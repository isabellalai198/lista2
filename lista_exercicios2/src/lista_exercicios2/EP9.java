package lista_exercicios2;
import java.util.Scanner;
public class EP9 {

	

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Digite o salário do funcionário: R$ ");
	        double salario = input.nextDouble();

	        double novoSalario;
	        if (salario <= 2000) {
	            novoSalario = salario * 1.1;
	        } else if (salario <= 3000) {
	            novoSalario = salario * 1.08;
	        } else {
	            novoSalario = salario * 1.05;
	        }

	        double auxilioEscola;
	        if (salario <= 2500) {
	            auxilioEscola = 350;
	        } else {
	            auxilioEscola = 300;
	        }

	        double salarioTotal = novoSalario + auxilioEscola;

	        System.out.printf("O novo salário do funcionário é R$ %.2f, com uma bonificação de %.2f%% e um auxílio escola de R$ %.2f.", salarioTotal, (salarioTotal / salario - 1) * 100, auxilioEscola);
	    }
	}


