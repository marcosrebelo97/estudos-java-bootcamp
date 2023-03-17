import java.util.Scanner;

public class Pratica1 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Nome: ");
            String nome = scan.next();
            if (nome.equals("0"))
                break;
            System.out.println("Idade: ");
            int idade = scan.nextInt();

        }
        System.out.println("Continua aqui");

    }

}
