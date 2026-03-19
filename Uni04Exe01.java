import java.util.Scanner;

public class Uni04Exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Insira o número de horas trabalhadas:");
        int nr_horas = sc.nextInt();
        
        System.out.println("Insira o valor por hora:");
        double vl_hora = sc.nextDouble();

        double vl_salario = vl_hora * nr_horas;

        if (nr_horas > 160) {
            double vl_extra = (nr_horas - 160) * (vl_hora / 2);
            vl_salario = vl_salario + vl_extra;
        }
        System.out.printf("O salário total é: %.2f ", vl_salario);
        sc.close();
    }    
}
