/*
__Enunciado:

__Análise:

//___Gordura:

//___Entradas:

//___Processos:

//___Saídas:
*/
import java.util.Scanner;

public class Uni04Exe27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa de estacionamento.");
        System.out.println("1° e 2° hora - R$ 5,00 cada\r\n" + 
                        "3° e 4° hora - R$ 7,50 cada\r\n" +
                        "5° hora e seguintes - R$ 10,00 cada");
        double vl_1_2_horas = 5.0;
        double vl_3_4_horas = 7.5;
        double vl_5_horas = 10.0;
        
        
        System.out.println("Insira a hora de chegada");
        int hr_chegada = sc.nextInt();

        System.out.println("Insira o minuto de chegada");
        int min_chegada = sc.nextInt();

        System.out.println("Insira a hora de saída");
        int hr_saida = sc.nextInt();

        System.out.println("Insira o minuto de saída");
        int min_saida = sc.nextInt();

        int tempoTotal = ((hr_saida * 60) + min_saida) - ((hr_chegada * 60) + min_chegada);
        System.out.println(tempoTotal);

        int nr_horas;

        if (tempoTotal <= 30) {
            nr_horas = 1;
        } else {
            nr_horas = tempoTotal / 60;
            int resto_horas = tempoTotal % 60;
            
            if (resto_horas >= 30) {
            nr_horas = nr_horas + 1;
            }
        }
        double vl_preco;
        

        if (nr_horas == 1) {
            vl_preco = vl_1_2_horas;
        } else if (nr_horas == 2) {
            vl_preco = vl_1_2_horas * 2; 
        } else if (nr_horas == 3) {
            vl_preco = (vl_1_2_horas * 2) + vl_3_4_horas;
        } else if (nr_horas == 4) {
            vl_preco = (vl_1_2_horas * 2) + (vl_3_4_horas * 2);
        } else {
            vl_preco = (vl_1_2_horas * 2) + (vl_3_4_horas * 2) + ((nr_horas - 4) * vl_5_horas);
        }
    System.out.println("O preço cobrado = R$" + vl_preco);
    
    sc.close();
    }
}
