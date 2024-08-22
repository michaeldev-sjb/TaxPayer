package entities;

public class TaxPayer {

    private Double salaryIncome;
    private Double serviceIncome;
    private Double capitalIncome;
    private Double healtSpending;
    private Double educationSpending;

    public TaxPayer(Double salaryIncome, Double serviceIncome, Double capitalIncome, Double healtSpending,
            Double educationSpending) {

        this.salaryIncome = salaryIncome;
        this.serviceIncome = serviceIncome;
        this.capitalIncome = capitalIncome;
        this.healtSpending = healtSpending;
        this.educationSpending = educationSpending;
    }

    public Double getSalaryIncome() {
        return salaryIncome;
    }

    public Double getServiceIncome() {
        return serviceIncome;
    }

    public Double getCapitalIncome() {
        return capitalIncome;
    }

    public Double getHealtSpending() {
        return healtSpending;
    }

    public Double getEducationSpending() {
        return educationSpending;
    }

    public double salaryTax() {
        if (salaryIncome <= 3000.0) {
            return 0;
        } else if (salaryIncome > 3000.0 && salaryIncome <= 5000.0) {
            return salaryIncome * 0.10;
        } else {
            return salaryIncome * 0.20;
        }
    }

    public double servicesTax() {
        return 0;
    }

    public double capitalTax() {
        return 0;
    }

    public double grossTax() {
        return 0;
    }

    public double taxRebate() {
        return 0;
    }

    public double netTax() {
        return 0;
    }

    @Override
    public String toString() {
        return "Imposto bruto total: " +
                salaryIncome +
                "\nAbatimento: " +
                salaryIncome +
                "\nImposto devido:" +
                String.format("%.2f", salaryTax());
    }

}
