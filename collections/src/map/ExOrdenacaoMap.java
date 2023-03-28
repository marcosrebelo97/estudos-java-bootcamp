import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ExOrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("Ordem aleatória: ");
        Map<String, Livro> meusLivros = new HashMap<>() {
            {
                put("Hawking, Stephen", new Livro("Uma breve história do tempo", 350));
                put("Duhingg Charles", new Livro("O poder do hábito", 408));
            }
        };
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue());
        }
    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return this.nome;
    }

    public Integer getPaginas() {
        return this.paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Livro)) {
            return false;
        }
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(paginas, livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return " nome = " + getNome() +
                ", paginas = " + getPaginas();
    }

}