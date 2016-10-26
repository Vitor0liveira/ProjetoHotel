package reserva;

import java.util.ArrayList;

public class NegocioReserva implements InterfacerReserva {

    @Override
    public void fazerReserva(Reserva r) throws Exception {
        //Fazer as validações
        if (r.getCd_reserva() == 0) {
            throw new Exception ("Informar um número de reserva válido.");
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
