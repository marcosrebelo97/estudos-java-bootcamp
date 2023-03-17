import java.util.Scanner;

import javax.lang.model.element.QualifiedNameable;

public class Pratica8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qntdConsoantes = 0;

        int cont = 0;
        do {
            System.out.print("Letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                consoantes[cont] = letra;
                qntdConsoantes++;
            }
            cont++;
        } while (cont < consoantes.length);

        for (String consoante : consoantes) {
            if (consoante != null)
                System.out.println("Consoante: " + consoante + " ");
        }
    }
}
