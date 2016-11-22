package fichaOcupacao;

import java.util.ArrayList;

public interface InterfaceFo {

    // Método de Pesquisar as ocupações.
    public FichaOcupacao pesquisarFo(FichaOcupacao f) throws Exception;
    // Método de Cadastro para as ocupações.
    public void cadastrarFo (FichaOcupacao f) throws Exception;
    // Método de remoção de ocupações.
    public void removerFo (FichaOcupacao f) throws Exception;
    // Método de atualização de ocupações.
    public void atualizarFo (FichaOcupacao f) throws Exception;
    // Método de listagem de ocupações.
    ArrayList<FichaOcupacao> listarFo(FichaOcupacao filtro) throws Exception;
    // Método de listagens de serviços.
    FichaOcupacao procurarServicos(FichaOcupacao f) throws Exception;
}
