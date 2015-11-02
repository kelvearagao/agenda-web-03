package dao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import model.Contato;

public class ContatoDAO implements Serializable{
	
	@Inject
	private EntityManager em;
	
	public void salvar(Contato contato)
	{	
		em.persist(contato);
	}
	
	public List<Contato> buscaTodos() {
		return em.createQuery("from Contato").getResultList();
	}
}
