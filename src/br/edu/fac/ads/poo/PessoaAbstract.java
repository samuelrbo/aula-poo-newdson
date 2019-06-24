package br.edu.fac.ads.poo;

/**
 * Classe abstrata
 * 
 * Pode ser refenreciada mas não pode ser instânciada
 * 
 * Possui pelo menos 1 método abstrato 
 * OBS: Pode ser um método não implementado de uma interface que ela implemente
 * 
 * Nela existem atributos e métodos comuns de classes que irão herdar dela (suas filhas)
 */
public abstract class PessoaAbstract implements PessoaInterface {

	protected String nome;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
}
