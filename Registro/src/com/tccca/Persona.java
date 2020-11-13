package com.tccca;

public class Persona {

	//atributos
	String nombre;
	String apellido;
	int edad;
	String id;
	
	//constructores
	public Persona (String id) {
		this.id= id;
		this.nombre = "";
		this.apellido = "";
		this.edad = 18;
	}
	
	public Persona(String nombre, String apellido, int edad) {
		this.id= "";
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	public Persona(String nombre, String apellido, int edad, String id ) {
		this.id= "";
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
}
}