package br.edu.ifpi.poo.prova.ui;

import java.util.List;

import br.edu.ifpi.poo.prova.DAO.DizimistaDAO;
import br.edu.ifpi.poo.prova.model.Dizimista;



public class dizimistaPrincipal {
		public static void main(String[] args){
			DizimistaDAO dDAO = new DizimistaDAO();
			Dizimista d;
			dDAO.inicia();
			d = new Dizimista("Antonio", "12345678901", "rua sao jose", "9899-8888");
			dDAO.salvar(d);
			d = new Dizimista("Rodrigo", "09876543210", "rua nao sei qual", "9999-9999" );
			dDAO.salvar(d);
			dDAO.commitar();;
			
			List<Dizimista> l = dDAO.listarTodos();
			for (Dizimista dizimista : l) {
				System.out.println(dizimista);
			}
			
			d = dDAO.procurar(10L);
			d.setCpf("12345678919");
			dDAO.atualizar(d);
			System.out.println(d);
		}

	}
