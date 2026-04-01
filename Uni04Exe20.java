/*
__Enunciado:

__Análise:

//___Gordura:

//___Entradas:

//___Processos:

//___Saídas:
*/
import java.util.Scanner;

public class Uni04Exe20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ds_conceito;
        String st_aprovacao;

        System.out.println("Insira a nota da primeira prova:");
        double vl_nota_prova1 = sc.nextDouble();

        System.out.println("Insira a nota da segunda prova:");
        double vl_nota_prova2 = sc.nextDouble();

        System.out.println("Insira a nota da terceira prova:");
        double vl_nota_prova3 = sc.nextDouble();

        System.out.println("Insira a nota da média dos exercícios: ");
        double vl_nota_exercicios = sc.nextDouble();

        double vl_media_aproveitamento = (vl_nota_prova1 + (vl_nota_prova2*2) + (vl_nota_prova3*3) + vl_nota_exercicios) / 7;
        String vl_med_apro_formatada = String.format("%.2f", vl_media_aproveitamento);

        if (vl_media_aproveitamento >= 9.0) {
            ds_conceito = 'A';
        } else if (vl_media_aproveitamento >= 7.5 && vl_media_aproveitamento < 9.0) {
            ds_conceito = 'B';
        } else if (vl_media_aproveitamento >= 6.0 && vl_media_aproveitamento < 7.5) {
            ds_conceito = 'C';
        } else if (vl_media_aproveitamento >= 4.0 && vl_media_aproveitamento < 6.0) {
            ds_conceito = 'D'; 
        } else if (vl_media_aproveitamento < 4.0) {
            ds_conceito = 'E';
        } else {
            ds_conceito = 'X';
        }
        
        if (ds_conceito == 'D' || ds_conceito == 'E') {
            st_aprovacao = "Reprovado";
        } else {
            st_aprovacao = "Aprovado";
        }

        System.out.println("A média de aproveitamento foi: " + vl_med_apro_formatada + ". Conceito: " + ds_conceito + ". " + st_aprovacao);

        sc.close();
    }
}
