public abstract class Laptop extends Producto implements Vendible{
    private String procesador;
    private int memoriaRAM;

    public Laptop(String nombre, String marca, double precio, int cantStock, String procesador, int memoriaRAM) {
        super(nombre, marca, precio, cantStock);
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "procesador='" + procesador + '\'' +
                ", memoriaRAM=" + memoriaRAM +
                '}';
    }

    public void mostrarDetalles() {
        System.out.println("Laptop: " + nombre + ", Marca: " + marca + ", Procesador: " + procesador + ", RAM: " + memoriaRAM + "GB, Precio: $" + precio + ", Stock: " + cantStock);
    }

    public double calcularPrecioVenta(int cantidad) {
        double total = precio * cantidad;
        if (cantidad > 5) {
            total *= 0.9; // 10% de descuento
        }
        return total;
    }

}
