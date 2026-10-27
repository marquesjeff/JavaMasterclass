public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;



    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){
        int birthYear = Integer.parseInt(birthDate.split("/")[2]);
        int age = 2026 - birthYear;
        System.out.println(this.name + " is " + age + " years of age.");
        return age;
    }
    public double collectPay(){
        return 0.0;
    }
    public void terminate(String endDate){
        this.endDate = endDate;
        System.out.println("Contract terminated in " + endDate);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
