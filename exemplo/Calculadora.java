import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        double num1 = sc.nextDouble();
     
        System.out.println("Digite o segundo valor");
        double num2 = sc.nextDouble();
    
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double divisao = num1 / num2;
        double multiplicacao = num1 * num2;
       
        System.out.println("O resultado da soma dos valores e: " + soma);

        System.out.println("O resultado da subtracao dos valores e: " + subtracao);

        System.out.println("O resultado da divisao dos valores e: " + divisao);

        System.out.println("O resultado da multiplicacao dos valores e: " + multiplicacao);
    
        sc.close();
    }
    }