import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.ArrayList;

class Jogo {
	private static final String nome_aventureiro = null; ////Precisa verificar o porque n�o consigo colocar o nome do aventureiro nos dialogos
	
     ////static int temp_dialog = 60, temp_narrativa = 130, temp_transicao = 20;   //Tempo correto do game
	static int temp_dialog = 20, temp_narrativa = 80, temp_transicao = 20; // Para rodar o jogo sem o delay nas
																			// mensagens, pode mudar o valor destas 3
																			// vari�veis para 0;
	public static void main(String[] args) throws Exception {
		Scanner entrada = new Scanner(System.in);
		
		//Digita("\n Um homem conhecido como Mestre Dos Magos e seu Aprendiz chamado Grannus, viagem a procura de suprimentos para fabrica��o de novas po��es.", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("\n Voc� est� pronto para conhecer o incr�vel mundo de The Last Breath?", TimeUnit.MILLISECONDS, temp_dialog);
		
		
		System.out.println("\n1 - Sim | 2 - Com certeza! | 3 - N�o estou preparado...");
		int escolha_menu = entrada.nextInt();

		if (escolha_menu == 1 || escolha_menu == 2) {
			Digita("\n Perfeito, fique sabendo que � um caminho sem volta!", TimeUnit.MILLISECONDS, temp_dialog);
			menu();
		} else if (escolha_menu == 3) {
			Digita("\n N�o se engane, voc� n�o tem muita escolha... Abrace o destino!", TimeUnit.MILLISECONDS, temp_dialog);
			menu();
		} else {
			Digita("Escolha uma op��o val�da!", TimeUnit.MILLISECONDS, temp_dialog);
			menu();
		}
	}
	
//============================================================== MENU DO JOGO ================================================================================================================================
	static void menu() throws Exception {
		Scanner entrada = new Scanner(System.in);

		int escolha_menu;
		do {
			Digita("\n\n..:: THE LAST OF BREATH ::.. \n\n1 - Jogar \n2 - Instru��es\n3 - Cr�ditos \n4 - Sair", TimeUnit.MILLISECONDS, temp_transicao);
			System.out.println();
			
			escolha_menu = entrada.nextInt();
			if (escolha_menu == 1) {
				jogo();
			} else if (escolha_menu == 2) {
				instrucoes();
			} else if (escolha_menu == 3) {
				creditos();
			} else if (escolha_menu == 4) {
				System.out.println("Voc� saiu do jogo!");
				System.exit(0);
			} else {
				System.out.println("\nOp��o inv�lida, digite novamente: ");
			}
		} while (escolha_menu != 1 && escolha_menu != 2 && escolha_menu != 3 && escolha_menu != 4);
	}
	
//============================================================== INSTRU��ES ==============================================================================================================================
	static void instrucoes() throws Exception {
		Scanner entrada = new Scanner(System.in);
		int escolha_menu, temp_narrativa = 80;
		
		Digita("\n O  Jogo baseado no modo RPG Textual � uma troca de mensagens em que o jogador move a trama do ponto de vista do seu personagem atr�ves de uma pergunta respondida.\r\n\n - A cada pergunta respondida o jogo dar� op��es de caminhos para explorar.\r\n\n Ou seja, Mantenha total aten��o na hora de responder.\r\n" + "  ", TimeUnit.MILLISECONDS, temp_narrativa);
		
		do {
			System.out.println();
			System.out.println("\n2 - Retornar ao menu");
			escolha_menu = entrada.nextInt();
			if (escolha_menu == 2) {
				menu();
			} else {
				System.out.println("\nOp��o inv�lida, digite novamente: ");
			}
		} while (escolha_menu != 2);
	}
	
	
//============================================================== CR�DITOS =================================================================================================================================
	static void creditos() throws Exception {
		Scanner entrada = new Scanner(System.in);
		int escolha_menu, temp_narrativa = 80;
		
		Digita("\n\n</> Desenvolvedores </>\n\n-> Jo�o Vitor Richard Carlos \n-> Natan Camargo Rodrigues \n-> Rafaela Eduarda Teixeira Silva\n-> Thamyra Fernanda de Godoi ", TimeUnit.MILLISECONDS, temp_narrativa);
		
		do {
			System.out.println();
			System.out.println("\n2 - Retornar ao menu");
			escolha_menu = entrada.nextInt();
			if (escolha_menu == 2) {
				menu();
			} else {
				System.out.println("\nOp��o inv�lida, digite novamente: ");
			}
		} while (escolha_menu != 2);
	}
	

//============================================================== JOGO ================================================================================================================================
	static void jogo() throws Exception {
		Scanner entrada = new Scanner(System.in);

		Digita("\n Para come�armos, por favor, diga-me o seu nome: ", TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println("\n");
		
		String nome_aventureiro = entrada.next();
		Digita("\n Seja bem-vindo(a), ao intenso mundo de The Last Breath, " + nome_aventureiro + "!", TimeUnit.MILLISECONDS, 50);
		
		Digita("\n\n A partir daqui, voc� iniciar� o jogo..", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("\n\n Gostaria de saber mais sobre a trama no qual voc� est� prestes a entrar ou ir direto para o jogo?", TimeUnit.MILLISECONDS, temp_dialog);
		
		int escolha_menu;
		
		do {
			System.out.println("\n\n1 - Gostaria de saber mais");
			System.out.println("2 - Iniciar jogo");
			System.out.println("3 - Voltar");
			escolha_menu = entrada.nextInt();
			
			if (escolha_menu == 1) {
				Digita("\n\n Sinopse: ", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n A hist�ria se baseia em uma trama repleta de mist�rios e magias, onde voc� viajar� em busca da cura que ir� salvar sua irm� de uma maldi��o lan�ada por um mago aprendiz. \n Durante esta jornada voc� ir� enfrentar diversos obst�culos e desafios que despertar� habilidades ocultas dentro de voc�.\r\n ", TimeUnit.MILLISECONDS, temp_dialog);

				Digita("\n\n" + nome_aventureiro + ", hora de iniciar a aventura!", TimeUnit.MILLISECONDS, temp_dialog);
				
				capitulo_1();
				capitulo_2();
				//capitulo_3();

			} else if (escolha_menu == 3) {
				menu();
			} else if (escolha_menu == 2) {
				Digita("\n\n CAP�TULO I - A terr�vel maldi��o", TimeUnit.MILLISECONDS, temp_dialog);
				capitulo_1();
				capitulo_2();
				//capitulo_3();

			} else {
				System.out.println("\n Op��o inv�lida!");
			}
		} while (escolha_menu != 1 || escolha_menu != 2 || escolha_menu != 3);
	}
	
//================================================================ CAPITULO 1 ==============================================================================================================================

	static void capitulo_1() throws Exception {

		Scanner entrada = new Scanner(System.in);
		
		int resp;
		
		Digita("\n\n Um homem conhecido como mestre dos magos e seu aprendiz viagem a procura de suprimentos para fabrica��o de novas po��es. \n\n Durante essa jornada, ao chegar em uma vila vizinha chamada Aghoo, encontram o irm�o mais novo dos mestre dos magos! Centrion, que foi corrompido por sua fome de poder e conhecimento ao longo dos anos. ", TimeUnit.MILLISECONDS, temp_dialog);

		
		Digita("\n\n - Mestre dos magos: Grannus, preciso de sua ajuda para levar essas pessoas para um local seguro, EU VOU ENFRENTAR MEU IRM�O E ACABAR COM ISSO DE UMA VEZ POR TODAS! \n\n - Aprendiz: Entendido mestre, assim que eu conseguir levar todos em seguran�a volto para te ajudar! [...] Por aqui crian�as, vou lev�-las para um lugar seguro!", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("\n\n - Centrion: Eu precisava de algo para chamar sua aten��o! Eu tinha que ter certeza de que voc� estaria aqui irm�o. \n\n - Mestre dos magos: O que voc� pretende fazer com tudo isso ?\n\n - Centrion: Eu quero tirar de voc� o que me pertence!!", TimeUnit.MILLISECONDS, temp_dialog);
	
			
		Digita("\n\n - Mestre dos magos:  1) Isso � o que veremos! ou 2) Voc� n�o � p�reo para mim!", TimeUnit.MILLISECONDS, temp_dialog);
		
		System.out.println("\n");
		resp = entrada.nextInt();
		
		
		if (resp == 1) {
			Digita("\n - Mestre dos magos: Isso � o que veremos!", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n �Ent�o, uma batalha intensa � travada entre dois magos poderosos e no meio dos destro�os uma crian�a sozinha e indefesa � vista tentando se esconder para n�o ser atingida� O Aprendiz volta para tentar ajudar seu mestre.�", TimeUnit.MILLISECONDS, temp_dialog);

			
		} else if (resp == 2) {
			
			Digita("\n - Mestre dos magos: Voc� n�o � p�reo para mim!", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n �Ent�o, uma batalha intensa � travada entre dois magos poderosos e no meio dos destro�os uma crian�a sozinha e indefesa � vista tentando se esconder para n�o ser atingida� O Aprendiz volta para tentar ajudar seu mestre.�", TimeUnit.MILLISECONDS, temp_dialog);

            System.out.println("");
          
            
		} else {
			System.out.println("Voc� n�o digitou uma resposta val�da!");
			
		}
		
		
		Digita("\n\n- Mestre dos magos: GRANNUS leve essa crian�a daqui!! Eu vou terminar essa luta sozinho! \n  CENTRIONNNNN!! Eu devia ter acabado com voc� no passado, mas n�o tem problema eu acabo com voc� agora!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - Aprendiz: Mestre, lembra daquele feiti�o que voc� me ensinou?", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - Mestre dos magos: Voc� tem certeza que isso vai funcionar? \n Irei confiar nos seus sentidos, meu jovem aprendiz! \n TENEBRISSS MORTIS!!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n   O tempo se fecha e o poder ca� sobre Centrion, o inimigo mesmo derrotado ainda n�o desistiu da luta e quer vingan�a...", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - Centrion: Voc� venceu aqui meu irm�o, mas essa batalha ainda n�o acabou!!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n   Ent�o em seu �ltimo suspiro de vida Centrion usou o que lhe restava de magia para lan�ar um feiti�o sobre Grannus, o aprendiz do Mestre dos magos, que no futuro acabar� trazendo a morte de seu mestre buscando pelos desejos de Centrion.", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - Centrion: �SEQUITUR VESTIIGIA MEA!!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - Aprendiz: �AAAARRGH! O que voc� feeez!!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - Mestre dos magos: Essa luta acabou! Grannus voc� est� bem ?", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - Aprendiz: Estou bem, n�o se preocupe comigo! Vamos levar essa crian�a daqui e voltar para casa!", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("\n\n   Depois de uma dura batalha o Mestre dos magos e seu Aprendiz retornam para casa levando uma crian�a que perdeu seus pais nos destro�os causados em Aghoo.", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - Aprendiz: Mestre, o que faremos com essa crian�a?", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - Mestre dos magos: Eu vou lev�-lo comigo e cuidar dele, tenho certeza que ele se dar� muito bem com meus filhos!", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("\n\n - .:: 1 ANOS DEPOIS ::.", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("\n\n - Aprendiz: Muito bem estamos quase chegando, aguente firme!", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("\n\n   Grannus vendo seu mestre enfraquecido aproveita para mat�-lo e tomar seus poderes. Consumido pelo �dio lan�ado no feiti�o de Centrion, ele amaldi�oou a amada filha de seu mestre a morrer quando completasse 18 anos de idade.", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n   Ap�s a morte de seu pai, o Mestre dos Magos, Solveig o filho mais velho leva seus irm�os para um lugar seguro onde eles pudessem viver. Enquanto isso, Grannus celebra seus novos poderes construindo seu reino em uma terra distante.", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("\n\n - Solveig: " + nome_aventureiro + " preciso lhe ensinar os conhecimentos que nosso pai tinha, para que um dia voc� possa se defender sozinho, voc� entende isso ?", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("\n\n - " + nome_aventureiro + "1) Eu quero proteger nossa vila do homem que matou nosso Pai!! ou 2) Eu n�o sei se conseguirei ser bom como voc� meu irm�o", TimeUnit.MILLISECONDS, temp_dialog);
		
	

			int resp1;

			System.out.println("\n");
			resp1 = entrada.nextInt();

			if (resp1 == 1) {
				Digita("\n - " + nome_aventureiro + " Eu quero proteger nossa vila do homem que matou nosso Pai!!  ", TimeUnit.MILLISECONDS, temp_dialog);
			

			} else if (resp1 == 2) {

				Digita("\n - " + nome_aventureiro + " Eu n�o sei se um dia conseguirei ser bom como voc� meu irm�o", TimeUnit.MILLISECONDS, temp_dialog);

			} else {
				System.out.println("Voc� n�o digitou uma resposta val�da!");
			}
		
			Digita("\n\n - Solveig: Voc� ser� excelente " + nome_aventureiro + ", agora chame nossa irm� para que eu possa ensin�-los a como batalhar!", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n - " + nome_aventureiro + " BRYANNAAAAAAA, ONDE EST� VOC�?", TimeUnit.MILLISECONDS, temp_dialog);
			
			Digita("\n\n - Bryanna: Estou aqui, j� estou indo!", TimeUnit.MILLISECONDS, temp_dialog);
			
			Digita("\n\n - Durante sua juventude Solveig ensina seus irm�os mais novos a desenvolver habilidades e conhecimentos para que um dia eles pudessem juntos derrotar Grannus e livrar Bryanna de sua maldi��o.", TimeUnit.MILLISECONDS, temp_dialog);
			
			Digita("\n\n CAP�TULO II - Uma jornada inesperada.", TimeUnit.MILLISECONDS, temp_dialog);
			
			capitulo_2();
	}   
	
	
	
	
//================================================================ CAPITULO 2 ==============================================================================================================================
	static void capitulo_2() throws Exception {

		Scanner entrada = new Scanner(System.in);
		
		
		Digita("\n\n Ao completar 17 anos, Bryanna come�a a receber sinais de que seu tempo de vida est� acabando. Seu meio irm�o " + nome_aventureiro + " percebe esses acontecimentos e conta para seu irm�o mais velho. \n Solveig desesperado para salvar sua irm� busca solu��es em livros antigos de seu pai para que talvez encontre algo que possa ajud�-los enquanto o jogador vai em busca da cura que est� com Grannus.", TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita("\n\n Precisa desenvolver o resto da historia, fiz apenas o MENU! by: Jo�o Vitor", TimeUnit.MILLISECONDS, temp_dialog);
		
	}
	
	
//================================================================ CAPITULO 3 ==============================================================================================================================
	//static void capitulo_3() throws Exception {

		//Scanner entrada = new Scanner(System.in);
		
		//Digita("\n\n Precisa desenvolver o resto da historia, fiz apenas o MENU! by: Jo�o Vitor", TimeUnit.MILLISECONDS, temp_dialog);
		
	//}
	
	
//================================================================ FIM DO C�DIGO ==============================================================================================================================	
	public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
		for (char caractere : mensagem.toCharArray()) {
			System.out.print(caractere);
			unit.sleep(tempo_mensagem);
		}
	}
}