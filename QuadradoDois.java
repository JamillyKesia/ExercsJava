
public class QuadradoDois {
	
	public void drawSquare(int side, char fillCharacter) {
		for (int linha = 1; linha <= side; linha++) {
            for (int coluna = 1; coluna <= side; coluna++) {
            	System.out.print(fillCharacter);
            	if (coluna == side) {
                    System.out.println("\n");
                }
            }
		}
	}
}
