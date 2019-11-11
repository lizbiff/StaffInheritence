package Staff.Management;

import Staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String ni, int salary, String deptName){
        super(name, ni, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public double raiseSalary(){
        return (getSalary() + 1000.00);
    }
}
