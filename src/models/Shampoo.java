package models;

public class Shampoo extends Producto{
    private Contenido contenido;

    public Shampoo(String titulo, Precio precio, Contenido contenido) {
        super(titulo, precio);
        this.contenido = contenido;

    }

    @Override
    public String mostrarDetalle() {
        return "Nombre: ".concat(this.titulo).concat(" /// Contenido: ").concat(this.contenido.getContenidoConUnidad()).concat(" /// Precio: ").concat(this.precio.getPrecio());
    }

}
