package lista_exercicios2;
import java.util.Scanner;
public class EP2 {
	

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        System.out.println("Digite o primeiro número: ");
	        int numero1 = input.nextInt();
	        
	        System.out.println("Digite o segundo número: ");
	        int numero2 = input.nextInt();
	        
	        System.out.println("Digite o terceiro número: ");
	        int numero3 = input.nextInt();
	        
	        int menorNumero = numero1;
	        if (numero2 < menorNumero) {
	            menorNumero = numero2;
	        }
	        if (numero3 < menorNumero) {
	            menorNumero = numero3;
	        }
	        
	        System.out.println("O menor número é: " + menorNumero);
	    }
	}


