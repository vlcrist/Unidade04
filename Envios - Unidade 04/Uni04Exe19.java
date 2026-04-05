/*
__Enunciado:

Dadas as coordenadas (X e Y) de um Ponto, 
você deve informar em qual quadrante ele está localizado
0, se os dois valores forem zero
1, se os dois valores forem positivos
2, se o x for negativo e o y, positivo 3, se os dois valores forem negativos
4, se o x for positivo e o y, negativo

__Análise: OK

//___Gordura:
*null*

//___Entradas:

ler(vl_x)
ler(vl_y)

//___Processos:

se (vl_x == 0 && vl_y == 0) então
    imprimir("Quadrante 0")
senão se (vl_x > 0 && vl_y > 0) então
    imprimir("Quadrante 1")
senão se (vl_x < 0 && vl_y > 0) então
    imprimir("Quadrante 2")
senão se (vl_x < 0 && vl_y < 0) então
    imprimir("Quadrante 3")
senão se (vl_x > 0 && vl_y < 0) então
    imprimir("Quadrante 4")

//___Saídas:
imprimir("Quadrante 0")
OU
imprimir("Quadrante 1")
OU
imprimir("Quadrante 2")
OU
imprimir("Quadrante 3")
OU
imprimir("Quadrante 4")
*/
import java.util.Scanner;

public class Uni04Exe19 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Variáveis e Entradas:
        System.out.println("Insira o valor de x:");
        int vl_x = sc.nextInt();

        System.out.println("Insira o valor de y:");
        int vl_y = sc.nextInt();
        
        // Processos e Saídas:
        if (vl_x == 0 && vl_y == 0) {
            System.out.println("Quadrante 0");
        } else if (vl_x > 0 && vl_y > 0) {
             System.out.println("Quadrante 1");
        } else if ( vl_x < 0 && vl_y > 0) {
             System.out.println("Quadrante 2");
        } else if (vl_x < 0 && vl_y < 0) {
            System.out.println("Quadrante 3");
        } else if (vl_x > 0 && vl_y < 0) {
            System.out.println("Quadrante 4");
        } else {}
        
        sc.close();

    }
              
}
/*
Valores de teste:
__ Caso 01 ____
vl_x = 0
vl_y = 0
imprime: Quadrante 0
__ Caso 02 ____
vl_x = 5
vl_y = 5
imprime: Quadrante 1
__ Caso 03 ____
vl_x = -5
vl_y = 5
imprime: Quadrante 2
__ Caso 04 ____
vl_x = -5
vl_y = -5
imprime: Quadrante 3
__ Caso 05 ____
vl_x = 5
vl_y = -5
imprime: Quadrante 4
*/        
