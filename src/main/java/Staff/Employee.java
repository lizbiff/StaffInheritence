package Staff;

public abstract class Employee {

    private String name;
    private String ni;
    private int salary;

    public Employee(String name, String ni, int salary){
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

    public int getSalary() {
        return salary;
    }

    public abstract double raiseSalary();

    public double payBonus(){
//        bonusAmount = (this.salary * 0.01);
        return (this.salary * 0.01);
    }


}
