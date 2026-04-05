/*
__Enunciado:

Leia uma data e determine se ela é válida. Ou seja, 
verifique se o mês está entre 1 e 12, e se o dia 
existe naquele mês. Note que fevereiro tem 29 dias 
em anos bissextos, e 28 dias em anos não bissextos.

__Análise: OK

//___Gordura:
*null*

//___Entradas:
ler(nr_dia)
ler(nr_mes)
ler(nr_ano)

//___Processos:

se (((nr_dia > 0 && nr_dia < 32)) && (nr_mes > 0 && nr_mes < 13) && (nr_ano > 0)) {
    se (( nr_mes == 1) || (nr_mes == 3) || (nr_mes == 5) || (nr_mes == 7) || (nr_mes == 8) || (nr_mes == 10) || (nr_mes == 12)) {
        imprimir("Válida");
    } se não se (nr_mes != 2 && nr_dia < 31) {
        imprimir("Válida");
    } se não se (nr_mes == 2 && nr_dia < 29) {
        imprimir("Válida");
    } se não se ((nr_dia == 29 && nr_ano % 4 == 0) && !(nr_ano % 100 == 0 && nr_ano % 400 != 0)) {
        imprimir("Válida");
    } se não {
        imprimir("Não Válida");
    }
} se não {
    imprimir("Não Válida");
}

//___Saídas:
imprimir("Válida")
OU
imprimir("Não Válida")

*/
import java.util.Scanner;

public class Uni04Exe14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Entradas e Variáveis:
        System.out.println("Digite o dia:");
        int nr_dia = sc.nextInt();
        
        System.out.println("Digite o mês:");
        int nr_mes = sc.nextInt();

        System.out.println("Digite o ano:");
        int nr_ano = sc.nextInt();

        // Processos:
        if (((nr_dia > 0 && nr_dia < 32)) && (nr_mes > 0 && nr_mes < 13) && (nr_ano > 0)) {
            if (( nr_mes == 1) || (nr_mes == 3) || (nr_mes == 5) || (nr_mes == 7) || (nr_mes == 8) || (nr_mes == 10) || (nr_mes == 12)) {
                // Saídas:
                System.out.println("Válida");
            } else if (nr_mes != 2 && nr_dia < 31) {
                // Saídas:
                System.out.println("Válida");
            } else if (nr_mes == 2 && nr_dia < 29) {
                // Saídas:
                System.out.println("Válida");
            } else if ((nr_dia == 29 && nr_ano % 4 == 0) && !(nr_ano % 100 == 0 && nr_ano % 400 != 0)) {
                // Saídas:
                System.out.println("Válida");
            } else {
                // Saídas:
                System.out.println("Não Válida");
            }
        } else {
            // Saídas:
            System.out.println("Não Válida");
        }
        sc.close();
    }
}
/*Valores de teste
* _ Caso 1 ___
* nr_dia = 29
* nr_mes = 2
* nr_ano = 2020
* Válida
* _ Caso 2 ___
* nr_dia = 30
* nr_mes = 2
* nr_ano = 2020
* Não Válida
*/