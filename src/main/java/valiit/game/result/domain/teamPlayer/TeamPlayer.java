package valiit.game.result.domain.teamPlayer;

import lombok.Getter;
import lombok.Setter;
import valiit.game.result.domain.player.Player;
import valiit.game.result.domain.team.Team;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "team_player")
public class TeamPlayer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "player_id", nullable = false)
    private Player player;


}