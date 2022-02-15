package valiit.game.result.tournamentRoundScore;

import valiit.game.result.tournamentGroup.TournamentGroup;

import javax.persistence.*;

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

    public TournamentGroup getTournamentGroup() {
        return tournamentGroup;
    }

    public void setTournamentGroup(TournamentGroup tournamentGroup) {
        this.tournamentGroup = tournamentGroup;
    }

    public Integer getTeamBResult() {
        return teamBResult;
    }

    public void setTeamBResult(Integer teamBResult) {
        this.teamBResult = teamBResult;
    }

    public Integer getTeamAResult() {
        return teamAResult;
    }

    public void setTeamAResult(Integer teamAResult) {
        this.teamAResult = teamAResult;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}