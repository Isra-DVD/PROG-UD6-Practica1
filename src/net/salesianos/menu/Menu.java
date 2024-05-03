package net.salesianos.menu;

public class Menu {
    public static String mostrar() {
        final String MENU = """
                1. Abrir caja.\n
                2. Añadir nuevo cliente a la cola.\n
                3. Atender cliente.\n
                4. Ver clientes pendientes.\n
                5. Cerrar supermercado.\n
                    """;
        return MENU;
    }
}
