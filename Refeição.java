import java.util.Map;
import java.util.Scanner;

public class Refeicao {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Bem - vindo ao nosso cardápio!!");

        System.out.println(" Menu dos pratos:");

        System.out.println(" N01 - vegetariano;\n N02 - Peixe;\n N03 - Frango;\n N04 - Carne\n");

        System.out.print("Escolha:");

        int prato = e.nextInt();
        if (prato == 1) {
            System.out.println("Pizza");
            prato = 180;
        } else if (prato == 2) {
            System.out.println(" Peixe");
            prato = 230;
        } else if (prato == 3) {
            System.out.println("Frango");
            prato = 250;
        } else if (prato == 4) {
            System.out.println("Carne");
            prato = 350;
        }
        System.out.println("Menu de Sobremesa:");

        System.out.println(" N01 - Abacaxi; \n N02 - Sorvete diet; \n N03 - Mousse diet; \n N04 - Mousse de Chocolate. \n");
        System.out.print("Escolha: ");

        int sobremesa = e.nextInt();
        if (sobremesa == 1) {
            System.out.println("Abacaxi");
            sobremesa = 75;
        } else if (sobremesa == 2) {
            System.out.println("Bolo de Morango");
            sobremesa = 70;
        } else if (sobremesa == 3) {
            System.out.println("Mousse diet");
            sobremesa = 170;
        } else if (sobremesa == 4) {
            System.out.println("Mousse de Chocolate");
            sobremesa = 200;
        }
        System.out.println("Menu Bebidas:");
        System.out.println(" N01 - Refrigerante; \n N02 - Suco; \n N03 - Chá; \n N04 - Café.\n ");
        System.out.print("Escolha sua bebida: ");
        int bebidas = e.nextInt();
        if (bebidas == 1) {
            System.out.println("Refrigerante");
            bebidas = 20;
        } else if (bebidas == 2) {
            System.out.println("Suco");
            bebidas = 70;
        } else if (bebidas == 3) {
            System.out.println("Chá");
            bebidas = 100;
        } else if (bebidas == 4) {
            System.out.println("Café");
            bebidas = 65;
        }
        System.out.println("O total de calorias a ser consomida é: ");
        int cal = (prato + sobremesa + bebidas);
        System.out.println(cal + "calorias");

    }
}
