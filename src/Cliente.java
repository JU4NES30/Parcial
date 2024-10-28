import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String Nombre;
    String Correo;
    List <Producto> productos = new ArrayList<>();


    public void ComprarProducto(Producto producto, int Cantidad){
        if (producto.CantStock >= Cantidad){
            producto.CantStock -= Cantidad;
            productos.add(producto);
            System.out.println("Se ha realizado una compra "+ "\n"+ "Cantidad: "+ Cantidad + "\n" + "Producto: "+ P);
        }

    }
    public void mostrarCompra(){
        System.out.println("cliente: "+ Nombre +"\n" +"Correo: "+ Correo + "\n"+"Producto: " + Producto);

    }

    public Cliente() {
    }

    public Cliente(String nombre, String correo) {
        Nombre = nombre;
        Correo = correo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Nombre='" + Nombre + '\'' +
                ", Correo='" + Correo + '\'' +
                '}';
    }
}
