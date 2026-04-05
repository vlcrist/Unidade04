/*
__Enunciado:

Dados 3 valores, escreva um algoritmo que os informe em 
uma determinada ordem a partir de um menu de opções:

se opção = 1, escreva os 3 valores em ordem crescente
se opção = 2, escreva os 3 valores em ordem decrescente
se opção = 3, escreva os 3 valores de forma que o maior 
valor fique no meio

__Análise: OK

//___Gordura:

escreva um algoritmo que

//___Entradas:

ler(nr_valor1, nr_valor2, nr_valor3, nr_escolha)

//___Processos:

definir maior, meio e menor

caso (nr_escolha == 1) então crescente
caso (nr_escolha == 2) então decrescente
caso (nr_escolha == 3) então maior no meio

//___Saídas:

imprimir(valores ordenados)

*/

import java.util.Scanner;

public class Uni04Exe24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira 3 valores inteiros e uma escolha (1, 2 ou 3): \r\n1 - Os 3 valores em ordem crescente\r\n" + 
                        "2 - Os 3 valores em ordem decrescente\r\n" +
                        "3 - Os 3 valores com o maior no meio");
        // Variáveis e Entradas:
        int nr_valor1 = sc.nextInt();
        int nr_valor2 = sc.nextInt();
        int nr_valor3 = sc.nextInt();
        int nr_escolha = sc.nextInt();

        int nr_maior, nr_meio, nr_menor;

        // Processos:
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

        // Processos E Saídas:
        switch (nr_escolha) {
        case 1:
            System.out.println(nr_menor + " " + nr_meio + " " + nr_maior);
            break;
        case 2:
            System.out.println(nr_maior + " " + nr_meio + " " + nr_menor);
            break;
        case 3:
            System.out.println(nr_meio + " " + nr_maior + " " + nr_menor);
            break;
        }

        sc.close();
    }
}

/*
Valores de teste:
__ Caso 01 ___
nr_valor1 = 5
nr_valor2 = 3
nr_valor3 = 2
nr_escolha = 1
imprimir("2 3 5")

__ Caso 02 ___
nr_valor1 = 5
nr_valor2 = 3
nr_valor3 = 2
nr_escolha = 2
imprimir("5 3 2")

__ Caso 03 ___
nr_valor1 = 5
nr_valor2 = 3
nr_valor3 = 2
nr_escolha = 3
imprimir("3 5 2")
*/