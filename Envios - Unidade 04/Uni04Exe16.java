/*
__Enunciado:
Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres 
(considere que a idade entre homens e mulheres sempre serão diferentes). 
Calcule e escreva a soma das idades do homem mais velho com a mulher mais 
nova, e o produto das idades do homem mais novo com a mulher mais velha.

__Análise: OK

//___Gordura:
Escreva um algoritmo que

//___Entradas:

ler(idade_homem_1)
ler(idade_homem_2)
ler(idade_mulher_1)
ler(idade_mulher_2)


//___Processos:

se (idade_homem_1 > idade_homem_2) e (idade_mulher_1 > idade_mulher_2) então
    vl_soma = idade_homem_1 + idade_mulher_2
    vl_produto = idade_homem_2 * idade_mulher_1
senão se (idade_homem_1 < idade_homem_2) e (idade_mulher_1 > idade_mulher_2) então
    vl_soma = idade_homem_2 + idade_mulher_2
    vl_produto = idade_homem_1 * idade_mulher_1
senão
    vl_soma = idade_homem_2 + idade_mulher_1
    vl_produto = idade_homem_1 * idade_mulher_2


//___Saídas:
imprimir("Soma: " + vl_soma + " Produto: " + vl_produto)

*/
import java.util.Scanner;

public class Uni04Exe16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Variáveis e Entradas:
        int vl_soma;
        int vl_produto;

        System.out.println("Escreva a idade dos dois homens:");

        int idade_homem_1 = sc.nextInt();
        int idade_homem_2 = sc.nextInt();

        System.out.println("Escreva a idade das duas mulheres:");

        int idade_mulher_1 = sc.nextInt();
        int idade_mulher_2 = sc.nextInt();

        // Processos:
        if ((idade_homem_1 > idade_homem_2) && (idade_mulher_1 > idade_mulher_2)) {
            vl_soma = idade_homem_1 + idade_mulher_2;
            vl_produto = idade_homem_2 * idade_mulher_1; 
        } else if ((idade_homem_1 < idade_homem_2) && (idade_mulher_1 > idade_mulher_2)) {
            vl_soma = idade_homem_2 + idade_mulher_2;
            vl_produto = idade_homem_1 * idade_mulher_1;
        } else {
            vl_soma = idade_homem_2 + idade_mulher_1;
            vl_produto = idade_homem_1 * idade_mulher_2;
        }
        // Saídas:
        System.out.println("Soma: " + vl_soma + " Produto: " + vl_produto);
        sc.close();
    }
}
/*
Valores de teste:
__ Caso 01 ____
idade_homem_1 = 30
idade_homem_2 = 25
idade_mulher_1 = 28
idade_mulher_2 = 22
imprimir("Soma: 52 Produto: 700") 
__ Caso 02 ____
idade_homem_1 = 18
idade_homem_2 = 35
idade_mulher_1 = 23
idade_mulher_2 = 56
imprimir("Soma: 58 Produto: 1008")
*/