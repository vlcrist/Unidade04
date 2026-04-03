/*
__Enunciado:
Elabore um algoritmo para exibir o valor de reajuste que um funcionário receberá no seu salário. 
A empresa irá conceder 5% de reajuste para o funcionário que for admitido há até de 12 meses. 
Para funcionário admitido entre 13 e 48 meses, irá conceder 7% de reajuste. 
O seu algoritmo deve solicitar ao usuário que digite a quantidade de meses que o funcionário foi admitido.

__Análise: OK

//___Gordura:
Elabore um algoritmo para O seu algoritmo deve

//___Entradas:
Ler(nr_meses)

//___Processos:

se nr_meses <= 12 então
    exibir("O funcionário irá receber 5% de reajuste")
senão se nr_meses >= 13 e nr_meses <= 48 então
    exibir("O funcionário irá receber 7% de reajuste")
senão
    exibir("Reajuste não informado")

//___Saídas:
imprimir("O funcionário irá receber 5% de reajuste")
OU
imprimir("O funcionário irá receber 7% de reajuste")
OU
imprimir("Reajuste não informado")

*/
import java.util.Scanner;

public class Uni04Exe15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Entradas e Variaveis:
        System.out.println("Calcule de valor de reajuste: ");
        int nr_meses = sc.nextInt();

        // Processos:
        if (nr_meses <= 12) {
            // Saídas:
            System.out.println("O funcionário irá receber 5% de reajuste");
        } else if (nr_meses >= 13 && nr_meses <= 48) {
            // Saídas:
            System.out.println("O funcionário irá receber 7% de reajuste");
        } else {
            // Saídas:
            System.out.println("Reajuste não informado");
        }
        sc.close();
    }

}
/*Valores de teste
* _ Caso 1 ___
* nr_meses = 10
* imprimir("O funcionário irá receber 5% de reajuste")
* _ Caso 2 ___
* nr_meses = 19
* imprimir("O funcionário irá receber 7% de reajuste")
*/