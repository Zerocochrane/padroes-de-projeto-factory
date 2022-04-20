import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoFactoryTest {

    @Test
    void excecaoParaServicoInexistente() {
        try {
            IServico servico = ServicoFactory.build("Veterinaria");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Servico não existente", e.getMessage());
        }
    }

    @Test
    void excecaoParaServicoInvalido() {
        try {
            IServico servico = ServicoFactory.build("Dentista");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inválido", e.getMessage());
        }
    }
}
