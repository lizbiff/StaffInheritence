import Techstaff.DataBaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataBaseAdminTest {

    DataBaseAdmin dataBaseAdmin;

    @Before
    public void before(){
        dataBaseAdmin = new DataBaseAdmin("Paul", "JK12345A", 35000);
    }

    @Test
    public void canGetName(){
        assertEquals("Paul", dataBaseAdmin.getName());
    }

    @Test
    public void canGetNi(){
        assertEquals("JK12345A", dataBaseAdmin.getNi());
    }

    @Test
    public void canGetSalary(){
        assertEquals(35000, dataBaseAdmin.getSalary(), 0.01);
    }
}
