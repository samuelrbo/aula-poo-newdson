package br.edu.fac.ads.poo;

public class Senador extends Candidato {

	public Senador(String nome, int numero) {
		super(nome, numero);
		this.setTipoCandidato(TipoCandidato.SENADOR);
	}
}
