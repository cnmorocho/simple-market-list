package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaDeProductos {
    private List<Producto> productos = new ArrayList<>();

    public void mostrarProductos() {
        productos.forEach(producto -> {
            System.out.println(producto.toString());
        });
        System.out.println("=============================");
        System.out.println("Producto mas caro: ".concat(this.productoMasCaro()));
        System.out.println("Producto mas barato: ".concat(this.productoMasBarato()));
    }

    public void agregarProductos(Producto producto) {
        productos.add(producto);
    }

    public String productoMasCaro() {
        return this.obtenerProducto(this.productos.size() - 1).titulo;
    }

    public String productoMasBarato() {
        return this.obtenerProducto(0).titulo;
    }

    private Producto obtenerProducto(int index) {
        Collections.sort(this.productos);
        return this.productos.get(index);
    }

}
