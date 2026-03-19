import java.util.Scanner;

public class Uni04Exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Escreva um valor inteiro maior que 0:");
        int nr_inteiro = sc.nextInt();
        
        if (nr_inteiro %2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }
        
        sc.close();
    }
}
