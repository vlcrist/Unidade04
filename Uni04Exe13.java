/*
__Enunciado:

Escreva um algoritmo que obtém do usuário 3 valores inteiros 
representando as três cartas deste usuário em uma mão de 
jogo de truco (1 = AS; 2 = 2; 3 = 3; 7 = 7; 11 = Valete; 
12 = Dama; 13 = Rei). O algoritmo deve imprimir na tela a 
palavra "TRUCO" (se APENAS UMA das três cartas for AS, 2 ou 3), 
"SEIS" (se APENAS DUAS das três cartas for AS, 2 ou 3) ou "NOVE" 
(se AS TRÊS cartas forem AS, 2 ou 3). Se não houver AS, 
2 ou 3 nas três cartas, não é impresso nada.

__Análise: OK

//___Gordura:
Escreva um algoritmo que

//___Entradas:

ler(carta_1)
ler(carta_2)
ler(carta_3)
ler(nr_cartas_boas)

//___Processos:

se (carta_1 == 1 || carta_1 == 2 || carta_1 == 3) {
    nr_cartas_boas = nr_cartas_boas + 1;
}
se (carta_2 == 1 || carta_2 == 2 || carta_2 == 3) {
    nr_cartas_boas = nr_cartas_boas + 1;
} 
se (carta_3 == 1 || carta_3 == 2 || carta_3 == 3) {
    nr_cartas_boas = nr_cartas_boas + 1;
}
se (nr_cartas_boas == 1) {
    imprimir("TRUCO");
} se não se (nr_cartas_boas == 2) {
    imprimir("SEIS");
} se não se (nr_cartas_boas == 3) {
    imprimir("NOVE");

//___Saídas:
imprimir("TRUCO")
OU
imprimir("SEIS")
OU
imprimir("NOVE")
*/
import java.util.Scanner;

public class Uni04Exe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Entradas e Variáveis:
        System.out.println("Insira as 3 cartas do truco:");
        int carta_1 = sc.nextInt();
        int carta_2 = sc.nextInt();
        int carta_3 = sc.nextInt();
        int nr_cartas_boas = 0;

        // Processos:
        if ((carta_1 == 1) || ((carta_1 == 2)) || (carta_1 == 3)) {
            nr_cartas_boas += 1;
        };
        if ((carta_2 == 1) || ((carta_2 == 2)) || (carta_2 == 3)) {
            nr_cartas_boas = nr_cartas_boas + 1;
        }
        if ((carta_3 == 1) || ((carta_3 == 2)) || (carta_3 == 3)) {
            nr_cartas_boas++;
        }
    
        if (nr_cartas_boas == 1) {
            // Saídas:
            System.out.println("TRUCO");
        } else if (nr_cartas_boas == 2) {
            // Saídas:
            System.out.println("SEIS");
        } else if (nr_cartas_boas == 3) {
            // Saídas:
            System.out.println("NOVE");
        } 
        sc.close();
    }
}
/* valores de teste
 * _ Caso 1 ___
 * carta_1 = 1
 * carta_2 = 2
 * carta_3 = 3
 * Saída: "NOVE"
 * _ Caso 2 ___
 * carta_1 = 1
 * carta_2 = 2
 * carta_3 = 4
 * Saída: "TRUCO"
 * _ Caso 3 ___
 * carta_1 = 4
 * carta_2 = 5
 * carta_3 = 6
 * Saída: ""
 */