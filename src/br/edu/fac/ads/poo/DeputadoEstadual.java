package br.edu.fac.ads.poo;

public class DeputadoEstadual extends Candidato {

	public DeputadoEstadual(String nome, int numero) {
		super(nome, numero);
		this.setTipoCandidato(TipoCandidato.DEP_ESTADUAL);
	}
}
