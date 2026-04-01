/*
__Enunciado:

__Análise:

//___Gordura:

//___Entradas:

//___Processos:

//___Saídas:
*/
import java.util.Scanner;

public class Uni04Exe21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ds_class; 

        System.out.println("Programa de cálculo de IMC");

        System.out.println("Insira sua altura (em metros):");
        double vl_altura = sc.nextDouble();

        System.out.println("Insira seu peso (em kilos):");
        double vl_peso = sc.nextDouble();

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

        System.out.println(ds_class);
        sc.close();
    }
}
