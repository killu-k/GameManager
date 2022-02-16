package valiit.game.result.competitionScore;

import lombok.Getter;
import lombok.Setter;
import valiit.game.result.team.Team;
import valiit.game.result.competition.Competition;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "competition_score")
public class CompetitionScore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "competition_id", nullable = false)
    private Competition competition;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;

    @Column(name = "points", nullable = false)
    private Integer points;

}