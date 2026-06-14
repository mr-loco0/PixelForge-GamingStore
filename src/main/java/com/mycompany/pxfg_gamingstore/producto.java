/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pxfg_gamingstore;
/**
 *
 * @author yisha
 */
public class producto {
    // 1. Atributos ajustados a los nombres de tu BD
    private int id_producto;
    private String nombre_producto;
    private double precio;
    private int stock;

    // Constructor vacío (Muy útil para crear objetos antes de asignar datos)
    public producto() {
    }

    // Constructor completo
    public producto(int id_producto, String nombre_producto, double precio, int stock) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.precio = precio;
        this.stock = stock;
    }

    // 2. GETTERS (Para leer los datos)
    public int getId_producto() { return id_producto; }
    public String getNombre_producto() { return nombre_producto; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }

    // 3. SETTERS (Para modificar los datos, necesario para editar productos)
    public void setId_producto(int id_producto) { this.id_producto = id_producto; }
    public void setNombre_producto(String nombre_producto) { this.nombre_producto = nombre_producto; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setStock(int stock) { this.stock = stock; }
}

