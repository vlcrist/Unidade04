import java.util.Scanner;

public class Uni04Exe14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o dia:");
        int nr_dia = sc.nextInt();
        
        System.out.println("Digite o mês:");
        int nr_mes = sc.nextInt();

        System.out.println("Digite o ano:");
        int nr_ano = sc.nextInt();

        if (((nr_dia > 0 && nr_dia < 32)) && (nr_mes > 0 && nr_mes < 13) && (nr_ano > 0)) {
            if (( nr_mes == 1) || (nr_mes == 3) || (nr_mes == 5) || (nr_mes == 7) || (nr_mes == 8) || (nr_mes == 10) || (nr_mes == 12)) {
                System.out.println("Válida");
            } else if (nr_mes != 2 && nr_dia < 31) {
                System.out.println("Válida");
            } else if (nr_mes == 2 && nr_dia < 29) {
                System.out.println("Válida");
            } else if ((nr_dia == 29 && nr_ano % 4 == 0) && !(nr_ano % 100 == 0 && nr_ano % 400 != 0)) {
                System.out.println("Válida");
            } else {
                System.out.println("Não Válida");
            }
        } else {
            System.out.println("Não Válida");
        }
        sc.close();
    }
}
