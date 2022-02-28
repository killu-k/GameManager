package valiit.game.result.service.score;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/score")
public class ScoreController {
    @Resource
    private ScoreGameService scoreGameService;

//    ref scorile tühi tabel
//    update  - ehk lisame punktid tühja tabelisse
//    repos paneme, et mis järjekorras ta meile tabeli info annab

//    ja siis on kõik uuesti aga timed score-ga

    @GetMapping("/all/teams/by/gameid")
    public RefereeScoreResponse findAllTeamsByGameId(@RequestParam Integer gameId) {
        return scoreGameService.findAllTeamsByGameId(gameId);
    }

    @GetMapping("/all/times/by/gameid")
    public List<TimeScoreDto> findAllTeamTimesByGameId (@RequestParam Integer gameId) {
        return scoreGameService.findAllTeamTimesByGameId(gameId);
    }

    @GetMapping ("/all/referee/scores/by/gameid")
    public List<RefereeScoreDto> findAllTeamRefereeScoresByGameId (@RequestParam Integer gameId) {
        return scoreGameService.findAllTeamRefereeScoresByGameId(gameId);
    }

    @PostMapping("/blank/table")
    public RefereeScoreResponse createBlankScoreTable(@RequestParam Integer gameId) {
        return scoreGameService.createBlankScoreTable(gameId);
    }

    @PutMapping("/scores")
    public void updateScoreTable(@RequestBody List<RefereeScoreDto> scoreDetails) {
        scoreGameService.updateScoreTable(scoreDetails);
    }

}
