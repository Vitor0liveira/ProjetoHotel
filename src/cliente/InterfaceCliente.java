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
    // verifica se um determinado cpf, está contido na tabela 'Cliente'.
    ArrayList<Cliente> pesquisarCliente(Cliente filtro) throws Exception;
    
}
