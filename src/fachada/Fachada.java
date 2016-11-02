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

    @Override
    public void atualizarCliente(Cliente c) throws Exception {
        NegocioCliente nC = new NegocioCliente();
        nC.atualizarCliente(c);
    }

    @Override
    public Cliente pesquisarCliente(String cpf) throws Exception {
        NegocioCliente nC = new NegocioCliente();
        return nC.pesquisarCliente(cpf);
    }

    @Override
    public void apagarCliente(Cliente c) throws Exception {
        NegocioCliente nC = new NegocioCliente();
        nC.apagarCliente(c);
    }

    @Override
    public boolean verificarExistencia(Cliente c) throws Exception {
        NegocioCliente nC = new NegocioCliente();
        return nC.verificarExistencia(c);
    }

    @Override
    public ArrayList<Cliente> listar(Cliente c) throws Exception {
        NegocioCliente nC = new NegocioCliente();
        return nC.listar(c);
    }

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
    public void removerReserva(Reserva r) throws Exception {
        NegocioReserva nR = new NegocioReserva();
        nR.removerReserva(r);
    }

    @Override
    public ArrayList<Reserva> listar(Reserva filtro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Reserva pesquisarReserva(int cd_reserva) throws Exception {
        NegocioReserva nR = new NegocioReserva();
        return nR.pesquisarReserva(cd_reserva);
    }

}
