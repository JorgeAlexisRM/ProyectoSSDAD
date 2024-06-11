package org.sssserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.sssserver.model.Servicio;

@Repository
public interface ServicioRepository extends MongoRepository<Servicio, String>{

}
