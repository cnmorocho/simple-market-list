package models;

public class Fruta extends Producto {
    private String unidadDeVenta;

    public Fruta(String titulo, Precio precio, String unidadDeVenta) {
        super(titulo, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String mostrarDetalle() {
        return "Nombre: ".concat(this.titulo).concat(" /// Precio: ").concat(this.precio.getPrecio()).concat(" /// Unidad de venta: ").concat(this.unidadDeVenta);
    }
}
