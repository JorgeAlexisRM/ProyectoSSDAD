package org.sssserver.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "servicios")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Servicio {
	@Id
	private String id;
	
	@DBRef
	private Alumno alumno;
	
	@DBRef
	private Dependencia dependencia;
	
	@DBRef
	private Programa programa;
	
}
