package models;

public class Bebida extends Producto{
    private Double litros;

    public Bebida(String titulo, Precio precio, Double litros) {
        super(titulo, precio);
        this.litros = litros;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s /// Litros: %.1f /// Precio %s", this.titulo, this.litros, this.precio.toString());
    }

}
