package az.vla.pro;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private Factorializer factorializer;
    @Before
    public void getFactorializer(){
        factorializer=new Factorializer();
    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testFactorializer1(){
        //Factorializer factorializer=new Factorializer();
        Assert.assertEquals(120, factorializer.fact(5));
    }
    @Test
    public void testFactorializer2(){
        //Factorializer factorializer=new Factorializer();
        Assert.assertEquals(720, factorializer.fact(6));
    }
    @Test
    public void testFactorializer3(){
        //Factorializer factorializer=new Factorializer();
        Assert.assertEquals(5040, factorializer.fact(7));
    }
    @Test
    public void testFactorializer4(){
        //Factorializer factorializer=new Factorializer();
        Assert.assertEquals(40320, factorializer.fact(8));
    }

    @Test
    public void testCombination(){
        Factorializer mockFactorializer=Mockito.mock(Factorializer.class);
        Mockito.when(mockFactorializer.fact(6)).thenReturn(720);
        Mockito.when(mockFactorializer.fact(2)).thenReturn(2);
        Mockito.when(mockFactorializer.fact(4)).thenReturn(24);
        
        Combination combinator=new Combination(mockFactorializer);
        
        Assert.assertTrue("Failed", 15==combinator.C(6,2));
    }
}
