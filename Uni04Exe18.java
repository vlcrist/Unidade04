/*
__Enunciado:

__Análise:

//___Gordura:

//___Entradas:

//___Processos:

//___Saídas:
*/
import java.util.Scanner;

public class Uni04Exe18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o valor da prestação:");
        double vl_prestacao = sc.nextDouble();
        
        System.out.println("Insira o dia de pagamento:");
        int dt_dia_pagamento = sc.nextInt();
        
        System.out.println("Insira o dia de vencimento");
        int dt_dia_vencimento = sc.nextInt();
        
        if (dt_dia_pagamento - dt_dia_vencimento < 0) {
            vl_prestacao = vl_prestacao - (vl_prestacao * 0.10);
            System.out.println("O pagamento está em dia. O valor da prestação = " + vl_prestacao); 
        } else if (dt_dia_pagamento - dt_dia_vencimento > 5) {
            vl_prestacao = vl_prestacao + (vl_prestacao * ((dt_dia_pagamento - dt_dia_vencimento) * 0.02));
            System.out.println("O pagamento está atrasado. Multa de 2% por dia de atraso. Valor da prestação = R$" +  vl_prestacao);
        }
        sc.close();
    }
}
