
public class Quadrado {
	
	public void drawSquare(int side) {
		for (int linha = 1; linha <= side; linha++) {
            for (int coluna = 1; coluna <= side; coluna++) {
            	System.out.printf("*");
            	if (coluna == side) {
                System.out.println("\n");
            	}
            }
		}
	}
}
