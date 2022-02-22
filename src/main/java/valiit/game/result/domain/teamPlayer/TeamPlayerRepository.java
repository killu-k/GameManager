package valiit.game.result.domain.teamPlayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeamPlayerRepository extends JpaRepository<TeamPlayer, Integer> {

    @Query("select t from TeamPlayer t where t.team.id = ?1 order by t.id")
    List<TeamPlayer> findTeamPlayersByTeamIdOrderById(Integer teamId);

}