package models;

import java.util.ArrayList;

public class Producto {
    //Descripción  (atributos)
    private static int SIGUIENTE_ID = 1;
    private final int id;
    private String nombre;
    private double precio;
    private int stock;

    //Constructor
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.id = SIGUIENTE_ID;
        SIGUIENTE_ID++;
    }

    public int getId() {
        return id;
    }

    public void reportarProducto() {
        System.out.printf("Nombre del producto: %s  Precio: %f  Stock: %d  ID: %d", nombre, precio, stock, id  );
    }

    public static void reportarListaDeProductos(ArrayList<Producto> listaProducto){
        System.out.println("Lista de productos: ");

        for (Producto producto : listaProducto) {
            System.out.println("Producto numero: " + producto.getId());
            producto.reportarProducto();
            System.out.println("\n");
        }
    }
}
