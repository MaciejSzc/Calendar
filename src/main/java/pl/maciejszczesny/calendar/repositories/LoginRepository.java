package pl.maciejszczesny.calendar.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.maciejszczesny.calendar.entities.LoginEntity;

public interface LoginRepository extends CrudRepository<LoginEntity, Integer> {
}
