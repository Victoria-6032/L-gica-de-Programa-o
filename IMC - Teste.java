import java.util.Scanner;
public class Loucura {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        System.out.print("Digite seu peso: ");
        float peso = en.nextFloat();
        System.out.println(peso + "Kg");
        System.out.print("Digite sua altura: ");
        float altura = en.nextFloat();
        System.out.println(altura + "m");

        float imc = peso/(altura * altura);
        if( imc < 20) {
            System.out.println("Abaixo do peso");
        }else if (imc >= 20 && imc <= 25 ){
            System.out.println("Normal");
        }else if (imc >= 25 && imc <= 30 ){
            System.out.println("Execesso de peso");
        }else if (imc >=30 && imc <= 35){
            System.out.println("Obesidade");
        }else{
            System.out.println("Obesidade mórbida");
        }

    }

}
