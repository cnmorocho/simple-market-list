package models;

public class Shampoo extends Producto{
    private Contenido contenido;

    public Shampoo(String titulo, Precio precio, Contenido contenido) {
        super(titulo, precio);
        this.contenido = contenido;

    }

    @Override
    public String toString() {
        return String.format("Nombre: %s /// Contenido: %s /// Precio %s", this.titulo, this.contenido.toString(), this.precio.toString());
    }

}
