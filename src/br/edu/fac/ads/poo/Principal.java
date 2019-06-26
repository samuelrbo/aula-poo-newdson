package br.edu.fac.ads.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.fac.ads.poo.entidade.candidato.Candidato;
import br.edu.fac.ads.poo.entidade.candidato.DeputadoEstadual;
import br.edu.fac.ads.poo.entidade.candidato.DeputadoFederal;
import br.edu.fac.ads.poo.entidade.candidato.Presidente;
import br.edu.fac.ads.poo.entidade.candidato.Senador;
import br.edu.fac.ads.poo.entidade.eleitor.Eleitor;
import br.edu.fac.ads.poo.tipo.TipoCandidato;
import br.edu.fac.ads.poo.voto.Voto;

public class Principal {
	
	private static Scanner input = new Scanner(System.in);
	private static int numCandidato;
	private static boolean confirmado;

	public static void main(String[] args) {
		// Candidatos presidente
		List<Candidato> presidentes = new ArrayList<Candidato>();
		presidentes.add(new Presidente("Francisco", 11));
		presidentes.add(new Presidente("Chico", 16));
		presidentes.add(new Presidente("Toim", 31));

		// Candidatos senador
		List<Candidato> senadores = new ArrayList<Candidato>();
		senadores.add(new Senador("Galeguim", 171));
		senadores.add(new Senador("Zé da Cachaça", 150));
		senadores.add(new Senador("Da Lua", 321));
		
		// Candidatos Dep. Federal
		List<Candidato> deputadosFederais = new ArrayList<Candidato>();
		deputadosFederais.add(new DeputadoFederal("Zezo", 1456));
		deputadosFederais.add(new DeputadoFederal("Bibas", 2222));
		
		// Candidatos Dep. Estadual
		List<Candidato> deputadosEstaduais = new ArrayList<Candidato>();
		deputadosEstaduais.add(new DeputadoEstadual("Brancoso", 22301));
		deputadosEstaduais.add(new DeputadoEstadual("Neguim", 33010));
		
		// Eleitor
		List<Eleitor> eleitores = new ArrayList<Eleitor>();
		
		boolean sair = false;
		boolean jaVotou;
		
		String menuPrincipal;
		String cpf;
		String nomeEleitor;
		
		Presidente presidente;
		Senador senador;
		DeputadoFederal deputadoFederal;
		DeputadoEstadual deputadoEstadual;

		Eleitor eleitor;
		Voto voto;

		while (!sair) {
			jaVotou = false;
			confirmado = false;

			System.out.println("[VOTACAO SIMPLES]\n");
			System.out.println("Menu Pincipal");
			System.out.println("  1. Iniciar novo eleitor");
			System.out.println("  2. Contabilizar votos");
			System.out.println("  3. Sair\n\n");
			
			menuPrincipal = input.nextLine();
			if (!menuPrincipal.isEmpty()) {
				switch (Integer.parseInt(menuPrincipal)) {
					case 1: // Inicia dados dos eleitores
						
						System.out.println("Identificacao do eleitor\n");
						System.out.println("Digite o CPF");
						
						cpf = input.nextLine();
						
						// Verifica se existe cpf jpa votou
						for ( Eleitor el : eleitores ) {
							if (el.getCpf().equals(cpf)) {
								jaVotou = true;
								System.out.println("JA CONSTA VOTO PARA ESSE CPF");
								break;
							}
						}
						
						if (!jaVotou) {
							System.out.println("Digite o nome do eleitor");
							nomeEleitor = input.nextLine();
							
							eleitor = new Eleitor(nomeEleitor, cpf);
							voto = new Voto();
							
							// PRESIDENTE
							presidente = (Presidente)votoConfirma(presidentes, TipoCandidato.PRESIDENTE);
							voto.setPresidente(presidente);
							
							// SENADOR
							senador = (Senador)votoConfirma(senadores, TipoCandidato.SENADOR);
							voto.setSenador(senador);
							
							// DEPUTADO FEDERAL
							deputadoFederal = (DeputadoFederal)votoConfirma(deputadosFederais, TipoCandidato.DEP_FEDERAL);
							voto.setDepFederal(deputadoFederal);
							
							// DEPUTADO ESTADUAL
							deputadoEstadual = (DeputadoEstadual)votoConfirma(deputadosEstaduais, TipoCandidato.DEP_ESTADUAL);
							voto.setDepEstadual(deputadoEstadual);
							
							eleitor.setVoto(voto);
							eleitores.add(eleitor);
							
							System.out.println("Obrigado pelo seu voto!");
						}
	
						break;
					case 2: // Contabiliza total dos votos dos candidatos por tipo
						
						try {
							System.out.println("Estamos computando os votos para os candidatos.");
							Thread.sleep(5000);
							
							for ( Eleitor e : eleitores ) {
								for (Candidato p : presidentes) {
									if (e.getVoto().getPresidente() != null && p.getNumero() == e.getVoto().getPresidente().getNumero()) {
										p.adicionarVoto();
									}
								}
								
								for (Candidato s : senadores) {
									if (e.getVoto().getSenador() != null && s.getNumero() == e.getVoto().getSenador().getNumero()) {
										s.adicionarVoto();
									}
								}
								
								for (Candidato df : deputadosFederais) {
									if (e.getVoto().getDepFederal() != null && df.getNumero() == e.getVoto().getDepFederal().getNumero()) {
										df.adicionarVoto();
									}
								}
								
								for (Candidato de : deputadosEstaduais) {
									if (e.getVoto().getDepEstadual() != null && de.getNumero() == e.getVoto().getDepEstadual().getNumero()) {
										de.adicionarVoto();
									}
								}
							}
							
							System.out.println("Resultados:\n");
							System.out.println("Presidente");
							for ( Candidato c : presidentes ) {
								System.out.println(c.getTotalVotos()+" - "+c.getNome());
							}
							
							System.out.println("Senador");
							for ( Candidato c : senadores ) {
								System.out.println(c.getTotalVotos()+" - "+c.getNome());
							}
							
							System.out.println("Deputado Federal");
							for ( Candidato c : deputadosFederais ) {
								System.out.println(c.getTotalVotos()+" - "+c.getNome());
							}
							
							System.out.println("Deputado Estadual");
							for ( Candidato c : deputadosEstaduais ) {
								System.out.println(c.getTotalVotos()+" - "+c.getNome());
							}
							
						} catch (Exception e) {
							System.out.println("Falha no sistema. Não foi possível calcular o total de votos");
						}
						
						break;
					default: // Sair
						System.out.println("Obrigado por utilizar o VOTACAO SIMPLES");
						sair = true;
						break;
				}
			}
		}

		input.close();
	}
	
	private static Candidato votoConfirma (List<Candidato> candidatos, String tipoCandidato) {
		
		numCandidato = 0;
		while (!confirmado) {
			System.out.println(tipoCandidato);
			for (Candidato candidato : candidatos) {
				System.out.println("  "+candidato.getNumero()+": "+candidato.getNome());
			}
			
			numCandidato = input.nextInt();
			
			System.out.println("Confirma?");
			System.out.println("  0. Nao");
			System.out.println("  1. Sim");
			
			confirmado = input.nextInt() == 1;
		}
		
		Candidato candidato = null;
		for (Candidato c : candidatos) {
			if (c.getNumero() == numCandidato) {
				candidato = c;
			}
		}
		
		// reinicia valor da variável confirmado para capturaros demais votos
		confirmado = false;
		return candidato;
	}
}
