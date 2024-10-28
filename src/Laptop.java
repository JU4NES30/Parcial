public class Laptop extends Producto{
    String Procesador;
    int MemoriaRam;

    public Laptop() {
    }

    public Laptop(String nombre, String marca, int precio, int cantStock, String procesador, int memoriaRam) {
        super(nombre, marca, precio, cantStock);
        Procesador = procesador;
        MemoriaRam = memoriaRam;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String procesador) {
        Procesador = procesador;
    }

    public int getMemoriaRam() {
        return MemoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        MemoriaRam = memoriaRam;
    }

    @Override
    String MostrarDetalles() {
        return "Laptop{" +
                "Procesador='" + Procesador + '\'' +
                ", MemoriaRam=" + MemoriaRam +
                ", Nombre='" + Nombre + '\'' +
                ", Marca='" + Marca + '\'' +
                ", precio=" + precio +
                ", CantStock=" + CantStock +
                '}';
    }
}
