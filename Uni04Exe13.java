import java.util.Scanner;
import java.util.Random;

public class Uni04Exe13 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        
        int carta_random_1 = random.nextInt(1, 12);
        int carta_random_2 = random.nextInt(1, 12);
        int carta_random_3 = random.nextInt(1, 12);

        System.out.println("Primeira carta: " + carta_random_1 + "\nSegunda carta: " + carta_random_2 + "\nTerceira Carta: " + carta_random_3);

        sc.close();
    }
}
