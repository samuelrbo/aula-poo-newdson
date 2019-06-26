package br.edu.fac.ads.poo.entidade.candidato;

import br.edu.fac.ads.poo.tipo.TipoCandidato;

public class Senador extends Candidato {

	public Senador(String nome, int numero) {
		super(nome, numero);
		this.setTipoCandidato(TipoCandidato.SENADOR);
	}
}
