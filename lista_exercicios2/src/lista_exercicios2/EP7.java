package lista_exercicios2;
import java.util.Scanner;
public class EP7 {

	

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite a primeira nota: ");
	        double nota1 = input.nextDouble();

	        System.out.print("Digite a segunda nota: ");
	        double nota2 = input.nextDouble();

	        System.out.print("Digite a terceira nota: ");
	        double nota3 = input.nextDouble();

	        double maiorNota = nota1;
	        if (nota2 > maiorNota) {
	            maiorNota = nota2;
	        }
	        if (nota3 > maiorNota) {
	            maiorNota = nota3;
	        }

	        double mediaPonderada = (maiorNota * 4 + (nota1 + nota2 + nota3 - maiorNota) * 2) / 6;

	        System.out.printf("Notas: %.1f, %.1f, %.1f\n", nota1, nota2, nota3);
	        System.out.printf("Média ponderada: %.1f\n", mediaPonderada);

	        if (mediaPonderada >= 50) {
	            System.out.println("APROVADO");
	        } else if (mediaPonderada >= 45) {
	            System.out.println("RECUPERAÇÃO");
	        } else {
	            System.out.println("REPROVADO");
	        }

	        input.close();
	    }

	}


