package APS;
import java.util.Scanner;
public class MatriculaExerc33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Faça um diagrama para resolver o seguinte: Uma editora precisa saber qual a previsão de média
		de lucros que terá com os lançamentos de cada um dos livros no próximo mês. Para tanto deve
		ser informado ao algoritmo o custo de uma página editada e, a partir daí, o nome do livro, quantas
		páginas ele possui, qual a previsão de venda em quantidade de livros e qual o preço de venda do
		livro. A partir daí para cada livro, calcule qual será o lucro com cada livro.*/
		
		
		Scanner sc= new Scanner(System.in);
		
		int custopag = 0, numpag, vendas, preco;
		int n= 0;
		double custoP;
		
		while(true) {
			System.out.println("Digite o nome do livro: ");
			String nome = sc.next();
			if(nome.equalsIgnoreCase("fim")) {
				break;
			}
			System.out.println("Informe quantas páginas " + nome + "  possui: " );
			numpag = sc.nextInt();
			
			System.out.println("Informe a previsão de vendas de: " + nome);
			vendas= sc.nextInt();
			System.out.println("Informe o valor do custo com páginas editadas: ");
			double custoPE= sc.nextDouble();
			
			custoP= numpag * custoPE;
			double lucro = (vendas - custoP) * vendas;
			
			System.out.println("o lucro de " + nome + " é: "+ lucro +" R$");
			
			
		}
		}

}
