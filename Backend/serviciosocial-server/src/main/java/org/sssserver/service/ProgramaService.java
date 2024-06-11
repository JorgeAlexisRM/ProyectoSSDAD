package org.sssserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sssserver.model.Programa;
import org.sssserver.repository.ProgramaRepository;

@Service
public class ProgramaService {
	
	@Autowired
	private ProgramaRepository programaRepository;
	
	public List<Programa> getAllProgramas(){
		return programaRepository.findAll();
	}
	
	public Programa getProgramaById(String id) {
		return programaRepository.findById(id).orElse(null);
	}
	
	public Programa createPrograma(Programa programa) {
		return programaRepository.save(programa);
	}
	
	public Programa updatePrograma(String id, Programa programa) {
		if(programaRepository.existsById(id)) {
			programa.setId(id);
			return programaRepository.save(programa);
		}
		return null;
	}
	
	public void deletePrograma(String id) {
		programaRepository.deleteById(id);
	}
}
