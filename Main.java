
public class Main {
	public static void main(String[] args) {
		//instancia objeto -> Cria a porta
		Porta p = new Porta(true, "Marrom", 2.0f, 1.2f);
		
		//abre a porta
		p.abrir();
		System.out.println("A porta está aberta? "+p.estaAberta());
	
		//fecha porta
		p.fechar();
		System.out.println("A porta está fechada? "+p.estaAberta());
		
		//troca cor da porta
		p.pintar("Branca");
		System.out.println("Cor da porta: "+p.getAltura());
		
		//muda dimensão
		p.setAltura(2.5f);
		p.setLargura(1.0f);
		System.out.println("Largura da porta: "+p.getLargura()+"m, Altura: "+p.getAltura()+"m");
	}
}
