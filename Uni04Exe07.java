/*
__Enunciado:

O custo do selo de uma carta com até 50 gramas é de R$ 0,45. 
As cartas com peso superior pagam um adicional de R$ 0,45
por cada 20 gramas, ou fração, em que excedem aquele peso. 
Escreva um algoritmo que dado o peso da carta, em gramas, 
determine o custo do selo.

__Análise: OK

//___Gordura:
Escreva um algoritmo que

//___Entradas:
ler(vl_peso)

//___Processos:

se (vl_peso <= 50) {
    valorPagar = 0.45;
} se não {
    vl_peso_excedido = vl_peso - 50;
    vl_adicional = (vl_peso_excedido / 20) + 1;
    valorPagar = 0.45f + 0.45f * vl_adicional;
}

//___Saídas:
imprimir("Custo do selo: " + valorPagar)

*/
import java.util.Scanner;

public class Uni04Exe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Entradas e Variáveis:
        System.out.println("Insira o peso da carta:");
        double vl_peso = sc.nextInt();
        double valorPagar = 0;

        // Processos:
        if (vl_peso <= 50) {
            valorPagar = 0.45;
        } else {
            double vl_peso_excedido = vl_peso - 50;
            double vl_adicional = (vl_peso_excedido / 20) + 1;
            valorPagar = 0.45f + 0.45f * vl_adicional;
        }
        // Saídas:
        System.out.println("Custo do selo: " + valorPagar);
        sc.close();
    }

}
/*
 * __ Valores de Testes:
 * _ Caso 1 ___
 * vl_peso = 30
 * Custo do selo = 0.45
 * 
 * _ Caso 2 ___
 * vl_peso = 70
 * Custo do selo = 0.9
 * 
 * _ Caso 3 ___
 * vl_peso = 90
 * Custo do selo = 1.35
 */