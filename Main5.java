import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		
		Quadrado quadrado = new Quadrado();
		
		System.out.println("Digite o tamanho: ");
		int side = scanner.nextInt();
		
		quadrado.drawSquare(side);
	}
	

}