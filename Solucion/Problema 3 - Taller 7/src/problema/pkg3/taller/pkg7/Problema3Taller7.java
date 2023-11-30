package problema.pkg3.taller.pkg7;
import java.util.Scanner;
public class Problema3Taller7 {
    public static void main(String[] args) {
        String nomEmpl;
        double costoDia, valorCancelar;
        int numDias, cont = 1;
        Scanner teclado = new Scanner(System.in);
        while (cont <= 5) {
            System.out.println("Ingresar el nombre del Empleado");
            nomEmpl = teclado.next();
            System.out.println("Ingresar el numero de dias trabajados");
            numDias = teclado.nextInt();
            System.out.println("Ingresar el costo por dia de trabajo");
            costoDia = teclado.nextDouble();
            valorCancelar = numDias * costoDia;
            System.out.println("| "+nomEmpl+" | "+numDias+" | "+costoDia+" | "+valorCancelar+" |");
            cont++;
        }
    }
}
//Desarrollado por Manuel Gomez