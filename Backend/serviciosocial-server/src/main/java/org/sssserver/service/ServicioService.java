package org.sssserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sssserver.model.Servicio;
import org.sssserver.repository.ServicioRepository;

@Service
public class ServicioService {
	
	@Autowired
	private ServicioRepository servicioRepository;
	
	public List<Servicio> getAllServicios(){
		return servicioRepository.findAll();
	}
	
	public Servicio getServicioById(String id) {
		return servicioRepository.findById(id).orElse(null);
	}
	
	public Servicio createServicio(Servicio servicio) {
		return servicioRepository.save(servicio);
	}
	
	public Servicio updateServicio(String id, Servicio servicio) {
		if (servicioRepository.existsById(id)) {
			servicio.setId(id);
			return servicioRepository.save(servicio);
		}
		return null;
	}
	
	public void deleteServicio(String id) {
		servicioRepository.deleteById(id);
	}
}
