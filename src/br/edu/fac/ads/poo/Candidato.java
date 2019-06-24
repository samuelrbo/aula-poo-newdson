package br.edu.fac.ads.poo;

public class Candidato extends PessoaAbstract {
	
	private int numero;
	private String tipoCandidato;
	
	public Candidato(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}
	
	protected void setTipoCandidato(String tipoCandidato) {
		this.tipoCandidato = tipoCandidato;
	}

	public String getTipoCandidato() {
		return tipoCandidato;
	}
	
	public String getTipo() {
		return TipoPessoa.ELEITOR;
	}
}
