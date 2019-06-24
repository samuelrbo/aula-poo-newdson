package br.edu.fac.ads.poo;

/**
 * Uma interface não é uma classe, mas pode ser referenciada.
 * Uma classe possui apenas assinaturas de métodos
 * Uma interface não pode conter atributos
 */
public interface PessoaInterface {
	
	/**
	 * @return Tipo da pessoa (Eleitor ou Candidato)
	 */
	public String getTipo();
}
