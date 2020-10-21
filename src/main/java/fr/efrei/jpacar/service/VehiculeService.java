package fr.efrei.jpacar.service;

import fr.efrei.jpacar.repository.VehiculeRepository;
import fr.efrei.jpacar.model.Vehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehiculeService {

    public List<Vehicule> vehicules = new ArrayList<>();

    @Autowired
    VehiculeRepository vehiculeRepository;

    public VehiculeService() {
        vehicules.add(new Vehicule("01-ABA-10"));
        vehicules.add(new Vehicule("85-XRO-13"));
        Vehicule car = new Vehicule("26-LYD-59");
        Vehicule lili = vehiculeRepository.save(car);
    }

    public Vehicule save(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }
    public String generatePlateNumber() {
        return "";
    }

    public Iterable<Vehicule> findAll() {
        return null;
    }
}
