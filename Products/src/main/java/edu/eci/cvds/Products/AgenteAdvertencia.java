public class AgenteAdvertencia extends Subscriber{
    public void notifyChange(String nombreProducto, Integer cantidad){
        System.out.println("ALERTA!!! El stock del Prodcto:" + nombreProducto + "es muy bajo, solo quedan" + cantidad + "unidades.");
    }
}
