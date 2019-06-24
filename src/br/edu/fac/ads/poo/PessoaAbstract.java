package br.edu.fac.ads.poo;

/**
 * Classe abstrata
 * 
 * Pode ser refenreciada mas n�o pode ser inst�nciada
 * 
 * Possui pelo menos 1 m�todo abstrato 
 * OBS: Pode ser um m�todo n�o implementado de uma interface que ela implemente
 * 
 * Nela existem atributos e m�todos comuns de classes que ir�o herdar dela (suas filhas)
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
