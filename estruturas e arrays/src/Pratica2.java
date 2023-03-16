import java.util.Scanner;

public class Pratica2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.print("Nota: ");
        nota = scan.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.println("Nota invalida!! Digite novamente: ");
            nota = scan.nextInt();
        }
    }
}
