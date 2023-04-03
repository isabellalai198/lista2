package lista_exercicios2;
import java.util.Scanner;
public class EP5 {

	

	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite o primeiro valor: ");
	        double valor1 = input.nextDouble();

	        System.out.print("Digite o segundo valor: ");
	        double valor2 = input.nextDouble();

	        System.out.print("Digite o terceiro valor: ");
	        double valor3 = input.nextDouble();

	        if (valor3 > valor1 && valor3 < valor2) {
	            System.out.println("O terceiro valor está entre o primeiro e o segundo valor.");
	        } else {
	            System.out.println("O terceiro valor não está entre o primeiro e o segundo valor.");
	        }
	    }
	}


