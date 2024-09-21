package edu.eci.cvds.Products;
public class AgenteAdvertencia extends Subscriber{
    public void notifyChange(String nombreProducto, Integer cantidad){
        System.out.println("ALERTA!!! El stock del Producto: " + nombreProducto + " es muy bajo, solo quedan " + cantidad + " unidades.");
    }
}
