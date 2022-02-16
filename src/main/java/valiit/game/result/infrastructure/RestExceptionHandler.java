package valiit.game.result.infrastructure;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import valiit.game.result.infrastructure.error.ApiError;
import valiit.game.result.infrastructure.error.GameError;
import valiit.game.result.infrastructure.exception.DataNotFoundException;
import valiit.game.result.infrastructure.exception.GameServiceException;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<GameError> handleDataNotFoundException(DataNotFoundException exception) {
        GameError gameError = new GameError();
        gameError.setMessage(exception.getMessage());
        gameError.setErrorCode(exception.getErrorCode());
        return new ResponseEntity<>(gameError, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<GameError> handleBankServiceException(GameServiceException exception) {
        GameError gameError = new GameError();
        gameError.setMessage(exception.getMessage());
        gameError.setErrorCode(exception.getErrorCode());
        return new ResponseEntity<>(gameError, HttpStatus.FORBIDDEN);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(final MethodArgumentNotValidException ex, final HttpHeaders headers, final HttpStatus status, final WebRequest request) {
        final List<String> errors = new ArrayList<>();
        for (final FieldError error : ex.getBindingResult().getFieldErrors()) {
            errors.add(error.getField() + ": " + error.getDefaultMessage());
        }
        for (final ObjectError error : ex.getBindingResult().getGlobalErrors()) {
            errors.add(error.getObjectName() + ": " + error.getDefaultMessage());
        }
        final ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST, "Not valid request body", errors);
        return handleExceptionInternal(ex, apiError, headers, apiError.getStatus(), request);
    }
}
