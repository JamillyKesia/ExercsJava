
public class Porta {

	private boolean aberta;
	private String cor;
	private float altura;
	private float largura;
	
	public Porta(boolean aberta,String cor, float altura, float largura){
		this.aberta = aberta;
		this.cor = cor;
		this.altura = altura;
		this.largura = largura;
	}
	
	void abrir() {
		this.aberta = true;
		if(this.aberta = true) {
			System.out.println("Aberta!");
		}
		else {
			System.out.println("Fechada!");
		}
	}
	
	void fechar() {
		this.aberta = false;
		if(this.aberta = false) {
			System.out.println("Fechada!");
		}
		else {
			System.out.println("Aberta!");
		}
	}
	
	public void pintar(String c) {
		this.cor = c;
	}
	
	public boolean estaAberta() {
		return this.aberta;
	}

	public void setAltura(float a) {
		this.altura = a;
	}
	
	public float getAltura() {
		return this.altura;
	}
	
	public void setLargura(float l) {
		this.largura = l;
	}
	
	public float getLargura() {
		return this.largura;
	}
}
