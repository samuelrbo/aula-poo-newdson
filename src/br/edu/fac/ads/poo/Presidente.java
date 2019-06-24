package br.edu.fac.ads.poo;

public class Presidente extends Candidato {

	public Presidente(String nome, int numero) {
		super(nome, numero);
		this.setTipoCandidato(TipoCandidato.PRESIDENTE);
	}
}
