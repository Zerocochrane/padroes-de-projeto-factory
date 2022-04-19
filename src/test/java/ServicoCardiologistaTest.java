import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoCardiologistaTest {


    @Test
    void consulta() {
        IServico servico = ServicoFactory.build("Cardiologista");
        assertEquals("Consulta efetuada com sucesso", servico.consulta());
    }

    @Test
    void cobranca() {
        IServico servico = ServicoFactory.build("Cardiologista");
        assertEquals(420, servico.cobranca());
    }

}