import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String correo;
    private List<String> historialCompras = new ArrayList<>();
    private double totalGastado = 0;

    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public void comprarProducto(Producto producto, int cantidad) {
        if (producto instanceof Vendible && producto.reducirStock(cantidad)) {
            double total = ((Vendible) producto).calcularPrecioVenta(cantidad);
            String precioFormateado = String.format("$%,.0f", total);
            historialCompras.add(cantidad + " x " + producto.getNombre() + " = " + precioFormateado);
            totalGastado += total;
        } else {
            System.out.println("No se pudo completar la compra de " + producto.getNombre());
        }
    }

    public void mostrarCompra() {
        System.out.println("Cliente: " + nombre + " | Correo: " + correo);
        System.out.println("Compras:");
        for (String c : historialCompras) {
            System.out.println("  - " + c);
        }
        System.out.println("Total gastado: " + String.format("$%,.0f", totalGastado));
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

    public List<String> getHistorialCompras() {
        return historialCompras;
    }

    public void setHistorialCompras(List<String> historialCompras) {
        this.historialCompras = historialCompras;
    }

    public double getTotalGastado() {
        return totalGastado;
    }

    public void setTotalGastado(double totalGastado) {
        this.totalGastado = totalGastado;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + ", Correo: " + correo;
    }
}
