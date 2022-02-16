package valiit.game.result.tournamentRoundScore;

import lombok.Getter;
import lombok.Setter;
import valiit.game.result.tournamentGroup.TournamentGroup;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "tournament_round_score")
public class TournamentRoundScore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "team_a_result")
    private Integer teamAResult;

    @Column(name = "team_b_result")
    private Integer teamBResult;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tournament_group_id", nullable = false)
    private TournamentGroup tournamentGroup;


}