package services.generic;

import java.io.Serializable;
import java.util.Collection;

import dao.Persistente;
import dao.generic.IGenericDAO;
import exceptions.DAOException;
import exceptions.MaisDeUmRegistroException;
import exceptions.TableException;
import exceptions.TipoChaveNaoEncontradaException;

public class GenericService <T extends Persistente, E extends Serializable> implements IGenericService <T, E>  {

	protected IGenericDAO<T, E> dao;
		
		public GenericService(IGenericDAO<T, E> dao) {
			this.dao = dao;
		}
		
		public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
			return this.dao.cadastrar(entity);
		}
	
		public void excluir(T entity) throws DAOException {
			this.dao.excluir(entity);
		}
	
		
		public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
			return this.dao.alterar(entity);
		}
	
		
		public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException {
			return this.dao.consultar(valor);
		}
	
		
		public Collection<T> buscarTodos() throws DAOException {
			return this.dao.buscarTodos();
		}
}