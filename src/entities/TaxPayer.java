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
        double monthlySalary = salaryIncome / 12;
        if (monthlySalary <= 3000.0) {
            return 0.0;
        } else if (monthlySalary > 3000.0 && monthlySalary <= 5000.0) {
            return salaryIncome * 0.10;
        } else {
            return salaryIncome * 0.20;
        }
    }

    public double servicesTax() {
        if (serviceIncome > 0.0) {
            return serviceIncome * 0.15;
        } else {
            return 0.0;
        }
    }

    public double capitalTax() {
        if (capitalIncome > 0.0) {
            return capitalIncome * 0.20;
        } else {
            return 0.0;
        }
    }

    public double grossTax() {
        return servicesTax() + salaryTax() + capitalTax();
    }

    public double taxRebate() {

        if (grossTax() > (healtSpending + educationSpending)) {
            return healtSpending + educationSpending;
        } else {
            return grossTax() * 0.30;
        }
    }

    public double netTax() {
        return grossTax() - taxRebate();
    }

    @Override
    public String toString() {
        return "\nImposto bruto total: " +
                String.format("%.2f", grossTax()) +
                "\nAbatimento: " +
                String.format("%.2f", taxRebate()) +
                "\nImposto devido: " +
                String.format("%.2f", netTax());

    }

}
