package net.salesianos.supermercados;

import java.util.Random;

public class Supermercado {
    private static String[] productos = { "Satisfyer", "Pack de 1906", "Tabaco Manitou", "Powerkinki",
            "Suscripción a ChatGPT",
            "Munchitos", "Pizza de 1€", "Bocadillazo", "Pringles", "Surtido de FoP", "Coca Cola", "Monster" };

    private static String[] clientes = { "Juanes", "Marco", "William", "Ezequiel", "Matías", "Francisco", "Ramiro",
            "Luisón",
            "Ana", "Héctor", "Doménica", "Pepe", "Claudia", "Diego", "Oriana", "Israel", "Marcelo", "Alonso",
            "Alejandro",
            "Giovanni", "Hautacuperche", "Gepeto", "Jhosmar", "Álvaro", "Pastoral" };

    private static Random random = new Random();

    public static String elegirProductoAleatorio() {
        int index = random.nextInt(productos.length);
        return productos[index];
    }

    public static String elegirNombreAleatorio() {
        int index = random.nextInt(clientes.length);
        return clientes[index];
    }

    public static int obtenerNumeroAleatorio(int valorMaximo) {
        return random.nextInt(valorMaximo);
    }
}