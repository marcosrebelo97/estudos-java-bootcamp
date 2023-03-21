public class Main {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> minhalistaEncadeada = new ListaDuplamenteEncadeada<>();

        minhalistaEncadeada.add("c1");
        minhalistaEncadeada.add("c2");
        minhalistaEncadeada.add("c3");
        minhalistaEncadeada.add("c4");
        minhalistaEncadeada.add("c5");
        minhalistaEncadeada.add("c6");
        minhalistaEncadeada.add("c7");
        minhalistaEncadeada.add("c8");

        System.out.println(minhalistaEncadeada);

        // testes
        minhalistaEncadeada.remove(3);

        minhalistaEncadeada.add(3, "99");

        System.out.println(minhalistaEncadeada);

        System.out.println(minhalistaEncadeada.get(3));
    }
}
