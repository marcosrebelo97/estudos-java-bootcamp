package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.time.LocalDateTime;

import org.junit.Test;

import main.Pessoa;

public class AssertionsTeste {

    @Test
    public void validarLancamento() {
        int[] primeiroLancamento = { 10, 20, 30, 40, 50 };
        int[] segundoLancamento = { 10, 20, 30, 40, 50 };

        assertArrayEquals(primeiroLancamento, segundoLancamento);

    }

    @Test
    public void validarObjetoEstaNulo() {
        Pessoa pessoa = null;
        assertNull(pessoa);

        /*
         * pessoa = new Pessoa("Luciano", LocalDateTime.now());
         * assertNull(pessoa);
         */
    }

    @Test
    public void validarNumerosDeTiposDiferentes() {
        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(outroValor, valor, outroValor);
    }

}
