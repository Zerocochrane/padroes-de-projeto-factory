import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoOrtopedistaTest {
    @Test
    void consulta() {
        IServico servico = ServicoFactory.build("Ortopedista");
        assertEquals("Consulta efetuada com sucesso", servico.consulta());
    }

    @Test
    void cobranca() {
        IServico servico = ServicoFactory.build("Ortopedista");
        assertEquals(420, servico.cobranca());
    }
}