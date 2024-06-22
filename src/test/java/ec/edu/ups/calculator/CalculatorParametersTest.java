package ec.edu.ups.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class CalculatorParametersTest {
    private int a,b, expected;
    @Parameterized.Parameters
    public static  Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();

        objects.add(new Object[]{5, 5, 10});
        objects.add(new Object[]{2, 9, 11});
        objects.add(new Object[]{3, 15, 18});
        objects.add(new Object[]{7, 13, 20});
        objects.add(new Object[]{20,14, 34});
        objects.add(new Object[]{22, 34, 56});
        return objects;
    }

    public CalculatorParametersTest(int a, int b, int expected){
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void given_parameters_when_addition_then_on(){
        Calculator cal = new Calculator();
        int actual = cal.sumar(a,b);
        assertEquals(expected,actual);
    }
}
