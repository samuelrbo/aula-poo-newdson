package br.edu.fac.ads.poo.voto;

import br.edu.fac.ads.poo.entidade.candidato.Candidato;

public class Voto {

	private Candidato presidente;
	private Candidato senador;
	private Candidato depFederal;
	private Candidato depEstadual;
	
	public Voto() {}
	
	public void setPresidente(Candidato presidente) {
		this.presidente = presidente;
	}
	
	public Candidato getPresidente() {
		return this.presidente;
	}
	
	public void setSenador(Candidato senador) {
		this.senador = senador;
	}
	
	public Candidato getSenador() {
		return this.senador;
	}
	
	public void setDepFederal(Candidato depFederal) {
		this.depFederal = depFederal;
	}
	
	public Candidato getDepFederal() {
		return this.depFederal;
	}
	
	public void setDepEstadual(Candidato depEstadual) {
		this.depEstadual = depEstadual;
	}
	
	public Candidato getDepEstadual() {
		return this.depEstadual;
	}
}
