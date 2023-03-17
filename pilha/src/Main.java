public class Main {
    public static void main(String[] args) {

        Pilha minhaPila = new Pilha(null);

        minhaPila.push(new No(1));
        minhaPila.push(new No(2));
        minhaPila.push(new No(3));
        minhaPila.push(new No(4));
        minhaPila.push(new No(5));
        minhaPila.push(new No(6));
        System.out.println(minhaPila);

        System.out.println(minhaPila.pop());
        System.out.println(minhaPila);

        minhaPila.push(new No(88));
        System.out.println(minhaPila);

    }
}
