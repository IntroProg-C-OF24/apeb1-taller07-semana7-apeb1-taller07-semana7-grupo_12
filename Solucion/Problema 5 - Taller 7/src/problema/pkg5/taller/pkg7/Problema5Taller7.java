package problema.pkg5.taller.pkg7;
import java.util.Scanner;
public class Problema5Taller7 {
    public static void main(String[] args) {
        String nomEst, registro;
        double promedio;
        int cont;
        Scanner teclado = new Scanner(System.in);
        cont = 1;
        while (cont <= 4) {
            System.out.println("Ingresar el Nombre del Estudiante");
            nomEst = teclado.next();
            System.out.println("Ingresar Promedio del Estudiante");
            promedio = teclado.nextDouble();
            if (promedio >= 7)
                registro = "Aprobado";
            else {
                registro = "Reprobado";
            }
            System.out.println("| "+nomEst+" | "+promedio+" | "+registro+" |");
            cont++;
        }
    }
}
//Desarrollado por Manuel Gomez