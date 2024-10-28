public abstract class Producto {
    String Nombre;
    String Marca;
    int precio;
    int CantStock;

    abstract String MostrarDetalles();

    public Producto() {
    }

    public Producto(String nombre, String marca, int precio, int cantStock) {
        Nombre = nombre;
        Marca = marca;
        this.precio = precio;
        CantStock = cantStock;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantStock() {
        return CantStock;
    }

    public void setCantStock(int cantStock) {
        CantStock = cantStock;
    }
}
