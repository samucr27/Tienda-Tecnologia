public class Laptop extends Producto implements Vendible {
    private String procesador;
    private int memoriaRAM;

    public Laptop(String nombre, String marca, double precio, int cantidadStock, String procesador, int memoriaRAM) {
        super(nombre, marca, precio, cantidadStock);
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Laptop - " + toString());
    }

    @Override
    public double calcularPrecioVenta(int cantidad) {
        double total = precio * cantidad;
        return cantidad > 5 ? total * 0.9 : total;
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
        return super.toString() + ", Procesador: " + procesador + ", RAM: " + memoriaRAM + "GB";
    }
}

