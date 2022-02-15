package valiit.game.result.tournamentGroup;

import lombok.Getter;
import lombok.Setter;
import valiit.game.result.game.Game;
import valiit.game.result.team.Team;

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

    public Integer getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(Integer groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Integer getTeamBId() {
        return teamBId;
    }

    public void setTeamBId(Integer teamBId) {
        this.teamBId = teamBId;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Integer getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(Integer roundNumber) {
        this.roundNumber = roundNumber;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}