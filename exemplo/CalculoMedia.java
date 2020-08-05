import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class CalculoMedia{
    public static void main(String[] args){

        double num1;
        double num2;
        double num3;
        double num4;
        double total;
        int variaveis;
        double media;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        num1 = sc.nextDouble();
     
        System.out.println("Digite o segundo valor");
        num2 = sc.nextDouble();

        System.out.println("Digite o terceiro valor");
        num3 = sc.nextDouble();

        System.out.println("Digite o quarto valor");
        num4 = sc.nextDouble();

        variaveis = 4;
        total = num1 + num2 + num3 + num4;
        media = total / variaveis;

        System.out.println("A media aritimetica dos numeros informados e: " + media);

        sc.close();
    
    }
}



