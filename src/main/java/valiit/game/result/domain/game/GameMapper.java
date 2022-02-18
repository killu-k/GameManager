package valiit.game.result.domain.game;

import org.mapstruct.*;
import valiit.game.result.domain.gameType.GameType;
import valiit.game.result.domain.gameType.GameTypeDto;
import valiit.game.result.domain.status.Status;
import valiit.game.result.domain.status.StatusDto;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface GameMapper {

// target
//    private Integer id;
//    private GameType gameType;
//    private Status status;
//    private String name;
//    private LocalDate date;

    Game gameDtoToGame(GameDto gameDto);


    // source
//    private final Integer id;
//    private final GameTypeDto gameType;
//    private final StatusDto status;
//    private final String name;
//    private final LocalDate date;






    List<Game> gameDtosToGames(List<GameDto> gameDtos);

    GameDto gameToGameDto(Game game);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateGameFromGameDto(GameDto gameDto, @MappingTarget Game game);
}
