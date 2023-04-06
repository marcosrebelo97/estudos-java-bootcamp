package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import org.junit.Test;
import main.Pessoa;

public class PessoaTeste {

    @Test
    public void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        assertEquals(23, jessica.getIdade());
    }

    @Test
    public void deveRetornarSeEhMaiorDeIdade() {
        Pessoa jessica = new Pessoa("Jéssica", LocalDateTime.of(2000, 1, 1, 15, 1, 1));
        assertTrue(jessica.ehMaiorDeIdade());

        // Pessoa joao = new Pessoa("João", LocalDateTime.now());
    }

}
