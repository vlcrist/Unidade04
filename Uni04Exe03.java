import java.util.Scanner;

public class Uni04Exe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro valor:");
        int nr_primeiro = sc.nextInt();
        System.out.println("Insira o segundo valor:");
        int nr_segundo = sc.nextInt();

        if (nr_primeiro > nr_segundo) {
            System.out.println("O valor " + nr_primeiro + " é maior que o valor " + nr_segundo);
        } else {
            System.out.println("O valor " + nr_segundo + " é maior que o valor " + nr_primeiro);
        }
        sc.close();
    }
}
