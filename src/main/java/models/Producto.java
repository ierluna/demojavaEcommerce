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

    public String getNombre() {
        return nombre;
    }

    public void reportarProducto() {
        System.out.printf("Nombre del producto: %s  Precio: %f  Stock: %d  ID: %d", nombre, precio, stock, id);
        System.out.println("\n");
    }

    public static void reportarListaDeProductos(ArrayList<Producto> listaProducto) {
        System.out.println("Lista de productos: ");

        for (Producto producto : listaProducto) {
            System.out.println("Producto numero: " + producto.getId());
            producto.reportarProducto();
            System.out.println("\n");
        }
    }

    public static void buscarPorNombre(ArrayList<Producto> listaProductos, String nombreBuscado) {
        boolean encontrado = false;

        for (Producto producto : listaProductos) {
            if (producto.getNombre().equalsIgnoreCase(nombreBuscado)) {
                producto.reportarProducto();// se encontró el producto
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró el producto");
            System.out.println("\n");
        }
    }
}


