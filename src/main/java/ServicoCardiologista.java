public class ServicoCardiologista  implements IServico{
    @Override
    public String consulta() {
        return "Consulta efetuada com sucesso";
    }

    @Override
    public float cobranca() {
        return 420;
    }

}
