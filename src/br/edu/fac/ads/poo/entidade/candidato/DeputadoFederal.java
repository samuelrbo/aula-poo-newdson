package br.edu.fac.ads.poo.entidade.candidato;

import br.edu.fac.ads.poo.tipo.TipoCandidato;

public class DeputadoFederal extends Candidato {

	public DeputadoFederal(String nome, int numero) {
		super(nome, numero);
		this.setTipoCandidato(TipoCandidato.DEP_FEDERAL);
	}
}
