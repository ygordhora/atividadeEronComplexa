


import java.util.Scanner;


public class Atv{
 
 public static void main(String args[]){


     

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um numero para somar");

    int n1 = sc.nextInt();

    System.out.println("Digite um segundo numero para somar");

    int n2 = sc.nextInt();

    int soma = n1+n2 ;

    System.out.println("O resultado da suma é " + soma);


    System.out.println("Escolha 1 numero para subitrair da soma anterior");
    int nsubtracao = sc.nextInt();

    int resultado = soma - nsubtracao;

    System.out.println("O resultado é " + resultado);


 }

}