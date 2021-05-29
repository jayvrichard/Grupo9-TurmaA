import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class Jogo {
	private static final String nome_aventureiro = " "; ////Precisa verificar o porque não consigo colocar o nome do aventureiro nos dialogos
	
     ////static int temp_dialog = 60, temp_narrativa = 130, temp_transicao = 20;   //Tempo correto do game
	static int temp_dialog = 0, temp_narrativa = 0, temp_transicao = 0; // Para rodar o jogo sem o delay nas
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
		
		Digita("\n O  Jogo baseado no modo RPG Textual é uma troca de mensagens em que o jogador move a trama do ponto de vista do seu personagem atráves de uma pergunta respondida.\r\n\n - A cada pergunta respondida o jogo dará opções de caminhos para explorar.\r\n\n Ou seja, mantenha total atenção na hora de responder.\r\n" + "  ", TimeUnit.MILLISECONDS, temp_narrativa);
		
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
				capitulo_3();
				final_1();
				final_2();

			} else if (escolha_menu == 3) {
				menu();
			} else if (escolha_menu == 2) {
				Digita("\n\n CAPÍTULO I - A terrível maldição", TimeUnit.MILLISECONDS, temp_dialog);
				capitulo_1();
				capitulo_2();
				capitulo_3();
				final_1();
				final_2();

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
		
		do {
			
			Digita("\n\n - Mestre dos magos:  1) Isso é o que veremos! ou 2) Você não é páreo para mim!", TimeUnit.MILLISECONDS, temp_dialog);
			System.out.println("\n");
			resp = entrada.nextInt();
			
		if (resp == 1) {
			Digita("\n - Mestre dos magos: Isso é o que veremos!", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n “Então, uma batalha intensa é travada entre dois magos poderosos e no meio dos destroços uma criança sozinha e indefesa é vista tentando se esconder para não ser atingida… O Aprendiz volta para tentar ajudar seu mestre.”", TimeUnit.MILLISECONDS, temp_dialog);
break;
			
		} else if (resp == 2) {
			
			Digita("\n - Mestre dos magos: Você não é páreo para mim!", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n “Então, uma batalha intensa é travada entre dois magos poderosos e no meio dos destroços uma criança sozinha e indefesa é vista tentando se esconder para não ser atingida… O Aprendiz volta para tentar ajudar seu mestre.”", TimeUnit.MILLISECONDS, temp_dialog);
break;
            
		} else {
			System.out.println("Você não digitou uma resposta valída!");
			
		}
		
		}while(resp != 1 || resp != 2);
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
		
		Digita("\n\n - " + nome_aventureiro + " 1) Eu quero proteger nossa vila do homem que matou nosso Pai!! ou 2) Eu não sei se conseguirei ser bom como você meu irmão", TimeUnit.MILLISECONDS, temp_dialog);
		
	

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
		Digita("\n\n ========================== ",  TimeUnit.MILLISECONDS, temp_dialog);
		System.err.println("=======");
		capitulo_3();
	}
	
	
//================================================================ CAPITULO 3 ==============================================================================================================================
	static void capitulo_3() throws Exception {

		Scanner entrada = new Scanner(System.in);
		
		Digita("\n\n  CAPÍTULO FINAL - O segredo é revelado", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - Doodou: Acorde garoto, precisamos seguir em frente! Vamos descobrir como salvar sua irmã e acabar com tudo isso.",  TimeUnit.MILLISECONDS, temp_dialog);
		
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
				System.out.println("Você não digitou uma resposta valída!");
			}
		} while(resp != 1 || resp != 2);
		
		if(resp == 1) {
			Digita("\n\n - Doodou: Vamos ter que entrar por trás para ele não ver a gente.", TimeUnit.MILLISECONDS, temp_dialog);
		}else if(resp == 2) {
			Digita("\n\n - Doodou: Essa pílula que eu te dei não te fez muito bem, vamos acorde!", TimeUnit.MILLISECONDS, temp_dialog);
		}
		
		Digita("\n\n - " + nome_aventureiro + " Certo vamos andando!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Doodou: Que estranho não há guardas e não vejo ninguém.",  TimeUnit.MILLISECONDS, temp_dialog);
		
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
				System.err.println("Você não digitou uma resposta valída!");
			}
		} while(resp1 != 1 || resp1 != 2);
		
		
		Digita("\n\n  Doodou: Você pode estar certo! Tenha cuidado!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - " + nome_aventureiro + " Eu acho que estou vendo a entrada, vamos!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Doodou: Ei " + nome_aventureiro + " espereee!! […] Ah droga isso não é nada bom!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - " + nome_aventureiro + " EU FINALMENTE ENCONTREI VOCÊ!!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n SINTA A FÚRIA DA MINHA ESPADA!!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus: Mas o que…!!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n Você tem muita coragem criança!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Doodou: " + nome_aventureiro + " não ataque sem uma estratégia, não se esqueça com que estamos lidando!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n Eles se entreolharam. O " + nome_aventureiro + " estava carregado de lembranças, de uma luta que ficou no passado, mas ainda marcava o presente. \r\n"
				+ "A intensa magia de Grannus fazia com que eles não se enxergassem muito bem, visto que estavam a uma distância considerável. \r\n"
				+ "Estava um de frente com o outro, até que Grannus resolveu se pronunciar: ", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus: Eu sabia que vocês viriam atrás de mim! mas para que? para morrer igual seu pai miserável? Se veio me matar, vai precisar muito mais que uma espada e um duende hahahahaha",  TimeUnit.MILLISECONDS, temp_dialog);
		
		int resp2;
		
		do {
	    Digita("\n\n - " + nome_aventureiro + " 1} Você foi um covarde matando meu pai enquanto ele estava fraco! 2} Você vai pagar por tudo que fez cretino!", TimeUnit.MILLISECONDS, temp_dialog);
			
		System.out.println("\n");
		resp2 = entrada.nextInt();
		
		if(resp2 == 1) {
			Digita("\n\n - " + nome_aventureiro + " Você foi um covarde matando meu pai enquanto ele estava fraco!", TimeUnit.MILLISECONDS, temp_dialog);
			break;
		}else if(resp2 == 2) {
			Digita("\n\n - " + nome_aventureiro + " Você vai pagar por tudo que fez cretino!", TimeUnit.MILLISECONDS, temp_dialog);
		    break;
		}
		
		}while(resp2 != 1 || resp2 != 2);
		
		Digita("\n\n  Grannus: Você é aquela criança ? Ah sim eu devo estar certo, eu lembro de você naquele dia!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  No dia em que eu salvei a sua vida e o levei para casa em segurança! Eu cuidei de você enquanto seu pai não podia nem levantar da cama, de você e dos seus irmãos, fracos!",  TimeUnit.MILLISECONDS, temp_dialog);
		
		int resp3;
		
		do {
			Digita("\n\n - " + nome_aventureiro + " 1}  Então se lembra de mim sabe porque eu estou aqui! 2} Eu vim acabar com a maldição que você jogou na minha irmã!", TimeUnit.MILLISECONDS, temp_dialog);
		
		System.out.println("\n");
		resp3 = entrada.nextInt();
		
		if(resp3 == 1) {
			Digita("\n\n - " + nome_aventureiro + " Então se lembra de mim sabe porque eu estou aqui!", TimeUnit.MILLISECONDS, temp_dialog);
		    break;
		}else if(resp3 == 2) {
			Digita("\n\n - " + nome_aventureiro + " Eu vim acabar com a maldição que você jogou na minha irmã!", TimeUnit.MILLISECONDS, temp_dialog);
		    break;
		}
		}while(resp3 != 1 || resp3 != 2);
		 
		Digita("\n\n  Grannus: HAHAHA você o que vai precisar fazer para conseguir isso não sabe?",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus ainda levado pelo feitiço lançado sobre ele, olha com desprezo e ódio para o jovem " + nome_aventureiro + " enquanto Doodou busca uma estratégia para derrotar o Grannus.",  TimeUnit.MILLISECONDS, temp_dialog);
		
		int resp4;
		
		do {
			Digita("\n\n - " + nome_aventureiro + " 1}  Eu vou vencê-lo custe o que custar! 2} Doodou o que vamos fazer?", TimeUnit.MILLISECONDS, temp_dialog);
			
		System.out.println("\n");
		resp4 = entrada.nextInt();
		
		if(resp4 == 1) {
			Digita("\n\n - " + nome_aventureiro + " Eu vou vencê-lo custe o que custar!", TimeUnit.MILLISECONDS, temp_dialog);
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
				Digita("\n\n Espera aí, cadê ele ?", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}else if(resp5 == 2) {
				Digita("\n\n - " + nome_aventureiro + " Não consigo ver nada com essa fumaça!", TimeUnit.MILLISECONDS, temp_dialog);
			    break;
			}else {
				System.out.println("Você não digitou uma resposta valída!");
			}
		} while(resp5 != 1 || resp5 != 2);
		
		Digita("\n\n  Doodou: A droga! " + nome_aventureiro + " em cima de você!!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus: CRUENTOS PASSOS",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - " + nome_aventureiro + " AAARRHH!!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n DOODOU ELE É MUITO FORTE!!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus: Acabou pra você criança! Você sangrará até que sua vida acabe!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - " + nome_aventureiro + " Não tão cedo Grannus, não me subestime!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus: MAS O QUE!?",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - " + nome_aventureiro + " Essa armadura realmente foi útil! Agora é minha vez!!", TimeUnit.MILLISECONDS, temp_dialog);
		
		int resp6;
		
		do {
			Digita("\n\n - " + nome_aventureiro + " 1}  Você devia se arrepender enquanto pode! 2} Eu não vou errar dessa vez!", TimeUnit.MILLISECONDS, temp_dialog);
			
			System.out.println("\n");
			resp6 = entrada.nextInt();
			
			if(resp6 == 1) {
				Digita("\n\n - " + nome_aventureiro + " Você devia se arrepender enquanto pode!", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}else if(resp6 == 2) {
				Digita("\n\n - " + nome_aventureiro + " Eu não vou errar dessa vez!", TimeUnit.MILLISECONDS, temp_dialog);
			    break;
			}else {
				System.out.println("Você não digitou uma resposta valída!");
			}
			
		} while(resp6 != 1 || resp6 != 2);
		
		Digita("\n\n  Grannus: AAAAAAH, AHHHH TIRA ISSO DE MIM JOGADOR! EU NÃO AGUENTO MAIS!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - " + nome_aventureiro + " O que foi isso? Como o olho dele mudou de cor?", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Doodou: Ele está com uma magia obscura dentro dele " + nome_aventureiro + " eu sinto uma força muito estranha! Pode ser o feitiço que o irmão do seu pai usou para possuir o corpo de Grannus antes de morrer. Precisamos ajudá-lo, ele está sofrendo!!",  TimeUnit.MILLISECONDS, temp_dialog);
		
		int resp7;
		
		do {
            Digita("\n\n - " + nome_aventureiro + " 1}  AAAAH EU VOU ACABAR COM A VIDA DELE! 2} Como vamos ajudá-lo?", TimeUnit.MILLISECONDS, temp_dialog);
			
			System.out.println("\n");
			resp7 = entrada.nextInt();
			
			if(resp7 == 1) {
				Digita("\n\n - " + nome_aventureiro + " AAAAH EU VOU ACABAR COM A VIDA DELE!", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  Doodou: Se você matar ele, pode ser que nunca descobriremos a cura para sua irmã!",  TimeUnit.MILLISECONDS, temp_dialog);
				
				int resp8;
				 
				Digita("\n\n - " + nome_aventureiro + " 1}  Você tem razão, precisamos dele vivo! 2} Você tem algum plano?", TimeUnit.MILLISECONDS, temp_dialog);
				 System.out.println("\n");
				 resp8 = entrada.nextInt();
				 
				 if(resp8 == 1) {
						Digita("\n\n - " + nome_aventureiro + " Você tem razão, precisamos dele vivo!", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Doodou: Eu tenho um plano, mas pode ser perigoso! SE AFASTE!",  TimeUnit.MILLISECONDS, temp_dialog);
						break;
				 }else if(resp8 == 2) {
					 Digita("\n\n - " + nome_aventureiro + " Você tem algum plano?", TimeUnit.MILLISECONDS, temp_dialog);
					 Digita("\n\n  Doodou: Eu tenho um plano, mas pode ser perigoso! SE AFASTE!",  TimeUnit.MILLISECONDS, temp_dialog);
				     break;
				 }else {
						System.out.println("Você não digitou uma resposta valída!");
					}
					
			}else if(resp7 == 2) {
				Digita("\n\n - " + nome_aventureiro + " Como vamos ajudá-lo?", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  Doodou: Eu tenho um plano, mas pode ser perigoso! SE AFASTE!",  TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n - " + nome_aventureiro + " O que você vai fazer?", TimeUnit.MILLISECONDS, temp_dialog);
			    break;
			}else {
				System.out.println("Você não digitou uma resposta valída!");
			}
			
		} while(resp7 != 1 || resp7 != 2);
		
		Digita("\n\n  Doodou: Distraia ele " + nome_aventureiro + " , vou tentar usar algo pelas costas dele!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - " + nome_aventureiro + " GRANUUS, VENHA ME PEGAR ESTOU AQUI! BUUH", TimeUnit.MILLISECONDS, temp_dialog);	
		Digita("\n\n  Doodou:  É agora " + nome_aventureiro + " você vai precisa me ajudar!",  TimeUnit.MILLISECONDS, temp_dialog);
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
			System.out.println("\n\n Para retirar a magia do corpo de Grannus, podemos afirmar que o zero da função f(x) = -2x + 5 é igual a: ");
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
				System.out.println("Escolha inválida!");
			}
		} while (!acertou & contador < 3);
		
		if (acertou) {
			System.out.println("Você acertou com " + contador + " tentativa!");
			} else {
			System.err.println("Você errou 3 vezes seguidas!");
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
    	
    	 Digita("\n\n Doodou: NÃOOOOOOOO, VOCÊ ERROU!", TimeUnit.MILLISECONDS, temp_dialog);
    	 Digita("\n\n Grannus: HAHAHAHAHAHA, VOCÊ CONTAVA COM A AJUDA DELE POBRE ALMA", TimeUnit.MILLISECONDS, temp_dialog);
    	 Digita("\n\n Doodou: “AAAAAAAAAAAAARRRRGGG, DESCULPE JOGADOR!", TimeUnit.MILLISECONDS, temp_dialog);
    	 Digita("\n\n - " + nome_aventureiro + " NÃOOOOOO DODOUUUUUU!", TimeUnit.MILLISECONDS, temp_dialog);
    	 
    	int resp;
    	do {
            Digita("\n\n 1} Chamar o Grannus para a briga. 2} Tentar salvar o Doodou", TimeUnit.MILLISECONDS, temp_dialog);
			
			System.out.println("\n");
			resp = entrada.nextInt();
			
			if(resp == 1) {
				Digita("\n\n - " + nome_aventureiro + " AAAAAA, VOCÊ VAI SE ARREPENDER!!", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  Grannus:  Isso é o que veremos, pobre criança. Agora é a sua vez de morrer!",  TimeUnit.MILLISECONDS, temp_dialog);
				
				
			}else if(resp == 2) {
				Digita("\n\n - " + nome_aventureiro + " Doodoouuu, acorde, não por favor, eu preciso de você!", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  Grannus: “Ele está morto, agora é a sua vez e depois eu acabo com todos os seres desse mundo!”",  TimeUnit.MILLISECONDS, temp_dialog);
			    break;
			}else {
				System.out.println("Você não digitou uma resposta valída!");
			}
			
		} while(resp != 1 || resp != 2);
	
    
    int resp2;
    
	do {
        Digita("\n\n 1} Enfiar a espada no peito de Grannus "
        		+ "2} Terminar o feitiço de doodou e fazer com que ele volte a ser quem era!\r\n"
        		+ "", TimeUnit.MILLISECONDS, temp_dialog);
		
		System.out.println("\n");
		resp2 = entrada.nextInt();
		
		if(resp2 == 1) {
			Digita("\n\n - " + nome_aventureiro + " UUUUAAARRG TOME ISSO!!", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Grannus:  Eu já te disse criança, você vai precisar mais que uma espada para me vencer!",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n - " + nome_aventureiro + " Você tem razão! Obrigado Doodou, por ter me deixado isso.!!", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Grannus:  Ei, o que você está fazendo ?",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n - " + nome_aventureiro + " ESSA É A SUA VOLTA PARA CASA!!", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Grannus:  AAAAAAAAAA, O QUE ESTÁ ACONTECENDO COMIGO?",  TimeUnit.MILLISECONDS, temp_dialog);
			
			
		}else if(resp2 == 2) {
			Digita("\n\n Grannus:  AAAAAAAAAA, O QUE ESTÁ ACONTECENDO COMIGO?",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n - " + nome_aventureiro + "Grannus, você se lembra de mim?", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n Grannus: " + nome_aventureiro + " o que está acontecendo, onde estou?", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n - " + nome_aventureiro + " Você foi enfeitiçado pelo irmão do mestre, ficou anos em essa magia dentro de você! Agora você está livre, você está melhor?", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n Grannus: “Estou bem melhor, aaaah, o que eu fiz? o que aconteceu?",  TimeUnit.MILLISECONDS, temp_dialog);
		    break;
		}else {
			System.out.println("Você não digitou uma resposta valída!");
		}
		
	} while(resp2 != 1 || resp2 != 2);


    int resp3;
    
   	do {
           Digita("\n\n 1} Vamos embora, no caminho eu te explico! 2} Você machucou muita gente, quer dizer, a magia que estava dentro de você!", TimeUnit.MILLISECONDS, temp_dialog);
   		
   		System.out.println("\n");
   		resp3 = entrada.nextInt();
   		
   		if(resp3 == 1) {
   			Digita("\n\n  Grannus:  Vamos!",  TimeUnit.MILLISECONDS, temp_dialog);
   			Digita("\n\n - " + nome_aventureiro + " “Aconteceu diversas coisas desde que a magia entrou em seu corpo, você matou o mestre e antes de ir embora amaldiçoou a Bryanna com um feitiço maligno que está destruindo-a por dentro e fora,"
   					+ " achamos que você não estava mais vivo, porém com vários acontecimentos soubemos da sua existência e por isso viemos atrás de você, nós achamos que a única forma de salvar a Bryanna é você refazer o feitiço que a assola noite e dia!", TimeUnit.MILLISECONDS, temp_dialog);
   			Digita("\n\n  Grannus:  Como assim feitiço, como eu fiz isso? Como eu vou desfazê-lo?",  TimeUnit.MILLISECONDS, temp_dialog);
   			Digita("\n\n - " + nome_aventureiro + " Vamos embora dessa região, quando chegarmos a gente estuda uma forma de salvá-la", TimeUnit.MILLISECONDS, temp_dialog);
   			
   		}else if(resp3 == 2) {
   			Digita("\n\n  Grannus:  “Meu deus, espero que me perdoem! será que as pessoas vão entender?",  TimeUnit.MILLISECONDS, temp_dialog);
   			Digita("\n\n - " + nome_aventureiro + " Espero que sim, isso não foi culpa sua!", TimeUnit.MILLISECONDS, temp_dialog);
   			Digita("\n\n  Grannus:  Eu fiquei quanto tempo com essa magia? o que eu fiz de ruim para a família do mago?",  TimeUnit.MILLISECONDS, temp_dialog);
   			Digita("\n\n - " + nome_aventureiro + "Essa magia está dentro de você a muito tempo, aconteceu diversas coisas desde que a magia entrou em seu corpo, você matou o mestre e antes de ir embora amaldiçoou a Bryanna com um feitiço maligno que está destruindo-a por dentro e fora, achamos que você não estava mais vivo, porém com vários acontecimentos soubemos da sua existência e por isso viemos atrás de você, "
   					+ "nós achamos que a única forma de salvar a Bryanna é você refazer o feitiço que a assola noite e dia!", TimeUnit.MILLISECONDS, temp_dialog);
   			Digita("\n\n Grannus:  Como assim feitiço, como eu fiz isso? Como eu vou desfazê-lo?",  TimeUnit.MILLISECONDS, temp_dialog);
   			Digita("\n\n - " + nome_aventureiro + " Vamos embora dessa região, quando chegarmos a gente estuda uma forma de salvá-la", TimeUnit.MILLISECONDS, temp_dialog);
   			Digita("\n\n Grannus:  Meu deus, espero que me perdoem! será que as pessoas vão entender?",  TimeUnit.MILLISECONDS, temp_dialog);
   			Digita("\n\n - " + nome_aventureiro + "Espero que sim, isso não foi culpa sua!", TimeUnit.MILLISECONDS, temp_dialog);
   			Digita("\n\n Grannus:  Eu fiquei quanto tempo com essa magia? o que eu fiz de ruim para a família do mago?", TimeUnit.MILLISECONDS, temp_dialog);
   			Digita("\n\n - " + nome_aventureiro + " Essa magia está dentro de você a muito tempo, aconteceu diversas coisas desde que a magia entrou em seu corpo, você matou o mestre e antes de ir embora amaldiçoou a Bryanna com um feitiço maligno que está destruindo-a por dentro e fora, achamos que você não estava mais vivo, porém com vários acontecimentos soubemos da sua existência e por isso viemos atrás de você, "
   					+ "nós achamos que a única forma de salvar a Bryanna é você refazer o feitiço que a assola noite e dia!", TimeUnit.MILLISECONDS, temp_dialog);
   			Digita("\n\n - " + nome_aventureiro + "Vamos embora dessa região, quando chegarmos a gente estuda uma forma de salvá-la", TimeUnit.MILLISECONDS, temp_dialog);
   		    break;
   		}else {
   			System.out.println("Você não digitou uma resposta valída!");
   		}
   		
   	} while(resp3 != 1 || resp3 != 2);
    
    
	int resp4;
	
	do {
		 Digita("\n\n 1} Chamar Hipogrifo para voltar para casa", TimeUnit.MILLISECONDS, temp_dialog);
		 resp4 = entrada.nextInt();
		 if(resp4 != 1) {
			 System.out.println("Você não digitou uma resposta valída!");
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
			System.out.println("\n\n Qual é a soma das coordenadas do vértice de uma função do segundo grau definida por f(x) = 2x2 + 10x + 12?");
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
				System.out.println("Escolha inválida!");
			}
		} while (!acertou & contador < 3);
		
		if (acertou) {
			System.out.println("Você acertou com " + contador + " tentativa!");
			} else {
			System.err.println("Você errou 3 vezes seguidas!");
	}
    
    
    int resp5 = 0;
	do {
		Digita("\n\n - " + nome_aventureiro + " Conheça meu grande amigo que conheci nessa jornada até aqui, esse é o hipogrifo mágico,"
				+ " ele pode nos levar para casa de uma forma mais rápida! Mas cuidado, para montar nele é preciso fazer uma reverência.", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus:  O que, como? esse bixo é mágico e muito raro! Sempre tive vontade de andar em um, como devo fazer a reverência? dessa forma?",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus:  Ouuuu ouuu, ele está me cheirando!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - " + nome_aventureiro + " Isso mesmo, parece que ele gostou de você! agora pode subir vamos embora!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - " + nome_aventureiro + " [...] então Grannus resumindo nós precisamos que você liberte minha irmã da maldição que você lançou nela, "
				+ "meu irmão Solveig está com ela agora tentando encontrar um jeito de libertá-la.", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus:  Meu deus… eu não consigo acreditar que fiz isso! Eu cuidei daquela menina como uma irmã!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - " + nome_aventureiro + " Não se culpe meu amigo, nós sabemos como Centrion era poderoso!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus:  Eu sinto muito…",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - " + nome_aventureiro + " 1} Você vai poder se desculpar quando salvar a minha irmã!” ou “2} Se não salvarmos ela hoje, ela morrerá a meia noite.", TimeUnit.MILLISECONDS, temp_dialog);
		
		System.out.println("\n");
		resp5 = entrada.nextInt();
		
		if(resp5 == 1 ) {
		Digita("\n\n - " + nome_aventureiro + " Já estou vendo a casa, vamos lá garoto mais rápido!", TimeUnit.MILLISECONDS, temp_dialog);
		 
		}else if( resp5 == 2) {
			Digita("\n\n  Doodou: Chegamos! Estamos em casa!",  TimeUnit.MILLISECONDS, temp_dialog);
		}else {
			System.out.println("Você não digitou uma resposta valída!");
		}
		
		Digita("\n\n - " + nome_aventureiro + " 1} Chamar Solveing ou 2} Entrar na casa", TimeUnit.MILLISECONDS, temp_dialog);
		if(resp5 == 1) {
			Digita("\n\n - " + nome_aventureiro + " Solveing chegamos!! Está em casa?", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Solveing: Graças a Merlim vocês voltaram!!",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n - " + nome_aventureiro + " Estamos aqui meu querido irmão e trago boas notícias!", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Solveing: Vocês conseguiram?",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n Grannus: Olá Solveing, há quanto tempo", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Solveing: Ele ainda é o Grannus que matou nosso pai ?",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n - " + nome_aventureiro + " Não Solveing, nós revertemos o feitiço que estava nele.", TimeUnit.MILLISECONDS, temp_dialog);
			
			
		}else if(resp5 == 2) {
			Digita("\n\n - " + nome_aventureiro + " Está tudo muito calmo, vamos entrar...", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Solveing: Força Bryanna, preciso que fique forte! tentarei uma nova magia..\n\n Espera ai que barulho é esse? \n\n Graças a Merlim vocês voltaram!!",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n - " + nome_aventureiro + " Estamos aqui meu querido irmão e trago boas notícias!", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Solveing: Vocês conseguiram?",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Grannus: Olá Solveing, a quanto tempo!",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Solveing: Ele ainda é o Grannus que matou nosso pai?",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n - " + nome_aventureiro + " Não Solveing, nós revertemos o feitiço que estava nele.", TimeUnit.MILLISECONDS, temp_dialog);
			
			Digita("\n\n - " + nome_aventureiro + " Está tudo muito calmo, vamos entrar...", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n   Solveing: Força Bryanna, preciso que fique forte! tentarei uma nova magia.. \n\n Espera ai... que barulho é esse ? \n\n Graças a Merlim vocês voltaram!!",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n - " + nome_aventureiro + " Estamos aqui meu querido irmão e trago boas notícias", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Solveing: Vocês conseguiram?",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n   Grannus: Olá Solveing, há quanto tempo!",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n   Solveing: Ele ainda é o Grannus que matou nosso pai ?",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n - " + nome_aventureiro + " Não Solveing, nós revertemos o feitiço que estava nele.", TimeUnit.MILLISECONDS, temp_dialog);
			
			Digita("\n\n - " + nome_aventureiro + " 1} Como está nossa irmã ? ou 2} Vamos logo com isso, estamos perdendo tempo!", TimeUnit.MILLISECONDS, temp_dialog);
			resp5 = entrada.nextInt();
			//rafa
			Digita("\n\n - " + nome_aventureiro + " Estamos aqui meu querido irmão e trago boas notícias!", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Solveing: Vocês conseguiram?",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n - " + nome_aventureiro + " Estamos aqui meu querido irmão e trago boas notícias!", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Solveing: Vocês conseguiram?",  TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n - " + nome_aventureiro + " Estamos aqui meu querido irmão e trago boas notícias!", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n  Solveing: Vocês conseguiram?",  TimeUnit.MILLISECONDS, temp_dialog);
			
			
			
			
			break;
		}else {
			System.out.println("Você não digitou uma resposta valída!");
		}
		
	} while(resp != 1 || resp != 2);
    }
//================================================================ FIM DO CÓDIGO ==============================================================================================================================	
	public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
		for (char caractere : mensagem.toCharArray()) {
			System.out.print(caractere);
			unit.sleep(tempo_mensagem);
		}
	}
}