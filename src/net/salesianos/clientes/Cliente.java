package net.salesianos.clientes;

import java.util.Stack;
import net.salesianos.supermercados.Supermercado;

public class Cliente {
    private String nombre;
    private Stack<String> cestaDeCompra;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.cestaDeCompra = new Stack<>();
        this.llenarCesta();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Stack<String> getCestaDeCompra() {
        return this.cestaDeCompra;
    }

    public void setCestaDeCompra(Stack<String> cestaDeCompra) {
        this.cestaDeCompra = cestaDeCompra;
    }

    public void llenarCesta() {
        int totalProductos = Supermercado.obtenerNumeroAleatorio(10) + 1;
        for (int i = 0; i < totalProductos; i++) {
            cestaDeCompra.push(Supermercado.elegirProductoAleatorio());
        }
    }

    @Override
    public String toString() {
        String representacion = "Cliente\n" +
                "===================================\n" +
                "* Nombre: " + this.getNombre() + "\n" +
                "* Total de productos: " + this.getCestaDeCompra().size() + "\n" +
                "* Lista de artículos en la cesta:\n";
        for (String producto : this.getCestaDeCompra()) {
            representacion += producto + "\n";
        }
        representacion += "===================================\n";
        return representacion;
    }
}