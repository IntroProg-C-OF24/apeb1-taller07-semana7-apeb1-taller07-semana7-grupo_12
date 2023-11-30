package problema.pkg7.taller.pkg7;
public class Problema7Taller7 {
    public static void main(String[] args) {
        int n = 1, d = 1;
        String signo;
        signo = "-";
        while (d <= 10) {
            System.out.println(signo+"("+n+"/"+d+")");
            d = d + 1;
            if (d % 2 == 0) {
                signo = "+";
            }
            else {
                signo = "-";
            }
        }
    }
}
//Desarrollado por Manuel Gomez