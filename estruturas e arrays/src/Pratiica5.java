import java.util.Scanner;

public class Pratiica5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Tabuada de: ");
        int tabuada = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }
    }
}
