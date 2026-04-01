/*
__Enunciado:

__Análise:

//___Gordura:

//___Entradas:

//___Processos:

//___Saídas:
*/
import java.util.Scanner;

public class Uni04Exe15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calcule de valor de reajuste: ");
        int nr_meses = sc.nextInt();

        if (nr_meses <= 12) {
            System.out.println("O funcionário irá receber 5% de reajuste");
        } else if (nr_meses >= 13 && nr_meses <= 48) {
            System.out.println("O funcionário irá receber 7% de reajuste");
        } else {
            System.out.println("Reajuste não informado");
        }
        sc.close();
    }

}