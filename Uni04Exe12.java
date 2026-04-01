/*
__Enunciado:
Dados 3 valores lado1, lado2, lado3, que representam os 
comprimentos dos lados de um triângulo, descreva um algoritmo 
que verifique se os mesmos podem ser os comprimentos dos lados 
de um triângulo. Em caso afirmativo, verifique e informe se é 
"triângulo equilátero", "triângulo isósceles" ou "triângulo escaleno". 
Em caso negativo, informe que os mesmos não formam um triângulo. Considere que:

o comprimento de cada lado de um triângulo é menor que a 
soma dos comprimentos dos outros lados
um triângulo equilátero tem três lados iguais
um triângulo isóscele tem dois lados iguais e um diferente
um triângulo escaleno tem três lados diferentes

__Análise: OK

//___Gordura:
descreva um algoritmo que

//___Entradas:
ler(nr_lado_1)
ler(nr_lado_2)
ler(nr_lado_3)

//___Processos:

se ((nr_lado_1 < (nr_lado_2 + nr_lado_3)) &&
(nr_lado_2 < (nr_lado_1 + nr_lado_3)) &&
(nr_lado_3 < (nr_lado_1 + nr_lado_2))) {
    se ((nr_lado_1 == nr_lado_2) && (nr_lado_2 == nr_lado_3)) {
        imprimir("É equilatero");
    } se não se (((nr_lado_1 == nr_lado_2)) || ((nr_lado_2 == nr_lado_3)) || ((nr_lado_1 == nr_lado_3))) {
        imprimir("É isóceles");
    } se não {
        imprimir("É escaleno");
    }
} se não {
    imprimir("Não formam um triângulo");
}

//___Saídas:
imprimir("É equilatero")
OU   
imprimir("É isóceles")
OU 
imprimir("É escaleno")
OU
imprimir("Não formam um triângulo")

*/
import java.util.Scanner;

public class Uni04Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Entradas e Variáveis:
        boolean triangulo;
        System.out.println("Insira o primeiro lado");
        int nr_lado_1 = sc.nextInt();

        System.out.println("Insira o segundo lado");
        int nr_lado_2 = sc.nextInt();

        System.out.println("Insira o terceiro lado");
        int nr_lado_3 = sc.nextInt();
        // Processos:
        if ((nr_lado_1 < (nr_lado_2 + nr_lado_3)) &&
        (nr_lado_2 < (nr_lado_1 + nr_lado_3)) &&
        (nr_lado_3 < (nr_lado_1 + nr_lado_2))) {
            triangulo = true;
        } else {
            // Saídas:
            System.out.println("Não formam um triângulo");
            triangulo = false;
        }
        if (triangulo == true) {
            if ((nr_lado_1 == nr_lado_2) && (nr_lado_2 == nr_lado_3)) {
                // Saídas:
                System.out.println("É equilatero");
            } else {
                if (((nr_lado_1 == nr_lado_2)) || ((nr_lado_2 == nr_lado_3)) || ((nr_lado_1 == nr_lado_3))) {
                    // Saídas:
                    System.out.println("É isóceles");
                } else {
                    // Saídas:
                    System.out.println("É escaleno");
                }
            }
        sc.close();
        }
    
    }
}
/* Valores de Testes:
 * _ Caso 1 ___
 * nr_lado_1 = 5
 * nr_lado_2 = 5
 * nr_lado_3 = 5
 * É equilatero
 *
 * _ Caso 2 ___
 * nr_lado_1 = 5
 * nr_lado_2 = 5
 * nr_lado_3 = 3
 * É isóceles
 *
 * _ Caso 3 ___
 * nr_lado_1 = 4
 * nr_lado_2 = 5
 * nr_lado_3 = 6
 * É escaleno
 *
 * _ Caso 4 ___
 * nr_lado_1 = 1
 * nr_lado_2 = 2
 * nr_lado_3 = 3
 * Não formam um triângulo
 */