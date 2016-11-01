package fachada;

import cliente.Cliente;
import cliente.InterfaceCliente;
import cliente.NegocioCliente;
import java.util.ArrayList;
import reserva.InterfaceReserva;
import reserva.NegocioReserva;
import reserva.Reserva;

public class Fachada implements InterfaceCliente, InterfaceReserva {

    @Override
    public void cadastrarCliente(Cliente c) throws Exception {
        NegocioCliente nC = new NegocioCliente();
        nC.cadastrarCliente(c);
    }

    /* @Override
     public void atualizarCliente(Cliente c) throws Exception {
     NegocioCliente nC = new NegocioCliente();
     nC.atualizarCliente(c);
     }*/

    /* @Override
     public void apagarCliente(Cliente c) throws Exception {
     NegocioCliente nC = new NegocioCliente();
     nC.apagarCliente(c);
     }*/

    /*@Override
     public ArrayList<Cliente> pesquisarCliente(Cliente filtro) throws Exception {
     NegocioCliente nC = new NegocioCliente();
     return nC.pesquisarCliente(filtro);
     }*/
    @Override
    public void fazerReserva(Reserva r) throws Exception {
        NegocioReserva nR = new NegocioReserva();
        nR.fazerReserva(r);
    }

    @Override
    public void atualizarReserva(Reserva r) throws Exception {
        NegocioReserva nR = new NegocioReserva();
        nR.atualizarReserva(r);
    }

    @Override
    public void apagarReserva(Reserva r) throws Exception {
        NegocioReserva nR = new NegocioReserva();
        nR.apagarReserva(r);
    }

    @Override
    public ArrayList<Reserva> pesquisarReserva(Reserva filtro) throws Exception {
        NegocioReserva nR = new NegocioReserva();
        return nR.pesquisarReserva(filtro);
    }

    @Override
    public void atualizarCliente(Cliente c) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void apagarCliente(Cliente c) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verificarExistencia(Cliente c) throws Exception {
        NegocioCliente nC = new NegocioCliente();
        return nC.verificarExistencia(c);
    }


}
