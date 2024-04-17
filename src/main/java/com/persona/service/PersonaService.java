package com.persona.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.persona.model.Persona;

@Service
public class PersonaService {
	
	public List<Persona> listarPersona() {
		
		List<Persona> personas = new ArrayList<Persona>();
		
		Persona personaUno = new Persona();
		personaUno.setPrimerNombre("Alejandra");
		personaUno.setSegundoNombre("Carolina");
		personaUno.setPrimerApellido("Gonzales");
		personaUno.setSegundoApellido("Contreras");
		personaUno.setCiudadResidencia("Bogota");
		personaUno.setDireccion("Tv 74 N 33b 32 sur");
		personaUno.setTelefono("3142357666");
		
		Persona personaDos = new Persona();
		personaDos.setPrimerNombre("Juliana");
		personaDos.setSegundoNombre("");
		personaDos.setPrimerApellido("Fernandez");
		personaDos.setSegundoApellido("Castañeda");
		personaDos.setCiudadResidencia("Villavicencio");
		personaDos.setDireccion("Cra 106 N 2a 32 norte");
		personaDos.setTelefono("3203345687");
		
		Persona personaTres = new Persona();
		personaTres.setPrimerNombre("Santiago");
		personaTres.setSegundoNombre("Angel");
		personaTres.setPrimerApellido("Piñeda");
		personaTres.setSegundoApellido("Vaca");
		personaTres.setCiudadResidencia("Bogota");
		personaTres.setDireccion("Cra 56 N 33 24b sur");
		personaTres.setTelefono("3132501456");
		
		personas.add(personaUno);
		personas.add(personaDos);
		personas.add(personaTres);
		
		return personas;
	}
	
	public Persona consultarPersona(Integer numeroDoc, String tipoDoc) {
		Persona persona = null;
		
		Integer numeroDocMock = 1026284490;
		String tipoDocMock = "C";
		
		if(Integer.compare(numeroDoc, numeroDocMock) == 0 && tipoDoc.equals(tipoDocMock) ) {
			
			persona = new Persona();
			persona.setPrimerNombre("Alejandra");
			persona.setSegundoNombre("Carolina");
			persona.setPrimerApellido("Hernandez");
			persona.setSegundoApellido("Contreras");
			persona.setCiudadResidencia("Bogota");
			persona.setDireccion("Tv 88 N 72b 32 sur");
			persona.setTelefono("3142387264");
		}
		
		return persona;
	}
	
	
	
	

}
