/*
__Enunciado:
Dados dois valores inteiros, escreva um algoritmo 
que informe se eles são múltiplos ou não.

__Análise: OK

//___Gordura:
escreva um algoritmo que

//___Entradas:
ler(nr_primeiro)
ler(nr_segundo)

//___Processos:
se ((nr_primeiro % nr_segundo == 0) || (nr_segundo % nr_primeiro == 0)) {
    imprimir("Os valores são múltiplos");
} se não {
    imprimir("Os valores não são múltiplos");
}

//___Saídas:
imprimir("Os valores são múltiplos")
OU
imprimir("Os valores não são múltiplos")

*/
import java.util.Scanner;

public class Uni04Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Entradas e Variáveis:
        System.out.println("Insira o primeiro valor inteiro:");
        int nr_primeiro = sc.nextInt();

        System.out.println("Insira o segundo valor inteiro:");
        int nr_segundo = sc.nextInt();

        // Processos:
        if ((nr_primeiro % nr_segundo == 0) || (nr_segundo % nr_primeiro == 0)) {
            // Saídas:
            System.out.println("Os valores são múltiplos");
        } else {
            // Saídas:
            System.out.println("Os valores não são múltiplos");
        }
        sc.close();
    }
}
/*
 * __ Valores de Testes:
 * _ Caso 1 ___
 * nr_primeiro = 10
 * nr_segundo = 5
 * Os valores são múltiplos
 *
 * _ Caso 2 ___
 * nr_primeiro = 7
 * nr_segundo = 3
 * Os valores não são múltiplos
 *
 * _ Caso 3 ___
 * nr_primeiro = 15
 * nr_segundo = 5
 * Os valores são múltiplos
 */
