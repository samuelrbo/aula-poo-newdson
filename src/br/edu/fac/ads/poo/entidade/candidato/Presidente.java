package br.edu.fac.ads.poo.entidade.candidato;

import br.edu.fac.ads.poo.tipo.TipoCandidato;

public class Presidente extends Candidato {

	public Presidente(String nome, int numero) {
		super(nome, numero);
		this.setTipoCandidato(TipoCandidato.PRESIDENTE);
	}
}
