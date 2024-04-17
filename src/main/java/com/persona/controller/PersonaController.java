package com.persona.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.persona.model.Persona;
import com.persona.service.PersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController {
	
	@Autowired
	PersonaService personaService;
	
	@GetMapping
	@ResponseBody
	public List<Persona> listarPersona() {
		return personaService.listarPersona();
	}
	
	@GetMapping("/consultar")
	@ResponseBody
	public Persona consultarPersona(@RequestParam Integer numeroDoc, @RequestParam String tipoDoc) {
		return personaService.consultarPersona(numeroDoc, tipoDoc);
	}

}
