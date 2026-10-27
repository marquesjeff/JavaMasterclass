public class HourlyEmployee extends Employee{

    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public void getDoublePay(){
        this.hourlyPayRate *= 2;
    }

    @Override
    public double collectPay() {
        System.out.println("Salary: $" + (300 * 8 * hourlyPayRate));
        return 300 * 8 * hourlyPayRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                "} " + super.toString();
    }
}
