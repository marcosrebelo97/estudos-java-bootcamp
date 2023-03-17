public class Pratica7 {
    public static void main(String[] args) {

        int[] vetor = { 10, -15, 8, 50, 9, 4 };
        int cont = 0;

        System.out.print("Vetor: ");
        while (cont < vetor.length) {
            System.out.print(vetor[cont] + " ");
            cont++;
        }

        System.out.print("\nOrdem inversa: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
