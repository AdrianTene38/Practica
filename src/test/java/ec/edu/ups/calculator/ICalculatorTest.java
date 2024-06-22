package ec.edu.ups.calculator;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ICalculatorTest {

    @Test
    public void given_two_integers_when_addition_then_ok() {

        ICalculator cal = Mockito.mock(ICalculator.class);
        Mockito.when(cal.sumar(10, 45)).thenReturn(55);
        assertEquals(55, cal.sumar(10, 45));
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok() {
        ICalculator cal = Mockito.mock(ICalculator.class);
        Mockito.when(cal.restar(33, 11)).thenReturn(22);
        assertEquals(22, cal.restar(33, 11));
    }

    @Test
    public void given_two_integers_when_multiplication_then_ok() {
        ICalculator cal = Mockito.mock(ICalculator.class);
        Mockito.when(cal.multiplicar(40,2)).thenReturn(80);
        assertEquals(80, cal.multiplicar(40, 2));
    }

    @Test
    public void given_two_integers_when_division_then_ok() {
        ICalculator cal = Mockito.mock(ICalculator.class);
        Mockito.when(cal.dividir(16,2)).thenReturn(8);
        assertEquals(8, cal.dividir(16,2));
    }
}