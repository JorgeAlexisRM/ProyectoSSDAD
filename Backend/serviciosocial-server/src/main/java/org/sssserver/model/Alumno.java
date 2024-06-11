package org.sssserver.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "alumnos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Alumno {
	@Id
	private int noControl;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String fechaNacimiento;
	private String genero;
	private String carrera;
	private int telefono;
	
	@DBRef
	private Direccion direccion;
}
