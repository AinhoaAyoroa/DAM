import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    private Calculadora calculadora;

    @Before
    public void setUp() {
        calculadora = new Calculadora();
    }

    @After
    public void tearDown() {
        calculadora.restablecer();
    }

    @Test
    public void testSuma() {
        assertEquals(5, calculadora.suma(2, 3), 0);
    }

    @Test
    public void testResta() {
        assertEquals(3, calculadora.resta(5, 2), 0);
    }

    @Test
    public void testMultiplica() {
        assertEquals(10, calculadora.multiplica(2, 5), 0);
    }

    @Test
    public void testDivideix() {
        assertEquals(2, calculadora.divideix(10, 5), 0);
    }

    @Test
    public void testMajorQue() {
        assertTrue(calculadora.majorQue(5, 3));
        assertFalse(calculadora.majorQue(2, 8));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideixPerZero() {
        calculadora.divideix(10, 0);
    }
}

