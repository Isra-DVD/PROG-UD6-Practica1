import java.util.Scanner;
import net.salesianos.menu.Menu;
import net.salesianos.trabajadores.Cajero;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner escaner = new Scanner(System.in);
        boolean seguirPreguntando = true;
        Cajero caja = new Cajero(1);

        do {

            System.out.println(Menu.mostrar());
            String opcionUsuario = escaner.nextLine();

            switch (opcionUsuario) {
                case "1":
                    caja.abrirCaja();
                    break;
                case "2":
                    caja.agregarClienteACola();
                    break;
                case "3":
                    caja.atenderCliente();
                    break;
                case "4":
                    System.out.println(caja.verClientesPendientes());
                    break;

                case "5":
                    seguirPreguntando = caja.cerrarSupermercado(caja);
                    break;

                default:
                    System.out.println("Ha introducido un valor erroneo, vuelva a intentarlo\n");
                    break;
            }

        } while (seguirPreguntando);

        escaner.close();
    }
}