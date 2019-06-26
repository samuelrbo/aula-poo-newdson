package br.edu.fac.ads.poo.entidade.candidato;

import br.edu.fac.ads.poo.interface_e_abastract.PessoaAbstract;
import br.edu.fac.ads.poo.tipo.TipoPessoa;

public class Candidato extends PessoaAbstract {
	
	private int numero;
	private String tipoCandidato;
	private int totalVotos = 0;
	
	public Candidato(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}
	
	protected void setTipoCandidato(String tipoCandidato) {
		this.tipoCandidato = tipoCandidato;
	}

	public String getTipoCandidato() {
		return tipoCandidato;
	}
	
	@Override
	public String getTipo() {
		return TipoPessoa.ELEITOR;
	}
	
	public void setTotalVotos(int totalVotos) {
		this.totalVotos = totalVotos;
	}
	
	public int getTotalVotos() {
		return totalVotos;
	}
	
	public void adicionarVoto() {
		totalVotos++;
	}
}
