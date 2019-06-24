package br.edu.fac.ads.poo;

public class DeputadoFederal extends Candidato {

	public DeputadoFederal(String nome, int numero) {
		super(nome, numero);
		this.setTipoCandidato(TipoCandidato.DEP_FEDERAL);
	}
}
