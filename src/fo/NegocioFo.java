package fo;

import java.util.ArrayList;

public class NegocioFo implements InterfaceFo {

    public void validarcamposBasicos(Fo f) throws Exception {
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
    
    public void validarAtualizarOcupacao (Fo f) throws Exception {
        if (f.getQuarto().getNr_quarto() <= 0) {
            throw new Exception("Por favor, informe um quarto válido.");
        }
        
        if (f.getQuarto().getNr_quarto() == f.getQuarto().getNr_quarto()) {
            throw new Exception("Quarto já ocupado.");
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
    }
    
    public void validarRemoverOcupacao (Fo f) throws Exception {
        if (f.getCd_ocupacao() <= 0) {
            throw new Exception("Código de ocupação não encontrado.");
        }
    }

    public void validarPesquisarOcupcao (Fo f) throws Exception {
        if (f.getCd_ocupacao() <= 0) {
            throw new Exception("Código de ocupação não encontrado.");
        }        
    }
    
    @Override
    public Fo pesquisarFo(Fo f) throws Exception {
        DadosFo dF = new DadosFo();
        return dF.pesquisarFo(f);

    }

    @Override
    public void cadastrarFo(Fo f) throws Exception {
        DadosFo dF = new DadosFo();
        dF.cadastrarFo(f);
    }

    @Override
    public void removerFo(Fo f) throws Exception {
        validarRemoverOcupacao(f);
        DadosFo dF = new DadosFo();
        dF.removerFo(f);
    }

    @Override
    public void atualizarFo(Fo f) throws Exception {
        validarAtualizarOcupacao(f);
        DadosFo dF = new DadosFo();
        dF.atualizarFo(f);
    }

    @Override
    public ArrayList<Fo> listarFo(Fo filtro) throws Exception {
        DadosFo dF = new DadosFo();
        return dF.listarFo(filtro);
    }

    @Override
    public Fo procurarServicos(Fo f) throws Exception {
        DadosFo dF = new DadosFo();
        return dF.procurarServicos(f);
    }

}
