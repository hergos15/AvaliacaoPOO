package br.edu.ifpi.poo.prova;

import org.junit.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

import br.edu.ifpi.poo.prova.model.Dizimista;


public class DizimistaTest {
	private static Dizimista d;

	@BeforeClass
	public static void inicializar() {
		d = new Dizimista();
	}

	@Test
	public void testValiadarNome() {
		d.setNome("Antonio");
		Assert.assertTrue(d.validarNome());
		d.setNome("Hergos");
		Assert.assertTrue(d.validarNome());
		
	}
	
	@Test
	public void testvalidarcpf(){
		d.setCpf("12312312354");
		Assert.assertTrue(d.testValidarCPF());
		
	}
	
	@Test
	public void testvalidarTelefone(){
		d.setTelefone("94564910");
		Assert.assertTrue(d.testValidarTelefone());
	}
	
	
}
