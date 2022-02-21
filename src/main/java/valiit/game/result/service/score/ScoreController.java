package valiit.game.result.service.score;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/score")
public class ScoreController {
    @Resource
    private ScoreGameService scoreGameService;

//    ref scorile tühi tabel
//    update  - ehk lisame punktid tühja tabelisse
//    repos paneme, et mis järjekorras ta meile tabeli info annab

//    ja siis on kõik uuesti aga timed score-ga

    @PostMapping("/blank/table")
    public RefereeScoreResponse createBlankScoreTable(@RequestParam Integer gameId) {
        return scoreGameService.createBlankScoreTable(gameId);
    }

    @PutMapping("/table/update")
    public void updateScoreTable(@RequestBody RefereeScoreUpdateRequest request) {
        scoreGameService.updateScoreTable(request);
    }

}
