package org.sssserver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.sssserver.model.Alumno;

@Repository
public interface AlumnoRepository extends MongoRepository<Alumno, Integer>{
	
}
