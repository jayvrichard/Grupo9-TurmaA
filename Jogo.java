import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class Jogo {
	private static final String nome_aventureiro = " "; ////Precisa verificar o porque n�o consigo colocar o nome do aventureiro nos dialogos
	
     ////static int temp_dialog = 60, temp_narrativa = 130, temp_transicao = 20;   //Tempo correto do game
	static int temp_dialog = 0, temp_narrativa = 0, temp_transicao = 0; // Para rodar o jogo sem o delay nas
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
		
		Digita("\n O  Jogo baseado no modo RPG Textual � uma troca de mensagens em que o jogador move a trama do ponto de vista do seu personagem atr�ves de uma pergunta respondida.\r\n\n - A cada pergunta respondida o jogo dar� op��es de caminhos para explorar.\r\n\n Ou seja, mantenha total aten��o na hora de responder.\r\n" + "  ", TimeUnit.MILLISECONDS, temp_narrativa);
		
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
				capitulo_3();
				final_1();
				final_2();

			} else if (escolha_menu == 3) {
				menu();
			} else if (escolha_menu == 2) {
				Digita("\n\n CAP�TULO I - A terr�vel maldi��o", TimeUnit.MILLISECONDS, temp_dialog);
				capitulo_1();
				capitulo_2();
				capitulo_3();
				final_1();
				final_2();

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
		
		do {
			
			Digita("\n\n - Mestre dos magos:  1) Isso � o que veremos! ou 2) Voc� n�o � p�reo para mim!", TimeUnit.MILLISECONDS, temp_dialog);
			System.out.println("\n");
			resp = entrada.nextInt();
			
		if (resp == 1) {
			Digita("\n - Mestre dos magos: Isso � o que veremos!", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n �Ent�o, uma batalha intensa � travada entre dois magos poderosos e no meio dos destro�os uma crian�a sozinha e indefesa � vista tentando se esconder para n�o ser atingida� O Aprendiz volta para tentar ajudar seu mestre.�", TimeUnit.MILLISECONDS, temp_dialog);
break;
			
		} else if (resp == 2) {
			
			Digita("\n - Mestre dos magos: Voc� n�o � p�reo para mim!", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n �Ent�o, uma batalha intensa � travada entre dois magos poderosos e no meio dos destro�os uma crian�a sozinha e indefesa � vista tentando se esconder para n�o ser atingida� O Aprendiz volta para tentar ajudar seu mestre.�", TimeUnit.MILLISECONDS, temp_dialog);
break;
            
		} else {
			System.out.println("Voc� n�o digitou uma resposta val�da!");
			
		}
		
		}while(resp != 1 || resp != 2);
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
		
		Digita("\n\n - " + nome_aventureiro + " 1) Eu quero proteger nossa vila do homem que matou nosso Pai!! ou 2) Eu n�o sei se conseguirei ser bom como voc� meu irm�o", TimeUnit.MILLISECONDS, temp_dialog);
		
	

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
		Digita("\n\n ========================== ",  TimeUnit.MILLISECONDS, temp_dialog);
		System.err.println("=======");
		capitulo_3();
	}
	
	
//================================================================ CAPITULO 3 ==============================================================================================================================
	static void capitulo_3() throws Exception {

		Scanner entrada = new Scanner(System.in);
		
		Digita("\n\n  CAP�TULO FINAL - O segredo � revelado", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - Doodou: Acorde garoto, precisamos seguir em frente! Vamos descobrir como salvar sua irm� e acabar com tudo isso.",  TimeUnit.MILLISECONDS, temp_dialog);
		
		int resp;
		do {
			Digita("\n\n - " + nome_aventureiro + " 1} Vamos, estou pronto! 2} Esperaaaaa, eu estou cansado!", TimeUnit.MILLISECONDS, temp_dialog);
			
			
			System.out.println("\n");
			resp = entrada.nextInt();
			
			if(resp == 1) {
				Digita("\n - " + nome_aventureiro + " Vamos estou pronto!", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}else if(resp == 2) {
				Digita("\n - " + nome_aventureiro + " Esperaaaaa, eu estou cansado!", TimeUnit.MILLISECONDS, temp_dialog);
			    break;
			}else {
				System.out.println("Voc� n�o digitou uma resposta val�da!");
			}
		} while(resp != 1 || resp != 2);
		
		if(resp == 1) {
			Digita("\n\n - Doodou: Vamos ter que entrar por tr�s para ele n�o ver a gente.", TimeUnit.MILLISECONDS, temp_dialog);
		}else if(resp == 2) {
			Digita("\n\n - Doodou: Essa p�lula que eu te dei n�o te fez muito bem, vamos acorde!", TimeUnit.MILLISECONDS, temp_dialog);
		}
		
		Digita("\n\n - " + nome_aventureiro + " Certo vamos andando!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Doodou: Que estranho n�o h� guardas e n�o vejo ningu�m.",  TimeUnit.MILLISECONDS, temp_dialog);
		
		int resp1;
		do {
			Digita("\n\n - " + nome_aventureiro + " 1} Ele deve ser muito convencido mesmo. 2} Isso pode ser uma armadilha!", TimeUnit.MILLISECONDS, temp_dialog);
			
			System.out.println("\n");
		    resp1 = entrada.nextInt();
			
			if(resp1 == 1) {
				Digita("\n - " + nome_aventureiro + " Ele deve ser muito convencido mesmo.", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}else if(resp1 == 2) {
				Digita("\n - " + nome_aventureiro + " Isso pode ser uma armadilha!", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}else {
				System.err.println("Voc� n�o digitou uma resposta val�da!");
			}
		} while(resp1 != 1 || resp1 != 2);
		
		
		Digita("\n\n  Doodou: Voc� pode estar certo! Tenha cuidado!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - " + nome_aventureiro + " Eu acho que estou vendo a entrada, vamos!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Doodou: Ei " + nome_aventureiro + " espereee!! [�] Ah droga isso n�o � nada bom!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - " + nome_aventureiro + " EU FINALMENTE ENCONTREI VOC�!!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n SINTA A F�RIA DA MINHA ESPADA!!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus: Mas o que�!!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n Voc� tem muita coragem crian�a!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Doodou: " + nome_aventureiro + " n�o ataque sem uma estrat�gia, n�o se esque�a com que estamos lidando!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n Eles se entreolharam. O " + nome_aventureiro + " estava carregado de lembran�as, de uma luta que ficou no passado, mas ainda marcava o presente. \r\n"
				+ "A intensa magia de Grannus fazia com que eles n�o se enxergassem muito bem, visto que estavam a uma dist�ncia consider�vel. \r\n"
				+ "Estava um de frente com o outro, at� que Grannus resolveu se pronunciar: ", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus: Eu sabia que voc�s viriam atr�s de mim! mas para que? para morrer igual seu pai miser�vel? Se veio me matar, vai precisar muito mais que uma espada e um duende hahahahaha",  TimeUnit.MILLISECONDS, temp_dialog);
		
		int resp2;
		
		do {
	    Digita("\n\n - " + nome_aventureiro + " 1} Voc� foi um covarde matando meu pai enquanto ele estava fraco! 2} Voc� vai pagar por tudo que fez cretino!", TimeUnit.MILLISECONDS, temp_dialog);
			
		System.out.println("\n");
		resp2 = entrada.nextInt();
		
		if(resp2 == 1) {
			Digita("\n\n - " + nome_aventureiro + " Voc� foi um covarde matando meu pai enquanto ele estava fraco!", TimeUnit.MILLISECONDS, temp_dialog);
			break;
		}else if(resp2 == 2) {
			Digita("\n\n - " + nome_aventureiro + " Voc� vai pagar por tudo que fez cretino!", TimeUnit.MILLISECONDS, temp_dialog);
		    break;
		}
		
		}while(resp2 != 1 || resp2 != 2);
		
		Digita("\n\n  Grannus: Voc� � aquela crian�a ? Ah sim eu devo estar certo, eu lembro de voc� naquele dia!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  No dia em que eu salvei a sua vida e o levei para casa em seguran�a! Eu cuidei de voc� enquanto seu pai n�o podia nem levantar da cama, de voc� e dos seus irm�os, fracos!",  TimeUnit.MILLISECONDS, temp_dialog);
		
		int resp3;
		
		do {
			Digita("\n\n - " + nome_aventureiro + " 1}  Ent�o se lembra de mim sabe porque eu estou aqui! 2} Eu vim acabar com a maldi��o que voc� jogou na minha irm�!", TimeUnit.MILLISECONDS, temp_dialog);
		
		System.out.println("\n");
		resp3 = entrada.nextInt();
		
		if(resp3 == 1) {
			Digita("\n\n - " + nome_aventureiro + " Ent�o se lembra de mim sabe porque eu estou aqui!", TimeUnit.MILLISECONDS, temp_dialog);
		    break;
		}else if(resp3 == 2) {
			Digita("\n\n - " + nome_aventureiro + " Eu vim acabar com a maldi��o que voc� jogou na minha irm�!", TimeUnit.MILLISECONDS, temp_dialog);
		    break;
		}
		}while(resp3 != 1 || resp3 != 2);
		 
		Digita("\n\n  Grannus: HAHAHA voc� o que vai precisar fazer para conseguir isso n�o sabe?",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus ainda levado pelo feiti�o lan�ado sobre ele, olha com desprezo e �dio para o jovem " + nome_aventureiro + " enquanto Doodou busca uma estrat�gia para derrotar o Grannus.",  TimeUnit.MILLISECONDS, temp_dialog);
		
		int resp4;
		
		do {
			Digita("\n\n - " + nome_aventureiro + " 1}  Eu vou venc�-lo custe o que custar! 2} Doodou o que vamos fazer?", TimeUnit.MILLISECONDS, temp_dialog);
			
		System.out.println("\n");
		resp4 = entrada.nextInt();
		
		if(resp4 == 1) {
			Digita("\n\n - " + nome_aventureiro + " Eu vou venc�-lo custe o que custar!", TimeUnit.MILLISECONDS, temp_dialog);
		    break;
		}else if(resp4 == 2) {
			Digita("\n\n - " + nome_aventureiro + " Doodou o que vamos fazer?", TimeUnit.MILLISECONDS, temp_dialog);
		    break;
		}
		
		}while(resp4 != 1 || resp4 != 2);
		
		Digita("\n\n  Doodou: Aqui pegue isso e jogue na frente dele!!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - " + nome_aventureiro + " Certo! AAAARRRGG TOME ISSO!!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Doodou: Muito bem " + nome_aventureiro + "!! Use sua espada agora!!",  TimeUnit.MILLISECONDS, temp_dialog);
		
		int resp5;
		do {
			Digita("\n\n - " + nome_aventureiro + " 1}  Atacar com a espada. 2} Esperar o ataque de Grannus.", TimeUnit.MILLISECONDS, temp_dialog);
			
			System.out.println("\n");
			resp5 = entrada.nextInt();
			
			if(resp5 == 1) {
				Digita("\n\n - " + nome_aventureiro + " AAAAHHH SEGURA ESSA!!", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n Espera a�, cad� ele ?", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}else if(resp5 == 2) {
				Digita("\n\n - " + nome_aventureiro + " N�o consigo ver nada com essa fuma�a!", TimeUnit.MILLISECONDS, temp_dialog);
			    break;
			}else {
				System.out.println("Voc� n�o digitou uma resposta val�da!");
			}
		} while(resp5 != 1 || resp5 != 2);
		
		Digita("\n\n  Doodou: A droga! " + nome_aventureiro + " em cima de voc�!!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus: CRUENTOS PASSOS",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - " + nome_aventureiro + " AAARRHH!!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n DOODOU ELE � MUITO FORTE!!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus: Acabou pra voc� crian�a! Voc� sangrar� at� que sua vida acabe!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - " + nome_aventureiro + " N�o t�o cedo Grannus, n�o me subestime!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus: MAS O QUE!?",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - " + nome_aventureiro + " Essa armadura realmente foi �til! Agora � minha vez!!", TimeUnit.MILLISECONDS, temp_dialog);
		
		int resp6;
		
		do {
			Digita("\n\n - " + nome_aventureiro + " 1}  Voc� devia se arrepender enquanto pode! 2} Eu n�o vou errar dessa vez!", TimeUnit.MILLISECONDS, temp_dialog);
			
			System.out.println("\n");
			resp6 = entrada.nextInt();
			
			if(resp6 == 1) {
				Digita("\n\n - " + nome_aventureiro + " Voc� devia se arrepender enquanto pode!", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}else if(resp6 == 2) {
				Digita("\n\n - " + nome_aventureiro + " Eu n�o vou errar dessa vez!", TimeUnit.MILLISECONDS, temp_dialog);
			    break;
			}else {
				System.out.println("Voc� n�o digitou uma resposta val�da!");
			}
			
		} while(resp6 != 1 || resp6 != 2);
		
		Digita("\n\n  Grannus: AAAAAAH, AHHHH TIRA ISSO DE MIM JOGADOR! EU N�O AGUENTO MAIS!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - " + nome_aventureiro + " O que foi isso? Como o olho dele mudou de cor?", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Doodou: Ele est� com uma magia obscura dentro dele " + nome_aventureiro + " eu sinto uma for�a muito estranha! Pode ser o feiti�o que o irm�o do seu pai usou para possuir o corpo de Grannus antes de morrer. Precisamos ajud�-lo, ele est� sofrendo!!",  TimeUnit.MILLISECONDS, temp_dialog);
		
		int resp7;
		
		do {
            Digita("\n\n - " + nome_aventureiro + " 1}  AAAAH EU VOU ACABAR COM A VIDA DELE! 2} Como vamos ajud�-lo?", TimeUnit.MILLISECONDS, temp_dialog);
			
			System.out.println("\n");
			resp7 = entrada.nextInt();
			
			if(resp7 == 1) {
				Digita("\n\n - " + nome_aventureiro + " AAAAH EU VOU ACABAR COM A VIDA DELE!", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  Doodou: Se voc� matar ele, pode ser que nunca descobriremos a cura para sua irm�!",  TimeUnit.MILLISECONDS, temp_dialog);
				
				int resp8;
				 
				Digita("\n\n - " + nome_aventureiro + " 1}  Voc� tem raz�o, precisamos dele vivo! 2} Voc� tem algum plano?", TimeUnit.MILLISECONDS, temp_dialog);
				 System.out.println("\n");
				 resp8 = entrada.nextInt();
				 
				 if(resp8 == 1) {
						Digita("\n\n - " + nome_aventureiro + " Voc� tem raz�o, precisamos dele vivo!", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Doodou: Eu tenho um plano, mas pode ser perigoso! SE AFASTE!",  TimeUnit.MILLISECONDS, temp_dialog);
						break;
				 }else if(resp8 == 2) {
					 Digita("\n\n - " + nome_aventureiro + " Voc� tem algum plano?", TimeUnit.MILLISECONDS, temp_dialog);
					 Digita("\n\n  Doodou: Eu tenho um plano, mas pode ser perigoso! SE AFASTE!",  TimeUnit.MILLISECONDS, temp_dialog);
				     break;
				 }else {
						System.out.println("Voc� n�o digitou uma resposta val�da!");
					}
					
			}else if(resp7 == 2) {
				Digita("\n\n - " + nome_aventureiro + " Como vamos ajud�-lo?", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  Doodou: Eu tenho um plano, mas pode ser perigoso! SE AFASTE!",  TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n - " + nome_aventureiro + " O que voc� vai fazer?", TimeUnit.MILLISECONDS, temp_dialog);
			    break;
			}else {
				System.out.println("Voc� n�o digitou uma resposta val�da!");
			}
			
		} while(resp7 != 1 || resp7 != 2);
		
		Digita("\n\n  Doodou: Distraia ele " + nome_aventureiro + " , vou tentar usar algo pelas costas dele!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - " + nome_aventureiro + " GRANUUS, VENHA ME PEGAR ESTOU AQUI! BUUH", TimeUnit.MILLISECONDS, temp_dialog);	
		Digita("\n\n  Doodou:  � agora " + nome_aventureiro + " voc� vai precisa me ajudar!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Doodou: CORPUUUSS RETIREEEE!!!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus: AAAAAAAAAHHH",  TimeUnit.MILLISECONDS, temp_dialog);
		
		boolean acertou = false;
		int contador = 0;
		List alternativas = new ArrayList();
		alternativas.add("2"); // resposta correta
		alternativas.add("2,5");
		alternativas.add("-2,5");
		alternativas.add("-3");
		alternativas.add("3");
		do {
			Collections.shuffle(alternativas);
			System.out.println("\n\n Para retirar a magia do corpo de Grannus, podemos afirmar que o zero da fun��o f(x) = -2x + 5 � igual a: ");
			System.out.println("a) " + alternativas.get(0));
			System.out.println("b) " + alternativas.get(1));
			System.out.println("c) " + alternativas.get(2));
			System.out.println("d) " + alternativas.get(3));
			System.out.println("e) " + alternativas.get(4));
			System.out.print("Escolha uma alternativa: ");
			String resposta = entrada.next();
			switch (resposta) {
			case "a":
			case "A":
				if (alternativas.get(0).equals("2,5")) {
					System.out.println("Resposta correta!");
					acertou = true;
					contador++;
				} else {
					System.out.println("Resposta incorreta!");
					contador++;
				}
				break;
			case "b":
			case "B":
				if (alternativas.get(1).equals("2,5")) {
					System.out.println("Resposta correta!");
					acertou = true;
					contador++;
				} else {
					System.out.println("Resposta incorreta!");
					contador++;
				}
				break;
			case "c":
			case "C":
				if (alternativas.get(2).equals("2,5")) {
					System.out.println("Resposta correta!");
					acertou = true;
					contador++;
				} else {
					System.out.println("Resposta incorreta!");
					contador++;
				}
				break;
			case "d":
			case "D":
				if (alternativas.get(3).equals("2,5")) {
					System.out.println("Resposta correta!");
					acertou = true;
					contador++;
				} else {
					System.out.println("Resposta incorreta!");
					contador++;
				}
				break;
			case "e":
			case "E":
				if (alternativas.get(4).equals("2,5")) {
					System.out.println("Resposta correta!");
					acertou = true;
					contador++;
				} else {
					System.out.println("Resposta incorreta!");
					contador++;
				}
				break;
			default:
				System.out.println("Escolha inv�lida!");
			}
		} while (!acertou & contador < 3);
		
		if (acertou) {
			System.out.println("Voc� acertou com " + contador + " tentativa!");
			} else {
			System.err.println("Voc� errou 3 vezes seguidas!");
	}
		final_1();
		
	}
	
//================================================================ Final 1 ==============================================================================================================================	

	
	static void final_1() throws Exception {
		Digita("\n\n  Grannus: TESTEEEEEEEE",  TimeUnit.MILLISECONDS, temp_dialog);
		final_2();
	}
	
//================================================================ Final 2 ==============================================================================================================================	
	
    static void final_2() throws Exception {
    	Scanner entrada = new Scanner(System.in);
    	
    	 Digita("\n\n Doodou: N�OOOOOOOO, VOC� ERROU!", TimeUnit.MILLISECONDS, temp_dialog);
    	 Digita("\n\n Grannus: HAHAHAHAHAHA, VOC� CONTAVA COM A AJUDA DELE POBRE ALMA", TimeUnit.MILLISECONDS, temp_dialog);
    	 Digita("\n\n Doodou: �AAAAAAAAAAAAARRRRGGG, DESCULPE JOGADOR!", TimeUnit.MILLISECONDS, temp_dialog);
    	 Digita("\n\n - " + nome_aventureiro + " N�OOOOOO DODOUUUUUU!", TimeUnit.MILLISECONDS, temp_dialog);
    	 
    	int resp;
    	do {
            Digita("\n\n 1} Chamar o Grannus para a briga. 2} Tentar salvar o Doodou", TimeUnit.MILLISECONDS, temp_dialog);
			
			System.out.println("\n");
			resp = entrada.nextInt();
			
			if(resp == 1) {
				Digita("\n\n - " + nome_aventureiro + " AAAAAA, VOC� VAI SE ARREPENDER!!", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  Grannus:  Isso � o que veremos, pobre crian�a. Agora � a sua vez de morrer!",  TimeUnit.MILLISECONDS, temp_dialog);
				
				
			}else if(resp == 2) {
				Digita("\n\n - " + nome_aventureiro + " Doodoouuu, acorde, n�o por favor, eu preciso de voc�!", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  Grannus: �Ele est� morto, agora � a sua vez e depois eu acabo com todos os seres desse mundo!�",  TimeUnit.MILLISECONDS, temp_dialog);
			    break;
			}else {
				System.out.println("Voc� n�o digitou uma resposta val�da!");
			}
			
		} while(resp != 1 || resp != 2);
	
    
    int resp2;
    
	do {
        Digita("\n\n 1} Enfiar a espada no peito de Grannus "
        		+ "2} Terminar o feiti�o de doodou e fazer com que ele volte a ser quem era!\r\n"
        		+ "", TimeUnit.MILLISECONDS, temp_dialog);
		
		System.out.println("\n");
		resp2 = entrada.nextInt();
		
		if(resp2 == 1) {
			Digita("\n\n - " + nome_aventureiro + " UUUUAAARRG TOME ISSO!!", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Grannus:  Eu j� te disse crian�a, voc� vai precisar mais que uma espada para me vencer!",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n - " + nome_aventureiro + " Voc� tem raz�o! Obrigado Doodou, por ter me deixado isso.!!", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Grannus:  Ei, o que voc� est� fazendo ?",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n - " + nome_aventureiro + " ESSA � A SUA VOLTA PARA CASA!!", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Grannus:  AAAAAAAAAA, O QUE EST� ACONTECENDO COMIGO?",  TimeUnit.MILLISECONDS, temp_dialog);
			
			
		}else if(resp2 == 2) {
			Digita("\n\n Grannus:  AAAAAAAAAA, O QUE EST� ACONTECENDO COMIGO?",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n - " + nome_aventureiro + "Grannus, voc� se lembra de mim?", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n Grannus: " + nome_aventureiro + " o que est� acontecendo, onde estou?", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n - " + nome_aventureiro + " Voc� foi enfeiti�ado pelo irm�o do mestre, ficou anos em essa magia dentro de voc�! Agora voc� est� livre, voc� est� melhor?", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n Grannus: �Estou bem melhor, aaaah, o que eu fiz? o que aconteceu?",  TimeUnit.MILLISECONDS, temp_dialog);
		    break;
		}else {
			System.out.println("Voc� n�o digitou uma resposta val�da!");
		}
		
	} while(resp2 != 1 || resp2 != 2);


    int resp3;
    
   	do {
           Digita("\n\n 1} Vamos embora, no caminho eu te explico! 2} Voc� machucou muita gente, quer dizer, a magia que estava dentro de voc�!", TimeUnit.MILLISECONDS, temp_dialog);
   		
   		System.out.println("\n");
   		resp3 = entrada.nextInt();
   		
   		if(resp3 == 1) {
   			Digita("\n\n  Grannus:  Vamos!",  TimeUnit.MILLISECONDS, temp_dialog);
   			Digita("\n\n - " + nome_aventureiro + " �Aconteceu diversas coisas desde que a magia entrou em seu corpo, voc� matou o mestre e antes de ir embora amaldi�oou a Bryanna com um feiti�o maligno que est� destruindo-a por dentro e fora,"
   					+ " achamos que voc� n�o estava mais vivo, por�m com v�rios acontecimentos soubemos da sua exist�ncia e por isso viemos atr�s de voc�, n�s achamos que a �nica forma de salvar a Bryanna � voc� refazer o feiti�o que a assola noite e dia!", TimeUnit.MILLISECONDS, temp_dialog);
   			Digita("\n\n  Grannus:  Como assim feiti�o, como eu fiz isso? Como eu vou desfaz�-lo?",  TimeUnit.MILLISECONDS, temp_dialog);
   			Digita("\n\n - " + nome_aventureiro + " Vamos embora dessa regi�o, quando chegarmos a gente estuda uma forma de salv�-la", TimeUnit.MILLISECONDS, temp_dialog);
   			
   		}else if(resp3 == 2) {
   			Digita("\n\n  Grannus:  �Meu deus, espero que me perdoem! ser� que as pessoas v�o entender?",  TimeUnit.MILLISECONDS, temp_dialog);
   			Digita("\n\n - " + nome_aventureiro + " Espero que sim, isso n�o foi culpa sua!", TimeUnit.MILLISECONDS, temp_dialog);
   			Digita("\n\n  Grannus:  Eu fiquei quanto tempo com essa magia? o que eu fiz de ruim para a fam�lia do mago?",  TimeUnit.MILLISECONDS, temp_dialog);
   			Digita("\n\n - " + nome_aventureiro + "Essa magia est� dentro de voc� a muito tempo, aconteceu diversas coisas desde que a magia entrou em seu corpo, voc� matou o mestre e antes de ir embora amaldi�oou a Bryanna com um feiti�o maligno que est� destruindo-a por dentro e fora, achamos que voc� n�o estava mais vivo, por�m com v�rios acontecimentos soubemos da sua exist�ncia e por isso viemos atr�s de voc�, "
   					+ "n�s achamos que a �nica forma de salvar a Bryanna � voc� refazer o feiti�o que a assola noite e dia!", TimeUnit.MILLISECONDS, temp_dialog);
   			Digita("\n\n Grannus:  Como assim feiti�o, como eu fiz isso? Como eu vou desfaz�-lo?",  TimeUnit.MILLISECONDS, temp_dialog);
   			Digita("\n\n - " + nome_aventureiro + " Vamos embora dessa regi�o, quando chegarmos a gente estuda uma forma de salv�-la", TimeUnit.MILLISECONDS, temp_dialog);
   			Digita("\n\n Grannus:  Meu deus, espero que me perdoem! ser� que as pessoas v�o entender?",  TimeUnit.MILLISECONDS, temp_dialog);
   			Digita("\n\n - " + nome_aventureiro + "Espero que sim, isso n�o foi culpa sua!", TimeUnit.MILLISECONDS, temp_dialog);
   			Digita("\n\n Grannus:  Eu fiquei quanto tempo com essa magia? o que eu fiz de ruim para a fam�lia do mago?", TimeUnit.MILLISECONDS, temp_dialog);
   			Digita("\n\n - " + nome_aventureiro + " Essa magia est� dentro de voc� a muito tempo, aconteceu diversas coisas desde que a magia entrou em seu corpo, voc� matou o mestre e antes de ir embora amaldi�oou a Bryanna com um feiti�o maligno que est� destruindo-a por dentro e fora, achamos que voc� n�o estava mais vivo, por�m com v�rios acontecimentos soubemos da sua exist�ncia e por isso viemos atr�s de voc�, "
   					+ "n�s achamos que a �nica forma de salvar a Bryanna � voc� refazer o feiti�o que a assola noite e dia!", TimeUnit.MILLISECONDS, temp_dialog);
   			Digita("\n\n - " + nome_aventureiro + "Vamos embora dessa regi�o, quando chegarmos a gente estuda uma forma de salv�-la", TimeUnit.MILLISECONDS, temp_dialog);
   		    break;
   		}else {
   			System.out.println("Voc� n�o digitou uma resposta val�da!");
   		}
   		
   	} while(resp3 != 1 || resp3 != 2);
    
    
	int resp4;
	
	do {
		 Digita("\n\n 1} Chamar Hipogrifo para voltar para casa", TimeUnit.MILLISECONDS, temp_dialog);
		 resp4 = entrada.nextInt();
		 if(resp4 != 1) {
			 System.out.println("Voc� n�o digitou uma resposta val�da!");
		 }
	}while( resp4 != 1);
 
        Digita("\n\n - " + nome_aventureiro + "Antes disso, preciso encontrar as coordenadas!", TimeUnit.MILLISECONDS, temp_dialog);
        	
		System.out.println("\n");
		
		
		boolean acertou = false;
		int contador = 0;
		List alternativas = new ArrayList();
		alternativas.add("-3,0"); // resposta correta
		alternativas.add("3,0");
		alternativas.add("2,5");
		alternativas.add("-2,5");
		alternativas.add("0,5");
		do {
			Collections.shuffle(alternativas);
			System.out.println("\n\n Qual � a soma das coordenadas do v�rtice de uma fun��o do segundo grau definida por f(x) = 2x2 + 10x + 12?");
			System.out.println("a) " + alternativas.get(0));
			System.out.println("b) " + alternativas.get(1));
			System.out.println("c) " + alternativas.get(2));
			System.out.println("d) " + alternativas.get(3));
			System.out.println("e) " + alternativas.get(4));
			System.out.print("Escolha uma alternativa: ");
			String resposta = entrada.next();
			switch (resposta) {
			case "a":
			case "A":
				if (alternativas.get(0).equals("-3,0")) {
					System.out.println("Resposta correta!");
					acertou = true;
					contador++;
				} else {
					System.out.println("Resposta incorreta!");
					contador++;
				}
				break;
			case "b":
			case "B":
				if (alternativas.get(1).equals("-3,0")) {
					System.out.println("Resposta correta!");
					acertou = true;
					contador++;
				} else {
					System.out.println("Resposta incorreta!");
					contador++;
				}
				break;
			case "c":
			case "C":
				if (alternativas.get(2).equals("-3,0")) {
					System.out.println("Resposta correta!");
					acertou = true;
					contador++;
				} else {
					System.out.println("Resposta incorreta!");
					contador++;
				}
				break;
			case "d":
			case "D":
				if (alternativas.get(3).equals("-3,0")) {
					System.out.println("Resposta correta!");
					acertou = true;
					contador++;
				} else {
					System.out.println("Resposta incorreta!");
					contador++;
				}
				break;
			case "e":
			case "E":
				if (alternativas.get(4).equals("3,0")) {
					System.out.println("Resposta correta!");
					acertou = true;
					contador++;
				} else {
					System.out.println("Resposta incorreta!");
					contador++;
				}
				break;
			default:
				System.out.println("Escolha inv�lida!");
			}
		} while (!acertou & contador < 3);
		
		if (acertou) {
			System.out.println("Voc� acertou com " + contador + " tentativa!");
			} else {
			System.err.println("Voc� errou 3 vezes seguidas!");
	}
    
    
    int resp5 = 0;
	do {
		Digita("\n\n - " + nome_aventureiro + " Conhe�a meu grande amigo que conheci nessa jornada at� aqui, esse � o hipogrifo m�gico,"
				+ " ele pode nos levar para casa de uma forma mais r�pida! Mas cuidado, para montar nele � preciso fazer uma rever�ncia.", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus:  O que, como? esse bixo � m�gico e muito raro! Sempre tive vontade de andar em um, como devo fazer a rever�ncia? dessa forma?",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus:  Ouuuu ouuu, ele est� me cheirando!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - " + nome_aventureiro + " Isso mesmo, parece que ele gostou de voc�! agora pode subir vamos embora!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - " + nome_aventureiro + " [...] ent�o Grannus resumindo n�s precisamos que voc� liberte minha irm� da maldi��o que voc� lan�ou nela, "
				+ "meu irm�o Solveig est� com ela agora tentando encontrar um jeito de libert�-la.", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus:  Meu deus� eu n�o consigo acreditar que fiz isso! Eu cuidei daquela menina como uma irm�!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - " + nome_aventureiro + " N�o se culpe meu amigo, n�s sabemos como Centrion era poderoso!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus:  Eu sinto muito�",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - " + nome_aventureiro + " 1} Voc� vai poder se desculpar quando salvar a minha irm�!� ou �2} Se n�o salvarmos ela hoje, ela morrer� a meia noite.", TimeUnit.MILLISECONDS, temp_dialog);
		
		System.out.println("\n");
		resp5 = entrada.nextInt();
		
		if(resp5 == 1 ) {
		Digita("\n\n - " + nome_aventureiro + " J� estou vendo a casa, vamos l� garoto mais r�pido!", TimeUnit.MILLISECONDS, temp_dialog);
		 
		}else if( resp5 == 2) {
			Digita("\n\n  Doodou: Chegamos! Estamos em casa!",  TimeUnit.MILLISECONDS, temp_dialog);
		}else {
			System.out.println("Voc� n�o digitou uma resposta val�da!");
		}
		
		Digita("\n\n - " + nome_aventureiro + " 1} Chamar Solveing ou 2} Entrar na casa", TimeUnit.MILLISECONDS, temp_dialog);
		if(resp5 == 1) {
			Digita("\n\n - " + nome_aventureiro + " Solveing chegamos!! Est� em casa?", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Solveing: Gra�as a Merlim voc�s voltaram!!",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n - " + nome_aventureiro + " Estamos aqui meu querido irm�o e trago boas not�cias!", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Solveing: Voc�s conseguiram?",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n Grannus: Ol� Solveing, h� quanto tempo", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Solveing: Ele ainda � o Grannus que matou nosso pai ?",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n - " + nome_aventureiro + " N�o Solveing, n�s revertemos o feiti�o que estava nele.", TimeUnit.MILLISECONDS, temp_dialog);
			
			
		}else if(resp5 == 2) {
			Digita("\n\n - " + nome_aventureiro + " Est� tudo muito calmo, vamos entrar...", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Solveing: For�a Bryanna, preciso que fique forte! tentarei uma nova magia..\n\n Espera ai que barulho � esse? \n\n Gra�as a Merlim voc�s voltaram!!",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n - " + nome_aventureiro + " Estamos aqui meu querido irm�o e trago boas not�cias!", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Solveing: Voc�s conseguiram?",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Grannus: Ol� Solveing, a quanto tempo!",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Solveing: Ele ainda � o Grannus que matou nosso pai?",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n - " + nome_aventureiro + " N�o Solveing, n�s revertemos o feiti�o que estava nele.", TimeUnit.MILLISECONDS, temp_dialog);
			
			Digita("\n\n - " + nome_aventureiro + " Est� tudo muito calmo, vamos entrar...", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n   Solveing: For�a Bryanna, preciso que fique forte! tentarei uma nova magia.. \n\n Espera ai... que barulho � esse ? \n\n Gra�as a Merlim voc�s voltaram!!",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n - " + nome_aventureiro + " Estamos aqui meu querido irm�o e trago boas not�cias", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Solveing: Voc�s conseguiram?",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n   Grannus: Ol� Solveing, h� quanto tempo!",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n   Solveing: Ele ainda � o Grannus que matou nosso pai ?",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n - " + nome_aventureiro + " N�o Solveing, n�s revertemos o feiti�o que estava nele.", TimeUnit.MILLISECONDS, temp_dialog);
			
			Digita("\n\n - " + nome_aventureiro + " 1} Como est� nossa irm� ? ou 2} Vamos logo com isso, estamos perdendo tempo!", TimeUnit.MILLISECONDS, temp_dialog);
			resp5 = entrada.nextInt();
			//rafa
			Digita("\n\n - " + nome_aventureiro + " Estamos aqui meu querido irm�o e trago boas not�cias!", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Solveing: Voc�s conseguiram?",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n - " + nome_aventureiro + " Estamos aqui meu querido irm�o e trago boas not�cias!", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Solveing: Voc�s conseguiram?",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n - " + nome_aventureiro + " Estamos aqui meu querido irm�o e trago boas not�cias!", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Solveing: Voc�s conseguiram?",  TimeUnit.MILLISECONDS, temp_dialog);
			
			
			
			
			break;
		}else {
			System.out.println("Voc� n�o digitou uma resposta val�da!");
		}
		
	} while(resp != 1 || resp != 2);
    }
//================================================================ FIM DO C�DIGO ==============================================================================================================================	
	public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
		for (char caractere : mensagem.toCharArray()) {
			System.out.print(caractere);
			unit.sleep(tempo_mensagem);
		}
	}
}