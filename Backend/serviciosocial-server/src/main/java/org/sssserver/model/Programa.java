package org.sssserver.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "programas")
@Data
@NoArgsConstructor 
@AllArgsConstructor
@Builder
public class Programa {
	@Id
	private String id;
	private String nombre;
	private String actividades;
}
