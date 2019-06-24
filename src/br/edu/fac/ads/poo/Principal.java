package br.edu.fac.ads.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Candidatos presidente
		List<Presidente> presidentes = new ArrayList<Presidente>();
		presidentes.add(new Presidente("Francisco", 11));
		presidentes.add(new Presidente("Chico", 16));
		presidentes.add(new Presidente("Toim", 31));

		// Candidatos senador
		List<Senador> senadores = new ArrayList<Senador>();
		senadores.add(new Senador("Galeguim", 171));
		senadores.add(new Senador("Zé da Cachaça", 150));
		senadores.add(new Senador("Da Lua", 321));
		
		// Candidatos Dep. Federal
		List<DeputadoFederal> deputadosFederais = new ArrayList<DeputadoFederal>();
		deputadosFederais.add(new DeputadoFederal("Zezo", 1456));
		deputadosFederais.add(new DeputadoFederal("Bibas", 2222));
		
		// Candidatos Dep. Estadual
		List<DeputadoEstadual> deputadosEstaduais = new ArrayList<DeputadoEstadual>();
		deputadosEstaduais.add(new DeputadoEstadual("Brancoso", 22301));
		deputadosEstaduais.add(new DeputadoEstadual("Neguim", 33010));
		
		// Eleitor
		List<Eleitor> eleitores = new ArrayList<Eleitor>();
		
		Scanner input = new Scanner(System.in);
		
		boolean sair = false;
		boolean jaVotou;
		boolean confirmado;
		
		int menuPrincipal;
		int numPresidente;
		int numSenador;
		int numDepFederal;
		int numDepEstadual;
		
		String cpf;
		String nomeEleitor;
		
		Eleitor eleitor;
		Voto voto;

		while (!sair) {
			jaVotou = false;
			confirmado = false;

			System.out.println("[VOTACAO SIMPLES]\n");
			System.out.println("Menu Pincipal");
			System.out.println("  1. Iniciar novo eleitor");
			System.out.println("  2. Contabilizar votos");
			System.out.println("  3. Saira\n\n");
			
			menuPrincipal = input.nextInt();
			switch (menuPrincipal) {
				case 1: // Inicia dados dos eleitores
					
					System.out.println("Identificacao do eleitor");
					System.out.println("Digite o CPF");
					
					cpf = input.nextLine().trim();
					
					// Verifica se existe cpf jpa votou
					for ( Eleitor el : eleitores ) {
						if (el.getCpf().equals(cpf)) {
							jaVotou = false;
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
						numPresidente = 0;
						
						while (!confirmado) {
							System.out.println("PRESIDENTES");
							for (Presidente presidente : presidentes) {
								System.out.println("  "+presidente.getNumero()+": "+presidente.getNome());
							}
	
							numPresidente = input.nextInt();
							
							System.out.println("Confirma?");
							System.out.println("  0. Nao");
							System.out.println("  1. Sim");
							
							confirmado = input.nextBoolean();
						}
						
						for (Presidente presidente : presidentes) {
							if (presidente.getNumero() == numPresidente) {
								voto.setPresidente(presidente); 
							}
						}
						
						// reinicia valor da variável confirmado para capturaros demais votos
						confirmado = false;
						
						// SENADOR
						
					}

					break;
				case 2: // Contabiliza total dos votos dos candidatos por tipo
					
					break;
				default: // Sair
					System.out.println("Obrigado por utilizar o VOTACAO SIMPLES");
					sair = true;
					break;
			}
		}

		input.close();
	}
}
