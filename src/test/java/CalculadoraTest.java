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
        assertEquals("La suma de 2 i 3 ha de ser 5", 5.0, calculadora.suma(2, 3), 0);
    }

    @Test
    public void testResta() {
        assertEquals("La resta de 5 i 2 ha de ser 3", 3.0, calculadora.resta(5, 2), 0);
    }

    @Test
    public void testMultiplica() {
        assertEquals("La multiplicació de 2 i 5 ha de ser 10", 10.0, calculadora.multiplica(2, 5), 0);
    }

    @Test
    public void testDivideix() {
        assertEquals("La divisió de 10 i 5 ha de ser 2", 2.0, calculadora.divideix(10, 5), 0);
    }

    @Test
    public void testMajorQue() {
        assertTrue("5 ha de ser major que 2", calculadora.majorQue(5, 2));
        assertFalse("2 no ha de ser major que 5", calculadora.majorQue(2, 5));
    }
}
