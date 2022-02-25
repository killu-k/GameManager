package valiit.game.result.service.newteam;


import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/team")
public class NewTeamController {
    @Resource
    private NewTeamService newTeamService;

    @GetMapping("/player/all")
    public List<NewTeamPlayerDto> findTeamPlayers(@RequestParam Integer teamId) {
       return newTeamService.findTeamPlayers(teamId);
    }

    @PostMapping("/new")
    public NewTeamResponse addNewTeam(@RequestParam String teamName) {
        return newTeamService.addNewTeam(teamName);
    }

    @PostMapping("/player")
    public void addNewPlayer(@RequestBody NewTeamPlayerRequest request) {
        newTeamService.addNewPlayerToTeam(request);
    }


}
