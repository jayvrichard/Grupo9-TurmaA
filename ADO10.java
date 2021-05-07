import java.util.Scanner;
import java.util.Random;
public class ADO10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random sorteio = new Random();
		
		int tentativa;
		int chances = 1;
		int num = sorteio.nextInt(99) + 1;
		
		System.out.println("Bem vindo ao Jogo da Advinha��o!"
				+ "\nInstru��es: Um n�mero de 1 a 100 ser� sorteado, tente acerta-lo."
				+ "\nBoa sorte! Voc� s� tem 5 chances!");
		
		
		System.out.println("N�mero sorteado!");
		
		do {
			System.out.println("\nAcerte o n�mero: ");
			tentativa = entrada.nextInt();
			
			if (tentativa + 1 == num || tentativa - 1 == num) {
				System.out.println("ESTA QUENTE!");
				chances++;
				
			}else if (tentativa > num) {
				System.out.println("O n�mero sorteado � menor que " + tentativa);
				chances++;
				
			}else if (tentativa < num) {
				System.out.println("O n�mero sorteado � maior que " + tentativa);
				chances++;
				
			}else if (tentativa == num) {
				System.out.println("PARAB�NS voc� acertou o n�mero!!");
				break;
				
			}
		}while(chances <= 5);
		
		if (chances > 5) {
			System.out.println("GAME OVER!!"
					+ "\nVoc� usou todas as suas tentativas!"
					+ "\nO n�mero sorteado foi " + num);
			
		}
	}

}
