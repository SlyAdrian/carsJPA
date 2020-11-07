package fr.efrei.jpacar.service;

import fr.efrei.jpacar.model.Person;
import fr.efrei.jpacar.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
        // Addition of a person
        Person person = new Person("Driver");
        // Persistence in database
        personRepository.save(person);
    }
    public Person save(Person person) {

        return personRepository.save(person);

    }

    public Iterable<Person> findAll() {

        return null;
    }
}
