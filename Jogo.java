import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class Jogo {
	private static final String nome_aventureiro = null; ////Precisa verificar o porque não consigo colocar o nome do aventureiro nos dialogos
	
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
			Digita("\n\n - Mestre dos magos: Isso é o que veremos!", TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n\n “Então, uma batalha intensa é travada entre dois magos poderosos e no meio dos destroços uma criança sozinha e indefesa é vista tentando se esconder para não ser atingida… O Aprendiz volta para tentar ajudar seu mestre.”", TimeUnit.MILLISECONDS, temp_dialog);
break;
			
		} else if (resp == 2) {
			
			Digita("\n\n - Mestre dos magos: Você não é páreo para mim!", TimeUnit.MILLISECONDS, temp_dialog);
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
				Digita("\n\n - " + nome_aventureiro + " Eu quero proteger nossa vila do homem que matou nosso Pai!!  ", TimeUnit.MILLISECONDS, temp_dialog);
			

			} else if (resp1 == 2) {

				Digita("\n\n - " + nome_aventureiro + " Eu não sei se um dia conseguirei ser bom como você meu irmão", TimeUnit.MILLISECONDS, temp_dialog);

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
				Digita("\n\n - " + nome_aventureiro + " Vamos estou pronto!", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}else if(resp == 2) {
				Digita("\n\n - " + nome_aventureiro + " Esperaaaaa, eu estou cansado!", TimeUnit.MILLISECONDS, temp_dialog);
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
		Scanner entrada = new Scanner(System.in);
		
		Digita("\n\n  Doodou: Boaaa " + nome_aventureiro + "! Agora, segure ele até o feitiço fazer efeito!",  TimeUnit.MILLISECONDS, temp_dialog);
		
int resp;
		
		do {
			Digita("\n\n - " + nome_aventureiro + " 1} Doodou, isso vai dar certo? 2} Ele pode morrer?", TimeUnit.MILLISECONDS, temp_dialog);
			
			System.out.println("\n");
			resp = entrada.nextInt();
			
			if(resp == 1) {
				Digita("\n\n - " + nome_aventureiro + " Doodou, isso vai dar certo?", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}else if(resp == 2) {
				Digita("\n\n - " + nome_aventureiro + " Ele pode morrer?", TimeUnit.MILLISECONDS, temp_dialog);
			    break;
			}else {
				System.out.println("Você não digitou uma resposta valída!");
			}
			
		} while(resp != 1 || resp != 2);
		
		Digita("\n\n  Doodou: Eu espero que dê certo e que ele não morra!!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus: O que você feeeez!!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - " + nome_aventureiro + " e Doodou torcem para que o efeito da poção faça com que Grannus volte a si depois de tantos anos enfeitiçado, caso contrário eles não terão escolha ao não ser matá-lo.",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Doodou: Veja " + nome_aventureiro + " eu disse que ia dar certo!",  TimeUnit.MILLISECONDS, temp_dialog);
		
int resp1;
		
		do {
			Digita("\n\n - " + nome_aventureiro + " 1} Grannus olhe pra mim, você sabe quem sou? 2} Eu acho que isso ainda não acabou!", TimeUnit.MILLISECONDS, temp_dialog);
			
			System.out.println("\n");
			resp1 = entrada.nextInt();
			
			if(resp1 == 1) {
				Digita("\n\n - " + nome_aventureiro + " Grannus olhe pra mim, você sabe quem sou? ", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}else if(resp1 == 2) {
				Digita("\n\n - " + nome_aventureiro + " Eu acho que isso ainda não acabou!", TimeUnit.MILLISECONDS, temp_dialog);
			    break;
			}else {
				System.out.println("Você não digitou uma resposta valída!");
			}
			
		} while(resp1 != 1 || resp1 != 2);
		
		Digita("\n\n  Grannus: Onde… onde estou, que lugar é esse?",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Porque vocês estão aqui?",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Doodou: AAAHH É essa poção pegou ele de jeito!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus: Você é a criança não é? Que salvamos aquele dia! Onde está meu mestre?",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Doodou você sabe!! ONDE ESTÁ MEU MESTRE!!!!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Doodou: Olha cara… temos muito pra te contar.",  TimeUnit.MILLISECONDS, temp_dialog);
		
int resp2;
		
		do {
            Digita("\n\n - " + nome_aventureiro + " 1} Vamos te contar tudo que precisa saber! 2} Você realmente não se lembra de nada?", TimeUnit.MILLISECONDS, temp_dialog);
			
			System.out.println("\n");
			resp2 = entrada.nextInt();
			
			if(resp2 == 1) {
				Digita("\n\n - " + nome_aventureiro + " Vamos te contar tudo que precisa saber!", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  Grannus: Eu não entendo! Está tudo girando pra mim!",  TimeUnit.MILLISECONDS, temp_dialog);
				
				
			}else if(resp2 == 2) {
				Digita("\n\n - " + nome_aventureiro + " Você realmente não se lembra de nada?", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  Grannus: Eu me lembro de que... me lembro que salvamos a cidade e derrotamos o Centrion!",  TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  O que aconteceu depois?", TimeUnit.MILLISECONDS, temp_dialog);
			    break;
			}else {
				System.out.println("Você não digitou uma resposta valída!");
			}
			
		} while(resp2 != 1 || resp2 != 2);
		
int resp3;
		
		do {
			Digita("\n\n - " + nome_aventureiro + " 1} Vamos levá-lo pra casa, ainda precisamos da ajuda dele! 2} Doodou você acredita nele?", TimeUnit.MILLISECONDS, temp_dialog);
			
			System.out.println("\n");
			resp3 = entrada.nextInt();
			
			if(resp3 == 1) {
				Digita("\n\n - " + nome_aventureiro + " Vamos levá-lo pra casa, ainda precisamos da ajuda dele! ", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}else if(resp3 == 2) {
				Digita("\n\n - " + nome_aventureiro + " Doodou você acredita nele? ", TimeUnit.MILLISECONDS, temp_dialog);
			    break;
			}else {
				System.out.println("Você não digitou uma resposta valída!");
			}
			
		} while(resp3 != 1 || resp3 != 2);
		
		Digita("\n\n  Doodou: Vamos amarrá-lo eu ainda não confio nele!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus: Vocês ainda não me disseram o que estamos fazendo aqui!",  TimeUnit.MILLISECONDS, temp_dialog);
		
int resp4;
		
		do {
			Digita("\n\n - " + nome_aventureiro + " 1} Amarrar Grannus e levá-lo embora. 2} Dizer o que ele precisa saber.", TimeUnit.MILLISECONDS, temp_dialog);
			
			System.out.println("\n");
			resp4 = entrada.nextInt();
			
			if(resp4 == 1) {
				Digita("\n\n - " + nome_aventureiro + " Amarrar Grannus e levá-lo embora. ", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n - " + nome_aventureiro + " Já disse que contaremos no caminho, agora me deixe te amarrar! ", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}else if(resp4 == 2) {
				Digita("\n\n - " + nome_aventureiro + " Dizer o que ele precisa saber.", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n - " + nome_aventureiro + " Nós estamos aqui por que você…", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}else {
				System.out.println("Você não digitou uma resposta valída!");
			}
			
		} while(resp4 != 1 || resp4 != 2);
		
		Digita("\n\n  Doodou: EI EI não conte nada a ele agora, contamos no caminho ande logo!!!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - " + nome_aventureiro + " Você tem razão, nosso tempo está acabando!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus: Tempo ? Do que vocês estão falando?",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Doodou: "  + nome_aventureiro + " vou chamar nosso amigo, se prepare e explique a ele o que precisamos fazer!",  TimeUnit.MILLISECONDS, temp_dialog);
		
int resp5;
		
		do {
			Digita("\n\n - " + nome_aventureiro + " 1} Lá vem você com suas ideias rsrs. 2} HAHAHA ele vai adorar isso!!", TimeUnit.MILLISECONDS, temp_dialog);
			
			System.out.println("\n");
			resp5 = entrada.nextInt();
			
			if(resp5 == 1) {
				Digita("\n\n - " + nome_aventureiro + " Lá vem você com suas ideias rsrs. ", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}else if(resp5 == 2) {
				Digita("\n\n - " + nome_aventureiro + " HAHAHA ele vai adorar isso!!", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}else {
				System.out.println("Você não digitou uma resposta valída!");
			}
			
		} while(resp5 != 1 || resp5 != 2);
		
		Digita("\n\n  Doodou: "  + nome_aventureiro + ", para irmos embora vamos precisar das coordenadas! você consegue olhar no livro?",  TimeUnit.MILLISECONDS, temp_dialog);
		
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
			System.out.println("\n\n Volte pra casa e salve sua irmã mas você vai precisar das coordenadas do vértice de uma função do segundo grau definida por f(x) = 2x2 + 10x + 12? ");
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
				if (alternativas.get(4).equals("-3,0")) {
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
		
		Digita("\n\n - " + nome_aventureiro + " Grannus vamos embora num Hipogrifo, ele é nosso amigo mas por via das dúvidas faça a reverência precisamos de você vivo! ", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus: UM HIPOGRIFO??  Só quero entender o que estamos fazendo!",  TimeUnit.MILLISECONDS, temp_dialog);
		
int resp6;
		
		do {
			Digita("\n\n - " + nome_aventureiro + " 1} Fique tranquilo, te explicaremos tudo no caminho! 2} Chamar Hipogrifo.", TimeUnit.MILLISECONDS, temp_dialog);
			
			System.out.println("\n");
			resp6 = entrada.nextInt();
			
			if(resp6 == 1) {
				Digita("\n\n - " + nome_aventureiro + " Fique tranquilo, te explicaremos tudo no caminho! ", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}else if(resp6 == 2) {
				Digita("\n\n - " + nome_aventureiro + " Chamar Hipogrifo.", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}else {
				System.out.println("Você não digitou uma resposta valída!");
			}
			
		} while(resp6 != 1 || resp6 != 2);
		
		Digita("\n\n  IIIAAARRG", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Doodou: Lá vem ele!!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - " + nome_aventureiro + " Muito bem garoto, precisamos da sua ajuda!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Doodou: Vamos lá subam!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Enquanto o forte Hipogrifo leva-os para casa, Doodou e " + nome_aventureiro + " contam tudo que Grannus precisava saber.", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Doodou: Olhem... estamos chegando!!!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n - " + nome_aventureiro + " [...] então Grannus resumindo nós precisamos que você liberte minha irmã da maldição que você lançou nela, meu irmão Solveig está com ela agora tentando encontrar um jeito de libertá-la.", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus: Santo Merlim... eu não consigo acreditar que fiz isso! Eu cuidei daquela menina como uma irmã!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Doodou: Não se culpe meu amigo, nós sabemos como Centrion era poderoso!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Grannus: Eu sinto muito...",  TimeUnit.MILLISECONDS, temp_dialog);
		
int resp7;
		
		do {
			Digita("\n\n - " + nome_aventureiro + " 1} Você vai poder se desculpar quando salvar a minha irmã! 2} Se não salvarmos ela hoje, ela morrerá à meia noite.", TimeUnit.MILLISECONDS, temp_dialog);
			
			System.out.println("\n");
			resp7 = entrada.nextInt();
			
			if(resp7 == 1) {
				Digita("\n\n - " + nome_aventureiro + " Você vai poder se desculpar quando salvar a minha irmã! ", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}else if(resp7 == 2) {
				Digita("\n\n - " + nome_aventureiro + " Se não salvarmos ela hoje, ela morrerá à meia noite.", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}else {
				System.out.println("Você não digitou uma resposta valída!");
			}
			
		} while(resp7 != 1 || resp7 != 2);
		
		Digita("\n\n  Doodou: Já estou vendo a casa, vamos lá garoto mais rápido!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Doodou: Chegamos! Estamos em casa!",  TimeUnit.MILLISECONDS, temp_dialog);
		
int resp8;
		
		do {
			Digita("\n\n - " + nome_aventureiro + " 1}  Chamar Solveing 2} Entrar na casa", TimeUnit.MILLISECONDS, temp_dialog);
			
			System.out.println("\n");
			resp8 = entrada.nextInt();
			
			if(resp8 == 1) {
				Digita("\n\n - " + nome_aventureiro + " Solveing chegamos!! Está em casa? ", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  Solveing: Graças a Merlim vocês voltaram!!",  TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n - " + nome_aventureiro + " Estamos aqui meu querido irmão e trago boas notícias!", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  Solveing: Vocês conseguiram?",  TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  Grannus: Olá Solveing, a quanto tempo!",  TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  Solveing: Ele ainda é o Grannus que matou nosso pai?",  TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  Doodou: Não Solveing, nós tiramos o feitiço dele.",  TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}else if(resp8 == 2) {
				Digita("\n\n - " + nome_aventureiro + " Está tudo muito calmo, vamos entrar! Hipogrifo, agora você está livre, adeus meu amigo, obrigado por tudo! Vamos Grannus...", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  Solveing: Força Bryanna, preciso que fique forte! tentarei uma nova magia...",  TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  Espera ai que barulho é esse?",  TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  Graças a Merlim vocês voltaram!!",  TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n - " + nome_aventureiro + "Estamos aqui meu querido irmão e trago boas notícias!", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  Solveing: Vocês conseguiram?",  TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  Grannus: Olá Solveing, a quanto tempo!",  TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  Solveing: Ele ainda é o Grannus que matou nosso pai?",  TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  Doodou: Não Solveing, nós tiramos o feitiço dele.",  TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}else {
				System.out.println("Você não digitou uma resposta valída!");
			}
			
		} while(resp8 != 1 || resp8 != 2);
		
int resp9;
		
		do {
			Digita("\n\n - " + nome_aventureiro + " 1} Como está nossa irmã? 2} Vamos logo com isso, estamos perdendo tempo!", TimeUnit.MILLISECONDS, temp_dialog);
			
			System.out.println("\n");
			resp9 = entrada.nextInt();
			
			if(resp9 == 1) {
				Digita("\n\n - " + nome_aventureiro + " Como está nossa irmã? ", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}else if(resp9 == 2) {
				Digita("\n\n - " + nome_aventureiro + " Vamos logo com isso, estamos perdendo tempo!", TimeUnit.MILLISECONDS, temp_dialog);
				break;
			}else {
				System.out.println("Você não digitou uma resposta valída!");
			}
			
		} while(resp9 != 1 || resp9 != 2);
		
		Digita("\n\n  Solveing: Meu irmão durante esses dias todos esperando pela sua volta eu busquei em livros e mais livros, eu tentei de tudo que pudesse ajudá-la mas nada do que eu fazia dava certo. Até que encontrei um livro antigo de magia oculta do nosso pai...",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Doodou: E o que tinha nele??? Vamos desembucha!!!!",  TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\n\n  Solveing: Eu não sei se devemos falar sobre isso na presença dele!",  TimeUnit.MILLISECONDS, temp_dialog);
		
int resp10;
		
		do {
            Digita("\n\n - " + nome_aventureiro + " 1} Pedir para Solveing revelar o que encontrou. 2} Ter uma conversa a sós com Solveing.", TimeUnit.MILLISECONDS, temp_dialog);
			
			System.out.println("\n");
			resp10 = entrada.nextInt();
			
			if(resp10 == 1) {
				Digita("\n\n - " + nome_aventureiro + " Pode contar, ele veio para nos ajudar!", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  Solveing: Muito bem, o livro dizia que maldições lançadas por magos poderosos só podem ser quebradas se ou quando eles morrerem!",  TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n ... há um silêncio no ar enquanto todos pensam numa maneira de salvar Bryanna.", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  Doodou: Pois bem, olha só eu não queria dizer isso mas...",  TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  Grannus: EU ME SACRIFICO!!!",  TimeUnit.MILLISECONDS, temp_dialog);
				
				int resp11;
				 
				Digita("\n\n - " + nome_aventureiro + " 1} Você não precisa fazer isso! 2} Eu sei que você sempre foi fiel ao meu pai, faça o que for preciso!", TimeUnit.MILLISECONDS, temp_dialog);
				 System.out.println("\n");
				 resp11 = entrada.nextInt();
				 
				 if(resp11 == 1) {
						Digita("\n\n - " + nome_aventureiro + " Você não precisa fazer isso!", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Grannus: Eu vou fazer isso por ela e pelo meu mestre, eu nunca me perdoaria se a Bryanna morresse!!",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Solveing: Ela está no quarto, subindo as escadas.",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Grannus: Eu vou me despedir dela.",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Bryanna: Quem está aí? Solveing é você?",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Grannus: Olá Bryanna, é o Grannus, lembra de mim?",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Bryanna: Eu era muito pequena, você era o Aprendiz do meu pai não era?",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Você o matou!",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Grannus: Sim Bryanna eu matei o seu pai, ele era meu mestre! Mas por favor não quero que pense assim de mim, eu não sabia o que estava fazendo… na verdade eu o amava muito! Eu vou tirar você dessa maldição custe o que custar!!!",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Só vim aqui para te dizer uma coisa que seu pai me disse quando estava me ensinando suas magias...",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Bryanna: E o que é ?",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Grannus: Proteja o mundo mágico, ele sempre estará lá quando você precisar!",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Eu nunca entendi o que ele quis dizer com “ele”, mas acredito que você minha criança deve ser a única capaz de desvendar os mistérios que ainda andam por esses vales e montanhas.",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Cuide-se e adeus.",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Bryanna: Solveing!! Obrigada!",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Apesar de triste pelo o que fez, Solveing procura a felicidade em sua atitude de salvar a garotinha que tanto amava.",  TimeUnit.MILLISECONDS, temp_dialog);
						break;
				 }else if(resp11 == 2) {
					    Digita("\n\n - " + nome_aventureiro + " Eu sei que você sempre foi fiel ao meu pai, faça o que for preciso!", TimeUnit.MILLISECONDS, temp_dialog);
					    Digita("\n\n  Grannus: Eu vou fazer isso por ela e pelo meu mestre, eu nunca me perdoaria se a Bryanna morresse!!",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Solveing: Ela está no quarto, subindo as escadas.",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Grannus: Eu vou me despedir dela.",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Bryanna: Quem está aí? Solveing é você?",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Grannus: Olá Bryanna, é o Grannus, lembra de mim?",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Bryanna: Eu era muito pequena, você era o Aprendiz do meu pai não era?",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Você o matou!",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Grannus: Sim Bryanna eu matei o seu pai, ele era meu mestre! Mas por favor não quero que pense assim de mim, eu não sabia o que estava fazendo… na verdade eu o amava muito! Eu vou tirar você dessa maldição custe o que custar!!!",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Só vim aqui para te dizer uma coisa que seu pai me disse quando estava me ensinando suas magias...",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Bryanna: E o que é ?",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Grannus: Proteja o mundo mágico, ele sempre estará lá quando você precisar!",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Eu nunca entendi o que ele quis dizer com “ele”, mas acredito que você minha criança deve ser a única capaz de desvendar os mistérios que ainda andam por esses vales e montanhas.",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Cuide-se e adeus.",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Bryanna: Solveing!! Obrigada!",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Apesar de triste pelo o que fez, Solveing procura a felicidade em sua atitude de salvar a garotinha que tanto amava.",  TimeUnit.MILLISECONDS, temp_dialog);
					    break;
				 }else {
						System.out.println("Você não digitou uma resposta valída!");
					}
					
			}else if(resp10 == 2) {
				Digita("\n\n - " + nome_aventureiro + " Vamos conversar lá fora meu irmão!", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  Solveing: Muito bem, o livro dizia que maldições lançadas por magos poderosos só podem ser quebradas se ou quando eles morrerem!",  TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n - " + nome_aventureiro + " Então o Grannus precisa morrer para o feitiço ser revertido?", TimeUnit.MILLISECONDS, temp_dialog);
				Digita("\n\n  Solveing: É a única forma, como ele matou nosso pai eu posso entrar e matá-lo eu mesmo!",  TimeUnit.MILLISECONDS, temp_dialog);
				
				int resp12;
				 
				Digita("\n\n - " + nome_aventureiro + " 1} Solveig, nosso pai nos ensinou a nunca ser covarde! 2} Vamos entrar e contar isso a ele.", TimeUnit.MILLISECONDS, temp_dialog);
				 System.out.println("\n");
				 resp12 = entrada.nextInt();
				 
				 if(resp12 == 1) {
					Digita("\n\n - " + nome_aventureiro + " Solveig, nosso pai nos ensinou a nunca ser covarde!",  TimeUnit.MILLISECONDS, temp_dialog);	
					Digita("\n\n  Solveing: Você tem razão meu irmão, conhecendo o pai ele ficaria muito magoado! Vamos entrar e contar a ele tudo que eu aprendi durante esse tempo",  TimeUnit.MILLISECONDS, temp_dialog);
					Digita("\n\n - " + nome_aventureiro + " Grannus sempre foi uma boa pessoa, tenho certeza que ele vai entender e nos ajudar da melhor forma possível, o hipogrifo que viemos só ajudam pessoas com boas intenções, caso contrário, o Grannus não teria nem chego aqui comigo! ", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("\n\n  Solveing: Muito bem, vou contar isso a todos... o livro dizia que maldições lançadas por magos poderosos só podem ser quebradas se ou quando eles morrerem!",  TimeUnit.MILLISECONDS, temp_dialog);
					Digita("\n\n ... há um silêncio no ar enquanto todos pensam numa maneira de salvar Bryanna.", TimeUnit.MILLISECONDS, temp_dialog);
					Digita("\n\n  Doodou: Pois bem, olha só eu não queria dizer isso mas...",  TimeUnit.MILLISECONDS, temp_dialog);
					Digita("\n\n  Grannus: EU ME SACRIFICO!!!",  TimeUnit.MILLISECONDS, temp_dialog);
					
					int resp13;
					 
					Digita("\n\n - " + nome_aventureiro + " 1} Você não precisa fazer isso! 2} Eu sei que você sempre foi fiel ao meu pai, faça o que for preciso!", TimeUnit.MILLISECONDS, temp_dialog);
					 System.out.println("\n");
					 resp13 = entrada.nextInt();
					 
					 if(resp13 == 1) {
							Digita("\n\n - " + nome_aventureiro + " Você não precisa fazer isso!", TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Grannus: Eu vou fazer isso por ela e pelo meu mestre, eu nunca me perdoaria se a Bryanna morresse!!",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Solveing: Ela está no quarto, subindo as escadas.",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Grannus: Eu vou me despedir dela.",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Bryanna: Quem está aí? Solveing é você?",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Grannus: Olá Bryanna, é o Grannus, lembra de mim?",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Bryanna: Eu era muito pequena, você era o Aprendiz do meu pai não era?",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Você o matou!",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Grannus: Sim Bryanna eu matei o seu pai, ele era meu mestre! Mas por favor não quero que pense assim de mim, eu não sabia o que estava fazendo… na verdade eu o amava muito! Eu vou tirar você dessa maldição custe o que custar!!!",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Só vim aqui para te dizer uma coisa que seu pai me disse quando estava me ensinando suas magias...",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Bryanna: E o que é ?",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Grannus: Proteja o mundo mágico, ele sempre estará lá quando você precisar!",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Eu nunca entendi o que ele quis dizer com “ele”, mas acredito que você minha criança deve ser a única capaz de desvendar os mistérios que ainda andam por esses vales e montanhas.",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Cuide-se e adeus.",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Bryanna: Solveing!! Obrigada!",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Apesar de triste pelo o que fez, Solveing procura a felicidade em sua atitude de salvar a garotinha que tanto amava.",  TimeUnit.MILLISECONDS, temp_dialog);
							break;
					 }else if(resp13 == 2) {
						    Digita("\n\n - " + nome_aventureiro + " Eu sei que você sempre foi fiel ao meu pai, faça o que for preciso!", TimeUnit.MILLISECONDS, temp_dialog);
						    Digita("\n\n  Grannus: Eu vou fazer isso por ela e pelo meu mestre, eu nunca me perdoaria se a Bryanna morresse!!",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Solveing: Ela está no quarto, subindo as escadas.",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Grannus: Eu vou me despedir dela.",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Bryanna: Quem está aí? Solveing é você?",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Grannus: Olá Bryanna, é o Grannus, lembra de mim?",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Bryanna: Eu era muito pequena, você era o Aprendiz do meu pai não era?",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Você o matou!",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Grannus: Sim Bryanna eu matei o seu pai, ele era meu mestre! Mas por favor não quero que pense assim de mim, eu não sabia o que estava fazendo… na verdade eu o amava muito! Eu vou tirar você dessa maldição custe o que custar!!!",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Só vim aqui para te dizer uma coisa que seu pai me disse quando estava me ensinando suas magias...",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Bryanna: E o que é ?",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Grannus: Proteja o mundo mágico, ele sempre estará lá quando você precisar!",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Eu nunca entendi o que ele quis dizer com “ele”, mas acredito que você minha criança deve ser a única capaz de desvendar os mistérios que ainda andam por esses vales e montanhas.",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Cuide-se e adeus.",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Bryanna: Solveing!! Obrigada!",  TimeUnit.MILLISECONDS, temp_dialog);
							Digita("\n\n  Apesar de triste pelo o que fez, Solveing procura a felicidade em sua atitude de salvar a garotinha que tanto amava.",  TimeUnit.MILLISECONDS, temp_dialog);
						    break;
					 }else {
							System.out.println("Você não digitou uma resposta valída!");
						}
					break;
				 }else if(resp12 == 2){
					 Digita("\n\n - " + nome_aventureiro + " Vamos entrar e contar isso a ele.",  TimeUnit.MILLISECONDS, temp_dialog);
					 Digita("\n\n  Solveing: Você acha que ele vai entender?",  TimeUnit.MILLISECONDS, temp_dialog);
					 Digita("\n\n - " + nome_aventureiro + " Grannus sempre foi uma boa pessoa, tenho certeza que ele vai entender e nos ajudar da melhor forma possível, o hipogrifo que viemos só ajudam pessoas com boas intenções, caso contrário, o Grannus não teria nem chego aqui comigo! ", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Solveing: Muito bem, vou contar isso a todos... o livro dizia que maldições lançadas por magos poderosos só podem ser quebradas se ou quando eles morrerem!",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n ... há um silêncio no ar enquanto todos pensam numa maneira de salvar Bryanna.", TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Doodou: Pois bem, olha só eu não queria dizer isso mas...",  TimeUnit.MILLISECONDS, temp_dialog);
						Digita("\n\n  Grannus: EU ME SACRIFICO!!!",  TimeUnit.MILLISECONDS, temp_dialog);
						
						int resp14;
						 
						Digita("\n\n - " + nome_aventureiro + " 1} Você não precisa fazer isso! 2} Eu sei que você sempre foi fiel ao meu pai, faça o que for preciso!", TimeUnit.MILLISECONDS, temp_dialog);
						 System.out.println("\n");
						 resp14 = entrada.nextInt();
						 
						 if(resp14 == 1) {
								Digita("\n\n - " + nome_aventureiro + " Você não precisa fazer isso!", TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Grannus: Eu vou fazer isso por ela e pelo meu mestre, eu nunca me perdoaria se a Bryanna morresse!!",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Solveing: Ela está no quarto, subindo as escadas.",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Grannus: Eu vou me despedir dela.",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Bryanna: Quem está aí? Solveing é você?",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Grannus: Olá Bryanna, é o Grannus, lembra de mim?",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Bryanna: Eu era muito pequena, você era o Aprendiz do meu pai não era?",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Você o matou!",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Grannus: Sim Bryanna eu matei o seu pai, ele era meu mestre! Mas por favor não quero que pense assim de mim, eu não sabia o que estava fazendo… na verdade eu o amava muito! Eu vou tirar você dessa maldição custe o que custar!!!",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Só vim aqui para te dizer uma coisa que seu pai me disse quando estava me ensinando suas magias...",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Bryanna: E o que é ?",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Grannus: Proteja o mundo mágico, ele sempre estará lá quando você precisar!",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Eu nunca entendi o que ele quis dizer com “ele”, mas acredito que você minha criança deve ser a única capaz de desvendar os mistérios que ainda andam por esses vales e montanhas.",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Cuide-se e adeus.",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Bryanna: Solveing!! Obrigada!",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Apesar de triste pelo o que fez, Solveing procura a felicidade em sua atitude de salvar a garotinha que tanto amava.",  TimeUnit.MILLISECONDS, temp_dialog);
								break;
						 }else if(resp14 == 2) {
							    Digita("\n\n - " + nome_aventureiro + " Eu sei que você sempre foi fiel ao meu pai, faça o que for preciso!", TimeUnit.MILLISECONDS, temp_dialog);
							    Digita("\n\n  Grannus: Eu vou fazer isso por ela e pelo meu mestre, eu nunca me perdoaria se a Bryanna morresse!!",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Solveing: Ela está no quarto, subindo as escadas.",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Grannus: Eu vou me despedir dela.",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Bryanna: Quem está aí? Solveing é você?",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Grannus: Olá Bryanna, é o Grannus, lembra de mim?",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Bryanna: Eu era muito pequena, você era o Aprendiz do meu pai não era?",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Você o matou!",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Grannus: Sim Bryanna eu matei o seu pai, ele era meu mestre! Mas por favor não quero que pense assim de mim, eu não sabia o que estava fazendo… na verdade eu o amava muito! Eu vou tirar você dessa maldição custe o que custar!!!",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Só vim aqui para te dizer uma coisa que seu pai me disse quando estava me ensinando suas magias...",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Bryanna: E o que é ?",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Grannus: Proteja o mundo mágico, ele sempre estará lá quando você precisar!",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Eu nunca entendi o que ele quis dizer com “ele”, mas acredito que você minha criança deve ser a única capaz de desvendar os mistérios que ainda andam por esses vales e montanhas.",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Cuide-se e adeus.",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Bryanna: Solveing!! Obrigada!",  TimeUnit.MILLISECONDS, temp_dialog);
								Digita("\n\n  Apesar de triste pelo o que fez, Solveing procura a felicidade em sua atitude de salvar a garotinha que tanto amava.",  TimeUnit.MILLISECONDS, temp_dialog);
							    break;
						 }else {
								System.out.println("Você não digitou uma resposta valída!");
							}
						break; 
				 }
				 
			}else {
				System.out.println("Você não digitou uma resposta valída!");
			}
			
		} while(resp10 != 1 || resp10 != 2);
		
		
		final_2();
	}
	
//================================================================ Final 2 ==============================================================================================================================	
	
    static void final_2() throws Exception {
    	Digita("\n\n  Grannus: TESTeeeeeee",  TimeUnit.MILLISECONDS, temp_dialog);
    	System.exit(0);
	}
	
//================================================================ FIM DO CÓDIGO ==============================================================================================================================	
	public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
		for (char caractere : mensagem.toCharArray()) {
			System.out.print(caractere);
			unit.sleep(tempo_mensagem);
		}
	}
}