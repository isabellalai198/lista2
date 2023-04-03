package lista_exercicios2;
import java.util.Scanner;
public class EP6 {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Informe o sexo (M ou F): ");
	        String sexo = scanner.nextLine();
	        System.out.print("Informe a altura (em cm): ");
	        double altura = scanner.nextDouble();
	        double pesoIdeal = 0.0;

	        if (sexo.equals("M")) {
	            pesoIdeal = 52.0 + (0.75 * (altura - 152.4));
	        } else if (sexo.equals("F")) {
	            pesoIdeal = 52.0 + (0.67 * (altura - 152.4));
	        } else {
	            System.out.println("Sexo inválido!");
	            return;
	        }

	        System.out.println("O peso ideal para uma pessoa do sexo " + sexo + " com altura de " + altura + " cm é " + pesoIdeal + " kg.");
	    }
	}


