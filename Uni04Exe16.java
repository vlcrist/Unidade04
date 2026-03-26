import java.util.Scanner;

public class Uni04Exe16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vl_soma;
        int vl_produto;

        System.out.println("Escreva a idade dos dois homens:");

        int idade_homem_1 = sc.nextInt();
        int idade_homem_2 = sc.nextInt();

        System.out.println("Escreva a idade das duas mulheres:");

        int idade_mulher_1 = sc.nextInt();
        int idade_mulher_2 = sc.nextInt();

        if ((idade_homem_1 > idade_homem_2) && (idade_mulher_1 > idade_mulher_2)) {
            vl_soma = idade_homem_1 + idade_mulher_2;
            vl_produto = idade_homem_2 * idade_mulher_1; 
        } else if ((idade_homem_1 < idade_homem_2) && (idade_mulher_1 > idade_mulher_2)) {
            vl_soma = idade_homem_2 + idade_mulher_2;
            vl_produto = idade_homem_1 * idade_mulher_1;
        } else {
            vl_soma = idade_homem_2 + idade_mulher_1;
            vl_produto = idade_homem_1 * idade_mulher_2;
        }
        System.out.println("Soma: " + vl_soma + " Produto: " + vl_produto);
        sc.close();
    }
}
