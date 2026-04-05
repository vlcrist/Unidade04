/*
__Enunciado:

As tarifas de um estacionamento são as seguintes:

1° e 2° hora - R$ 5,00 cada
3° e 4° hora - R$ 7,50 cada
5° hora e seguintes - R$ 10,00 cada

O número de horas a pagar é sempre inteiro e arredondado 
para cima ou para baixo dependendo do tempo. Até 29 minutos depois da chegada, 
arredonda-se para baixo e após 30 minutos arredonda-se para cima. Por exemplo, 
quem estacionar durante 1 hora e 15 minutos pagará por 1 hora e quem estacionar 
por 1 hora e 35 minutos pagará por duas horas. Entretanto, se a pessoa permaneceu 
menos de 30 minutos, também pagará por uma hora. Os horários de chegada e partida 
são apresentados na forma de pares de inteiros, representando horas e minutos. 
Por exemplo, o par 12 50 representará meio dia e cinquenta. Assim, 
faça um algoritmo que leia os horários de chegada e de partida e escreva na 
tela o tempo que ficou estacionado, e o preço a ser cobrado. Deverá haver 
dmite-se que a chegada e a partida se dão com intervalo não superior a 24 horas, 
e sempre chegam e saem no mesmo dia.

__Análise: OK

//___Gordura:

faça um algoritmo que

//___Entradas:

ler(hr_chegada, min_chegada, hr_saida, min_saida)

//___Processos:

se (tempoTotal <= 89) {
            System.out.println("Preço cobrado = R$" + vl_1_2_horas);
        } se não (tempoTotal <= 179) {
            System.out.println("Preço cobrado = R$" + vl_1_2_horas * 2); 
        } se não (tempoTotal <= 269) {
            System.out.println("Preço cobrado = R$" + vl_3_4_horas * 3);
        } Se não (tempoTotal <= 359) {
            System.out.println("Preço cobrado = R$" + vl_3_4_horas * 4);
        } Senão se {
            int tempoSubsequente = tempoTotal / 60;
            System.out.println("Preço cobrado = R$" + vl_5_horas * tempoSubsequente);
        }

//___Saídas:

imprimir(preço)

*/

import java.util.Scanner;

public class Uni04Exe27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o horário de chegada (hora e minuto) e o horário de saída (hora e minuto):");
        // Variáveis e Entradas:
        double vl_1_2_horas = 5.0;
        double vl_3_4_horas = 7.5;
        double vl_5_horas = 10.0;
        
        int hr_chegada = sc.nextInt();
        int min_chegada = sc.nextInt();
        int hr_saida = sc.nextInt();
        int min_saida = sc.nextInt();

        // Processos:
        int tempoTotal = ((hr_saida * 60) + min_saida) - ((hr_chegada * 60) + min_chegada);

        // Processos E Saídas:
        if (tempoTotal <= 89) {
            System.out.println("Preço cobrado = R$" + vl_1_2_horas);
        } else if (tempoTotal <= 179) {
            System.out.println("Preço cobrado = R$" + vl_1_2_horas * 2); 
        } else if (tempoTotal <= 269) {
            System.out.println("Preço cobrado = R$" + vl_3_4_horas * 3);
        } else if (tempoTotal <= 359) {
            System.out.println("Preço cobrado = R$" + vl_3_4_horas * 4);
        } else {
            int tempoSubsequente = tempoTotal / 60;
            System.out.println("Preço cobrado = R$" + vl_5_horas * tempoSubsequente);
        }

        sc.close();
    }
}

/*
Valores de teste:
__ Caso 01 ___
hr_chegada = 13
min_chegada = 10
hr_saida = 13
min_saida = 22
imprimir("R$5.0")

__ Caso 02 ___
hr_chegada = 3
min_chegada = 40
hr_saida = 5
min_saida = 15
imprimir("R$10.0")

__ Caso 03 ___
hr_chegada = 8
min_chegada = 5
hr_saida = 12
min_saida = 46
imprimir("R$35.0")
*/