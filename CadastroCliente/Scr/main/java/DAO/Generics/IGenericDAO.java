package Scr.main.java.DAO.Generics;

import java.util.Collection;

import Scr.main.java.Cliente;
import Scr.main.java.DAO.Generics.Exeption.TipoChaveNaoEncontradaException;

public interface IGenericDAO <T extends Persistente> {

    boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    public void excluir(Long valor);


    public void alterar(T entity) throws TipoChaveNaoEncontradaException;


    public T consultar(Long valor);


    public Collection<T> buscarTodos();
}
