package com.example.demo.model;


import java.time.LocalDate;

public class Producto {

    private int productoID ;
    private double precio;
    private String nombre;
    private LocalDate fechaVencimiento;  
    private boolean estado; 


   // constructor por defecto
   public Alumno(){
}
// Constructor parametrizado
public Alumno(int productoID, double precio, String nombre, LocalDate fechaVencimiento, boolean estado) {
    this.dni = dni;
    this.nombre = nombre; 
    this.apellido = apellido; 
    this.fechaNacimiento = fechaNacimiento;
    this.condicion = condicion;
    
}

 // Constructor parcial 
 public Alumno(int dni, String nombre, String apellido,  LocalDate fechaNacimiento){
    this.dni = dni;
    this.nombre = nombre;
    this.apellido = apellido;
    this.fechaNacimiento = fechaNacimiento;
    this.condicion = "regular"; 
    
 }
 // Getters y Setters
 public int getDni(){
    return dni;

 }

 public void setDni(int dni){
    this.dni = dni;
 }
 
 public String getNombre(){
    return nombre;
 }
 public void setNombre(String nombre){
    this.nombre = nombre;

 }

 public String getApellido(){
    return apellido;
 }
 public void setApellido(String apellido){
    this.apellido = apellido;

 }

 public LocalDate getFechaNacimiento(){
    return fechaNacimiento;
 }

 public void setFechaNacimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
 }

 public String getCondicion(){
    return condicion;

 }

 public void setCondicion(String condicion){
 this.condicion = condicion;  

}




}

