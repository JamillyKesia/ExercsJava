
public class ClasseEstrangeira {
	public static void main(String[] args) {
		ClasseEmpacotada ce = new ClasseEmpacotada();//existe um método com o mesmo nome da classe que tem o parâmetro int que acaba sendo solicitado p o objeto
		ce.setA(10);
		System.out.println(ce.soma);//os 2 métodos estão sendo chamadps de forma errada, sendo que era só colocar ce.soma(); por exemplo
		System.out.println(ce.a);
	}
}
