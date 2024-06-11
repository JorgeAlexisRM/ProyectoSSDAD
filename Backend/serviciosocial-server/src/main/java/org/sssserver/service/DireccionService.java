package org.sssserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sssserver.model.Direccion;
import org.sssserver.repository.DireccionRepository;

@Service
public class DireccionService {

	@Autowired
	private DireccionRepository direccionRepository;
	
	public Direccion getDireccionById(int id) {
		return direccionRepository.findById(id).orElse(null);
	}
	
	public Direccion createDireccion(Direccion direccion) {
		return direccionRepository.save(direccion);
	}
	
	public Direccion updateDireccion(int id, Direccion direccion) {
		if (direccionRepository.existsById(id)) {
			direccion.setId(id);
			return direccionRepository.save(direccion);
		}
		return null;
	}
	
	public void deleteDireccion(int id) {
		direccionRepository.deleteById(id);
	}
}
