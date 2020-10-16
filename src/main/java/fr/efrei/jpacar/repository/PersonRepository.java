package fr.efrei.jpacar.repository;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import fr.efrei.jpacar.model.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
    List<Person> findByName(String name);
}
