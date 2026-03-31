import java.util.Scanner;

public class Uni04Exe24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem Vindo ao programa de escolha de ordenação de números");

        System.out.println("Insira o primeiro valor:");
        int nr_valor1 = sc.nextInt();

        System.out.println("Insira o segundo valor:");
        int nr_valor2 = sc.nextInt();

        System.out.println("Insira o terceiro valor:");
        int nr_valor3 = sc.nextInt();
        
        System.out.println("Insira um número para ordenação: \nOpção 1: Valores em ordem crescente \nOpção 2: Valores em ordem decrescente \nOpção 3: Valor maior no meio");
        int nr_escolha = sc.nextInt();

        int nr_maior;
        int nr_meio;
        int nr_menor;

        if (nr_valor1 > nr_valor2 && nr_valor1 > nr_valor3) {
            nr_maior = nr_valor1;
            if (nr_valor2 > nr_valor3) {
                nr_meio = nr_valor2;
                nr_menor = nr_valor3;
            } else {
                nr_meio = nr_valor3;
                nr_menor = nr_valor2;
            }

        } else if (nr_valor2 > nr_valor1 && nr_valor2 > nr_valor3) {
            nr_maior = nr_valor2;
            if (nr_valor1 > nr_valor3) {
                nr_meio = nr_valor1;
                nr_menor = nr_valor3;
            } else {
                nr_meio = nr_valor3;
                nr_menor = nr_valor1;
            }
        } else {
            nr_maior = nr_valor3;
            if (nr_valor2 > nr_valor1) {
                nr_meio = nr_valor2;
                nr_menor = nr_valor1;
            } else {
                nr_meio = nr_valor1;
                nr_menor = nr_valor2;
            }
        }

        switch (nr_escolha) {
        case 1:
            System.out.println(nr_maior + " " + nr_meio + " " + nr_menor);    
            break;
    
        case 2:
            System.out.println(nr_menor + " " + nr_meio + " " + nr_maior);
            break;
        
        case 3:
            System.out.println(nr_meio + " " + nr_maior + " " + nr_menor);
            break;
        
        default:
        
        }
        sc.close();
    }
}
