package com.sistemaSIASS.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.sistemaSIASS.domain.Alumno;

@Controller
public class AlumnoController {

	@RequestMapping("/alumnos")
	public String list(Model model){
		
		Alumno alumno1 = new Alumno();
		alumno1.setNombre("Rodolfo");
		alumno1.setApellido1("Rios");
		alumno1.setMatricula("1231164");
		alumno1.setCarrera("ITIC");
		alumno1.setSemestre(8);
		alumno1.setTaller_id(0);
		
		model.addAttribute("alumno", alumno1);
		
		return "alumnos";
	}
}
