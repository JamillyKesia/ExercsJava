import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		QuadradoDois quadradodois = new QuadradoDois();
		
		System.out.println("Digite o tamanho: ");
		int side = scanner.nextInt();
		
		System.out.println("Digite o caractere: ");
		char fillCharacter = scanner.next().charAt(0);
		
		quadradodois.drawSquare(side,fillCharacter);
	}
}