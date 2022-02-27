package valiit.game.result.domain.gameInCompetition;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface GameInCompetitionRepository extends JpaRepository<GameInCompetition, Integer> {
    @Query("select g from GameInCompetition g where g.competition.id = ?1 order by g.game.name")
    List<GameInCompetition> findCompetitionGamesByCompetitionId(Integer id);


    @Query("select g from GameInCompetition g where g.competition.id = ?1")
    GameInCompetition findByCompetitionId(Integer competitionId);

    @Transactional
    @Modifying
    @Query("delete from GameInCompetition g where g.id = ?1")
    void deleteGameByGameInCompetitionId(Integer gameInCompetitionId);

    @Query("select g from GameInCompetition g where g.id = ?1")
    GameInCompetition findByGameInCompetitionId(Integer id);



}