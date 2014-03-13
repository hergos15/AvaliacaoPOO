package br.edu.ifpi.poo.prova.DAO;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.edu.ifpi.poo.prova.model.Dizimista;

public class DizimistaDAO {
	private EntityManager em = Persistence.createEntityManagerFactory("dizimista-jpa").createEntityManager();
	
	public void fechar(){
		em.close();
	}
	
	public void commitar(){
		em.getTransaction().commit();
	}
	
	public void inicia(){
		em.getTransaction().begin();
	}
	
	public void salvar(Dizimista d){
		em.persist(d);
		
	}
	
	public void apagar(Dizimista d){
		em.remove(d);

	}
	
	public void atualizar(Dizimista d){
		em.merge(d);
	}
	
	public Dizimista procurar(Long id){
		return em.find(Dizimista.class, id);
	}
	
	public List<Dizimista> listarTodos(){
		Query query = em.createNamedQuery("Dizimista.buscarTodos");
		return query.getResultList();
		
	}
	
	public Dizimista procurarPorCPF(String cpf){
		Query query = em.createNamedQuery("Dizimista.buscarPorCPF");
		query.setParameter("cpf", cpf);
		return (Dizimista) query.getSingleResult();
		
	}
	
	

}
