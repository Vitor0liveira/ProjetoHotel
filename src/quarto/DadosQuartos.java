package quarto;

import conexao.Dados;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DadosQuartos extends Dados implements InterfaceQuartos {

    @Override
    public void cadastrarQuartos(Quarto q) throws Exception {
        try {
            conectar();

            String Sql = "INSERT INTO Quarto (nr_quarto, ds_quarto, preço, andar, tipo)";
            Sql += "VALUES(?,?,?,?,?)";

            PreparedStatement Cmd = conn.prepareStatement(Sql);
            Cmd.setInt(1, q.getNr_quarto());
            Cmd.setString(2, q.getDs_quarto());
            Cmd.setFloat(3, q.getPreco());
            Cmd.setInt(4, q.getAndar());
            Cmd.setString(5, q.getTipo());
            Cmd.execute();

        } catch (SQLException E) {
            throw new Exception(E.getMessage());
        }
        desconectar();
    }

}
