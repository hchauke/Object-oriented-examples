package Abstract;

public class Main {
    public static void main(String[] args) {

        Salary s = new Salary("Hlulani", "Tembisa", 3600.00);
        Employee e = new Salary("Ralson", "Limpopo", 2400.00);

        System.out.println("\nCall mailCheck using Salary reference.");
        s.mailCheck();

        System.out.println("\nCall mailCheck using Employee reference.");
        e.mailCheck();
    }
}
