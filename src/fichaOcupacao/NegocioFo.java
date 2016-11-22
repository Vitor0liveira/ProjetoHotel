package fichaOcupacao;

import java.util.ArrayList;

public class NegocioFo implements InterfaceFo {

    public void validarcamposBasicos(FichaOcupacao f) throws Exception {
        if (f.getCd_ocupacao() < 0) {
            throw new Exception("Por favor, informe um código de ocupação válido.");
        }

        if (f.getCd_ocupacao() == f.getCd_ocupacao()) {
            throw new Exception("Código de ocupação já existente.");
        }
        
        if (f.getCliente().getCpf_cliente() == null) {
            throw new Exception("Por favor, fnforme o CPF do cliente.");
        }
        
        if (f.getData_entrada().equals("  /  /   ")) {
            throw new Exception("Por favor, informe data de entrada válida.");
        }
        
        if (f.getData_saida().equals("  /  /   ")) {
            throw new Exception("Por favor, informe data de saída válida.");
        }        

        if (f.getHora_entrada().equals("  :  ")) {
            throw new Exception("Por favor, informe hora de entrada válida.");
        }

        if (f.getHora_saida().equals("  :  ")) {
            throw new Exception("Por favor, informe hora de saída válida.");
        }
        
        if (f.getQuarto().getNr_quarto() <= 0) {
            throw new Exception("Por favor, informe um quarto válido.");
        }
        
        if (f.getQuarto().getNr_quarto() == f.getQuarto().getNr_quarto()) {
            throw new Exception("Quarto já ocupado.");
        }

        if (f.getValorDiaria() <= 0) {
            throw new Exception("Por favor, informe um valor válido.");
        }         
    }
    
    public void validarAtualizarOcupacao (FichaOcupacao f) throws Exception {
        if (f.getQuarto().getNr_quarto() <= 0) {
            throw new Exception("Por favor, informe um quarto válido.");
        }
        
        /*if (f.getQuarto().getNr_quarto() == f.getQuarto().getNr_quarto()) {
            throw new Exception("Quarto já ocupado.");
        }*/
        
        if (f.getData_entrada().equals("  /  /   ")) {
            throw new Exception("Por favor, informe data de entrada válida.");
        }
        
        if (f.getData_saida().equals("  /  /   ")) {
            throw new Exception("Por favor, informe data de saída válida.");
        }        

        if (f.getHora_entrada().equals("  :  ")) {
            throw new Exception("Por favor, informe hora de entrada válida.");
        }

        if (f.getHora_saida().equals("  :  ")) {
            throw new Exception("Por favor, informe hora de saída válida.");
        }        
    }
    
    public void validarRemoverOcupacao (FichaOcupacao f) throws Exception {
        if (f.getCd_ocupacao() <= 0) {
            throw new Exception("Código de ocupação não encontrado.");
        }
    }

    public void validarPesquisarOcupcao (FichaOcupacao f) throws Exception {
        if (f.getCd_ocupacao() <= 0) {
            throw new Exception("Código de ocupação não encontrado.");
        }        
    }
    
    @Override
    public FichaOcupacao pesquisarFo(FichaOcupacao f) throws Exception {
        DadosFo dF = new DadosFo();
        return dF.pesquisarFo(f);

    }

    @Override
    public void cadastrarFo(FichaOcupacao f) throws Exception {
        DadosFo dF = new DadosFo();
        dF.cadastrarFo(f);
    }

    @Override
    public void removerFo(FichaOcupacao f) throws Exception {
        validarRemoverOcupacao(f);
        DadosFo dF = new DadosFo();
        dF.removerFo(f);
    }

    @Override
    public void atualizarFo(FichaOcupacao f) throws Exception {
        validarAtualizarOcupacao(f);
        DadosFo dF = new DadosFo();
        dF.atualizarFo(f);
    }

    @Override
    public ArrayList<FichaOcupacao> listarFo(FichaOcupacao filtro) throws Exception {
        DadosFo dF = new DadosFo();
        return dF.listarFo(filtro);
    }

    @Override
    public FichaOcupacao procurarServicos(FichaOcupacao f) throws Exception {
        DadosFo dF = new DadosFo();
        return dF.procurarServicos(f);
    }

}
