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
    public void removerCliente(Cliente c) throws Exception {
        NegocioCliente nC = new NegocioCliente();
        nC.removerCliente(c);
    }

    @Override
    public ArrayList<Cliente> listarCliente(Cliente filtro) throws Exception {
        NegocioCliente nC = new NegocioCliente();
        return nC.listarCliente(filtro);
    }
    
    @Override
    public Cliente detalhesCliente(Cliente c) throws Exception {
        NegocioCliente nC = new NegocioCliente();
        return nC.detalhesCliente(c);
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
    public ArrayList<Reserva> listarReserva(Reserva filtro) throws Exception {
        NegocioReserva nR = new NegocioReserva();
        return nR.listarReserva(filtro);
    }

    @Override
    public Reserva pesquisarReserva(int cd_reserva) throws Exception {
        NegocioReserva nR = new NegocioReserva();
        return nR.pesquisarReserva(cd_reserva);
    }

    @Override
    public Fo pesquisarFo(Fo f) throws Exception {
        NegocioFo nF = new NegocioFo();
        return nF.pesquisarFo(f);
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
        NegocioFo nF = new NegocioFo();
        nF.atualizarFo(f);
    }

    @Override
    public ArrayList<Fo> listarFo(Fo filtro) throws Exception {
        NegocioFo nF = new NegocioFo();
        return nF.listarFo(filtro);
    }

    @Override
    public Fo procurarServicos(Fo f) throws Exception {
        NegocioFo nF = new NegocioFo();
        return nF.procurarServicos(f);
    }

    @Override
    public Reserva procurarCliente(Reserva r) throws Exception {
        NegocioReserva nR = new NegocioReserva();
         return nR.procurarCliente(r);
    }

}
