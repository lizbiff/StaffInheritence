import Techstaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Steven", "GH12345A", 65000);
    }

    @Test
    public void canGetName(){
        assertEquals("Steven", developer.getName());
    }

    @Test
    public void canGetNi(){
        assertEquals("GH12345A", developer.getNi());
    }

    @Test
    public void canGetSalary(){
        assertEquals(65000, developer.getSalary(), 0.01);
    }

}
