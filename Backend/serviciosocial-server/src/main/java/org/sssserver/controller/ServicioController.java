package org.sssserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.sssserver.model.Alumno;
import org.sssserver.model.Dependencia;
import org.sssserver.model.Programa;
import org.sssserver.model.Servicio;
import org.sssserver.service.ServicioService;

@Controller
public class ServicioController {

	@Autowired
	private ServicioService servicioService;
	
	@QueryMapping
	public Servicio servicioById(String id) {
		return servicioService.getServicioById(id);
	}
	
	@QueryMapping
	public List<Servicio> allServicios(){
		return servicioService.getAllServicios();
	}
	
	@MutationMapping
	public Servicio createServicio(Alumno alumno, Dependencia dependencia, Programa programa
			
			) {
		Servicio servicio = Servicio.builder()
				.alumno(alumno)
				.dependencia(dependencia)
				.programa(programa)
				.build();
		return servicioService.createServicio(servicio);
	}
	
	@MutationMapping
	public Servicio updateServicio(String id, Alumno alumno, Dependencia dependencia, Programa programa) {
		Servicio servicio = Servicio.builder()
				.id(id)
				.alumno(alumno)
				.dependencia(dependencia)
				.programa(programa)
				.build();
		return servicioService.updateServicio(id, servicio);
	}
	
	@MutationMapping
	public boolean deleteServicio(String id) {
		servicioService.deleteServicio(id);
		return true;
	}
}
