public class Main extends Cliente {
    public static void main(String[] args) {

        Laptop  portatil1 = new Laptop("macbook", "Apple", 200000, 200, "A16",32);
        Celular Celular1 = new Celular("Note 11", "Xiaomi", 150000, 10, 5500, 50);
        Cliente cliente1 = new Cliente("Juan perez", "JuanPerez@gmail.com");

        cliente1.ComprarProducto(Celular1, 3);
        cliente1.mostrarCompra();





    }


}