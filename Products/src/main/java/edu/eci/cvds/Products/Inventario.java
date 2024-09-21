package edu.eci.cvds.Products;
import java.util.ArrayList;

public class Inventario {
    private ArrayList<Products> productos;
    private ArrayList<Subscriber> suscriptores;

    public Inventario(Subscriber AgenteAdvertencia, Subscriber AgenteLog){
        suscriptores.add(AgenteLog);
        suscriptores.add(AgenteAdvertencia);
    }

    public void agregarProducto(Products producto){
        for(Products p:productos){
            if(p.equals(producto)){
                producto.setCantidad(producto.getCantidad() + 1);
            }
        }
        productos.add(producto);
    }

    public void modificarProducto(String nombreProducto, Integer nuevaCantidad){
        for(Subscriber s:suscriptores){
            s.setNotificado(false);
        }

        for(Products p:productos){
            if(p.getNombreProducto().equals(nombreProducto)){
                p.setCantidad(nuevaCantidad);
            }
        }

        for(Subscriber s:suscriptores){
            if(!(s.estaNotificado())){
                s.setNotificado(true);
                s.notifyChange(nombreProducto, nuevaCantidad);
            }
        }
    }

    public ArrayList<Products> getProductos(){
        return productos;
    }
}
