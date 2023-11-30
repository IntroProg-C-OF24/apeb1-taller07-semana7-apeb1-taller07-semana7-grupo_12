package problema.pkg4.taller.pkg7;
import java.util.Scanner;
public class Problema4Taller7 {
    public static void main(String[] args) {
        String nomJug, posicion;
        int numJug, cont, edad, num;
        double estatura;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el Numero de Jugadores que desea registrar");
        numJug = teclado.nextInt();
        num = 0;
        cont = 1;
        while (cont <= numJug) {
            System.out.println("Ingresar el Nombre del jugador");
            nomJug = teclado.next();
            System.out.println("Ingresar la Posicion en el campo de juego");
            posicion = teclado.next();
            System.out.println("Ingresar la Edad del jugador");
            edad = teclado.nextInt();
            System.out.println("Ingresar la Estatura del jugador");
            estatura = teclado.nextDouble();
            num = num + 1;
            System.out.println(num+" "+nomJug+" "+"-"+posicion+"-"+", "+edad+"edad"+", "+"estatura"+estatura);
            cont++;
        }
    }
}
//Desarrollado por Manuel Gomez