import java.util.Scanner;

public class Uni04Exe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira as 3 cartas do truco:");
        int carta_1 = sc.nextInt();
        int carta_2 = sc.nextInt();
        int carta_3 = sc.nextInt();
        int nr_cartas_boas = 0;

        if ((carta_1 == 1) || ((carta_1 == 2)) || (carta_1 == 3)) {
            nr_cartas_boas += 1;
        };
        if ((carta_2 == 1) || ((carta_2 == 2)) || (carta_2 == 3)) {
            nr_cartas_boas = nr_cartas_boas + 1;
        }
        if ((carta_3 == 1) || ((carta_3 == 2)) || (carta_3 == 3)) {
            nr_cartas_boas++;
        }
        if (nr_cartas_boas == 1) {
            System.out.println("TRUCO");
        } else if (nr_cartas_boas == 2) {
            System.out.println("SEIS");
        } else if (nr_cartas_boas == 3) {
            System.out.println("NOVE");
        } else {

        };
        sc.close();
    }
}
