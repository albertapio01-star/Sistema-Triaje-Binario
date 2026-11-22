
package Clases;

public class Paciente {

    private String nombre;
    private String cedula;
    private String sintoma;
    private int puntajeRiesgo;

    public Paciente(String nombre, String cedula, String sintoma, int puntajeRiesgo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.sintoma = sintoma;
        this.puntajeRiesgo = puntajeRiesgo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getSintoma() {
        return sintoma;
    }

    public int getPuntajeRiesgo() {
        return puntajeRiesgo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               " | Cedula: " + cedula +
               " | Sintoma: " + sintoma +
               " | Riesgo: " + puntajeRiesgo;
    }
}
