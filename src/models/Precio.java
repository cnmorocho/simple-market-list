package models;

public class Precio {
    private Integer precio;

    public Precio(int precio) {
        this.precio = precio;
    }

    public String getPrecio() {
        return "$".concat(this.precio.toString());
    }

    public int toInt() {
        return this.precio;
    }
}
