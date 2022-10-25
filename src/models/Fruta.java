package models;

public class Fruta extends Producto {
    private String unidadDeVenta;

    public Fruta(String titulo, Precio precio, String unidadDeVenta) {
        super(titulo, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s /// Precio: %s /// Unidad de venta: %s", this.titulo, this.precio.toString(), this.unidadDeVenta);
    }
}
