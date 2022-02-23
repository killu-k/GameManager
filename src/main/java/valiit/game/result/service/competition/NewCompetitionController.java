package valiit.game.result.service.competition;

import org.springframework.web.bind.annotation.*;
import valiit.game.result.domain.gameInCompetition.GameInCompetitionMapper;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/competition")
public class NewCompetitionController {
    @Resource
    private NewCompetitionService newCompetitionService;

    @GetMapping("/game/all")
    public List<NewCompetitionDto> findCompetitionGames(@RequestParam Integer competitionId) {
        return newCompetitionService.findCompetitionGames(competitionId);
    }

    @PostMapping("/add")
    public void addCompetition(@RequestParam String competitionName) {
        newCompetitionService.addCompetition(competitionName);
    }

    @PostMapping("/add/game/in/competition")
    public void addGameToCompetition(@RequestBody AddGamesToCompetitionRequest request) {
        newCompetitionService.addGameToCompetition(request);
    }
}
