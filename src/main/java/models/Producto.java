package models;

public class Producto {
    //Descripción  (atributos)
    private static int  SIGUIENTE_ID =1;
    private final int id;
    private String nombre;
    private double precio;
    private int stock;

    //Constructor
    public  Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.id = SIGUIENTE_ID;
        SIGUIENTE_ID++;
    }


    public void reportarProducto(){
        System.out.println("Nombre del producto: " +nombre+ " Precio: " + precio + " Stock: " + stock + " ID: " + id);
    }


}
