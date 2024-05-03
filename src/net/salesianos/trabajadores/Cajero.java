package net.salesianos.trabajadores;

import java.util.LinkedList;
import net.salesianos.clientes.Cliente;
import net.salesianos.supermercados.Supermercado;

public class Cajero {
    private int numeroDeCaja;
    private LinkedList<Cliente> clientesEnFila;
    private boolean cajaAbierta;

    public Cajero(int numeroDeCaja) {
        this.numeroDeCaja = numeroDeCaja;
        this.clientesEnFila = new LinkedList<>();
        this.cajaAbierta = false;
    }

    public void abrirCaja() {
        if (!cajaAbierta) {
            cajaAbierta = true;
            System.out.println("Caja abierta con exito.\n");
        } else {
            System.out.println("La caja ya estaba abierta.\n");
        }
    }

    public void agregarClienteACola() {
        if (cajaAbierta) {
            Cliente cliente = new Cliente(Supermercado.elegirNombreAleatorio());
            clientesEnFila.add(cliente);
            System.out.println(cliente.toString());
        } else {
            System.out.println("La caja debe estar abierta para poder añadir a un cliente a la cola.\n");
        }

    }

    public void atenderCliente() {
        if (cajaAbierta) {
            if (!clientesEnFila.isEmpty()) {
                Cliente clienteActual = clientesEnFila.poll();
                System.out.println("El cliente: " + clienteActual.getNombre() + " ya fue atendido.\n");
            } else {
                System.out.println("No hay clientes en la fila.\n");
            }
        } else {
            System.out.println("La caja debe estar abierta\n");
        }

    }

    public String verClientesPendientes() {
        if (cajaAbierta) {
            if (clientesEnFila.isEmpty()) {
                return "Cajero\n" +
                        "===================================\n" +
                        "* Número de caja: " + this.numeroDeCaja + ":\n" + "No hay clientes pendientes a atender.\n";
            } else {
                String representacion = "Cajero\n" +
                        "===================================\n" +
                        "* Número de caja: " + this.numeroDeCaja + ":\n" +
                        "* Total de clientes: " + this.clientesEnFila.size() + "\n" +
                        "* Clientes en la fila:\n";
                for (Cliente cliente : this.clientesEnFila) {
                    representacion += cliente.toString();
                }
                representacion += "===================================\n";
                return representacion;
            }
        } else {
            return "La caja debe estar abierta.\n";
        }

    }

    public boolean noQuedanClientes() {
        return clientesEnFila.isEmpty();
    }

    public void cerrarCaja() {
        if (clientesEnFila.isEmpty()) {
            cajaAbierta = false;
            System.out.println("La caja está cerrada. ¡Don Bosco les bendiga!");
        } else {
            System.out.println("No se puede cerrar la caja, todavía hay clientes esperando.");
        }
    }

    public boolean cerrarSupermercado(Cajero caja) {
        if (caja.noQuedanClientes()) {
            caja.cerrarCaja();
            return false;
        } else {
            System.out.println("La caja debe estar vacia para poder cerrar");
            return true;
        }
    }

    public int getNumeroDeCaja() {
        return numeroDeCaja;
    }

    public void setNumeroDeCaja(int numeroDeCaja) {
        this.numeroDeCaja = numeroDeCaja;
    }

    public LinkedList<Cliente> getClientesEnFila() {
        return clientesEnFila;
    }

    public void setClientesEnFila(LinkedList<Cliente> clientesEnFila) {
        this.clientesEnFila = clientesEnFila;
    }

    public boolean isCajaAbierta() {
        return cajaAbierta;
    }

    public void setCajaAbierta(boolean cajaAbierta) {
        this.cajaAbierta = cajaAbierta;
    }

}