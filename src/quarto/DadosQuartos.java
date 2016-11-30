package quarto;

import conexao.Dados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DadosQuartos extends Dados implements InterfaceQuartos {

    @Override
    public ArrayList<Quarto> listarQuartos(Quarto filtro) throws Exception {
        int posPar = 1;
        ArrayList<Quarto> retorno = new ArrayList<>();
        //abrindo a conexÃ£o
        conectar();

        String sql = "SELECT Q.andar, Q.ds_quarto, Q.nr_quarto, Q.preco, Q.tipo ";
        sql += "FROM Quarto AS Q ";
        sql += "WHERE Q.nr_quarto not in (select nr_quarto from Reserva)";
        //Como está aqui, o quarto quando é reservado nunca mais poderá ser reservado,
        //pois nunca sairá de reserva. Tem que informar em algum local, quando o quarto
        //está livre.

        try {
            //executando a instrução sql
            PreparedStatement cmd = conn.prepareStatement(sql);

            ResultSet leitor = cmd.executeQuery();

            while (leitor.next()) {
                Quarto q = new Quarto();
                q.setAndar(leitor.getInt("Andar"));
                q.setDs_quarto(leitor.getString("Ds_quarto"));
                q.setNr_quarto(leitor.getInt("Nr_quarto"));
                q.setPreco(leitor.getFloat("Preco"));
                q.setTipo(leitor.getString("Tipo"));

                retorno.add(q);
            }
        } catch (SQLException erro) {
            //caso haja algum erro neste mÃ©todo serÃ¡ levantada esta execeÃ§Ã£o
            throw new Exception("Erro as listar quarto: " + erro.getMessage());
        }
        //fechando a conexÃ£o com o banco de dados
        desconectar();
        return retorno;

    }

}
