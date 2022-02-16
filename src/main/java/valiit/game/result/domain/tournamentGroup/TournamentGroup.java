package valiit.game.result.domain.tournamentGroup;

import lombok.Getter;
import lombok.Setter;
import valiit.game.result.domain.game.Game;
import valiit.game.result.domain.team.Team;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "tournament_group")
public class TournamentGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "game_id", nullable = false)
    private Game game;

    @Column(name = "round_number", nullable = false)
    private Integer roundNumber;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "team_a_id", nullable = false)
    private Team team;

    @Column(name = "team_b_id", nullable = false)
    private Integer teamBId;

    @Column(name = "group_number", nullable = false)
    private Integer groupNumber;


}