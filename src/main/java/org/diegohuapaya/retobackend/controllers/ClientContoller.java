package org.diegohuapaya.retobackend.controllers;

import org.diegohuapaya.retobackend.models.entity.Client;
import org.diegohuapaya.retobackend.services.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClientContoller {

    @Autowired
    private ClientServices services;

    @GetMapping("/{id}")
    public ResponseEntity<Client> buscarCodigoUnico(@PathVariable Long id){
        Optional<Client> optionalClient = services.buscarCodigounico(id);
        if (optionalClient.isPresent()){
            Client client = optionalClient.get();
            return ResponseEntity.ok(client);
        }
        return ResponseEntity.noContent().build();

    }

    @GetMapping
    public ResponseEntity<List<Client>> listar(){
        return ResponseEntity.ok(services.todo());
    }

    @PostMapping("/add")
    public ResponseEntity<Client> agregar(@RequestBody Client client){
        return ResponseEntity.ok(services.agregar(client));
    }
}