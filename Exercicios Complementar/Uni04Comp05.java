/*
Escreva um programa que valide um cupom de desconto em formato de texto. 
Leia o nome do cupom digitado pelo usuário. Se o cupom for exatamente 
igual a "SOUFURB", o programa deve exibir a mensagem: 
"Desconto de 15% aplicado com sucesso!"

__ Análise: OK
__ Gordura: Escreva um programa que o programa deve exibir


__ Entradas: 
ler(cupomTexto)

__ Processos: 
se ds_cupom for igual a "SOUFURB" então
  imprimir "Desconto de 15% aplicado com sucesso!"
se não

__ Saídas: 
imprimir(msg)

*/
import java.util.Scanner;

public class Uni04Comp05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome do cupom:");
        String ds_cupom = sc.next().toUpperCase();

        if (ds_cupom.equals("SOUFURB")) {
            System.out.println("Desconto de 15% aplicado com sucesso!");
        }
        sc.close();
    }
    
}
/*
__ Valores de Teste __
----------------------
__ Caso 01 ____
ds_cupom = SOUFURB
Saída = Desconto de 15% aplicado com sucesso!
---------------------
__ Caso 02 ____
ds_cupom = CUPOMBOM
Saída = NULL
---------------------
*/