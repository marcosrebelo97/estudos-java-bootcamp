package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;
import org.junit.Test;

public class AssumptionsTeste {

    @Test
    public void validarUsuarioMarcos() {
        assumeTrue("marcos".equals(System.getenv("USER")));
        assertEquals(10, 5 + 5);
    }

}
