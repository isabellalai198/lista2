package lista_exercicios2;
import java.util.Scanner;
public class EP11 {

	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Digite o valor do lado X:");
	        double x = sc.nextDouble();

	        System.out.println("Digite o valor do lado Y:");
	        double y = sc.nextDouble();

	        System.out.println("Digite o valor do lado Z:");
	        double z = sc.nextDouble();

	        if (x < y + z && y < x + z && z < x + y) {
	            if (x == y && y == z) {
	                System.out.println("Triângulo equilátero");
	            } else if (x == y || y == z || x == z) {
	                System.out.println("Triângulo isósceles");
	            } else {
	                System.out.println("Triângulo escaleno");
	            }
	        } else {
	            System.out.println("Não é um triângulo");
	        }

	        sc.close();
	    }

	}


