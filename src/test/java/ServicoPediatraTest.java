import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoPediatraTest {
    @Test
    void consulta() {
        IServico servico = ServicoFactory.build("Pediatra");
        assertEquals("Consulta efetuada com sucesso", servico.consulta());
    }

    @Test
    void cobranca() {
        IServico servico = ServicoFactory.build("Pediatra");
        assertEquals(420, servico.cobranca());
    }
}