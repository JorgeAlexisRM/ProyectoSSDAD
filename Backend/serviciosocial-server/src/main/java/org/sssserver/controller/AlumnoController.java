package org.sssserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.sssserver.model.Alumno;
import org.sssserver.model.Direccion;
import org.sssserver.service.AlumnoService;

@Controller
public class AlumnoController {
	@Autowired
	private AlumnoService alumnoService;
	
	@QueryMapping
	public Alumno alumnoById(int id) {
		return alumnoService.getAlumnoById(id);
	}
	
	@QueryMapping
	public List<Alumno> allAlumnos(){
		return alumnoService.getAllAlumnos();
	}
	
	@MutationMapping
	public Alumno createAlumno(
			String nombre, String apellidoPaterno, String apellidoMaterno, 
            String fechaNacimiento, String genero, String carrera, int telefono, Direccion direccion
			) {
		Alumno alumno = Alumno.builder()
				.nombre(nombre)
                .apellidoPaterno(apellidoPaterno)
                .apellidoMaterno(apellidoMaterno)
                .fechaNacimiento(fechaNacimiento)
                .genero(genero)
                .carrera(carrera)
                .telefono(telefono)
                .direccion(direccion)
                .build();
		return alumnoService.createAlumno(alumno);
	}
	
	@MutationMapping
	public Alumno updateAlumno(int id, String nombre, String apellidoPaterno, String apellidoMaterno, 
            String fechaNacimiento, String genero, String carrera, int telefono, Direccion direccion) {
		Alumno alumno = Alumno.builder()
                .noControl(id)
                .nombre(nombre)
                .apellidoPaterno(apellidoPaterno)
                .apellidoMaterno(apellidoMaterno)
                .fechaNacimiento(fechaNacimiento)
                .genero(genero)
                .carrera(carrera)
                .telefono(telefono)
                .direccion(direccion)
                .build();
        return alumnoService.updateAlumno(id, alumno);
	}
	
	@MutationMapping
    public boolean deleteAlumno(int id) {
        alumnoService.deleteAlumno(id);
        return true;
    }
		
}
