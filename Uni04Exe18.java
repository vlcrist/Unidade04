/*
__Enunciado:
Uma loja que trabalha com crediário funciona da seguinte maneira: 
se o pagamento ocorre até o dia do vencimento, o cliente ganha 10% de desconto
e é avisado que o pagamento está em dia. Se o pagamento é realizado até 
cinco dias após o vencimento o cliente perde o desconto, e se o pagamento 
atrasa mais de cinco dias, é cobrada uma multa de 2% por cada dia de atraso. 
Faça um algoritmo que leia o dia do vencimento, o dia do pagamento e o 
valor da prestação e calcule o valor a ser pago pelo cliente, exibindo as devidas mensagens. 
Suponha que todo vencimento ocorre até o dia dez de cada mês e 
os clientes nunca deixam para pagar no mês seguinte.

__Análise: OK

//___Gordura:
ma loja que trabalha com Faça um algoritmo que

//___Entradas:

ler(vl_prestacao)
ler(dt_dia_pagamento)
ler(dt_dia_vencimento)

//___Processos:

se (dt_dia_pagamento - dt_dia_vencimento < 0) então
    vl_prestacao = vl_prestacao - (vl_prestacao * 0.10)
    imprimir("O pagamento está em dia. O valor da prestação = " + vl_prestacao)
senão se (dt_dia_pagamento - dt_dia_vencimento > 5) então
    vl_prestacao = vl_prestacao + (vl_prestacao * ((dt_dia_pagamento - dt_dia_vencimento) * 0.02))
    imprimir("O pagamento está atrasado. Multa de 2% por dia de atraso. Valor da prestação = R$" +  vl_prestacao)


//___Saídas:
imprimir("O pagamento está em dia. O valor da prestação = " + vl_prestacao)
imprimir("O pagamento está atrasado. Multa de 2% por dia de atraso. Valor da prestação = R$" +  vl_prestacao)

*/
import java.util.Scanner;

public class Uni04Exe18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Variáveis e Entradas:
        System.out.println("Insira o valor da prestação:");
        double vl_prestacao = sc.nextDouble();
        
        System.out.println("Insira o dia de pagamento:");
        int dt_dia_pagamento = sc.nextInt();
        
        System.out.println("Insira o dia de vencimento");
        int dt_dia_vencimento = sc.nextInt();
        
        // Processos:
        if (dt_dia_pagamento - dt_dia_vencimento < 0) {
            vl_prestacao = vl_prestacao - (vl_prestacao * 0.10);
            // Saídas:
            System.out.println("O pagamento está em dia. O valor da prestação = " + vl_prestacao); 
        } else if (dt_dia_pagamento - dt_dia_vencimento > 5) {
            vl_prestacao = vl_prestacao + (vl_prestacao * ((dt_dia_pagamento - dt_dia_vencimento) * 0.02));
            // Saídas:
            System.out.println("O pagamento está atrasado. Multa de 2% por dia de atraso. Valor da prestação = R$" +  vl_prestacao);
        }
        sc.close();
    }
}
/*
Valores de teste:
__ Caso 01 ____
vl_prestacao = 100
dt_dia_pagamento = 5
dt_dia_vencimento = 10
imprime: O pagamento está em dia. O valor da prestação = 90.0
__ Caso 02 ____
vl_prestacao = 100
dt_dia_pagamento = 12
dt_dia_vencimento = 10
imprime: O pagamento está atrasado. Multa de 2% por dia de atraso. Valor da prestação = R$104.0
*/