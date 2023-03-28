import java.util.Objects;

public class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return this.nome;
    }

    public String getGenero() {
        return this.genero;
    }

    public Integer getTempoEpisodio() {
        return this.tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                " nome='" + getNome() + "'" +
                ", genero='" + getGenero() + "'" +
                ", tempoEpisodio='" + getTempoEpisodio() + "'" +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Serie)) {
            return false;
        }
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero)
                && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0)
            return tempoEpisodio;

        return this.getGenero().compareTo(serie.getGenero());
    }
}