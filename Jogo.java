import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.ArrayList;

class Jogo {
	private static final String nome_aventureiro = null; ////Precisa verificar o porque não consigo colocar o nome do aventureiro nos dialogos
	
     ////static int temp_dialog = 60, temp_narrativa = 130, temp_transicao = 20;   //Tempo correto do game
	static int temp_dialog = 20, temp_narrativa = 80, temp_transicao = 20; // Para rodar o jogo sem o delay nas
																			// mensagens, pode mudar o valor destas 3
																			// variáveis para 0;
	public static void main(String[] args) throws Exception {
		Scanner entrada = new Scanner(System.in);
		
		//Digita("\n Um homem conhecido como Mestre Dos Magos e seu Aprendiz chamado Grannus, viagem a procura de suprimentos para fabricação de novas poções.", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("\n Você está pronto para conhecer o incrível mundo de The Last Breath?", TimeUnit.MILLISECONDS, temp_dialog);
		
		
		System.out.println("\n1 - Sim | 2 - Com certeza! | 3 - Não estou preparado...");
		int escolha_menu = entrada.nextInt();

		if (escolha_menu == 1 || escolha_menu == 2) {
			Digita("\n Perfeito, fique sabendo que é um caminho sem volta!", TimeUnit.MILLISECONDS, temp_dialog);
			menu();
		} else if (escolha_menu == 3) {
			Digita("\n Não se engane, você não tem muita escolha... Abrace o destino!", TimeUnit.MILLISECONDS, temp_dialog);
			menu();
		} else {
			Digita("Escolha uma opção valída!", TimeUnit.MILLISECONDS, temp_dialog);
			menu();
		}
	}
	
//============================================================== MENU DO JOGO ================================================================================================================================
	static void menu() throws Exception {
		Scanner entrada = new Scanner(System.in);

		int escolha_menu;
		do {
			Digita("\n\n..:: THE LAST OF BREATH ::.. \n\n1 - Jogar \n2 - Instruções\n3 - Créditos \n4 - Sair", TimeUnit.MILLISECONDS, temp_transicao);
			System.out.println();
			
			escolha_menu = entrada.nextInt();
			if (escolha_menu == 1) {
				jogo();
			} else if (escolha_menu == 2) {
				instrucoes();
			} else if (escolha_menu == 3) {
				creditos();
			} else if (escolha_menu == 4) {
				System.out.println("Você saiu do jogo!");
				System.exit(0);
			} else {
				System.out.println("\nOpção inválida, digite novamente: ");
			}
		} while (escolha_menu != 1 && escolha_menu != 2 && escolha_menu != 3 && escolha_menu != 4);
	}
	
//============================================================== INSTRUÇÕES ==============================================================================================================================
	static void instrucoes() throws Exception {
		Scanner entrada = new Scanner(System.in);
		int escolha_menu, temp_narrativa = 80;
		
		Digita("\n O  Jogo baseado no modo RPG Textual é uma troca de mensagens em que o jogador move a trama do ponto de vista do seu personagem atráves de uma pergunta respondida.\r\n\n - A cada pergunta respondida o jogo dará opções de caminhos para explorar.\r\n\n Ou seja, Mantenha total atenção na hora de responder.\r\n" + "  ", TimeUnit.MILLISECONDS, temp_narrativa);
		
		do {
			System.out.println();
			System.out.println("\n2 - Retornar ao menu");
			escolha_menu = entrada.nextInt();
			if (escolha_menu == 2) {
				menu();
			} else {
				System.out.println("\nOpção inválida, digite novamente: ");
			}
		} while (escolha_menu != 2);
	}
	
	
//============================================================== CRÉDITOS =================================================================================================================================
	static void creditos() throws Exception {
		Scanner entrada = new Scanner(System.in);
		int escolha_menu, temp_narrativa = 80;
		
		Digita("\n\n</> Desenvolvedores </>\n\n-> João Vitor Richard Carlos \n-> Natan Camargo Rodrigues \n-> Rafaela Eduarda Teixeira Silva\n-> Thamyra Fernanda de Godoi ", TimeUnit.MILLISECONDS, temp_narrativa);
		
		do {
			System.out.println();
			System.out.println("\n2 - Retornar ao menu");
			escolha_menu = entrada.nextInt();
			if (escolha_menu == 2) {
				menu();
			} else {
				System.out.println("\nOpção inválida, digite novamente: ");
			}
		} while (escolha_menu != 2);
	}
	

//============================================================== JOGO ================================================================================================================================
	static void jogo() throws Exception {
		Scanner entrada = new Scanner(System.in);

		Digita("\n Para começarmos, por favor, diga-me o seu nome: ", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println("\n");
		
		String nome_aventureiro = entrada.next();
		Digita("\n Seja bem-vindo(a), ao intenso mundo de The Last Breath, " + nome_aventureiro + "!", TimeUnit.MILLISECONDS, 50);
		
		Digita("\n\n A partir daqui, você iniciará o jogo..", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("\n\n Gostaria de saber mais sobre a trama no qual você está prestes a entrar ou ir direto para o jogo?", TimeUnit.MILLISECONDS, temp_dialog);
		
		int escolha_menu;
		
		do {
			System.out.println("\n\n1 - Gostaria de saber mais");
			System.out.println("2 - Iniciar jogo");
			System.out.println("3 - Voltar");
			escolha_menu = entrada.nextInt();
			
			if (escolha_menu == 1) {
				Digita("\n\n Sinopse: ", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n A história se baseia em uma trama repleta de mistérios e magias, onde você viajará em busca da cura que irá salvar sua irmã de uma maldição lançada por um mago aprendiz. \n Durante esta jornada você irá enfrentar diversos obstáculos e desafios que despertará habilidades ocultas dentro de você.\r\n ", TimeUnit.MILLISECONDS, temp_dialog);

				Digita("\n\n" + nome_aventureiro + ", hora de iniciar a aventura!", TimeUnit.MILLISECONDS, temp_dialog);
				
				capitulo_1();
				capitulo_2();
				//capitulo_3();

			} else if (escolha_menu == 3) {
				menu();
			} else if (escolha_menu == 2) {
				Digita("\n\n CAPÍTULO I - A terrível maldição", TimeUnit.MILLISECONDS, temp_dialog);
				capitulo_1();
				capitulo_2();
				//capitulo_3();

			} else {
				System.out.println("\n Opção inválida!");
			}
		} while (escolha_menu != 1 || escolha_menu != 2 || escolha_menu != 3);
	}
	
//================================================================ CAPITULO 1 ==============================================================================================================================

	static void capitulo_1() throws Exception {

		Scanner entrada = new Scanner(System.in);
		
		int resp;
		
		Digita("\n\n Um homem conhecido como mestre dos magos e seu aprendiz viagem a procura de suprimentos para fabricação de novas poções. \n\n Durante essa jornada, ao chegar em uma vila vizinha chamada Aghoo, encontram o irmão mais novo dos mestre dos magos! Centrion, que foi corrompido por sua fome de poder e conhecimento ao longo dos anos. ", TimeUnit.MILLISECONDS, temp_dialog);

		
		Digita("\n\n - Mestre dos magos: Grannus, preciso de sua ajuda para levar essas pessoas para um local seguro, EU VOU ENFRENTAR MEU IRMÃO E ACABAR COM ISSO DE UMA VEZ POR TODAS! \n\n - Aprendiz: Entendido mestre, assim que eu conseguir levar todos em segurança volto para te ajudar! [...] Por aqui crianças, vou levá-las para um lugar seguro!", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("\n\n - Centrion: Eu precisava de algo para chamar sua atenção! Eu tinha que ter certeza de que você estaria aqui irmão. \n\n - Mestre dos magos: O que você pretende fazer com tudo isso ?\n\n - Centrion: Eu quero tirar de você o que me pertence!!", TimeUnit.MILLISECONDS, temp_dialog);
	
			
		Digita("\n\n - Mestre dos magos:  1) Isso é o que veremos! ou 2) Você não é páreo para mim!", TimeUnit.MILLISECONDS, temp_dialog);
		
		System.out.println("\n");
		resp = entrada.nextInt();
		
		
		if (resp == 1) {
			Digita("\n - Mestre dos magos: Isso é o que veremos!", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n “Então, uma batalha intensa é travada entre dois magos poderosos e no meio dos destroços uma criança sozinha e indefesa é vista tentando se esconder para não ser atingida… O Aprendiz volta para tentar ajudar seu mestre.”", TimeUnit.MILLISECONDS, temp_dialog);

			
		} else if (resp == 2) {
			
			Digita("\n - Mestre dos magos: Você não é páreo para mim!", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n “Então, uma batalha intensa é travada entre dois magos poderosos e no meio dos destroços uma criança sozinha e indefesa é vista tentando se esconder para não ser atingida… O Aprendiz volta para tentar ajudar seu mestre.”", TimeUnit.MILLISECONDS, temp_dialog);

            System.out.println("");
          
            
		} else {
			System.out.println("Você não digitou uma resposta valída!");
			
		}
		
		
		Digita("\n\n- Mestre dos magos: GRANNUS leve essa criança daqui!! Eu vou terminar essa luta sozinho! \n  CENTRIONNNNN!! Eu devia ter acabado com você no passado, mas não tem problema eu acabo com você agora!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - Aprendiz: Mestre, lembra daquele feitiço que você me ensinou?", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - Mestre dos magos: Você tem certeza que isso vai funcionar? \n Irei confiar nos seus sentidos, meu jovem aprendiz! \n TENEBRISSS MORTIS!!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n   O tempo se fecha e o poder caí sobre Centrion, o inimigo mesmo derrotado ainda não desistiu da luta e quer vingança...", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - Centrion: Você venceu aqui meu irmão, mas essa batalha ainda não acabou!!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n   Então em seu último suspiro de vida Centrion usou o que lhe restava de magia para lançar um feitiço sobre Grannus, o aprendiz do Mestre dos magos, que no futuro acabará trazendo a morte de seu mestre buscando pelos desejos de Centrion.", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - Centrion: “SEQUITUR VESTIIGIA MEA!!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - Aprendiz: “AAAARRGH! O que você feeez!!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - Mestre dos magos: Essa luta acabou! Grannus você está bem ?", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - Aprendiz: Estou bem, não se preocupe comigo! Vamos levar essa criança daqui e voltar para casa!", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("\n\n   Depois de uma dura batalha o Mestre dos magos e seu Aprendiz retornam para casa levando uma criança que perdeu seus pais nos destroços causados em Aghoo.", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - Aprendiz: Mestre, o que faremos com essa criança?", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - Mestre dos magos: Eu vou levá-lo comigo e cuidar dele, tenho certeza que ele se dará muito bem com meus filhos!", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("\n\n - .:: 1 ANOS DEPOIS ::.", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("\n\n - Aprendiz: Muito bem estamos quase chegando, aguente firme!", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("\n\n   Grannus vendo seu mestre enfraquecido aproveita para matá-lo e tomar seus poderes. Consumido pelo ódio lançado no feitiço de Centrion, ele amaldiçoou a amada filha de seu mestre a morrer quando completasse 18 anos de idade.", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n   Após a morte de seu pai, o Mestre dos Magos, Solveig o filho mais velho leva seus irmãos para um lugar seguro onde eles pudessem viver. Enquanto isso, Grannus celebra seus novos poderes construindo seu reino em uma terra distante.", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("\n\n - Solveig: " + nome_aventureiro + " preciso lhe ensinar os conhecimentos que nosso pai tinha, para que um dia você possa se defender sozinho, você entende isso ?", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("\n\n - " + nome_aventureiro + "1) Eu quero proteger nossa vila do homem que matou nosso Pai!! ou 2) Eu não sei se conseguirei ser bom como você meu irmão", TimeUnit.MILLISECONDS, temp_dialog);
		
	

			int resp1;

			System.out.println("\n");
			resp1 = entrada.nextInt();

			if (resp1 == 1) {
				Digita("\n - " + nome_aventureiro + " Eu quero proteger nossa vila do homem que matou nosso Pai!!  ", TimeUnit.MILLISECONDS, temp_dialog);
			

			} else if (resp1 == 2) {

				Digita("\n - " + nome_aventureiro + " Eu não sei se um dia conseguirei ser bom como você meu irmão", TimeUnit.MILLISECONDS, temp_dialog);

			} else {
				System.out.println("Você não digitou uma resposta valída!");
			}
		
			Digita("\n\n - Solveig: Você será excelente " + nome_aventureiro + ", agora chame nossa irmã para que eu possa ensiná-los a como batalhar!", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n - " + nome_aventureiro + " BRYANNAAAAAAA, ONDE ESTÁ VOCÊ?", TimeUnit.MILLISECONDS, temp_dialog);
			
			Digita("\n\n - Bryanna: Estou aqui, já estou indo!", TimeUnit.MILLISECONDS, temp_dialog);
			
			Digita("\n\n - Durante sua juventude Solveig ensina seus irmãos mais novos a desenvolver habilidades e conhecimentos para que um dia eles pudessem juntos derrotar Grannus e livrar Bryanna de sua maldição.", TimeUnit.MILLISECONDS, temp_dialog);
			
			Digita("\n\n CAPÍTULO II - Uma jornada inesperada.", TimeUnit.MILLISECONDS, temp_dialog);
			
			capitulo_2();
	}   
	
	
	
	
//================================================================ CAPITULO 2 ==============================================================================================================================
	static void capitulo_2() throws Exception {

		Scanner entrada = new Scanner(System.in);
		
		
		Digita("\n\n Ao completar 17 anos, Bryanna começa a receber sinais de que seu tempo de vida está acabando. Seu meio irmão " + nome_aventureiro + " percebe esses acontecimentos e conta para seu irmão mais velho. \n Solveig desesperado para salvar sua irmã busca soluções em livros antigos de seu pai para que talvez encontre algo que possa ajudá-los enquanto o jogador vai em busca da cura que está com Grannus.", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("\n\n Precisa desenvolver o resto da historia, fiz apenas o MENU! by: João Vitor", TimeUnit.MILLISECONDS, temp_dialog);
		
	}
	
	
//================================================================ CAPITULO 3 ==============================================================================================================================
	//static void capitulo_3() throws Exception {

		//Scanner entrada = new Scanner(System.in);
		
		//Digita("\n\n Precisa desenvolver o resto da historia, fiz apenas o MENU! by: João Vitor", TimeUnit.MILLISECONDS, temp_dialog);
		
	//}
	
	
//================================================================ FIM DO CÓDIGO ==============================================================================================================================	
	public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
		for (char caractere : mensagem.toCharArray()) {
			System.out.print(caractere);
			unit.sleep(tempo_mensagem);
		}
	}
}