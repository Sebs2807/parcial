package edu.eci.cvds.Products;
public class AgenteLog extends Subscriber{
    public void notifyChange(String nombreProducto, Integer cantidad){
        System.out.println("Producto: " + nombreProducto + "->" + cantidad + "unidades disponibles");
    }
}
