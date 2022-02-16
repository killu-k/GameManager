package valiit.game.result.domain.role;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {


    @Override
    Optional<Role> findById(Integer integer);
}