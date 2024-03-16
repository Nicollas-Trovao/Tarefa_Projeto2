package Scr.test.java;

import java.util.Collection;

import Scr.main.java.Cliente;
import Scr.main.java.DAO.IClienteDAO;
import Scr.main.java.DAO.Generics.Exeption.TipoChaveNaoEncontradaException;


public class ClienteDaoMock implements IClienteDAO {

    @Override
	public boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void excluir(Long valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente consultar(Long valor) {
		Cliente cliente = new Cliente();
		cliente.setCPF(valor);
		return cliente;
	}

	@Override
	public Collection<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}