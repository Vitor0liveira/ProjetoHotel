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
            r.setCd_reserva(0);
            r.setData("19/92/2010");
            r.setPeriodo(0);
            r.setSituacao(0);
            r.setCpf_cliente("109.010.101-9");
            r.setNr_quarto(0);
            r.setCd_ocupacao(1);
            
            
            
            NegocioReserva nr = new NegocioReserva();
            nr.fazerReserva(r);
            JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso.");
            
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
