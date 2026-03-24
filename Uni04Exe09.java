import java.util.Scanner;

public class Uni04Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro valor inteiro:");
        int nr_primeiro = sc.nextInt();

        System.out.println("Insira o segundo valor inteiro:");
        int nr_segundo = sc.nextInt();

        if ((nr_primeiro % nr_segundo == 0) || (nr_segundo % nr_primeiro == 0)) {
            System.out.println("Os valores são múltiplos");
        } else {
            System.out.println("Os valores não são múltiplos");
        }
        sc.close();
    }
}
