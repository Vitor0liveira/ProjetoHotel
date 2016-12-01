package situacao;

import java.util.ArrayList;

public class NegocioSituacao implements InterfaceSituacao{

    @Override
    public ArrayList<Situacao> listarSituacao(Situacao filtro) throws Exception {
        DadosSituacao dS = new DadosSituacao();
        return dS.listarSituacao(filtro);
    }
    
}
