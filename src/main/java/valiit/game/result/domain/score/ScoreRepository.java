package valiit.game.result.domain.score;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ScoreRepository extends JpaRepository<Score, Integer> {

    @Query("select s from Score s where s.game.id = ?1")
    List<Score> findScoresByGameId(Integer gameId);







}