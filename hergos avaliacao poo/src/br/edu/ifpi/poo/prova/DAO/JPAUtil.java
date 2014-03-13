package br.edu.ifpi.poo.prova.DAO;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManager em;
	
	
	public static EntityManager getEntityManager(){
		if(em == null){
			em = Persistence.createEntityManagerFactory("dizimista-jpa").createEntityManager();
		}
		return em;
	}

}
