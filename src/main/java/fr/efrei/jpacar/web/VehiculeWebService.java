package fr.efrei.jpacar.web;

import fr.efrei.jpacar.model.Vehicule;
import fr.efrei.jpacar.repository.VehiculeRepository;
import fr.efrei.jpacar.service.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VehiculeWebService {

    public List<Vehicule> vehicules = new ArrayList<>();
    @Autowired
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

    //public void addVehicule()

/*    @GetMapping("/add")
    public void addVehiculeTemp2(@RequestBody Vehicule vehicule) throws Exception {
        Vehicule vehicule2 = new Vehicule(vehicule.getPlateNumber());
        vehiculeService.save(vehicule2);
        if(vehicule.getPlateNumber().equals("otter")) {
            throw new Exception();
        }

    }*/

    @GetMapping("/postVehicule")
    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    public void addVehicule(@RequestBody Vehicule vehicule) throws Exception {
        vehiculeService.save(vehicule);
        if(vehicule.getPlateNumber().equals("Otter")) {
            throw new Exception();
        }
    }



/*   @PostMapping("/vehicules")
    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    public void addVehicule(@RequestBody Vehicule vehicule) throws Exception {
        vehiculeRepository.save(vehicule);
        if(vehicule.getPlateNumber().equals("OTTER")) {
            throw new Exception();
        }
    }*/
}
