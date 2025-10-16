package com.example.demo.model;

import java.time.LocalDate;

public class Producto {

    private int productoID;
    private double precio;
    private String nombre;
    private LocalDate fechaVencimiento;
    private boolean estado;

    // Constructor por defecto
    public Producto() {
    }

    // Constructor completo
    public Producto(int productoID, double precio, String nombre, LocalDate fechaVencimiento, boolean estado) {
        this.productoID = productoID;
        this.precio = precio;
        this.nombre = nombre;
        this.fechaVencimiento = fechaVencimiento;
        this.estado = estado;
    }

    // Constructor parcial (sin fecha ni estado; estado por defecto = true)
    public Producto(int productoID, double precio, String nombre) {
        this(productoID, precio, nombre, null, true);
    }

    // Getters y Setters (si los necesitás)
    public int getProductoID() { return productoID; }
    public void setProductoID(int productoID) { this.productoID = productoID; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public LocalDate getFechaVencimiento() { return fechaVencimiento; }
    public void setFechaVencimiento(LocalDate fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }

    public boolean isEstado() { return estado; }
    public void setEstado(boolean estado) { this.estado = estado; }
}

