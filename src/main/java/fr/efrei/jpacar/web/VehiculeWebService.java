package fr.efrei.jpacar.web;

import fr.efrei.jpacar.model.Vehicule;
import fr.efrei.jpacar.repository.VehiculeRepository;
import fr.efrei.jpacar.service.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehiculeWebService {

    VehiculeService vehiculeService;

    @Autowired
    public VehiculeWebService(VehiculeService vehiculeService) {
        super();
        this.vehiculeService = vehiculeService;
    }

    @GetMapping("/vehicules")
    public Iterable<Vehicule> getVehicules() {
        return vehiculeService.findAll();
    }


    @GetMapping("/add")
    public void addVehiculeTemp() throws Exception {
        Vehicule vehicule = new Vehicule("test");
        vehiculeService.save(vehicule);
        if(vehicule.getPlateNumber().equals("otter")) {
            throw new Exception();
        }

    }
/*    @PostMapping("/vehicules")
    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    public void addVehicule(@RequestBody Vehicule vehicule) throws Exception {
        vehiculeRepository.save(vehicule);
        if(vehicule.getPlateNumber().equals("OTTER")) {
            throw new Exception();
        }
    }*/
}
