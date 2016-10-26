package reserva;

import conexao.Dados;
import java.util.ArrayList;

public class DadosReserva extends Dados implements InterfacerReserva {

    @Override
    public void fazerReserva(Reserva r) throws Exception {

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
