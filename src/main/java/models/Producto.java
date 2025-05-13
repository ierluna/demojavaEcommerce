package models;

public class Producto {
    //descripción  (atributos)
    String nombre;
    double precio;
    int stock;

    public  Producto(){}
    public  Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void reportarProducto(){
        System.out.println("Nombre del producto: " +nombre+ "Precio: " + precio + "Stock: " + stock);
    }


}
