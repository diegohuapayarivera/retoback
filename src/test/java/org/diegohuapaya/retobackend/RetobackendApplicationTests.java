package org.diegohuapaya.retobackend;

import org.aspectj.lang.annotation.Before;
import org.diegohuapaya.retobackend.models.entity.Client;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
class RetobackendApplicationTests {


    private List<Client> clients;

    @Test
    void retornar_apellidos_clientes() {
        List<Client> clients = new ArrayList<>();
        clients.add(new Client("Diego", "Huapaya Rivera", "DNI", "7206321"));
        clients.add(new Client("Juan", "Huapaya Rivera", "PASAPORTE", "65464273"));
        clients.add(new Client("Antonio", "Huapaya Rivera", "DNI", "56622345"));
        clients.add(new Client("Jairo", "Sanchez Ramirez", "DNI", "78392784"));
        clients.add(new Client("Benjamin", "Diaz Medrano", "PASAPORTE", "83657465"));
        List<String> apellidos = clients.stream().filter(client -> client.getNombres().equals("Juan")).map(Client::getApellidos).collect(Collectors.toList());
        System.out.println(apellidos);
    }

}
