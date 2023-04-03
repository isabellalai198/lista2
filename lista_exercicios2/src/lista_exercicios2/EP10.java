package lista_exercicios2;
import java.util.Scanner;
public class EP10 {

	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o seu peso em quilogramas: ");
	        double peso = scanner.nextDouble();

	        System.out.print("Digite a sua altura em metros: ");
	        double altura = scanner.nextDouble();

	        double imc = peso / (altura * altura);

	        String classificacao;

	        if (imc <= 16) {
	            classificacao = "Magreza Severa";
	        } else if (imc <= 17) {
	            classificacao = "Magreza Moderada";
	        } else if (imc <= 18.5) {
	            classificacao = "Magreza Leve";
	        } else if (imc <= 25) {
	            classificacao = "Normal";
	        } else if (imc <= 30) {
	            classificacao = "Obesidade Leve";
	        } else if (imc <= 40) {
	            classificacao = "Obesidade Severa";
	        } else {
	            classificacao = "Obesidade Mórbida";
	        }

	        System.out.printf("Seu IMC é %.2f, e sua classificação é %s.", imc, classificacao);

	        scanner.close();
	    }
	}


