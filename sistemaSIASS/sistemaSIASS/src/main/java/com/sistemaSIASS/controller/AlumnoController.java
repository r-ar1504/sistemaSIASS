//package com.sistemaSIASS.controller;
//
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.sistemaSIASS.domain.repository.AlumnoRepository;
//
//
//@Controller
//@RequestMapping("/alumnos")
//public  class AlumnoController {
//    
//    @Autowired
//    private AlumnoRepository alumnoRepository;
//
//	@RequestMapping("/test")
//        public String list(Model model) {
//            model.addAttribute("alumnos",alumnoRepository.getAllAlumnos());
//            return "alumnos";
//		
//	}
//}
////	  @RequestMapping(value="/add")
////	  @ResponseBody
////	  public String add( String matricula, String nombre,  String apellido1,
////				 String apellido2,  String carrera,
////				 int semestre,  int taller_id) {
////	    try {
////	      Alumno alumno = new Alumno(matricula, nombre, apellido1, apellido2, carrera, semestre, taller_id);
////	      alumnoDAO.create(alumno);
////	    }
////	    catch (Exception ex) {
////	      return "Error creating the user: " + ex.toString();
////	    }
////	    return "User succesfully created!";
////	  }
////	/**
////	@GetMapping(path = "/all")
////	public @ResponseBody Iterable<Alumno> getAllAlumnos(){
////		
////		return alumnoRepository.findAll();
////	}
////	**/
////	
////
////}