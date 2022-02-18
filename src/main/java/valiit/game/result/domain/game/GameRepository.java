package valiit.game.result.domain.game;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GameRepository extends JpaRepository<Game, Integer> {

//    @Query("select g from Game g where g.gameType.id = ?1")
//    Game findByGameTypeId(Integer id);


}