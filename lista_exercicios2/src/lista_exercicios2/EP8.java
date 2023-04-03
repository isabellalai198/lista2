package lista_exercicios2;
import java.util.Scanner;
public class EP8 {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        // Receber salário base via teclado
	        System.out.print("Digite o salário base: ");
	        double salarioBase = sc.nextDouble();
	        
	        // Receber gratificação via teclado
	        System.out.print("Digite a gratificação: ");
	        double gratificacao = sc.nextDouble();
	        
	        // Calcular salário bruto
	        double salarioBruto = salarioBase + gratificacao;
	        
	        // Calcular imposto
	        double imposto;
	        if (salarioBruto < 2500.00) {
	            imposto = salarioBruto * 0.1;
	        } else {
	            imposto = salarioBruto * 0.15;
	        }
	        
	        // Calcular salário líquido
	        double salarioLiquido = salarioBruto - imposto;
	        
	        // Exibir resultados
	        System.out.println("Salário bruto: R$" + salarioBruto);
	        System.out.println("Gratificação: R$" + gratificacao);
	        System.out.println("Imposto: R$" + imposto);
	        System.out.println("Salário líquido: R$" + salarioLiquido);
	        
	        sc.close();
	    }
	}


