import java.util.Scanner;

public class Pratica4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qntdNumeros, qntdPares = 0, qntdImpares = 0;
        int numero;

        System.out.println("Quantidade de números: ");
        qntdNumeros = scan.nextInt();

        int cont = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0)
                qntdPares++;
            else
                qntdImpares++;

            cont++;
        } while (cont < qntdNumeros);

        System.out.println("Quantidade Par: " + qntdPares);
        System.out.println("Quantidade Ímpar: " + qntdImpares);

    }

}
