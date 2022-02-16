package valiit.game.result.tournamentSetup;

import lombok.Getter;
import lombok.Setter;
import valiit.game.result.game.Game;

import javax.persistence.*;

@Getter
@Setter
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

}