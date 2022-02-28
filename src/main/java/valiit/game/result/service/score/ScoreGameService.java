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
import java.util.Collections;
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

    public void updateScoreTable(List<RefereeScoreDto> scoreDetails) {
        List<Score> scores = new ArrayList<>();
        for (RefereeScoreDto scoreDetail : scoreDetails) {
            Score score = scoreService.findByScoreId(scoreDetail.getScoreId());
            score.setRefereeScore(scoreDetail.getRefereeScore());
            score.setPoints(scoreDetail.getPoints());
            score.setTimeInSeconds(scoreDetail.getTimeInSeconds());
            scores.add(score);
        }
        scoreService.saveAll(scores);

    }

    public RefereeScoreResponse findAllTeamsByGameId(Integer gameId) {
        RefereeScoreResponse response = new RefereeScoreResponse();
        List<Score> scoreDetails = scoreService.findScoresByGameId(gameId);
        List<RefereeScoreDto> refereeScoreDtos = scoreMapper.toRefereeScoreDtos(scoreDetails);
        response.setScoreDetails(refereeScoreDtos);
        response.setGameTypeId(gameService.findGameTypeId(gameId));
        return response;
    }

    public List<TimeScoreDto> findAllTeamTimesByGameId(Integer gameId) {
        List<Score> scoresByGameId = scoreService.findScoresByGameId(gameId);
        List<TimeScoreDto> timeScoreDtos = new ArrayList<>();
        for (Score score : scoresByGameId) {
            TimeScoreDto timeScoreDto = new TimeScoreDto();
            timeScoreDto.setTimeInSeconds(score.getTimeInSeconds());
            timeScoreDto.setTeamName(score.getTeam().getName());
            timeScoreDto.setScoreId(score.getId());
            timeScoreDtos.add(timeScoreDto);
        }
        return timeScoreDtos;
    }

    public List<RefereeScoreDto> findAllTeamRefereeScoresByGameId(Integer gameId) {
        List<Score> scoresByGameId = scoreService.findRefereeScoresByGameId(gameId);
        List<RefereeScoreDto> refereeScoreDtos = new ArrayList<>();
        for (Score score : scoresByGameId) {
            RefereeScoreDto refereeScoreDto = new RefereeScoreDto();
            refereeScoreDto.setRefereeScore(score.getRefereeScore());
            refereeScoreDto.setTeamName(score.getTeam().getName());
            refereeScoreDto.setScoreId(score.getId());
            refereeScoreDtos.add(refereeScoreDto);
        }
        return refereeScoreDtos;
    }
}
