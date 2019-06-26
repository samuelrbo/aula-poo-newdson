package br.edu.fac.ads.poo.voto;

import br.edu.fac.ads.poo.entidade.candidato.Candidato;
import br.edu.fac.ads.poo.entidade.candidato.DeputadoEstadual;
import br.edu.fac.ads.poo.entidade.candidato.DeputadoFederal;
import br.edu.fac.ads.poo.entidade.candidato.Presidente;
import br.edu.fac.ads.poo.entidade.candidato.Senador;

public class Voto {

	private Presidente presidente;
	private Senador senador;
	private DeputadoFederal depFederal;
	private DeputadoEstadual depEstadual;
	
	public Voto() {}
	
	public void setPresidente(Presidente presidente) {
		this.presidente = presidente;
	}
	
	public Candidato getPresidente() {
		return this.presidente;
	}
	
	public void setSenador(Senador senador) {
		this.senador = senador;
	}
	
	public Candidato getSenador() {
		return this.senador;
	}
	
	public void setDepFederal(DeputadoFederal depFederal) {
		this.depFederal = depFederal;
	}
	
	public Candidato getDepFederal() {
		return this.depFederal;
	}
	
	public void setDepEstadual(DeputadoEstadual depEstadual) {
		this.depEstadual = depEstadual;
	}
	
	public Candidato getDepEstadual() {
		return this.depEstadual;
	}
}
