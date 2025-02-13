import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*1- Crie um algoritmo que verifica se um número é positivo e par.
        2- Faça um algoritmo que verifique se um número está entre 10 e 20.
        3- Faca um algoritmo que verifique se uma pessoa pode dirigir. Para isso a pessoa precisa ter habilitação e ser maior de idade.
        4- Escreva um algoritmo que defina se uma pessoa é elegível para desconto: Para receber o desconto, a pessoa precisa ser estudante ou ter idade superior a 60 anos
        5- Crie um programa que verifica se uma pessoa pode entrar em um clube. A pessoa deve ter 18 anos ou mais e não pode estar vestindo chinelos. Se ambas as condições forem verdadeiras, imprima "Pode entrar", caso contrário, imprima "Não pode entrar"*/

        
        System.out.println("Digite um numero:");
        double numero1 = scanner.nextInt();

        if(numero1>0 && numero1%2==0){
            System.out.println("Esse numero é positivo e é par");
        }
        else if (numero1%2==0) {
            System.out.println("Esse numero é par, mas é negativo");
            
        }else if (numero1>0) {
            System.out.println("Esse numero é positivo");
            
        }
        else{
            System.out.println("Esse numero nao é par ou positivo");
        }

        
        //2
        System.out.println("Digite um numero:");
        double numero2 = scanner.nextDouble();

        if(numero2 >= 10 && numero2 <=20){
            System.out.println("Esse numero esta entre 10 e 20");
        }
        else{
            System.out.println("Esse numero nao esta entre 10 e 20");
        } 

        //3
        
        System.out.println("Qual a sua idade?");
        int idade = scanner.nextInt();

        System.out.println("Voce tem habilitacao?");
        boolean habilitacao = scanner.nextBoolean();

        if(idade>=18 && habilitacao){
            System.out.println("Voce e maior de 18 anos e tem carteira para dirigir");
        }
        else if(!habilitacao){
            System.out.println("Voce nao tem a idade permitida e nao pode ter habilitacao");

        }
        else{
            System.out.println("Voce nao tem a idade permitida para dirigir");
        }


        //4
        
        System.out.println("Qual a sua idade?");
        int idade2 = scanner.nextInt();
        
        
        System.out.println("Qual a sua profissão?");
        String profissao = scanner.nextLine();
        
        if (idade2 >= 60 || profissao.equalsIgnoreCase("estudante")) { 
            System.out.println("Você está apto para o desconto!");
        } 
        else {
            System.out.println("Você NÃO está apto para o desconto.");
        }        

        System.out.println("Qual a sua idade?");
        int idade3 = scanner.nextInt();

        System.out.println("Voce esta de chinelo?");
        Boolean chinelo = scanner.nextBoolean();

        if (idade3 >= 18 && !chinelo) {
            System.out.println("parabens, voce pode entrar");
            
        }
        else{
            System.out.println("Voce nao atende os requisitos, nao vai entrar");
        }

        } 
}   