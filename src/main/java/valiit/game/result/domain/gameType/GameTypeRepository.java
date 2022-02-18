package valiit.game.result.domain.gameType;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GameTypeRepository extends JpaRepository<GameType, Integer> {

    @Override
    Optional<GameType> findById(Integer integer);
}