import java.util.Scanner;

public class Pratica3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maior = 0, soma = 0;
        int cont = 0;

        do {
            System.out.print("Numero: ");
            int numero = scan.nextInt();

            soma += numero;

            if (numero > maior)
                maior = numero;
            cont++;
        } while (cont < 5);
        System.out.println("Maior: " + maior);
        System.out.println("Media: " + (soma / 5));
    }

}
