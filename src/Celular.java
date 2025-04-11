public class Celular extends Producto implements Vendible {
    private int capacidadBateria;
    private String camaraResolucion;

    public Celular(String nombre, String marca, double precio, int cantidadStock, int capacidadBateria, String camaraResolucion) {
        super(nombre, marca, precio, cantidadStock);
        this.capacidadBateria = capacidadBateria;
        this.camaraResolucion = camaraResolucion;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Celular - " + toString());
    }

    @Override
    public double calcularPrecioVenta(int cantidad) {
        double total = precio * cantidad;
        return cantidad > 5 ? total * 0.95 : total;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public String getCamaraResolucion() {
        return camaraResolucion;
    }

    public void setCamaraResolucion(String camaraResolucion) {
        this.camaraResolucion = camaraResolucion;
    }

    @Override
    public String toString() {
        return super.toString() + ", Batería: " + capacidadBateria + "mAh, Cámara: " + camaraResolucion;
    }
}

