package introducaopoo.entities;

public class Employee {

    public String name;
    public double grossSalary;   // salario bruto
    public double tax;    // imposto

    public double netSalary() {   // salario liquido
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {    // aumento salarial
        grossSalary += (grossSalary * percentage / 100);
    }

    public String toString() {
        return name
                + " , $ "
                + String.format("%.2f", netSalary());
    }
}
