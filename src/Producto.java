public abstract class Producto {
    protected String nombre;
    protected String marca;
    protected double precio;
    protected int cantStock;

    public Producto() {
    }

    public Producto(String nombre, String marca, double precio, int cantStock) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantStock = cantStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantStock() {
        return cantStock;
    }

    public void setCantStock(int cantStock) {
        this.cantStock = cantStock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", cantStock=" + cantStock +
                '}';
    }


    public void reduStock(int cantidad) {

    }
}
