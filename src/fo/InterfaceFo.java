package fo;

public interface InterfaceFo {

    // Método de Pesquisar os Quartos.
    public Fo pesquisarFo(int cd_ocupacao) throws Exception;

    public void cadastrarFo (Fo f) throws Exception;
    
    public void removerFo (Fo f) throws Exception;
    
    public void atualizarFo (Fo f) throws Exception;
}
