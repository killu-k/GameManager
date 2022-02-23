package valiit.game.result.domain.gameInCompetition;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameInCompetitionRepository extends JpaRepository<GameInCompetition, Integer> {
    @Query("select g from GameInCompetition g where g.competition.id = ?1 order by g.game.name")
    List<GameInCompetition> findCompetitionGamesByCompetitionId(Integer id);




}