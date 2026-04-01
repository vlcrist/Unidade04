/*
__Enunciado:
Dada uma pergunta, “a cor é azul?”, faça um programa que leia uma 
variável lógica com a resposta e responda “Sim”, 
caso a resposta seja true, ou “Não”, caso seja false.

__Análise: OK

//___Gordura:
faça um programa que

//___Entradas:
ler(ds_resposta)

//___Processos:

se (ds_resposta == true) {
    imprimir("Sim");
} se não {
    imprimir("Não");
}


//___Saídas:
imprimir("Sim")
OU
imprimir("Não")

*/
import java.util.Scanner;

public class Uni04Exe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Entradas e Variáveis:
        System.out.println("A cor é azul?");
        boolean ds_resposta = sc.nextBoolean();

        // Processos:
        if (ds_resposta == true) {
            // Saídas:
            System.out.println("Sim");
        } else {
            // Saídas:
            System.out.println("Não");
        }

        sc.close();
    }
}
/*
 * __ Valores de Testes:
 * _ Caso 1 ___
 * ds_resposta = true
 * imprimir("Sim");
 * _ Caso 2 ___
 * ds_resposta = false
 * imprimir("Não");
 */