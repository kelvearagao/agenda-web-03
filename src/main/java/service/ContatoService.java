package service;

import java.io.Serializable;

import javax.inject.Inject;

import util.jpa.Transactional;
import model.Contato;
import dao.ContatoDAO;

public class ContatoService implements Serializable{
	
	@Inject
	private ContatoDAO contatoDAO;
	
	@Transactional
	public void salvar(Contato contato) {
		this.contatoDAO.salvar(contato);
	}
}
