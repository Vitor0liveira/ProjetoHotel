package situacao;

import java.util.ArrayList;

public interface InterfaceSituacao {
    // Método de listar Situações
    ArrayList<Situacao> listarSituacao(Situacao filtro) throws Exception;
}
