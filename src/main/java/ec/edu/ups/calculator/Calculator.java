package ec.edu.ups.calculator;

public class Calculator {
    private int ans;

    public int sumar(int valorA, int valorB) {
        return valorA + valorB;
    }

    public int restar(int valorA, int valorB) {
        return valorA - valorB;
    }

    public int dividir(int valorA, int valorB) {
        return valorA / valorB;
    }

    public int multiplicar(int valorA, int valorB) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return valorA * valorB;
    }

    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }
}