package az.vla.pro;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testFactorializer(){
        Factorializer factorializer=new Factorializer();
        Assert.assertEquals(120, factorializer.fact(5));
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
