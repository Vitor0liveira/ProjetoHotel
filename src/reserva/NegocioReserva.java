package reserva;

import java.util.ArrayList;

public class NegocioReserva implements InterfacerReserva {

    @Override
    public void fazerReserva(Reserva r) throws Exception {
        //Fazer as validações
        if (r.getCd_reserva() == 0) {
            throw new Exception("Informar um Número de Reserva Válido.");
        }

        if (r.getPeriodo() == 0) {
            throw new Exception("Informe um Número Válido para o Periodo.");
        }

        if (r.getCpf_cliente().equals("   .   .   -  ")) {
            throw new Exception("Informe o CPF Totalmente.");
        }
        
         if (r.getData().equals("  /  /  ")) {
            throw new Exception("Informe a Data por Completo.");
        }

        if (r.getNr_quarto() == 0) {
            throw new Exception("Informe o Número do Quarto.");
        }

        if (r.getCd_ocupacao() == 0) {
            throw new Exception("Informe o Código de Ocupação.");
        }
    }

    @Override
    public void atualizarReserva(Reserva r) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apagarReserva(Reserva r) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Reserva> pesquisarReserva(Reserva filtro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
