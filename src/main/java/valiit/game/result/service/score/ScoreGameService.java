package valiit.game.result.service.score;

import org.springframework.stereotype.Service;
import valiit.game.result.domain.game.Game;
import valiit.game.result.domain.score.Score;
import valiit.game.result.domain.score.ScoreMapper;
import valiit.game.result.domain.score.ScoreService;
import valiit.game.result.domain.teamInGame.TeamInGame;
import valiit.game.result.domain.teamInGame.TeamInGameService;
import valiit.game.result.service.game.GameService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ScoreGameService {

    @Resource
    private TeamInGameService teamInGameService;

    @Resource
    private GameService gameService;

    @Resource
    private ScoreService scoreService;

    @Resource
    private ScoreMapper scoreMapper;

    public RefereeScoreResponse createBlankScoreTable(Integer gameId) {

        List<TeamInGame> teamsInGame = teamInGameService.findTeamsInGame(gameId);

        List<Score> scores = new ArrayList<>();
        for (TeamInGame teamInGame : teamsInGame) {
            Score score = new Score();
            score.setGame(teamInGame.getGame());
            score.setTeam(teamInGame.getTeam());
            scores.add(score);
        }
        scoreService.saveAll(scores);

        List<RefereeScoreDto> scoreDetails = scoreMapper.toRefereeScoreDtos(scores);
        Game game = gameService.findById(gameId);

        RefereeScoreResponse response = new RefereeScoreResponse();
        response.setGameName(game.getName());
        response.setScoreDetails(scoreDetails);

        return response;
    }

    public void updateScoreTable(RefereeScoreUpdateRequest request) {
        for (RefereeScoreDto scoreDetail : request.getScoreDetails()) {
            Score score = scoreService.findByScoreId(scoreDetail.getScoreId());
            score.setRefereeScore(scoreDetail.getRefereeScore());
            score.setPoints(scoreDetail.getPoints());
            score.setTimeInSeconds(scoreDetail.getTimeInSeconds());
            scoreService.save(score);
        }
    }
}
