package Management;

import Staff.Employee;

public class Director extends Employee {

    private double budget;

    public Director(String name, String ni, double salary, double budget){
        super(name, ni, salary);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public double payBonus(){
        return (getSalary() * 0.02);
    }
}
