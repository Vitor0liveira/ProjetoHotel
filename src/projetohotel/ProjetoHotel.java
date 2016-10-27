package projetohotel;

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
            JOptionPane.showMessageDialog(null, "Funcionou");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());*/

            Reserva r = new Reserva();
            r.setCd_ocupacao(1);
            r.setCpf_cliente("109.010.101-9");
            r.setData("19/92/2010");
            
            
            
            NegocioReserva nr = new NegocioReserva();
            nr.fazerReserva(r);
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso.");
            
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
