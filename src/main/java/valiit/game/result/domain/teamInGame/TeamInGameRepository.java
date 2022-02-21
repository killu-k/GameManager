package valiit.game.result.domain.teamInGame;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeamInGameRepository extends JpaRepository<TeamInGame, Integer> {
    @Query("select t from TeamInGame t where t.game.id = ?1 order by t.team.name")
    List<TeamInGame> findByGameIdAsc(Integer id);

}