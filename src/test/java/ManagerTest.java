import Management.Manager;
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
        assertEquals(40000, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Sales" , manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1000);
        assertEquals(41000, manager.getSalary(), 0.01);
    }

    @Test
    public void canCalculateBonus(){
        assertEquals(400, manager.payBonus(), 0.01);
    }

}
