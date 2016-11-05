package quarto;

import conexao.Dados;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DadosQuartos extends Dados implements InterfaceQuartos {

    @Override
    public void pesquisarQuartos(Quarto q) throws Exception {

        try {
            conectar();

            String Sql = " SELECT nr_quarto, ds_quarto, preço, andar, tipo FROM Quarto ";
            Sql += " WHERE nr_quarto = ? ";

            PreparedStatement Cmd = conn.prepareStatement(Sql);
            Cmd.setInt(1, q.getNr_quarto());
            Cmd.execute();

        } catch (SQLException E) {
            throw new Exception("Erro: " + E.getMessage());
        }
        desconectar();

    }

}
