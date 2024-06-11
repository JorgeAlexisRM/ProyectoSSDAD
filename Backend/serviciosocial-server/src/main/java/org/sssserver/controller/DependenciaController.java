package org.sssserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.sssserver.model.Dependencia;
import org.sssserver.model.Programa;
import org.sssserver.service.DependenciaService;

@Controller
public class DependenciaController {

	@Autowired
	private DependenciaService dependenciaService;
	
	@QueryMapping
	public Dependencia dependenciaById(String id) {
		return dependenciaService.getDependenciaById(id);
	}
	
	@QueryMapping
	public List<Dependencia> allDependencias(){
		return dependenciaService.getAllDependencias();
	}
	
	@MutationMapping
	public Dependencia createDependencia(
			String nombre, Programa programa, String encargado
			) {
		Dependencia dependencia = Dependencia.builder()
				.nombre(nombre)
				.programa(programa)
				.encargado(encargado)
				.build();
		return dependenciaService.createDependencia(dependencia);
	}
	
	@MutationMapping
	public Dependencia updateDependencia(
			String id, String nombre, Programa programa, String encargado
			) {
		Dependencia dependencia = Dependencia.builder()
				.id(id)
				.nombre(nombre)
				.programa(programa)
				.encargado(encargado)
				.build();
		return dependenciaService.updateDependencia(id, dependencia);
	}
	
	@MutationMapping
	public boolean deleteDependencia(String id) {
		dependenciaService.deleteAlumno(id);
		return true;
	}
}
