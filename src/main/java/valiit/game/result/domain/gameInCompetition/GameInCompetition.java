package valiit.game.result.domain.gameInCompetition;

import lombok.Getter;
import lombok.Setter;
import valiit.game.result.domain.competition.Competition;
import valiit.game.result.domain.game.Game;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "game_in_competition")
public class GameInCompetition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "competition_id", nullable = false)
    private Competition competition;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "game_id", nullable = false)
    private Game game;


}