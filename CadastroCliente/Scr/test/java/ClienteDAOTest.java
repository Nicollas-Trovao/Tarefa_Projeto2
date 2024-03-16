package Scr.test.java;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Scr.main.java.Cliente;
import Scr.main.java.DAO.IClienteDAO;
import Scr.main.java.DAO.Generics.Exeption.TipoChaveNaoEncontradaException;

public class ClienteDAOTest {
    
    private IClienteDAO ClienteDAO;
    private Cliente cliente;

    public ClienteDAOTest(){
        ClienteDAO = new ClienteDaoMock();
    }

    @Test
	public void pesquisarCliente() {
        Cliente clienteConsultado = ClienteDAO.consultar(cliente.getCPF());

        Assert.assertNotNull(clienteConsultado);
	}

    @Before
	public void init() throws TipoChaveNaoEncontradaException {
		cliente = new Cliente();
		cliente.setCPF(12312312312L);
		cliente.setNome("Rodrigo");
		cliente.setCidade("São Paulo");
		cliente.setEnd("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel(70707070);

		ClienteDAO.cadastrar(cliente);
	}

    @Test
    public void SalvarCliente() throws TipoChaveNaoEncontradaException{
        boolean retorno = ClienteDAO.cadastrar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void ExcluirCliente(){
        ClienteDAO.excluir(cliente.getCPF());

    }

    @Test
    public void AlterarCliente() throws TipoChaveNaoEncontradaException{
        cliente.setNome("Nicollas Trovão");
        ClienteDAO.alterar(cliente);

        Assert.assertEquals("Nicollas Trovão", cliente.getNome());
    }

}
