import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println("Ordem aleatória: ");
        Set<Serie> minhasSeries = new HashSet<>() {
            {
                add(new Serie("got", "fantasia", 60));
                add(new Serie("dark", "drama", 60));
                add(new Serie("that 70s show", "comédia", 30));
            }
        };
        for (Serie serie : minhasSeries) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\nOrdem de Inserção: ");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {
            {
                add(new Serie("got", "fantasia", 60));
                add(new Serie("dark", "drama", 60));
                add(new Serie("that 70s show", "comédia", 30));
            }
        };
        for (Serie serie : minhasSeries1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\nOrdem Natural (Tempo Episodio)");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

    }
}
