package org.diegohuapaya.retobackend.services;


import org.diegohuapaya.retobackend.models.entity.Client;
import org.diegohuapaya.retobackend.repositories.ClientRespository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientServices {


    @Autowired
    private ClientRespository clientRespository;

    @Override
    public Optional<Client> buscarCodigounico(Long codigounico) {
        Optional<Client> optionalClient = clientRespository.findById(codigounico);
        return optionalClient.map(Optional::of).orElseThrow(() -> new RuntimeException());
    }

    @Override
    public Optional<Client> actulizarInformacion(Client nuevaInformacion) {
        Optional<Client> optionalClient = clientRespository.findById(nuevaInformacion.getCodigoUnico());
        if (optionalClient.isPresent()) {
            Client clienteActualizado = clientRespository.save(nuevaInformacion);
            return Optional.of(clienteActualizado);
        }
        return Optional.empty();
    }

    @Override
    public List<Client> listaClientes() {
        List<Client> clients = clientRespository.findAll();
        return (List<Client>) clients.stream().map(client -> client.getNombres().equals("Juan"));
    }

   /* public List<String> clientesApellidos() {
        List<Client> clients = clientRespository.findAll();
        return (List<String>) clients.stream().map(client -> client.getNombres().equals("Juan")).map(Client::getApellidos);
    }

    */



}
