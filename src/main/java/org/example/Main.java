package org.example;

import models.Producto;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Producto pepsi = new Producto("Pepsi",500,10);
        Producto cocaCola = new Producto("cocaCola",1000,20);
        Producto cunnington = new Producto("cunnington",800,15);

        ArrayList<Producto> listaDeBebidas = new ArrayList<>();

        listaDeBebidas.add(pepsi);
        listaDeBebidas.add(cocaCola);
        listaDeBebidas.add(cunnington);

        //Producto.reportarListaDeProductos(listaDeBebidas);

        //Producto.buscarPorNombre(listaDeBebidas, "cocaCola");
        //Producto.buscarPorNombre(listaDeBebidas, "cunnington");

        //Producto.buscarPorID(listaDeBebidas, 3); //retorna cunnington
        //Producto.buscarPorID(listaDeBebidas, 4); //retorna no se encontro el producto

 /*       pepsi.actualizarPrecio(-5);
        pepsi.reportarProducto();
        pepsi.actualizarPrecio(5.200);
        pepsi.reportarProducto();
        pepsi.actualizarStock(-3);
        pepsi.reportarProducto();
        pepsi.actualizarStock(3000);
        pepsi.reportarProducto();
*/

        Producto.eliminarProductoPorId(listaDeBebidas,3);
        Producto.eliminarProductoPorId(listaDeBebidas,3);
    }
}