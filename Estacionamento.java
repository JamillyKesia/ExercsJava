
public class Estacionamento {
	import java.util.Scanner;

	public class Estacionamento {
	    private static final double minimo = 5.0;
	    private static final double adicionalhora = 3.0;
	    private static final double maximadia = 50.0;

	    private double faturamentoDiario = 0.0;

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        Estacionamento estacionamento = new Estacionamento();

	        System.out.print("Quantos clientes estacionaram hoje? ");
	        int numClientes = scanner.nextInt();

	        for (int i = 1; i <= numClientes; i++) {
	            System.out.print("Quantas horas o cliente " + i + " permaneceu estacionado? ");
	            int horas = scanner.nextInt();

	            double taxa = estacionamento.calcularTaxa(horas);
	            System.out.printf("Taxa do cliente %d: R$ %.2f\n", i, taxa);

	            estacionamento.faturamentoDiario += taxa;
	        }

	        System.out.printf("Faturamento diário: R$ %.2f\n", estacionamento.obterFaturamentoDiario());

	        scanner.close();
	    }

	    public double calcularTaxa(int horas) {
	        double taxa = minimo;

	        if (horas > 1) {
	            taxa += (horas - 1) * adicionalhora;
	        }

	        if (taxa > maximadia) {
	            taxa = maximadia;
	        }

	        return taxa;
	    }

	    public double obterFaturamentoDiario() {
	        return faturamentoDiario;
	    }
	}



























