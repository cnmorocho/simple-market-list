package models;

public class Contenido {
    private Integer cantidad;
    private String unidad;

    public Contenido(int cantidad, String unidad) {
        this.cantidad = cantidad;
        this.unidad = unidad;
    }

    public String toString() {
        return String.format("%d%s", this.cantidad, this.unidad);
    }
}
