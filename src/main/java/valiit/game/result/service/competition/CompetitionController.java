package valiit.game.result.service.competition;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/competition")
public class CompetitionController {
    @Resource
    private CompetitionService competitionService;

    @PostMapping("/add")
    public void addCompetition (@RequestParam String competitionName){
        competitionService.addCompetition(competitionName);
    }

    @PostMapping("/add/game/in/competition")
    public void addGameToCompetition (@RequestBody AddGamesToCompetitionRequest request) {
        competitionService.addGameToCompetition(request);
    }
}
