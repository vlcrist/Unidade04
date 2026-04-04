/*
__Enunciado:
Dado um valor inteiro maior do que 0 
informe se o valor é par ou ímpar.

__Análise: OK

//___Gordura:

*null*

//___Entradas:

ler(nr_inteiro)


//___Processos:

se (nr_inteiro % 2 == 0) então
    imprimir("O número é par")
senão
    imprimir("O número é impar")


//___Saídas: 

imprimir("O número é par") 
ou
imprimir("O número é impar")

*/

import java.util.Scanner;
public class Uni04Exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Variáveis e Entradas:
        System.err.println("Escreva um valor inteiro maior que 0:");
        int nr_inteiro = sc.nextInt();
        
        // Processos:
        if (nr_inteiro %2 == 0) {
            // Saídas:
            System.out.println("O número é par");
        } else {
            // Saídas:
            System.out.println("O número é impar");
        }
        
        sc.close();
    }
}
/*
 * __ Valores de Testes:
 * _ Caso 1 ___
 * nr_inteiro = 200
 * imprimir("O número é par")
 * _ Caso 2 ___
 * nr_inteiro = 999
 * imprimir("O número é impar")
 */