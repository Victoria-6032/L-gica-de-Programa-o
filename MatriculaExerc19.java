package APS;
import java.util.Scanner;
public class MatriculaExerc19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//19)Faça um algoritmo que seja uma calculadora.
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o número da tabuada: ");
        int nu = sc.nextInt();
        int n =1;
        while(n<=10){
            int tabu = nu * n;
            System.out.println(nu + "x"+ n + ": " + tabu);
            n = n+1;
        }
    }

	}


