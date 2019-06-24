package br.edu.fac.ads.poo;

/**
 * Uma interface n�o � uma classe, mas pode ser referenciada.
 * Uma classe possui apenas assinaturas de m�todos
 * Uma interface n�o pode conter atributos
 */
public interface PessoaInterface {
	
	/**
	 * @return Tipo da pessoa (Eleitor ou Candidato)
	 */
	public String getTipo();
}
