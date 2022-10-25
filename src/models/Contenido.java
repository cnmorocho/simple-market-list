package models;

public class Contenido {
    private Integer cantidad;
    private String unidad;

    public Contenido(int cantidad, String unidad) {
        this.cantidad = cantidad;
        this.unidad = unidad;
    }

    public String getContenidoConUnidad() {
        return this.cantidad.toString().concat(this.unidad);
    }
}
