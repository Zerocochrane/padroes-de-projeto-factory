import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoFactoryTest {

    @Test
    void DeveFalharbuild() {
        IServico servico = ServicoFactory.build("Veterinaria");
        fail();
    }
}