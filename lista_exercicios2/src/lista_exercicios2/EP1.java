package lista_exercicios2;
import java.util.Scanner;
public class EP1 {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o primeiro número: ");
	        int num1 = sc.nextInt();

	        System.out.print("Digite o segundo número: ");
	        int num2 = sc.nextInt();

	        if (num1 > num2) {
	            System.out.println(num1 + " é o maior número.");
	        } else if (num2 > num1) {
	            System.out.println(num2 + " é o maior número.");
	        } else {
	            System.out.println("Os números são iguais.");
	        }

	        sc.close();
	    }
	}


