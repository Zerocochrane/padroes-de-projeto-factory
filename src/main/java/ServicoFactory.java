public class ServicoFactory {
    static Class classe = null;
    static Object objeto = null;

    public static IServico build(String servico){
        try{
            classe = Class.forName("Servico" + servico);
            objeto = classe.newInstance();
        }catch (Exception e){
            throw new IllegalArgumentException("Servico não existente");
        }

        return (IServico) objeto;
    }
}
