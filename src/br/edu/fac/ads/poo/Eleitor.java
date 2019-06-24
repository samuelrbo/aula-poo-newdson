package br.edu.fac.ads.poo;

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
