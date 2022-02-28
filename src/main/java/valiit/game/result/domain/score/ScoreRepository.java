package valiit.game.result.domain.score;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ScoreRepository extends JpaRepository<Score, Integer> {

    @Query("select s from Score s where s.game.id = ?1 order by s.timeInSeconds")
    List<Score> findScoresByGameId(Integer gameId);

    @Query("select s from Score s where s.game.id = ?1 order by s.refereeScore DESC")
    List<Score> findRefereeScoresByGameId(Integer id);









}