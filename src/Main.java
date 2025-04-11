import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        productos.add(new Laptop("VivoBook","Asus",2500000,20, "Intel i5", 16));
        productos.add(new Laptop("Ideapad","Lenovo",1750000,25, "AMD Ryzen 5", 16));
        productos.add(new Laptop("Victus","Hp",3500000,15, "Intel i5", 16));

        productos.add(new Celular("Iphone 14","Apple", 2750000,20,4323,"1080mp"));
        productos.add(new Celular("Redmi note 13","Xiaomi", 950000,20,3700,"540mp"));
        productos.add(new Celular("A24","Samsung", 2500000,15,4178,"1080mp"));


        System.out.println("Bienvenido a la tienda de tecnologia");
        System.out.println("Ingrese su nombre: ");
        String nombreCliente = teclado.nextLine();
        System.out.println("Ingrese su correo: ");
        String correoCliente = teclado.nextLine();

        Cliente cliente = new Cliente(nombreCliente, correoCliente);

        int op;

        do {
            System.out.println("""
                    Menu de opciones
                    1. Ver productos disponibles
                    2. Comprar productos
                    3. Resumen de compra
                    4. Salir
                    """);
            op = teclado.nextInt();

            switch (op){
                case 1 ->{
                    System.out.println("Productos disponibles");
                    for (int i = 0; i< productos.size();i++){
                        System.out.print((i+1) + ".");

                        productos.get(i).mostrarDetalles();
                    }
                }
                case 2 -> {
                    System.out.println("Seleccione un producto");
                    for (int i = 0; i < productos.size(); i++) {
                        System.out.println((i + 1) + "." + productos.get(i).getNombre() + " Stock: " + productos.get(i).getCantidadStock());
                    }
                    int productoIndex = teclado.nextInt() - 1;
                    Producto producto = productos.get(productoIndex);

                    System.out.println("Cantidad a comprar: ");
                    int cantidad = teclado.nextInt();

                    cliente.comprarProducto(producto, cantidad);

                }
                case 3->{
                    cliente.mostrarCompra();
                }
                case 4->{
                    System.out.println("Saliendo...");
                }
                default -> {
                    System.out.println("Opcion invalida");
                }
            }

        } while (op != 4);
        teclado.close();
    }
}