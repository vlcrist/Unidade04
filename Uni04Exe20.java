/*
__Enunciado:

Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios, 
descreva um algoritmo que calcule a média de aproveitamento e o conceito do aluno, usando a fórmula:
media=(notaProva1+notaProva22+notaProva33+notaExercicios)/7
O algoritmo deve escrever a média de aproveitamento, o conceito correspondente e a mensagem "aprovado" 
caso o conceito seja A, B ou C, e "reprovado" caso o conceito seja D ou E.

__Análise: OK

//___Gordura:

descreva um algoritmo que

//___Entradas:
ler(vl_nota_prova1)
ler(vl_nota_prova2)
ler(vl_nota_prova3)
ler(vl_nota_exercicios)

//___Processos:

se (vl_media_aproveitamento >= 9.0) então
    ds_conceito = 'A'
senão se (vl_media_aproveitamento >= 7.5 && vl_media_aproveitamento < 9.0) então
    ds_conceito = 'B'
senão se (vl_media_aproveitamento >= 6.0 && vl_media_aproveitamento < 7.5) então
    ds_conceito = 'C'
senão se (vl_media_aproveitamento >= 4.0 && vl_media_aproveitamento < 6.0) então
    ds_conceito = 'D'
senão se (vl_media_aproveitamento < 4.0) então
    ds_conceito = 'E'
senão
    ds_conceito = 'X'

se (ds_conceito == 'D' || ds_conceito == 'E') então
    st_aprovacao = "Reprovado"
senão
    st_aprovacao = "Aprovado"

//___Saídas:

escreva("A média de aproveitamento foi: " + vl_med_apro_formatada + ". Conceito: " + ds_conceito + ". " + st_aprovacao)

*/
import java.util.Scanner;

public class Uni04Exe20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Variáveis e Entradas:
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

         // Processos:
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

         // Saídas:
        System.out.println("A média de aproveitamento foi: " + vl_med_apro_formatada + ". Conceito: " + ds_conceito + ". " + st_aprovacao);

        sc.close();
    }
}
