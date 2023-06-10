package APS;
import java.util.Scanner;

public class MatriculaExerc66 {
	
	public static void main(String[] args) {
		
		
		
		/*66)Os alunos de informática tiveram cinco provas: 1, 2, 3, 4 e 5. Criar um algoritmo que imprima:
		a) Nome dos que foram aprovados em todas as matérias
		b) Nome dos alunos aprovados nas matérias 1 e 4.
		c) A porcentagem dos aprovados na matéria 3.
		Considere aprovado com nota >= 7.0.*/
		
	
		     
		double nota1, nota2, nota3, nota4, nota5, por3;
        String nome;
        int n = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número de alunos: ");
        int nu = scanner.nextInt();

        for (int c = 1; c <= nu; c++) {
            System.out.print("Informe o nome do aluno: ");
            nome = scanner.next();

            System.out.print("Informe as notas (Nota1, Nota2, Nota3, Nota4, Nota5): ");
            nota1 = scanner.nextDouble();
            nota2 = scanner.nextDouble();
            nota3 = scanner.nextDouble();
            nota4 = scanner.nextDouble();
            nota5 = scanner.nextDouble();

            if (nota1 >= 7 && nota2 >= 7 && nota3 >= 7 && nota4 >= 7 && nota5 >= 7) {
                System.out.println(nome + " aprovado em todas as matérias!");
            } if (nota1 >= 7 && nota4 >= 7) {
                System.out.println(nome + " aprovado nas matérias 1 e 4!");
            }
           
            else if (nota3 >= 7) {
                n++;
            }
        }

        por3 = (n * 100.0) / nu;
        System.out.println("A porcentagem dos alunos aprovados na matéria 3 é: " + por3 + "%");
    }
}
