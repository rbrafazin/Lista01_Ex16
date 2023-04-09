import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da área a ser pintada em m²:  ");
        double a = sc.nextDouble();
        double lt = a / 3;
        double latas_tinta = (int) Math.ceil(lt / 18);
        double p_total = latas_tinta * 80;

        System.out.printf("Você precisará de%.0f latas de tinta, totalizando R$%.2f", latas_tinta, p_total);

        sc.close();

    }

}
