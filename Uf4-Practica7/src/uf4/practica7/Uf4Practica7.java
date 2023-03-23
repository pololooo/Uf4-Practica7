package uf4.practica7;

import java.util.*;

public class Uf4Practica7 {

    static Scanner scan = new Scanner(System.in);

    private Estudiant estudiant;
    private Professor tutor;
    private Grup grup;

    public void afegirEstudiant(int posicio, Estudiant estudiant) {
        estudiants[posicio] = estudiant;
    }

    public int numAprovats() {
        int numAprovats = 0;
        for (Estudiant estudiant : estudiants) {
            if (estudiant.getNotaFinal() >= 5) {
                numAprovats++;
            }
        }
        return numAprovats;
    }

    public static void Menu() {
        int opcion;

        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Numero d'estudiants");
            System.out.println("2. Dades del alumne");
            System.out.println("4. Llista Estudiants Aprovats");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opcio: ");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    establecerNumeroEstudiantes();
                    break;
                case 2:
                    crearEspacioEnVector();
                    break;
                case 3:
                    agregarDatosEstudiantes();
                    break;
                case 4:
                    mostrarNumeroEstudiantesAprobados();
                    break;
                case 5:
                    numAprovats();
                    break;
                default:
                    System.out.println("Opcio no valida");
            }
            System.out.println();
        } while (opcion != 0);
    }

    public static void main(String[] args) {

    }
}
