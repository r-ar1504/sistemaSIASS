package com.sistemaSIASS.domain;

import java.io.Serializable;

public class Alumno implements Serializable {
	
   private static final long serialVersionUID = 3678107792576131001L;

    
	private String matricula;

    
	private String nombre;

    
    private String apellido1;

    
	private String apellido2;

    
	private String carrera;

    
	private int	semestre;

    
	private int taller_id;
    
	
	public Alumno(){
		super();
	}
	
	public Alumno(String matricula, String nombre, String apellido1, String apellido2, String carrera, int semestre, int taller_id){
		this.matricula = matricula;
		this.nombre = nombre;
		this.apellido1 = apellido1; 
		this.apellido2 = apellido2;
		this.carrera = carrera;
		this.semestre = semestre;
		this.taller_id = taller_id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public int getTaller_id() {
		return taller_id;
	}

	public void setTaller_id(int taller_id) {
		this.taller_id = taller_id;
	}
	
 }

