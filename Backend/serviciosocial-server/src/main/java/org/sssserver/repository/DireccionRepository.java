package org.sssserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.sssserver.model.Direccion;

@Repository
public interface DireccionRepository extends MongoRepository<Direccion, Integer>{

}
