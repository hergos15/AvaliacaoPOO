package br.edu.ifpi.poo.prova.DAO;

import java.util.List;

import javax.persistence.EntityManager;

public class GenericJPADAO<T> implements GenericDAO<T> {
	protected EntityManager em = JPAUtil.getEntityManager();
	protected Class<T> classe;

	@Override
	public void open() {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		em.close();
	}

	@Override
	public void commit() {
		// TODO Auto-generated method stub
		em.getTransaction().commit();
	}

	@Override
	public void commitAndClose() {
		// TODO Auto-generated method stub
		commit();
		close();
	}

	@Override
	public void salvar(T entity) {
		// TODO Auto-generated method stub
		em.persist(entity);
	}

	@Override
	public void atualizar(T entity) {
		// TODO Auto-generated method stub
		em.merge(entity);
	}

	@Override
	public List<T> listarTodos() {
		// TODO Auto-generated method stub
		em.createNamedQuery(classe.getName() + ".buscarTodos").getResultList();
		return null;
	}

	@Override
	public T pesquisar(Object id) {
		// TODO Auto-generated method stub
		return em.find(classe, id);
	}

	@Override
	public void remover(T entity) {
		// TODO Auto-generated method stub
		em.remove(entity);
	}
	
	
	
	

}
