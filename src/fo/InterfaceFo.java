package fo;

import java.util.ArrayList;

public interface InterfaceFo {

    // Método de Pesquisar as ocupações.
    public Fo pesquisarFo(int cd_ocupacao) throws Exception;
    // Método de Cadastro para as ocupações.
    public void cadastrarFo (Fo f) throws Exception;
    // Método de remoção de ocupações.
    public void removerFo (Fo f) throws Exception;
    // Método de atualização de ocupações.
    public void atualizarFo (Fo f) throws Exception;
    // Método de listagem de ocupações.
    ArrayList<Fo> listarFo() throws Exception;
}
