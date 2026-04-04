/*
__Enunciado:

Faça um algoritmo que escreva o menu abaixo, leia uma opção do usuário e execute a operação correspondente. 
O algoritmo deve exibir uma mensagem de erro se a opção for inválida. O menu tem as seguintes opções:
Escolha uma opção:
1 - Soma de dois números.
2 - Diferença entre dois números.
3 - Produto entre dois números.
4 - Divisão entre dois números (o denominador não pode ser zero).

__Análise: OK

//___Gordura:

Faça um algoritmo que

//___Entradas:

ler(vl_1, vl_2, nr_escolha)

//___Processos:

caso (nr_escolha == 1) então soma
caso (nr_escolha == 2) então subtração
caso (nr_escolha == 3) então multiplicação
caso (nr_escolha == 4) então divisão

//___Saídas:

imprimir(resultado)

*/

import java.util.Scanner;

public class Uni04Exe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma opção:\r\n1 - Soma de dois números.\r\n2 - Diferença entre dois números.\r\n3 - Produto entre dois números.\r\n4 - Divisão entre dois números (o denominador não pode ser zero).");
        // Variáveis e Entradas:
        int vl_1 = sc.nextInt();
        int vl_2 = sc.nextInt();
        int nr_escolha = sc.nextInt();

        int nr_resultado = 0;

        // Processos E Saídas:
        switch (nr_escolha) {
        case 1:
            nr_resultado = vl_1 + vl_2;
            System.out.println(nr_resultado);
            break;
        case 2:
            nr_resultado = vl_1 - vl_2;
            System.out.println(nr_resultado);
            break;
        case 3:
            nr_resultado = vl_1 * vl_2;
            System.out.println(nr_resultado);
            break;
        case 4:
            nr_resultado = vl_1 / vl_2;
            System.out.println(nr_resultado);
            break;
        default:
            System.out.println("Selecione um valor válido");
        }

        sc.close();
    }
}

/*
Valores de teste:
__ Caso 01 ___
vl_1 = 5
vl_2 = 3
nr_escolha = 1
imprimir("8")

__ Caso 02 ___
vl_1 = 5
vl_2 = 3
nr_escolha = 4
imprimir("1")

__ Caso 03 ___
vl_1 = 5
vl_2 = 3
nr_escolha = 3
imprimir("15")
*/