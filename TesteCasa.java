
public class TesteCasa {
    public static void main(String[] args) {
        Porta porta1 = new Porta(false, "amarela", 2.0f, 1.0f);
        Porta porta2 = new Porta(false, "verde", 2.1f, 1.1f);
        Porta porta3 = new Porta(false, "vermelha", 2.2f, 1.2f);
        Casa casa = new Casa("branca", porta1, porta2, porta3);
        
        casa.pintar("azul");
        casa.getPorta1().setAltura(2.1f);
        casa.getPorta2().abrir();
        casa.getPorta3().fechar();
        
        System.out.println("A casa tem " + casa.quantasPortasEstaoAbertas() + " porta(s) aberta(s).");
    }
}
