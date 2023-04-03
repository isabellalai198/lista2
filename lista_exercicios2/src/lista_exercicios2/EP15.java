package lista_exercicios2;
import java.util.Scanner;
public class EP15 {


	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Recebe os dois valores literais
	        System.out.print("Digite o primeiro valor: ");
	        String valor1 = input.nextLine();
	        System.out.print("Digite o segundo valor: ");
	        String valor2 = input.nextLine();

	        // Mostra os valores originais
	        System.out.println("Valores originais:");
	        System.out.println("valor1 = " + valor1);
	        System.out.println("valor2 = " + valor2);

	        // Troca os conteúdos das variáveis
	        String auxiliar = valor1;
	        valor1 = valor2;
	        valor2 = auxiliar;

	        // Mostra os novos valores das variáveis
	        System.out.println("Novos valores:");
	        System.out.println("valor1 = " + valor1);
	        System.out.println("valor2 = " + valor2);
	    }
	}


