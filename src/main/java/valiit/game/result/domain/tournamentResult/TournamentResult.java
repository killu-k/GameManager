package valiit.game.result.domain.tournamentResult;

import lombok.Getter;
import lombok.Setter;
import valiit.game.result.domain.team.Team;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "tournament_result")
public class TournamentResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "points", nullable = false)
    private Integer points;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;


}