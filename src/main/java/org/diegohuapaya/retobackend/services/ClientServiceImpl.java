package org.diegohuapaya.retobackend.services;


import org.diegohuapaya.retobackend.models.entity.Client;
import org.diegohuapaya.retobackend.repositories.ClientRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientServices{


    @Autowired
    private ClientRespository clientRespository;

    @Override
    public Optional<Client> buscarCodigounico(Long codigounico) {
        Optional<Client> optionalClient = clientRespository.findById(codigounico);
        if (optionalClient.isPresent()){
            Client client = optionalClient.get();
            return Optional.of(client);
        }
        return Optional.empty();
    }


    @Override
    public List<Client> listaClientes() {
        return (List<Client>) clientRespository.findAll();
    }
}
