package ec.edu.ups.calculator;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class CalculatorTest {

    @InjectMocks
    private Calculator calculator;

    @BeforeClass
    public static void setUpClass(){
        System.out.println("setUpClass()");
    }

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void sumar() {
        assertEquals(14, calculator.sumar(10, 4));
        System.out.println("Test additions");
    }

    @Test
    public void sumarError() {
        assertEquals(20, calculator.sumar(10, 4));
        System.out.println("Test additions");
    }

    @Test
    public void restar() {
        assertEquals(50, calculator.restar(100, 50) );
    }

    @Test
    public void restarError() {
        assertNotEquals(10, calculator.restar(100, 50) );
    }

    @Test
    public void multiplicar() {
        assertEquals(360, calculator.multiplicar(120, 3));
    }

    @Test
    public void multiplicarError() {
        assertNotEquals(1000, calculator.multiplicar(120, 3));
    }

    @Test
    public void dividir() {
        assertEquals(120, calculator.multiplicar(360, 3));
    }


    @Test
    public void dividirError() {
        assertNotEquals(12, calculator.multiplicar(360, 3));
    }
}