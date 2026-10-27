public class SalariedEmployee extends Employee{

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay(){
        if(isRetired){
            int hireYear = Integer.parseInt(hireDate.split("/")[2]);
            int endYear = Integer.parseInt(endDate.split("/")[2]);
            double salary = (endYear - hireYear) * this.annualSalary;
            System.out.println("Salary: $" + salary);
            return salary;
        }else{
            System.out.println("Salary: $" + annualSalary);
            return annualSalary;
        }
    }

    public void retire(){
        this.isRetired = true;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
