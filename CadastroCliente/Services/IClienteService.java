package Services;

import Scr.main.java.Cliente;
import Scr.main.java.DAO.Generics.Exeption.TipoChaveNaoEncontradaException;

public interface IClienteService {

    boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
