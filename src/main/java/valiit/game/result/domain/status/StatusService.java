package valiit.game.result.domain.status;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import static valiit.game.result.service.StatusValues.REGISTERED;

@Service
public class StatusService {

    @Resource
    private StatusRepository statusRepository;

    public Status findByName(String registered) {
        return statusRepository.findByName(registered);
    }
}
