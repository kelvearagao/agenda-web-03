package dao;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.Contato;

public class ContatoDAO implements Serializable{
	
	@Inject
	private EntityManager em;
	
	public void salvar(Contato contato)
	{
		System.out.println(contato.getNome());
		
		em.persist(contato);
	}
}
