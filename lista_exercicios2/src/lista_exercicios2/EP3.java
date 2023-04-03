package lista_exercicios2;
import java.util.Scanner;
public class EP3 {

	


	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        
	        System.out.print("Digite o nome do aluno: ");
	        String nome = entrada.nextLine();
	        
	        double[] notas = new double[4];
	        double soma = 0;
	        
	        for (int i = 0; i < 4; i++) {
	            System.out.printf("Digite a %dª nota: ", i+1);
	            notas[i] = entrada.nextDouble();
	            soma += notas[i];
	        }
	        
	        double media = soma / 4;
	        
	        String classificacao;
	        if (media <= 20) {
	            classificacao = "Péssimo";
	        } else if (media < 40) {
	            classificacao = "Ruim";
	        } else if (media < 60) {
	            classificacao = "Regular";
	        } else if (media < 80) {
	            classificacao = "Bom";
	        } else {
	            classificacao = "Ótimo";
	        }
	        
	        System.out.printf("Aluno: %s\n", nome);
	        System.out.printf("Notas: %.1f, %.1f, %.1f, %.1f\n", notas[0], notas[1], notas[2], notas[3]);
	        System.out.printf("Média: %.1f\n", media);
	        System.out.printf("Classificação: %s\n", classificacao);
	        
	        entrada.close();
	    }

	}


