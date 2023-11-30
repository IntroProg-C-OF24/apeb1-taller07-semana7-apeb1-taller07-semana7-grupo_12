package problema.pkg6.taller.pkg7;
import java.util.Scanner;
public class Problema6Taller7 {
    public static void main(String[] args) {
        String nomCliente;
        int cont, tipoCliente;
        double costoComp, costoCompDesct;
        Scanner  teclado = new Scanner(System.in);
        cont = 1;
        while (cont <= 7) {
            System.out.println("Ingresar el Nombre del Cliente");
            nomCliente = teclado.next();
            System.out.println("Ingresar el Costo de la Computadora");
            costoComp = teclado.nextDouble();
            System.out.println("Ingresar el numero de Tipo de Cliente");
            System.out.println("Tipo 1 ---> 10% de descuento");
            System.out.println("Tipo 2 ---> 20% de descuento");
            System.out.println("Tipo 0 ---> no hay descuento");
            tipoCliente = teclado.nextInt();
            switch (tipoCliente){
                case 1:
                    costoCompDesct = (costoComp*10)/100;
                case 2:
                    costoCompDesct = (costoComp*20)/100;
                default:
                    costoCompDesct = costoComp;
            }
            System.out.println("| "+nomCliente+" | "+costoComp+" | "+costoCompDesct+" |");
            cont++;
        }
    }
}
//Desarrollado por Manuel Gomez