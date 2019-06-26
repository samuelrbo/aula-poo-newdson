package br.edu.fac.ads.poo.entidade.eleitor;

import br.edu.fac.ads.poo.interface_e_abastract.PessoaAbstract;
import br.edu.fac.ads.poo.tipo.TipoPessoa;
import br.edu.fac.ads.poo.voto.Voto;

public class Eleitor extends PessoaAbstract {
	
	private String cpf;
	private Voto voto;
	
	public Eleitor() {}
	
	public Eleitor(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	@Override
	public String getTipo() {
		return TipoPessoa.ELEITOR;
	}
	
	public void setVoto(Voto voto) {
		this.voto = voto;
	}
	
	public Voto getVoto() {
		return voto;
	}
}
