package valiit.game.result.domain.score;

import lombok.Getter;
import lombok.Setter;
import valiit.game.result.domain.game.Game;
import valiit.game.result.domain.team.Team;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "score")
public class Score {
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

    @Column(name = "time_in_seconds")
    private Long timeInSeconds;

    @Column(name = "referee_score")
    private Integer refereeScore;

    @Column(name = "points", nullable = false)
    private Integer points;


}