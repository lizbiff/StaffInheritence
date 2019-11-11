import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Stuart", "JH45678A", 40000, "Sales");
    }

    @Test
    public void canGetName(){
        assertEquals("Stuart", manager.getName());
    }

    @Test
    public void canGetNi(){
        assertEquals("JH45678A", manager.getNi());
    }
    @Test
    public void canGetSalary(){
        assertEquals(40000, manager.getSalary());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Sales" , manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(41000.00, manager.raiseSalary(), 1);
    }

    @Test
    public void canCalculateBonus(){
        assertEquals(400, manager.payBonus(), 1);
    }

}
