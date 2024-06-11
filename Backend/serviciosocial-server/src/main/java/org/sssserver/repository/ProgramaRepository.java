package org.sssserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.sssserver.model.Programa;

@Repository
public interface ProgramaRepository extends MongoRepository<Programa, String>{

}
