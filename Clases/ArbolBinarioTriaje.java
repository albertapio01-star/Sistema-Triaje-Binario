
package Clases;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ArbolBinarioTriaje {


    public NodoArbol raiz;

    public ArbolBinarioTriaje() {
        raiz = null;
    }

    // Insertar paciente en el arbol
    public void insertar(Paciente nuevoPaciente) {
        raiz = insertarRecursivo(raiz, nuevoPaciente);
    }

    private NodoArbol insertarRecursivo(NodoArbol actual, Paciente paciente) {

        if (actual == null) {
            return new NodoArbol(paciente);
        }

        if (paciente.getPuntajeRiesgo() < actual.datos.getPuntajeRiesgo()) {
            actual.izquierdo = insertarRecursivo(actual.izquierdo, paciente);
        } else {
            actual.derecho = insertarRecursivo(actual.derecho, paciente);
        }

        return actual;
    }

    // Mostrar pacientes en orden
    public void mostrarInOrden() {
        if (raiz == null) {
            System.out.println("El arbol esta vacio.");
            return;
        }

        recorrerInOrden(raiz);
    }

    private void recorrerInOrden(NodoArbol nodo) {
        if (nodo == null) return;

        recorrerInOrden(nodo.izquierdo);
        System.out.println(nodo.datos);
        recorrerInOrden(nodo.derecho);
    }

    // Buscar paciente por riesgo
    public Paciente buscarPorRiesgo(int puntaje) {
        return buscarRecursivo(raiz, puntaje);
    }

    private Paciente buscarRecursivo(NodoArbol actual, int puntaje) {
        if (actual == null) return null;

        if (actual.datos.getPuntajeRiesgo() == puntaje) {
            return actual.datos;
        }

        if (puntaje < actual.datos.getPuntajeRiesgo()) {
            return buscarRecursivo(actual.izquierdo, puntaje);
        } else {
            return buscarRecursivo(actual.derecho, puntaje);
        }
    }

    // Obtener paciente mas critico
    public Paciente obtenerMasCritico() {
        if (raiz == null) return null;

        NodoArbol actual = raiz;

        while (actual.derecho != null) {
            actual = actual.derecho;
        }

        return actual.datos;
    }

    // Mostrar estructura del arbol
    public void imprimirEstructura() {
        if (raiz == null) {
            System.out.println("El arbol esta vacio.");
            return;
        }

        imprimirNodo(raiz, "", true, "RAIZ");
    }

    private void imprimirNodo(NodoArbol nodo, String sangria,
                              boolean esUltimo, String rama) {

        if (nodo == null) return;

        System.out.print(sangria);
        System.out.print(esUltimo ? "└── " : "├── ");
        System.out.println("[" + rama + "] " +
                nodo.datos.getNombre() +
                " (Riesgo: " + nodo.datos.getPuntajeRiesgo() + ")");

        sangria += esUltimo ? " " : "│ ";

        if (nodo.izquierdo != null || nodo.derecho != null) {

            if (nodo.izquierdo != null) {
                imprimirNodo(nodo.izquierdo, sangria,
                        nodo.derecho == null, "IZQ <");
            }

            if (nodo.derecho != null) {
                imprimirNodo(nodo.derecho, sangria,
                        true, "DER >=");
            }
        }
    }
    // Guardar respaldo de pacientes en un archivo TXT
public void guardarRespaldoTXT() {

    try (PrintWriter archivo = new PrintWriter(
            new FileWriter("RespaldoPacientesJava.txt"))) {

        guardarInOrden(raiz, archivo);

        System.out.println("Respaldo guardado correctamente.");

    } catch (IOException e) {
        System.out.println("Error al guardar el respaldo: " + e.getMessage());
    }
}

// Recorrer el arbol y guardar los pacientes
private void guardarInOrden(NodoArbol nodo, PrintWriter archivo) {

    if (nodo == null) {
        return;
    }

    guardarInOrden(nodo.izquierdo, archivo);

    archivo.println(nodo.datos.toString());

    guardarInOrden(nodo.derecho, archivo);
}
}
