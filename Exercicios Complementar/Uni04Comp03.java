/*
__ Enunciado: 
Uma transportadora utiliza uma esteira de separação rápida para pacotes leves, 
visando agilizar a logística. Escreva um algoritmo que leia o peso de uma 
caixa (em kg). Se o peso for menor ('<') que 2.5 kg, o programa deve informar: 
"Encaminhar para a Esteira Rápida (Pacote Leve)".

__ Análise: OK
__ Gordura: Uma transportadora utiliza Escreva um algoritmo que

__ Entradas: 
ler(vl_peso)

__ Processos: 
se vl_peso < 2.5 então
  imprimir "Encaminhar para a Esteira Rápida (Pacote Leve)"
se não

__ Saídas: 
imprimir(destino)

*/ 

import java.util.Scanner;

public class Uni04Comp03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(java.util.Locale.US);
        System.out.println("Insira o peso (em KG):");
        float vl_peso = sc.nextFloat();
        if (vl_peso < 2.5) {
            System.out.println("Encaminhar para a Esteira Rápida (Pacote Leve)");
        }
        sc.close();
    }
}

/*
__ Valores de Teste __
----------------------
__ Caso 01 ____
vl_peso = 2.6
Saída = NULL
----------------------
__ Caso 02 ____
vl_peso = 1.7
Saída = Encaminhar para a Esteira Rápida (Pacote Leve)
----------------------
*/