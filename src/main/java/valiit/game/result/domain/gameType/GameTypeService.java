package valiit.game.result.domain.gameType;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

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

    public GameType findById(Integer gameTypeId) {
        GameType gameType = gameTypeRepository.findById(gameTypeId).get();
        return gameType;
    }

}
