package pl.maciejszczesny.calendar.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pl.maciejszczesny.calendar.entities.LoginEntity;

import java.util.Optional;

public interface LoginRepository extends CrudRepository<LoginEntity, Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM `user` WHERE `login`= ?1 AND `password` = ?2")
    Optional<LoginEntity> getUser(String login, String password);
}

