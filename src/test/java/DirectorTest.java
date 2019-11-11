import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Sarah", "KL12345S", 100000, 2000000);
    }

    @Test
    public void canCheckHowMuchBudget(){
        assertEquals(2000000, director.getBudget(), 0.01);
    }

    @Test
    public void canCheckDirectorsBonus(){
        assertEquals(2000.0, director.payBonus(), 0.01);
    }
}
