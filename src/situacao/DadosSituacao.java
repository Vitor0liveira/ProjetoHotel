package situacao;

import conexao.Dados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DadosSituacao extends Dados implements InterfaceSituacao {

    @Override
    public ArrayList<Situacao> listarSituacao(Situacao filtro) throws Exception {
        int posPar = 1;

        ArrayList<Situacao> retorno = new ArrayList<>();
        //abrindo a conexÃ£o
        conectar();

        String sql = "SELECT S.cd_situacao, S.ds_situacao FROM Situacao AS S ";
        try {
            //executando a instrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);

            ResultSet leitor = cmd.executeQuery();

            while (leitor.next()) {
                Situacao s = new Situacao();
                s.setCd_situacao(leitor.getInt("cd_situacao"));
                s.setDs_situacao(leitor.getString("Ds_situacao"));
                retorno.add(s);
            }
        } catch (SQLException erro) {
            //caso haja algum erro neste mÃ©todo serÃ¡ levantada esta execeÃ§Ã£o
            throw new Exception("Erro as listar situação: " + erro.getMessage());
        }
        //fechando a conexÃ£o com o banco de dados
        desconectar();
        return retorno;

    }
}

