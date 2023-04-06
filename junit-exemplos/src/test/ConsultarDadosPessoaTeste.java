package test;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.*;

import main.GerenciadorConexaoBD;

public class ConsultarDadosPessoaTeste {

    @Before
    public void configuraConexao() {
        GerenciadorConexaoBD.iniciarConexao();
        System.out.println("Rodou configuraConexao");
    }

    @Test
    public void validarDadosRetorno() {
        assertTrue(true);
    }

    @After
    public void finalizarConexao() {
        GerenciadorConexaoBD.finalizarConexao();
        System.out.println("Rodou finalizarConexao");
    }

}
