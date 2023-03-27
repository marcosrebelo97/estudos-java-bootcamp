import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class ExSet {
    public static void main(String[] args) {

        System.out.println("Conjunto de notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 7d, 0d, 3.6));
        System.out.println(notas);

        System.out.println("");

    }
}