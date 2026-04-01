/*

__ Enunciado:
A jornada de trabalho semanal de um funcionário é de 40 horas. 
O funcionário que trabalhar mais de 40 horas receberá hora extra, 
cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que 
leia o número de horas trabalhadas em um mês, o valor por hora e escreva o salário total do funcionário, 
que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).

__ Análise: OK

//___ Gordura:
Escreva um algoritmo que

//__ Entradas: 

ler(nr_horas)
ler(vl_hora)

//__ Processos: 

vl_salario = vl_hora * nr_horas;
se (nr_horas > 160) {
    double vl_extra = (nr_horas - 160) * (vl_hora / 2);
    vl_salario = vl_salario + vl_extra;

//__ Saídas: // vl_salario

imprimir(vl_salario)

*/
import java.util.Scanner;
public class Uni04Exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Entradas e Variáveis:
        System.out.println("Insira o número de horas trabalhadas:");
        int nr_horas = sc.nextInt();
        
        System.out.println("Insira o valor por hora:");
        double vl_hora = sc.nextDouble();

        // Processos:
        double vl_salario = vl_hora * nr_horas;
        if (nr_horas > 160) {
            double vl_extra = (nr_horas - 160) * (vl_hora / 2);
            vl_salario = vl_salario + vl_extra;
        }

        // Saídas:
        System.out.printf("O salário total é: %.2f ", vl_salario);
        sc.close();
    }    
}

/*
 * __ Valores de Testes:
 * _ Caso 1 ___
 * nr_horas = 160
 * vl_hora = 10
 * vl_salario = 1600
 * 
 * _ Caso 2 ___
 * nr_horas = 185
 * vl_hora = 15
 * vl_salario = 2962,50
 */