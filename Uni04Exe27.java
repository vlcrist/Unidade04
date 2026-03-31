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

        if (tempoTotal <= 89) {
            System.out.println("Preço cobrado = R$" + vl_1_2_horas);
        } else if (tempoTotal >= 90 && tempoTotal <= 179) {
            System.out.println("Preço cobrado = R$" + vl_1_2_horas * 2); 
        } else if (tempoTotal >= 180 && tempoTotal <= 269) {
            System.out.println("Preço cobrado = R$" + vl_3_4_horas * 3);
        } else if (tempoTotal >= 270 && tempoTotal <= 359) {
            System.out.println("Preço cobrado = R$" + vl_3_4_horas * 4);
        } else {
            int tempoSubsequente = tempoTotal / 60;
            System.out.println(tempoSubsequente);
            System.out.println("Preço cobrado = R$" + vl_5_horas * tempoSubsequente);
        }
    sc.close();
    }
}
