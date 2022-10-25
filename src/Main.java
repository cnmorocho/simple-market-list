import models.*;

public class Main {
    public static void main(String[] args) {
        ListaDeProductos lista = new ListaDeProductos();
        lista.agregarProductos(new Bebida("Coca-Cola", new Precio(18),1.5));
        lista.agregarProductos(new Bebida("Coca-Cola Zero", new Precio(20),1.5));
        lista.agregarProductos(new Shampoo("Shampoo Sedal", new Precio(19), new Contenido(500, "ml")));
        lista.agregarProductos(new Fruta("Frutillas", new Precio(64), "kilo"));
        lista.mostrarProductos();
    }
}