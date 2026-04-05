/*
__Enunciado:

O índice de massa corporal (IMC) é uma medida internacional usada 
para calcular se uma pessoa está no peso ideal. O IMC é determinado 
pela divisão da massa do indivíduo pelo quadrado de sua altura, 
onde a massa está em quilogramas e a altura está em metros, 
de acordo com a fórmula:

IMC={Massa} /{Altura^2}

Faça um algoritmo para classificar o IMC e dizer o grau de 
obesidade do indivíduo, de acordo com a seguinte tabela:

{Tabela de Classificação do IMC}

__Análise: OK

//___Gordura:

Faça um algoritmo para

//___Entradas:

ler(vl_altura)
ler(vl_peso)

//___Processos:

se (vl_imc < 18.5) então
    ds_class = "Magreza"
senão se (vl_imc >= 18.5 && vl_imc <= 24.9) então
    ds_class = "Saudável"
senão se (vl_imc >= 25.0 && vl_imc <= 29.9) então
    ds_class = "Sobrepeso"
senão se (vl_imc >= 30.0 && vl_imc <= 34.9) então
    ds_class = "Obesidade Grau I"
senão se (vl_imc >= 35.0 &&  vl_imc <= 39.9) então
    ds_class = "Obesidade Grau II (severa)" 
senão
    ds_class = "Obesidade Grau III (mórbida)"

//___Saídas:
escreva(ds_class)
*/
import java.util.Scanner;

public class Uni04Exe21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa de cálculo de IMC");

         // Variáveis e Entradas:
        String ds_class; 

        System.out.println("Insira sua altura (em metros):");
        double vl_altura = sc.nextDouble();

        System.out.println("Insira seu peso (em kilos):");
        double vl_peso = sc.nextDouble();

        // Processos:
        double vl_imc = vl_peso  / (Math.pow(vl_altura, 2));

        if (vl_imc < 18.5) {
            ds_class = "Magreza";
        } else if (vl_imc >= 18.5 && vl_imc <= 24.9) {
            ds_class = "Saudável";
        } else if (vl_imc >= 25.0 && vl_imc <= 29.9) {
            ds_class = "Sobrepeso";
        } else if (vl_imc >= 30.0 && vl_imc <= 34.9) {
            ds_class = "Obesidade Grau I";
        } else if (vl_imc >= 35.0 &&  vl_imc <= 39.9) {
            ds_class = "Obesidade Grau II (severa)";
        } else {
            ds_class = "Obesidade Grau III (mórbida)";
        }

         // Saídas:
        System.out.println(ds_class);
        sc.close();
    }
}
