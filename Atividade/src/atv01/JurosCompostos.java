package atv01;
import java.util.Scanner;
import java.util.Locale;

public class JurosCompostos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o capital inicial: ");
		double capitalInicial = scan.nextDouble();
		
		System.out.println("Informe a taxa de juros: ");
		double taxaDejuros = scan.nextDouble();
		
		System.out.println("Informe o número de meses: ");
		int numeroDeMes = scan.nextInt();
		
		double potencia = Math.pow((taxaDejuros+1), numeroDeMes);
		double montanteTotal = capitalInicial * potencia;
		
		System.out.printf("\nMontante Total: %.2f", montanteTotal);
		scan.close();
	}
}
