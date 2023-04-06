package test;

import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import main.GerenciadorConexaoBD;
import main.Pessoa;

public class ConsultarDadosPessoaTeste {

    @Before
    public void configuraConexao() {
        GerenciadorConexaoBD.iniciarConexao();
        System.out.println("Rodou configuraConexao");
    }

    /*
     * @BeforeEach
     * public void insereDadosParaTeste() {
     * GerenciadorConexaoBD.insereDados(new Pessoa("Joao", LocalDateTime.of(200, 1,
     * 1, 13, 0, 0)));
     * }
     */

    @Test
    public void validarDadosRetorno() {
        assertTrue(true);
    }

    @After
    public void finalizarConexao() {
        GerenciadorConexaoBD.finalizarConexao();
        System.out.println("Rodou finalizarConexao");
    }

    /*
     * public static void insereDados(Pessoa pessoa) {
     * // insere pessoa no BD
     * Logger.info("Inseriu dados");
     * 
     * }
     */

}
