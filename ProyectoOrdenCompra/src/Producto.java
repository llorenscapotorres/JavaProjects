public class Producto {

    private String fabricante;
    private String nombre;
    private int precio;

    public Producto(String fabricante, String nombre, int precio) {
        this.fabricante = fabricante;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "[" + this.getFabricante() + ", " + this.getNombre() + ", " + this.getPrecio() + "]";
    }

}
