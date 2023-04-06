package test;

import static org.junit.Assert.assertThrows;

import org.junit.Test;

import main.Conta;
import main.TransferenciaContas;

public class ExceptionsTeste {

    @Test
    public void validarCenarioExcecaoTransferencia() {
        Conta contaOrigem = new Conta("13212", 0);
        Conta contaDestino = new Conta("87954", 100);

        assertThrows(IllegalArgumentException.class,
                () -> transferenciaContas.transfere(contaOrigem, contaDestino, -1));

    }
}
