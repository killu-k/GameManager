package valiit.game.result.domain.teamInGame;

import lombok.Getter;
import lombok.Setter;
import valiit.game.result.domain.game.Game;
import valiit.game.result.domain.team.Team;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "team_in_game")
public class TeamInGame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "game_id", nullable = false)
    private Game game;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;


}