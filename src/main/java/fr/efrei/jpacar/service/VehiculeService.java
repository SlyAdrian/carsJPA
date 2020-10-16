package fr.efrei.jpacar.service;

import fr.efrei.jpacar.repository.VehiculeRepository;
import fr.efrei.jpacar.model.Vehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculeService {
    @Autowired
    VehiculeRepository vehiculeRepository;

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
