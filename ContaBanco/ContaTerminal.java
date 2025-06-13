package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int number;
        String agency;
        String name;
        double balance;

        System.out.println("Por favor, digite o numero da agência:");
        agency = scan.next();

        System.out.println("Digite o numero da conta:");
        number = scan.nextInt();

        System.out.println("Digite o nome e sobrenome do cliente:");
        name = scan.next();
        name += " " + scan.next();

        System.out.println("Digite o saldo:");
        balance = scan.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", name, agency, number, balance);        
    }
}
