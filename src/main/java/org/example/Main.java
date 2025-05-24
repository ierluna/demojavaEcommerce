package org.example;

import models.Producto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        {

            int opcionUsuario;
            do {
                System.out.println("""
                        1) Agregar producto
                        2) Listar productos
                        3) Buscar/Actualizar producto
                        4) Eliminar producto
                        5) Crear un pedido
                        6) Listar pedidos
                        7) Salir
                        
                        Elija una opción:
                        """);
                opcionUsuario = entrada.nextInt();

                switch (opcionUsuario) {
                    case 1:
                        System.out.println("Agregar producto");
                        break;
                    case 2:
                        System.out.println("Listar producto");
                        break;
                    case 3:
                        System.out.println("Buscar/Actualizar producto");
                        break;
                    case 4:
                        System.out.println("Eliminar producto...");
                        break;
                    case 5:
                        System.out.println("Crear un pedido...");
                        break;
                    case 6:
                        System.out.println("Listar pedidos...");
                        break;
                    case 7:
                        System.out.println("¡Gracias por usar la app!");
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }
            } while (opcionUsuario != 7);
        }

/*      Producto pepsi = new Producto("Pepsi",500,10);
        Producto cocaCola = new Producto("cocaCola",1000,20);
        Producto cunnington = new Producto("cunnington",800,15);

        ArrayList<Producto> listaDeBebidas = new ArrayList<>();

        listaDeBebidas.add(pepsi);
        listaDeBebidas.add(cocaCola);
        listaDeBebidas.add(cunnington);

        Producto.reportarListaDeProductos(listaDeBebidas);*/
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

    }
}