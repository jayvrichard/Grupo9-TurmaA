import java.util.Scanner;
import java.util.Random;
public class ADO10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Random sorteio = new Random();
		
		int tentativa;
		int chances = 1;
		int num = sorteio.nextInt(99) + 1;
		
		System.out.println("Bem vindo ao Jogo da Advinhação!"
				+ "\nInstruções: Um número de 1 a 100 será sorteado, tente acerta-lo."
				+ "\nBoa sorte! Você só tem 5 chances!");
		
		
		System.out.println("Número sorteado!");
		
		do {
			System.out.println("\nAcerte o número: ");
			tentativa = entrada.nextInt();
			
			if (tentativa + 1 == num || tentativa - 1 == num) {
				System.out.println("ESTA QUENTE!");
				chances++;
				
			}else if (tentativa > num) {
				System.out.println("O número sorteado é menor que " + tentativa);
				chances++;
				
			}else if (tentativa < num) {
				System.out.println("O número sorteado é maior que " + tentativa);
				chances++;
				
			}else if (tentativa == num) {
				System.out.println("PARABÉNS você acertou o número!!");
				break;
				
			}
		}while(chances <= 5);
		
		if (chances > 5) {
			System.out.println("GAME OVER!!"
					+ "\nVocê usou todas as suas tentativas!"
					+ "\nO número sorteado foi " + num);
			
		}
	}

}
