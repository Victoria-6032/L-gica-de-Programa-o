import java.util.Scanner;
public class Idade{
public static void main(String[] args){

    Scanner  ei = new Scanner(System.in);

    /*Entrar com o ano de nascimento de uma pessoa e o ano atual. Imprimir a idade da
pessoa. Não se esqueça de verificar se o ano de nascimento é um ano válido. */

    System.out.print("Digite o seu ano de nascimento: ");
    int ano = ei.nextInt();
    System.out.println("Ano Nasc: " + ano);

    if( ano <= 3000 && ano >= 1000 ){
        System.out.println("Ano Válido");
    }else{
        System.out.println("Este número não é válido");
    }

    System.out.print("Entre com o ano atual: ");
    int atual = ei.nextInt();
    System.out.println("Ano Atual: " + atual );


    System.out.println("Sua idade é");
    int idade= atual - ano ;
    System.out.println("Idade: " + idade);

    if (idade >= 10) {
        System.out.println("Você é nova!");
    }else{
        System.out.println("Você é Velha! Uma pena. kkkkkkkk");
         }
    }
}
