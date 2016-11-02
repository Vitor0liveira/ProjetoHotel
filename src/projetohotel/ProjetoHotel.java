package projetohotel;

import cliente.Cliente;
import cliente.DadosCliente;
import conexao.Dados;
import javax.swing.JOptionPane;
import reserva.NegocioReserva;
import reserva.Reserva;

public class ProjetoHotel {

    public static void main(String[] args) {
        try {
            /* Dados d = new Dados();
            d.conectar();
            d.desconectar();
            JOptionPane.showMessageDialog(null, "   Funcionou\n   Conexão Estabelecida");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
             */

            Cliente c = new Cliente();
            c.setCpf_cliente("068.843.834-29");
            c.setNm_cliente("Rodrigo");
            c.setTelefone("9504-4808");
            c.setSexo("M");

            DadosCliente DC = new DadosCliente();
            DC.cadastrarCliente(c);
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso.");

            /*Para fazer uma reserva precisamos de um Clinte (objeto), pois o mesmo irá conter o cpf
            que será o codigo identificador.
             */
 /*
            Reserva r = new Reserva();
            r.setCd_reserva(4);
            r.setData("19.92.2010");
            r.setPeriodo(2);
            r.setSituacao(1);
            r.setCliente(c);
            r.setNr_quarto(1);
            r.setCd_ocupacao(2);
            NegocioReserva nr = new NegocioReserva();
            nr.fazerReserva(r);
            JOptionPane.showMessageDialog(null, "Reserva efetuada com sucesso.");
             */
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
}
