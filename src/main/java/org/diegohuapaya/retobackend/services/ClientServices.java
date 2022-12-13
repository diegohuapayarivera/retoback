package org.diegohuapaya.retobackend.services;


import org.diegohuapaya.retobackend.models.entity.Client;

import java.util.List;
import java.util.Optional;


public interface ClientServices {

    Optional<Client> buscarCodigounico (Long codigounico);

    List<Client> listaClientes();

    Optional<Client> actulizarInformacion(Client nuevaInformacion);
}
