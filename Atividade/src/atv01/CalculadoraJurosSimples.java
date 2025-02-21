package atv01;
import java.util.Scanner;
import java.util.Locale;

public class CalculadoraJurosSimples{

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
        System.out.print("Digite o capital inicial (C): ");
        double capital = scan.nextDouble();
        
        System.out.print("Digite a taxa de juros mensal (%) (I): ");
        double taxaJuros = scan.nextDouble();
        
        System.out.print("Digite o tempo em meses (t): ");
        int tempo = scan.nextInt();
        
        double taxaJurosDecimal = taxaJuros / 100; // conversão decimal
        double juros = capital * taxaJurosDecimal * tempo; //juros
        double montanteTotal = capital + juros;//montante
        
        System.out.printf("Juros (J): %.2f%n", juros);
        System.out.printf("Montante total ao final do período: %.2f%n", montanteTotal);
        
    
        scan.close();
    }

	}


