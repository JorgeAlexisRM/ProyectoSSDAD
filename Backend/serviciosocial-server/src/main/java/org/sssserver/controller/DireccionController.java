package org.sssserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.sssserver.model.Direccion;
import org.sssserver.service.DireccionService;

@Controller
public class DireccionController {
	@Autowired
    private DireccionService direccionService;

    @QueryMapping
    public Direccion direccionById(int id) {
        return direccionService.getDireccionById(id);
    }

    @MutationMapping
    public Direccion createDireccion(
    		@Argument String calle, 
    		@Argument int numero,
    		@Argument String colonia, 
            @Argument int codigoPostal,
            @Argument String ciudad, 
            @Argument String estado) {
        Direccion direccion = new Direccion();
                direccion.setCalle(calle);
                direccion.setNumero(numero);
                direccion.setColonia(colonia);
                direccion.setCodigoPostal(codigoPostal);
                direccion.setCiudad(ciudad);
                direccion.setEstado(estado);
                
        return direccionService.createDireccion(direccion);
    }

    @MutationMapping
    public Direccion updateDireccion(int id, String calle, int numero, String colonia, 
                                     int codigoPostal, String ciudad, String estado) {
        Direccion direccion = Direccion.builder()
                .id(id)
                .calle(calle)
                .numero(numero)
                .colonia(colonia)
                .codigoPostal(codigoPostal)
                .ciudad(ciudad)
                .estado(estado)
                .build();
        return direccionService.updateDireccion(id, direccion);
    }

    @MutationMapping
    public boolean deleteDireccion(int id) {
        direccionService.deleteDireccion(id);
        return true;
    }
}
