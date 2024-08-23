import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        List<TaxPayer> taxPayer = new ArrayList<>();

        System.out.print("Quantos contribuintes você vai digitar? ");
        int numberContributors = sc.nextInt();

        for (int x = 1; x <= numberContributors; x++) {
            System.out.println("\nDigite os dados do " + x + "o contribuinte:");
            System.out.print("Renda anual com salário: ");
            double salary = sc.nextDouble();
            System.out.print("Renda anual com prestação de serviço: ");
            double service = sc.nextDouble();
            System.out.print("Renda anual com ganho de capital: ");
            double income = sc.nextDouble();
            System.out.print("Gastos médicos: ");
            double health = sc.nextDouble();
            System.out.print("Gastos educacionais: ");
            double education = sc.nextDouble();

            taxPayer.add(new TaxPayer(salary, service, income, health, education));
        }

        int contributor = 0;
        for (TaxPayer t : taxPayer) {
            contributor++;
            System.out.print("\nResumo do " + contributor + "o contribuinte: ");
            System.out.println(t);

        }

    }
}
