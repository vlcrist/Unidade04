import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua idade:");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Pode dirigir adulto!");
        } else {
            System.out.println("Não pode dirigir criança!");
        }
        System.out.println("Fim da condicional!");
    }
}