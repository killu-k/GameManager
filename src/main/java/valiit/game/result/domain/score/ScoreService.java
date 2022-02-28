package valiit.game.result.domain.score;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ScoreService {

    @Resource
    private ScoreRepository scoreRepository;

    public void saveAll(List<Score> scores) {
        scoreRepository.saveAll(scores);
    }

    public void save(Score score) {
        scoreRepository.save(score);
    }

    public Score findByScoreId(Integer scoreId) {
        return scoreRepository.findById(scoreId).get();
    }

    public List<Score> findScoresByGameId(Integer gameId) {
        return scoreRepository.findScoresByGameId(gameId);
    }

}
