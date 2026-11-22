
package Clases;

public class NodoArbol {

    public Paciente datos;
    public NodoArbol izquierdo;
    public NodoArbol derecho;

    public NodoArbol(Paciente datos) {
        this.datos = datos;
        this.izquierdo = null;
        this.derecho = null;
    }
}

