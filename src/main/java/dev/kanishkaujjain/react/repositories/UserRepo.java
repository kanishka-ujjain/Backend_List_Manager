package dev.kanishkaujjain.react.repositories;

import dev.kanishkaujjain.react.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Integer> {

    Optional<User> findByEmailId(String emailid);

    // This is the Repository layer
}