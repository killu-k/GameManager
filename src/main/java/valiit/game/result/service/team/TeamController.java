package valiit.game.result.service.team;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/team")
public class TeamController {
    @Resource
    private TeamService teamService;

    @PostMapping("/add")
    public void addTeam(@RequestBody NewTeamRequest request) {
        teamService.addTeam(request);
    }


}
