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

    //GETTERS
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
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

    public void actualizarPrecio(double precio){
        if(precio<0){
            System.out.println("Precio invalido. Por favor ingrese un valor de 0 en adelante.");
        } else {
            this.precio = precio;
            System.out.println("Precio actualizado. El precio actual es: " + this.precio);

        }
    }

    public void actualizarStock(int stock){
        if(stock<0){
            System.out.println("Stock invalido. Por favor ingrese un valor de 0 en adelante.");
        } else {
            this.stock = stock;
            System.out.println("Stock actualizado. El stock actual es: " + this.stock);

        }
    }

    //metodos de busqueda
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


    public static void buscarPorID(ArrayList<Producto> listaProductos, int IDBuscado) {
        boolean encontrado = false;

        for (Producto producto : listaProductos) {
            if (producto.getId() == IDBuscado) {
                producto.reportarProducto();// se encontró el producto
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró el producto");
            System.out.println("\n");
        }
    }

    public static void eliminarProductoPorId(ArrayList<Producto> listaProductos, int Id){
        Producto prod = null;

        for(Producto producto : listaProductos){
            if(producto.getId()==Id){
                prod = producto;
            }
        }
        if (prod == null){
            System.out.print("ID invalido. Producto no encontrado.");
        } else {
            listaProductos.remove(prod);
            System.out.println(prod.nombre + " eliminado.");
        }
    }


}


