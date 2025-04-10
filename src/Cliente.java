import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String correo;
    private double totalGast = 0;
    List<String> compras = new ArrayList<>();

    public Cliente(String nombre, String correo, double totalGast) {
        this.nombre = nombre;
        this.correo = correo;
        this.totalGast = totalGast;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getTotalGast() {
        return totalGast;
    }

    public void setTotalGast(double totalGast) {
        this.totalGast = totalGast;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", totalGast=" + totalGast +
                ", compras=" + compras +
                '}';
    }

    public void comProducto(Producto producto, int cantidad) {
        if (producto.getCantStock()>= cantidad){
            if (producto instanceof Vendible){
                double precioVenta = ((Vendible) producto).calPrecioVenta(cantidad);
                String descripcion = cantidad+" x "+producto.getNombre()+" = $ "+ precioVenta ;

                compras.add(descripcion);
                totalGast += precioVenta;

                producto.reduStock(cantidad);
            }
        } else {
            System.out.println("Stock insuficiente para "+producto.getNombre()+" cliente "+nombre );
        }
    }
    public void mostrarCompra(){
        System.out.println("Cliente "+nombre+" correo "+correo);
        System.out.println("-"+item);
        System.out.println("Total gastado: "+totalGast);
    }
}
