import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoClinicoGeralTest {

    @Test
    void consulta() {
        IServico servico = ServicoFactory.build("ClinicoGeral");
        assertEquals("Consulta efetuada com sucesso", servico.consulta());
    }

    @Test
    void cobranca() {
        IServico servico = ServicoFactory.build("ClinicoGeral");
        assertEquals(420, servico.cobranca());
    }
}