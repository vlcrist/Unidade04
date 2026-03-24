

import java.util.Scanner;

public class Uni04Exe04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número para verificação de casas decimais");
        float nr_numero = sc.nextFloat();

        if (nr_numero % 1 != 0) {
            System.out.println("Casas decimais foram digitadas.");
        } else {
            System.out.println("Casas decimais não foram digitadas.");
        }
        sc.close();
    }
}
