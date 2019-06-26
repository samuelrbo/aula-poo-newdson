package br.edu.fac.ads.poo.entidade.candidato;

import br.edu.fac.ads.poo.tipo.TipoCandidato;

public class DeputadoEstadual extends Candidato {

	public DeputadoEstadual(String nome, int numero) {
		super(nome, numero);
		this.setTipoCandidato(TipoCandidato.DEP_ESTADUAL);
	}
}
