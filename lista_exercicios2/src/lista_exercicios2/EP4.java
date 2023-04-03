package lista_exercicios2;
import java.util.Scanner;
public class EP4 {

	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite um valor entre 1 e 30: ");
	        int valor = sc.nextInt();

	        if (valor >= 1 && valor <= 30) {
	            System.out.println("O valor " + valor + " está dentro da faixa.");
	        } else {
	            System.out.println("O valor " + valor + " está fora da faixa.");
	        }
	    }
	}


