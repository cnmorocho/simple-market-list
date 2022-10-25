package models;

public class Precio {
    private Integer precio;

    public Precio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return String.format("$%d", this.precio);
    }

    public int toInt() {
        return this.precio;
    }
}
