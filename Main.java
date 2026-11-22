// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import Clases.ArbolBinarioTriaje;
import Clases.Paciente;
import java.util.Scanner;

public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      ArbolBinarioTriaje var2 = new ArbolBinarioTriaje();
      var2.insertar(new Paciente("Carlos Mendoza", "10984512", "Dolor toracico leve", 50));
      var2.insertar(new Paciente("Ana Lucia Gomez", "52418963", "Esguince de tobillo", 25));
      var2.insertar(new Paciente("Jorge Ramirez", "80147258", "Dificultad respiratoria", 80));
      var2.insertar(new Paciente("Maria Fernanda Ruiz", "10203040", "Fiebre moderada", 15));
      var2.insertar(new Paciente("Luis Eduardo Torres", "79456123", "Trauma craneoencefalico", 95));
      int var3 = 0;

      do {
         System.out.println("\n==============================================");
         System.out.println(" SISTEMA DE TRIAJE MEDICO - ARBOL BINARIO");
         System.out.println("==============================================");
         System.out.println("1. Registrar paciente");
         System.out.println("2. Visualizar arbol");
         System.out.println("3. Listar pacientes en orden");
         System.out.println("4. Mostrar paciente mas critico");
         System.out.println("5. Buscar paciente por riesgo");
         System.out.println("6. Guardar respaldo en TXT");
         System.out.println("7. Salir");
         System.out.print("Seleccione una opcion: ");
         var3 = var1.nextInt();
         var1.nextLine();
         switch (var3) {
            case 1:
               System.out.print("Nombre del paciente: ");
               String var4 = var1.nextLine();
               System.out.print("Cedula: ");
               String var5 = var1.nextLine();
               System.out.print("Sintoma principal: ");
               String var6 = var1.nextLine();
               System.out.print("Puntaje de riesgo (1 - 100): ");
               int var7 = var1.nextInt();
               var1.nextLine();
               var2.insertar(new Paciente(var4, var5, var6, var7));
               System.out.println("Paciente registrado correctamente.");
               break;
            case 2:
               System.out.println("--- ESTRUCTURA DEL ARBOL ---");
               var2.imprimirEstructura();
               break;
            case 3:
               System.out.println("--- PACIENTES ORDENADOS ---");
               var2.mostrarInOrden();
               break;
            case 4:
               Paciente var8 = var2.obtenerMasCritico();
               if (var8 != null) {
                  System.out.println("PACIENTE MAS CRITICO: " + String.valueOf(var8));
               } else {
                  System.out.println("No hay pacientes registrados.");
               }
               break;
            case 5:
               System.out.print("Ingrese el puntaje de riesgo: ");
               int var9 = var1.nextInt();
               var1.nextLine();
               Paciente var10 = var2.buscarPorRiesgo(var9);
               if (var10 != null) {
                  System.out.println("Paciente encontrado: " + String.valueOf(var10));
               } else {
                  System.out.println("No existe un paciente con ese riesgo.");
               }
               break;
            case 6:
               var2.guardarRespaldoTXT();
               break;
            case 7:
               System.out.println("Saliendo del sistema...");
               break;
            default:
               System.out.println("Opcion no valida.");
         }
      } while(var3 != 7);

      var1.close();
   }
}
