package service;

import java.io.Serializable;
import java.util.List;

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
	
	@Transactional
	public List<Contato> buscaTodos() {
		return this.contatoDAO.buscaTodos();
	}
	
	@Transactional
	public void excluir(Contato contato) {
		this.contatoDAO.excluir(contato);
	}
}
