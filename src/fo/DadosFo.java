package fo;

import conexao.Dados;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DadosFo extends Dados implements InterfaceFo {

    @Override
    public void pesquisarFo(Fo f) throws Exception {

        try {
            conectar();
            // Para pesquisar a "FO" é necessário informar o cd_ocupacao, CPF_cliente e nr_quarto.
            String Sql = "SELECT FROM FO WHERE cd_ocupacao = ? ";
            Sql += "AND CPF_cliente = ? AND nr_quarto = ?";

            PreparedStatement Cmd = conn.prepareStatement(Sql);
            Cmd.setInt(1, f.getCd_ocupacao());
            Cmd.setString(2, f.getCliente().getCpf_cliente());
            Cmd.setInt(3, f.getQuarto().getNr_quarto());
            Cmd.execute();

        } catch (SQLException E) {
            throw new Exception("Erro: " + E.getMessage());
        }

    }

}
