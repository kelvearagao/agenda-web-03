package controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import service.ContatoService;
import model.Contato;

@Named
@ViewScoped
public class ContatoBean implements Serializable {
	
	@Inject
	private ContatoService contatoService;
	
	private Contato contato;
	
	@PostConstruct
	public void init()
	{
		this.limpar();
	}
	
	public void limpar() {
		this.contato = new Contato();
	}
	
	public void salvar() {
		contatoService.salvar(contato);
		
		this.limpar();
	}

	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
}
