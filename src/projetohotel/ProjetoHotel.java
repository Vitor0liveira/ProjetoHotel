package projetohotel;

import conexao.Dados;
import javax.swing.JOptionPane;

public class ProjetoHotel {

    public static void main(String[] args) {
        try {
            Dados d = new Dados();
            d.conectar();
            d.desconectar();
            JOptionPane.showMessageDialog(null, "Funcionou");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}
