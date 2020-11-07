package fr.efrei.jpacar.service;

import fr.efrei.jpacar.model.Car;
import fr.efrei.jpacar.repository.VehiculeRepository;
import fr.efrei.jpacar.model.Vehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VehiculeService {

    @Autowired
    VehiculeRepository vehiculeRepository;

    public VehiculeService(VehiculeRepository vehiculeRepository){
        this.vehiculeRepository = vehiculeRepository;
        // Addition of a vehicule
        Vehicule ferrari = new Vehicule();
        ferrari.setPlateNumber("11-VEH-22");
        // Persistence in database
        vehiculeRepository.save(ferrari);
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
