package models;

public class Producto implements Comparable<Producto> {
    protected String titulo;
    protected Precio precio;

    public Producto(String titulo, Precio precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    public int compareTo(Producto producto){
        return this.precio.toInt() - producto.precio.toInt();
    }
}
