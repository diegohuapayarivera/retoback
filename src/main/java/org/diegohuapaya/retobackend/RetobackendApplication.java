package org.diegohuapaya.retobackend;

import org.diegohuapaya.retobackend.models.entity.Client;
import org.diegohuapaya.retobackend.repositories.ClientRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RetobackendApplication {

    @Autowired
    private ClientRespository clientRepository;

    public static void main(String[] args) {
        SpringApplication.run(RetobackendApplication.class, args);
    }

    @PostConstruct
    public void postInit() {
        List<Client> clientes = new ArrayList<>();
        clientes.add(new Client("Diego", "Huapaya Rivera", "DNI", "7206321"));
        clientes.add(new Client("Juan", "Huapaya Rivera", "PASAPORTE", "65464273"));
        clientes.add(new Client("Antonio", "Huapaya Rivera", "DNI", "56622345"));
        clientes.add(new Client("Jairo", "Sanchez Ramirez", "DNI", "78392784"));
        clientes.add(new Client("Benjamin", "Diaz Medrano", "PASAPORTE", "83657465"));
        clientRepository.saveAll(clientes);
    }

}
