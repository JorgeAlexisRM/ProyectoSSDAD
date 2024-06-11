package org.sssserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sssserver.model.Alumno;
import org.sssserver.repository.AlumnoRepository;

@Service
public class AlumnoService {

	@Autowired
	private AlumnoRepository alumnoRepository;
	
	public List<Alumno> getAllAlumnos(){
		return alumnoRepository.findAll();
	}
	
	public  Alumno getAlumnoById(int id) {
		return alumnoRepository.findById(id).orElse(null);
	}
	
	public Alumno createAlumno(Alumno alumno) {
		return alumnoRepository.save(alumno);
	}
	
	public Alumno updateAlumno(int id, Alumno alumno) {
		if (alumnoRepository.existsById(id)) {
			alumno.setNoControl(id);
			return alumnoRepository.save(alumno);
		}
		return null;
	}
	
	public void deleteAlumno(int id) {
		alumnoRepository.deleteById(id);
	}
}
