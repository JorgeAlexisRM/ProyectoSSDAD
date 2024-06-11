package org.sssserver.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "dependencias")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Dependencia {
	@Id
	private String id;
	private String nombre;
	
	@DBRef
	private Programa programa;
	
	private String encargado;
}
