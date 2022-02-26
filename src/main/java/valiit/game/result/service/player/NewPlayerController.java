package valiit.game.result.service.player;

import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;

@RestController
@RequestMapping("/player")
public class NewPlayerController {

    @Resource
    private NewPlayerService newPlayerService;

    @PutMapping("/update")
    public void updatePlayerInfo(@RequestBody NewPlayerDto playerDto, @RequestParam Integer teamPlayerId) {
        newPlayerService.updatePlayerInfo(playerDto, teamPlayerId);
    }

//    @DeleteMapping("/delete")
//    public void deletePlayer(@RequestParam Integer teamPlayerId) {
//        newPlayerService.deletePlayer(teamPlayerId);
//    }
}
