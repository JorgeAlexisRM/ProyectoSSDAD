package org.sssserver.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "direcciones")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Direccion {
	@Id
	private int id;
	private String calle;
	private int numero;
	private String colonia;
	private int codigoPostal;
	private String ciudad;
	private String estado;
}
