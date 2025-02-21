package atv01;
import java.util.Scanner;
import java.util.Locale;

public class CalculoPerimetro{

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scan.nextDouble();
        
        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio; 
        
        System.out.printf("Área do círculo: %.2f%n", area);
        System.out.printf("Perímetro do círculo: %.2f%n", perimetro);
        
        scan.close();
    }
}
