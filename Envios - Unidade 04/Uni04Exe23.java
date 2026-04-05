/*
__Enunciado:

Escreva um algoritmo que leia um número inteiro positivo 
representando um determinado mês do ano e escreva o mês por extenso. 
Para valores maiores do que 12 informe que o valor não é válido.

__Análise: OK

//___Gordura:

Escreva um algoritmo que

//___Entradas:

ler(nr_mes)

//___Processos:

caso (nr_mes == 1) então escreva("Janeiro")
caso (nr_mes == 2) então escreva("Fevereiro")
...
caso (nr_mes == 12) então escreva("Dezembro")
senão escreva("Valor inválido")

//___Saídas:

imprimir(nome do mês)

*/

import java.util.Scanner;

public class Uni04Exe23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variáveis e Entradas:
        int nr_mes = sc.nextInt();

        // Processos E Saídas:
        switch (nr_mes) {
        case 1: 
            System.out.println("Janeiro"); 
            break;
        case 2: 
            System.out.println("Fevereiro");
             break;
        case 3: 
            System.out.println("Março"); 
            break;
        case 4: 
            System.out.println("Abril"); 
            break;
        case 5: 
            System.out.println("Maio"); 
            break;
        case 6: 
            System.out.println("Junho"); 
            break;
        case 7: 
            System.out.println("Julho"); 
            break;
        case 8: 
            System.out.println("Agosto"); 
            break;
        case 9: 
            System.out.println("Setembro"); 
            break;
        case 10: 
            System.out.println("Outubro");
            break;
        case 11: 
            System.out.println("Novembro"); 
            break;
        case 12: 
            System.out.println("Dezembro"); 
            break;
        default: 
            System.out.println("Valor inválido");
            break;
        }

        sc.close();
    }
}

/*
Valores de teste:
__ Caso 01 ___
nr_mes = 1
imprimir("Janeiro")

__ Caso 02 ___
nr_mes = 15
imprimir("Valor inválido")
*/