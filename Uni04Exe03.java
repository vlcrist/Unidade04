
/*
__Enunciado:
Dados dois números inteiros descreva um 
algoritmo para informar o maior valor entre eles.

__Análise: OK

//___Gordura:
descreva um algoritmo para

//___Entradas:

ler(nr_primeiro)
ler(nr_segundo)

//___Processos:
 se (nr_primeiro > nr_segundo) {
    imprimir("O valor " + nr_primeiro + " é maior que o valor " + nr_segundo);
} se não {
    imprimir("O valor " + nr_segundo + " é maior que o valor " + nr_primeiro);
}

//___Saídas:
imprimir("O valor " + nr_primeiro + " é maior que o valor " + nr_segundo);
OU
imprimir("O valor " + nr_segundo + " é maior que o valor " + nr_primeiro);
*/
import java.util.Scanner;

public class Uni04Exe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variáveis e Entradas:
        System.out.println("Insira o primeiro valor:");
        int nr_primeiro = sc.nextInt();
        System.out.println("Insira o segundo valor:");
        int nr_segundo = sc.nextInt();
        // Processos:
        if (nr_primeiro > nr_segundo) {
            // Saídas:
            System.out.println("O valor " + nr_primeiro + " é maior que o valor " + nr_segundo);
        } else {
            // Saídas:
            System.out.println("O valor " + nr_segundo + " é maior que o valor " + nr_primeiro);
        }
        sc.close();
    }
}
/*
 * __ Valores de Testes:
 * _ Caso 1 ___
 * nr_primeiro = 100
 * nr_segundo = 50
 * imprimir("O valor 100 é maior que o valor 50");
 * _ Caso 2 ___
 * nr_primeiro = 25
 * nr_segundo = 75
 * imprimir("O valor 75 é maior que o valor 25");
 */