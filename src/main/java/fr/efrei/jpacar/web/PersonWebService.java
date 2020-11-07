package fr.efrei.jpacar.web;

import fr.efrei.jpacar.model.Person;
import fr.efrei.jpacar.model.Vehicule;
import fr.efrei.jpacar.service.PersonService;
import fr.efrei.jpacar.service.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonWebService {

    public List<Person> persons = new ArrayList<>();
    @Autowired
    PersonService personService;

    @GetMapping("/persons")
    public Iterable<Person> getPersons() {
        return personService.findAll();
    }


/*    @GetMapping("/add")
    public void addPersonTemp() throws Exception {
        Vehicule vehicule = new Vehicule("test");
        PersonService.save(vehicule);
        if(vehicule.getPlateNumber().equals("otter")) {
            throw new Exception();
        }

    }


    @GetMapping("/postPerson")
    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    public void addPerson(@RequestBody Person person) throws Exception {
        personService.save(person);
        if(person.getPlateNumber().equals("Otter")) {
            throw new Exception();
        }
    }*/
}
