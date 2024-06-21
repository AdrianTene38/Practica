package ec.edu.ups.calculator;

import org.junit.*;
import org.mockito.InjectMocks;
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
        assertEquals(14, calculator.sumar(10, 4));
        System.out.println("Test additions");
    }

    @Test
    public void restar() {
        assertEquals(1, calculator.restar(100, 50) );
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
        assertEquals(120, calculator.dividir(360, 3));
    }


    @Test
    public void dividirError() {
        assertEquals(12, calculator.multiplicar(360, 3));
    }

    @After
    public void tearDown(){
        System.out.println("tearDown()");
        calculator.setAns(12);
        calculator=null;
    }
    @AfterClass
    public static void tearDownClass(){
        System.out.println("tearDownClass()");
    }
}