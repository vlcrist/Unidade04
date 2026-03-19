import java.util.Scanner;

public class Uni04Exe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A cor é azul?");
        boolean ds_resposta = sc.nextBoolean();

        if (ds_resposta == true) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }

        sc.close();
    }
}
