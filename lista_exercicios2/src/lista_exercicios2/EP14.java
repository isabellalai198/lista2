package lista_exercicios2;
import java.util.Scanner;
public class EP14 {


	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int valorSaque, nota100, nota50, nota20, nota10, nota5, nota2;

	        System.out.print("Digite o valor do saque: ");
	        valorSaque = input.nextInt();

	        nota100 = valorSaque / 100;
	        valorSaque %= 100;

	        nota50 = valorSaque / 50;
	        valorSaque %= 50;

	        nota20 = valorSaque / 20;
	        valorSaque %= 20;

	        nota10 = valorSaque / 10;
	        valorSaque %= 10;

	        nota5 = valorSaque / 5;
	        valorSaque %= 5;

	        nota2 = valorSaque / 2;

	        System.out.println("Notas de 100 reais: " + nota100);
	        System.out.println("Notas de 50 reais: " + nota50);
	        System.out.println("Notas de 20 reais: " + nota20);
	        System.out.println("Notas de 10 reais: " + nota10);
	        System.out.println("Notas de 5 reais: " + nota5);
	        System.out.println("Notas de 2 reais: " + nota2);
	    }
	}


