
package edu.eci.cvds.Products;

public abstract class Subscriber {
    public boolean notificado = false;

    public abstract void notifyChange(String nombreProducto, Integer cantidad);

    public boolean estaNotificado(){
        return notificado;
    }

    public void setNotificado(boolean notificado){
        this.notificado = notificado;
    }
}