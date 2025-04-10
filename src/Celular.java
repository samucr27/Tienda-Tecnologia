public abstract class Celular extends Producto implements Vendible{
    private int capBateria;
    private double camResol;

    public Celular(String nombre, String marca, double precio, int cantStock, int capBancaria, double camResol) {
        super(nombre, marca, precio, cantStock);
        this.capBateria = capBancaria;
        this.camResol = camResol;
    }

    public int getCapBancaria() {
        return capBateria;
    }

    public void setCapBancaria(int capBancaria) {
        this.capBateria = capBancaria;
    }

    public double getCamResol() {
        return camResol;
    }

    public void setCamResol(double camResol) {
        this.camResol = camResol;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "capBancaria=" + capBateria +
                ", camResol=" + camResol +
                '}';
    }

    public void mostrarDetalles() {
        System.out.println("Celular: " + nombre + ", Marca: " + marca + ", Batería: " + capBateria + "mAh, Cámara: " + camResol + "mp, Precio: $" + precio + ", Stock: " + cantStock);
    }

    public double calcularPrecioVenta(int cantidad) {
        double total = precio * cantidad;
        if (cantidad > 5) {
            total *= 0.85;
        }
        return total;
    }
}
