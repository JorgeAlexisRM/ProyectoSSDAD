package org.sssserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.sssserver.model.Dependencia;

@Repository
public interface DependenciaRepository extends MongoRepository<Dependencia, String>{

}
