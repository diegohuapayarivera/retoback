package org.diegohuapaya.retobackend.repositories;

import org.diegohuapaya.retobackend.models.entity.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRespository extends CrudRepository<Client, Long> {

}
