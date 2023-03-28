import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExList {
    public static void main(String[] args) throws Exception {

        List<Double> notas = new ArrayList<>();

        notas.add(10.0);
        notas.add(9.0);
        notas.add(8.0);
        notas.add(11.0);
        notas.add(12.0);

        System.out.println(notas);
        // System.out.println("Posição: " + notas.indexOf(9d));
        notas.add(4, 100d);
        System.out.println(notas);

        notas.set(notas.indexOf(10d), 50.0);
        System.out.println(notas);

        System.out.println("Conferindo nota na lista: " + notas.contains(10d));

        System.out.println("Menor nota: " + Collections.min(notas)); // max p/ maior

        System.out.print("Soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

    }
}
