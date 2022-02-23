package valiit.game.result.domain.gameType;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GameTypeService {

    @Resource
    private GameTypeMapper gameTypeMapper;

    @Resource
    private GameTypeRepository gameTypeRepository;

    public List<GameTypeDto> getAllGameTypes() {
        List<GameType> allGameTypes = gameTypeRepository.findAll();
        List<GameTypeDto> gameTypeDtos = gameTypeMapper.gameTypesToGameTypeDtos(allGameTypes);

        return gameTypeDtos;
    }
}
