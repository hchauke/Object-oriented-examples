package Abstract;

public class Salary extends Employee {

    private double amount; //Annual amount

    public Salary(String name, String address, double salary) {
        super(name, address);
        setAmount(salary);
    }

    public void mailCheck() {
        System.out.println("Mailing check to: '"+ getName().toUpperCase()+"' Of address' "+getAddress().toUpperCase() + "' with amount: "+ getAmount());
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double newSalary) {
        if (newSalary >= 0.0) {
            amount = newSalary;
        }
    }
}