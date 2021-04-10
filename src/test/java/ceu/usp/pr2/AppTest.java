package ceu.usp.pr2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testFactorialIterativo1()
    {
        assertEquals("Factorial de 1 erroneo", 1, App.factorialIterativo(1), 0);
    }
    @Test
    public void testFactorialIterativo3()
    {
        assertEquals("Factorial de 3 erroneo", 6, App.factorialIterativo(3), 0);
    }
    @Test
    public void testFactorialIterativo5()
    {
        assertEquals("Factorial de 5 erroneo", 120, App.factorialIterativo(5), 0);
    }
    @Test
    public void testFactorialIterativo10()
    {
        assertEquals("Factorial de 10 erroneo", 3628800, App.factorialIterativo(10), 0);
    }
    @Test
    public void testFactorialRecursivo1()
    {
        assertEquals("Factorial de 1 erroneo", 1, App.factorialRecursivo(1), 0);
    }
    @Test
    public void testFactorialRecursivo3()
    {
        assertEquals("Factorial de 3 erroneo", 6, App.factorialRecursivo(3), 0);
    }
    @Test
    public void testFactorialRecursivo5()
    {
        assertEquals("Factorial de 5 erroneo", 120, App.factorialRecursivo(5), 0);
    }
    @Test
    public void testFactorialRecursivo10()
    {
        assertEquals("Factorial de 10 erroneo", 3628800, App.factorialRecursivo(10), 0);
    }
}
