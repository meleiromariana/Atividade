package atv01;
import java.util.Scanner;
import java.util.Locale;

public class MediaAluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
        
		
        System.out.print("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scan.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("A média final do aluno é %.1f%n", media);
        scan.close();
    }
}