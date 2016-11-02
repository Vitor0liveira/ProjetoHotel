package quarto;

public class NegocioQuartos implements InterfaceQuartos {
    
    public void validarCamposBasicos(Quarto q) throws Exception {
        if (q.getNr_quarto() < 1) {
            throw new Exception("Por Favor, Informe um número de quarto maior que ZERO(0).");
        }
        
        if (q.getDs_quarto().length() > 20) {
            throw new Exception("Por Favor, Descreva o quarto com menos de VINTE(20) Caracteres.");
        }
        
        if (q.getPreco() < 50) {
            throw new Exception("Por Favor, Informe um VALOR acima de CINQUENTA(R$50.00) Reais.");
        }
        
        if (q.getTipo().length() > 10) {
            throw new Exception("Por Favor, Informe o tipo do quarto com menos de DEZ(10) Caracteres.");
        }
        
        if (q.getTipo().equals("")) {
            throw new Exception("Por Favor, Informe o tipo do Quarto (Você deixou o Campo VAZIO).");
        }
        
        if (q.getTipo() == null) {
            throw new Exception("Por Favor, Informe o ANDAR.");
        }
        
        if (q.getAndar() < 0) {
            throw new Exception("Por Favor, Informe o ANDAR.");
        }
        
    }
    
    @Override
    public void cadastrarQuartos(Quarto q) throws Exception {
        validarCamposBasicos(q);
        
        DadosQuartos dQ = new DadosQuartos();
        dQ.cadastrarQuartos(q);
    }
    
}
