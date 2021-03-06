package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
	private List<Contato> contatos = new ArrayList<Contato>();
	private Contato contatoSelecionado;
	
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
	
	public void excluir() {
		this.contatoService.excluir(this.contatoSelecionado);
		this.contatos.remove(this.contatoSelecionado);
	}

	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	public Contato getContatoSelecionado() {
		return contatoSelecionado;
	}

	public void setContatoSelecionado(Contato contatoSelecionado) {
		this.contatoSelecionado = contatoSelecionado;
	}

	public List<Contato> getContatos() {
		this.contatos = this.contatoService.buscaTodos();
		
		return this.contatos; 
	}
}
