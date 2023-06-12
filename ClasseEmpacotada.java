//package pacote1.local;
public class ClasseEmpacotada {
	private int a;
	public ClasseEmpacotada(int val) {
		a =	val;
	}
	void setA(int val) { 
		a = val;
	}
	public int soma(int val) { //existem dois métodos iguais(com mesmo nome)
	return a + val;			   //esse o método get
	}
	public void soma(int val) {//esse era pra ser o metodo set 
		a+= val;
	}
	

}
