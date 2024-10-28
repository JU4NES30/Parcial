public class Celular extends Producto {
    int CapacidadBateria;
    int ResolucioCamara;

    public Celular() {
    }

    public Celular(String nombre, String marca, int precio, int cantStock, int capacidadBateria, int resolucioCamara) {
        super(nombre, marca, precio, cantStock);
        CapacidadBateria = capacidadBateria;
        ResolucioCamara = resolucioCamara;
    }

    public int getCapacidadBateria() {
        return CapacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        CapacidadBateria = capacidadBateria;
    }

    public int getResolucioCamara() {
        return ResolucioCamara;
    }

    public void setResolucioCamara(int resolucioCamara) {
        ResolucioCamara = resolucioCamara;
    }


    @Override
    String MostrarDetalles() {
        return "Celular{" +
                "CapacidadBateria=" + CapacidadBateria +
                ", ResolucioCamara=" + ResolucioCamara +
                ", Nombre='" + Nombre + '\'' +
                ", Marca='" + Marca + '\'' +
                ", precio=" + precio +
                ", CantStock=" + CantStock +
                '}';
    }
}
