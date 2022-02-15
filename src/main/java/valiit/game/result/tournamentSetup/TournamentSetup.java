package valiit.game.result.tournamentSetup;

import valiit.game.result.game.Game;

import javax.persistence.*;

@Entity
@Table(name = "tournament_setup")
public class TournamentSetup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "game_id", nullable = false)
    private Game game;

    @Column(name = "number_of_groups", nullable = false)
    private Integer numberOfGroups;

    @Column(name = "points_per_round", nullable = false)
    private Integer pointsPerRound;

    public Integer getPointsPerRound() {
        return pointsPerRound;
    }

    public void setPointsPerRound(Integer pointsPerRound) {
        this.pointsPerRound = pointsPerRound;
    }

    public Integer getNumberOfGroups() {
        return numberOfGroups;
    }

    public void setNumberOfGroups(Integer numberOfGroups) {
        this.numberOfGroups = numberOfGroups;
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