/*
__Enunciado:

Dado um caractere indicando uma opção, escreva um algoritmo para:
se opção = ‘T’: calcular a área de um triângulo de base b e altura h
se opção = ‘Q’: calcular a área de um quadrado de lado l
se opção = ‘R’: calcular a área de um retângulo de base b e altura h
se opção = ‘C’: calcular a área de um círculo de raio r

__Análise: OK

//___Gordura:

escreva um algoritmo para

//___Entradas:

ler(ds_opcao)

//___Processos:

caso (ds_opcao == 'T') então calcular área do triângulo
caso (ds_opcao == 'Q') então calcular área do quadrado
caso (ds_opcao == 'R') então calcular área do retângulo
caso (ds_opcao == 'C') então calcular área do círculo

//___Saídas:

imprimir(área)

*/

import java.util.Scanner;

public class Uni04Exe26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variáveis e Entradas:
        System.out.println("Insira uma opção (T, Q, R ou C) para calcular a área de uma figura geométrica:\r\n" + 
                        "T - Triângulo\r\n" + 
                        "Q - Quadrado\r\n" + 
                        "R - Retângulo\r\n" + 
                        "C - Círculo");
        char ds_opcao = sc.next().toUpperCase().charAt(0);

        double vl_base, vl_altura, vl_lado, vl_raio;

        // Processos E Saídas:
        switch (ds_opcao) {
        case 'T':
            vl_base = sc.nextDouble();
            vl_altura = sc.nextDouble();
            System.out.printf("%.2f", (vl_base * vl_altura) / 2);
            break;
        case 'Q':
            vl_lado = sc.nextDouble();
            System.out.printf("%.2f", vl_lado * vl_lado);
            break;
        case 'R':
            vl_base = sc.nextDouble();
            vl_altura = sc.nextDouble();
            System.out.printf("%.2f", vl_base * vl_altura);
            break;
        case 'C':
            vl_raio = sc.nextDouble();
            System.out.printf("%.2f", Math.PI * Math.pow(vl_raio, 2));
            break;
        default:
            System.out.println("Opção inválida.");
        }

        sc.close();
    }
}

/*
Valores de teste:
__ Caso 01 ___
ds_opcao = T
vl_base = 5
vl_altura = 2
imprimir("5.00")

__ Caso 02 ___
ds_opcao = C
vl_raio = 3
imprimir("28.27")

__ Caso 03 ___
ds_opcao = Q
vl_lado = 8
imprimir("64.00")
*/