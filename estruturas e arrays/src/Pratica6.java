import java.util.Scanner;

public class Pratica6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Fatorial: ");
        int fatorial = scan.nextInt();
        int mult = 1;

        System.out.print(fatorial + " ! = ");
        for (int i = fatorial; i >= 1; i--) {
            mult = mult * i;
        }
        System.out.println(mult);
    }
}
