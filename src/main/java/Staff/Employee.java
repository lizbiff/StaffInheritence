package Staff;

public abstract class Employee {

    private String name;
    private String ni;
    private double salary;

    public Employee(String name, String ni, double salary){
        this.name = name;
        this.ni = ni;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public String getNi() {
        return ni;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double amount){
        if(amount > 0.1) {
            this.salary = this.salary + amount;
        }
    }

    public double payBonus(){
//        bonusAmount = (this.salary * 0.01);
        return (this.salary * 0.01);
    }


}
