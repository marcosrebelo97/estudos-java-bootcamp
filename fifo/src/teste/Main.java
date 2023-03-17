package teste;

public class Main {
    public static void main(String[] args) {

        Fifo minhaFila = new Fifo();

        minhaFila.enqueue(new No("primeiro"));
        minhaFila.enqueue(new No("segundo"));
        minhaFila.enqueue(new No("terceiro"));
        minhaFila.enqueue(new No("quarto"));

        System.out.println(minhaFila);

        /*
         * System.out.println(minhaFila.dequeue());
         * System.out.println(minhaFila);
         */

        /*
         * testando
         * System.out.println(minhaFila.first());
         * System.out.println(minhaFila);
         */
    }

}
