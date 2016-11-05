package servicos;

import conexao.Dados;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DadosServicos extends Dados implements InterfaceServicos {

    @Override
    public void pesquisarServicos(Servico s) throws Exception {
        try {
            conectar();

            String Sql = " SELECT cd_servico, descricao, valor FROM Servico ";
            Sql += " WHERE cd_servico = ? ";

            PreparedStatement Cmd = conn.prepareStatement(Sql);
            Cmd.setInt(1, s.getCd_servico());
            Cmd.execute();

        } catch (SQLException E) {
            throw new Exception("Erro: " + E.getMessage());
        }
        desconectar();

    }

}
