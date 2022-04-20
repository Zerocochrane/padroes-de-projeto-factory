public class ServicoFactory {

    public static IServico build(String servico){
        Class classe = null;
        Object objeto = null;
        try{
            classe = Class.forName("Servico" + servico);
            objeto = classe.newInstance();
        }catch (Exception e){
            throw new IllegalArgumentException("Servico não existente");
        }

        if (!(objeto instanceof IServico)) {
            throw new IllegalArgumentException("Serviço inválido");
        }

        return (IServico) objeto;
    }
}
