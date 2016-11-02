package reserva;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NegocioReserva implements InterfaceReserva {

    @Override
    public void fazerReserva(Reserva r) throws Exception {
        //Validações de uma reserva
        //INFORMAR CPF
        if (r.getCliente().getCpf_cliente().trim().length() < 14) {
            throw new Exception("Informe um CPF válido.");
        }
        //INFORMAR PERIODO
        if (r.getPeriodo() < 0) {
            throw new Exception("Informe o período válido.");
        }
        //INFORMAR DATA
        if (r.getData().equals("")) {
            throw new Exception("Informe a data.");
        }

        DadosReserva dR = new DadosReserva();
        dR.fazerReserva(r);
    }

    @Override
    public void atualizarReserva(Reserva r) throws Exception {
        //INFORMAR CPF
        if (r.getCliente().getCpf_cliente().trim().length() < 14) {
            throw new Exception("Informe um CPF válido.");
        }
        //INFORMAR PERIODO
        if (r.getPeriodo() < 0) {
            throw new Exception("Informe o período válido.");
        }
        //INFORMAR CD_RESERVA
        if (r.getCd_reserva() < 0) {
            throw new Exception("Informe o código da reserva válido.");
        }

        DadosReserva dR = new DadosReserva();
        dR.atualizarReserva(r);
    }

    @Override
    public void removerReserva(Reserva r) throws Exception {
        
        DadosReserva dR = new DadosReserva();
        dR.removerReserva(r);
    }

    @Override
    public ArrayList<Reserva> pesquisarReserva(Reserva filtro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
