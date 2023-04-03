package lista_exercicios2;
import java.util.Scanner;
public class EP13 {

	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Digite a hora de início do jogo:");
	        int horaInicio = sc.nextInt();
	        int minutoInicio = sc.nextInt();

	        System.out.println("Digite a hora de término do jogo:");
	        int horaTermino = sc.nextInt();
	        int minutoTermino = sc.nextInt();

	        int duracaoHoras, duracaoMinutos;

	        if (horaInicio < horaTermino) {
	            duracaoHoras = horaTermino - horaInicio;
	        } else if (horaInicio > horaTermino) {
	            duracaoHoras = 24 - horaInicio + horaTermino;
	        } else {
	            duracaoHoras = 24;
	        }

	        if (minutoInicio < minutoTermino) {
	            duracaoMinutos = minutoTermino - minutoInicio;
	        } else {
	            duracaoMinutos = 60 - minutoInicio + minutoTermino;
	            duracaoHoras--;
	        }

	        System.out.printf("Duração do jogo: %d horas e %d minutos%n", duracaoHoras, duracaoMinutos);

	        sc.close();
	    }
	}


