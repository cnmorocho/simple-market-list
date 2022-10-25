package models;

public class Bebida extends Producto{
    private Double litros;

    public Bebida(String titulo, Precio precio, Double litros) {
        super(titulo, precio);
        this.litros = litros;
    }

    @Override
    public String mostrarDetalle() {
        return "Nombre: ".concat(this.titulo).concat(" /// Litros: ").concat(this.litros.toString()).concat(" /// Precio: ").concat(this.precio.getPrecio());
    }

}
