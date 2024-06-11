package org.sssserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.sssserver.model.Programa;
import org.sssserver.service.ProgramaService;

@Controller
public class ProgramaController {
	@Autowired
	private ProgramaService programaService;
	
	@QueryMapping
	public Programa programaById(String id) {
		return programaService.getProgramaById(id);
	}
	
	@QueryMapping
	public List<Programa> allProgramas(){
		return programaService.getAllProgramas();
	}
	
	@MutationMapping
	public Programa createPrograma(String nombre, String actividades){
		Programa programa = Programa.builder()
				.nombre(nombre)
				.actividades(actividades)
				.build();
		return programaService.createPrograma(programa);
	}
	
	@MutationMapping
	public Programa updatePrograma(String id, String nombre, String actividades) {
		Programa programa = Programa.builder()
				.id(id)
				.nombre(nombre)
				.actividades(actividades)
				.build();
		return programaService.updatePrograma(id, programa);
	}
	
	@MutationMapping
	public boolean deletePrograma(String id) {
		programaService.deletePrograma(id);
		return true;
	}
	
}
