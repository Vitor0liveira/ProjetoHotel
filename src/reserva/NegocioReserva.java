package reserva;

import java.util.ArrayList;

public class NegocioReserva implements InterfaceReserva {

    @Override
    public void fazerReserva(Reserva r) throws Exception {
        //Validações de uma reserva
        if (r.getCd_reserva() <= 0) {
            throw new Exception("Informar um número de RESERVA maior que zero.");
        }

        if (r.getPeriodo() <= 0) {
            throw new Exception("Informe um número de PERÍODO maior que zero.");
        }

        if (r.getCpf_cliente().equals("   .   .   -  ")) {
            throw new Exception("Informe o CPF totalmente.");
        }
        if (r.getData() == null) {
            throw new Exception("Informe DATA.");
        }

        if (r.getNr_quarto() <= 0) {

            throw new Exception("Informe o número do QUARTO válido.");
        }

        if (r.getCd_ocupacao()
                <= 0) {
            throw new Exception("Informe o código de OCUPAÇÃO.");
        }
        DadosReserva dr = new DadosReserva();

        dr.fazerReserva(r);
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
