import java.util.ArrayList;
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

        System.out.println("Posição: " + notas.indexOf(9d));

    }
}
