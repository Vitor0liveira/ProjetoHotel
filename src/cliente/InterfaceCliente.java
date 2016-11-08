package cliente;

import java.util.ArrayList;

public interface InterfaceCliente {

    // método 'cadastrarCliente' cadastra um cliente na tabela 'Cliente'.
    void cadastrarCliente(Cliente c) throws Exception;
    // método 'atulizarCliente' atualiza um cliente previamente cadastrado.

    void atualizarCliente(Cliente c) throws Exception;
    // método 'apagarCliente' apaga um cliente previamente cadastrado.

    void apagarCliente(Cliente c) throws Exception;
    // ArrayList 'pesquisarCliente retorna os clientes pesquisados.

    ArrayList<Cliente> listar(Cliente filtro) throws Exception;
    //pesquisar funcionario

    Cliente pesquisarCliente(String cpf) throws Exception;

}
