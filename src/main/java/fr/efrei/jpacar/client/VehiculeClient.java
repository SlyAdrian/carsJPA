package fr.efrei.jpacar.client;

import fr.efrei.jpacar.model.Vehicule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class VehiculeClient {

    private static final Logger log = LoggerFactory.getLogger(VehiculeClient.class);

    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<Vehicule> request = new HttpEntity<>(new Vehicule("44-QQ-66"));
        restTemplate.postForObject("http://localhost:8080/h2-console/login.do?jsessionid=dc1a51d3c0aa1d059d53c0fa57458ba2", request, Vehicule.class);

/*        List vehicules = restTemplate.getForObject("http://localhost:8080/vehicules", List.class);

        log.info(vehicules.toString());*/
    }
}
