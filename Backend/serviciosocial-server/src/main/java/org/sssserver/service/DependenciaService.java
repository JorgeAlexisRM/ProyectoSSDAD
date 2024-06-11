package org.sssserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sssserver.model.Dependencia;
import org.sssserver.repository.DependenciaRepository;

@Service
public class DependenciaService {
	@Autowired
	private DependenciaRepository dependenciaRepository;
	
	public List<Dependencia> getAllDependencias(){
		return dependenciaRepository.findAll();
	}
	
	public Dependencia getDependenciaById(String id) {
		return dependenciaRepository.findById(id).orElse(null);
	}
	
	public Dependencia createDependencia(Dependencia dependencia) {
		return dependenciaRepository.save(dependencia);
	}
	
	public Dependencia updateDependencia(String id, Dependencia dependencia) {
		if (dependenciaRepository.existsById(id)) {
			dependencia.setId(id);
			return dependenciaRepository.save(dependencia);
		}
		return null;
	}
	
	public void deleteAlumno(String id) {
		dependenciaRepository.deleteById(id);
	}
}
