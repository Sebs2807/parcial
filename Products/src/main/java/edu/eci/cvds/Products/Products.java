package edu.eci.cvds.Products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Products{
    private String idProducto;
    private String nombreProducto;
    private Integer precio;
    private String categoria;
    private Integer cantidad;

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Integer getPrecioProducto() {
        return precio;
    }

    public void setPrecioProducto(Integer precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public boolean equals(Products producto){
        if(nombreProducto.equals(producto.getNombreProducto())){
            return true;
        }else{
            return false;
        }
    }
}
