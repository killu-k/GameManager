package valiit.game.result.domain.teamPlayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TeamPlayerRepository extends JpaRepository<TeamPlayer, Integer> {

}