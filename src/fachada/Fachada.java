package fachada;

import cliente.Cliente;
import cliente.InterfaceCliente;
import cliente.NegocioCliente;
import fo.Fo;
import fo.InterfaceFo;
import fo.NegocioFo;
import java.util.ArrayList;
import reserva.InterfaceReserva;
import reserva.NegocioReserva;
import reserva.Reserva;

public class Fachada implements InterfaceCliente, InterfaceReserva, InterfaceFo {

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
    public ArrayList<Cliente> listarCliente() throws Exception {
        NegocioCliente nC = new NegocioCliente();
        return nC.listarCliente();
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
    public ArrayList<Reserva> listarReserva() throws Exception {
        NegocioReserva nR = new NegocioReserva();
        return nR.listarReserva();
    }

    @Override
    public Reserva pesquisarReserva(int cd_reserva) throws Exception {
        NegocioReserva nR = new NegocioReserva();
        return nR.pesquisarReserva(cd_reserva);
    }

    @Override
    public Fo pesquisarFo(int cd_ocupacao) throws Exception {
        NegocioFo nF = new NegocioFo();
        return nF.pesquisarFo(cd_ocupacao);
    }

    @Override
    public void cadastrarFo(Fo f) throws Exception {
        NegocioFo nF = new NegocioFo();
        nF.cadastrarFo(f);
    }

    @Override
    public void removerFo(Fo f) throws Exception {
        NegocioFo nF = new NegocioFo();
        nF.removerFo(f);
    }

    @Override
    public void atualizarFo(Fo f) throws Exception {
        NegocioFo  nF = new NegocioFo();
        nF.atualizarFo(f);
    }

}
