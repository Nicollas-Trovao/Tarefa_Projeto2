package Scr.test.java;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Scr.main.java.Cliente;
import Scr.main.java.DAO.IClienteDAO;
import Scr.main.java.DAO.Generics.Exeption.TipoChaveNaoEncontradaException;
import Services.ClienteService;
import Services.IClienteService;

public class ClienteServiceTest {

    private IClienteService clienteService;
    private Cliente cliente;

    public ClienteServiceTest(){
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao); 
            
    };

    @Before
    public void init(){
        cliente = new Cliente();
        cliente.setCPF(1231231231L);
        cliente.setNome("Nicollas");
        cliente.setCidade("São Gonçalo");
        cliente.setEnd("End");
        cliente.setEstado("RJ");
        cliente.setNumero(65);
        cliente.setTel(70707070);


    }
    

	@Test
	public void pesquisarCliente() {
		
        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCPF());

        Assert.assertNotNull(clienteConsultado);
	}
 
    @Test
    public void SalvarCliente() throws TipoChaveNaoEncontradaException {
        boolean retorno = clienteService.cadastrar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void ExcluirCliente(){
        clienteService.excluir(cliente.getCPF());

    }

    @Test
    public void AlterarCliente() throws TipoChaveNaoEncontradaException{
        cliente.setNome("Nicollas Trovão");
        clienteService.alterar(cliente);

        Assert.assertEquals("Nicollas Trovão", cliente.getNome());
    }
}