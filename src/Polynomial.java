public class Polynomial {
    public int n;
    public int[] polynomialCoefficients;

    public Polynomial(int n) {
        this.n = n;
        this.polynomialCoefficients = new int[this.n + 1];
    }


    public void randomCoefficients() {
        for (int i = 0; i < polynomialCoefficients.length; i++) {
            polynomialCoefficients[i] = (int) (Math.random() * 100);
        }
    }

    public void varargsCoefficients(int... numbers) {
        this.polynomialCoefficients = numbers;

    }

    public int hornerAlgoritm(int x) {
        int ans = polynomialCoefficients[0];
        for (int i = 1; i < polynomialCoefficients.length; i++)
            ans = ans * x + polynomialCoefficients[i];
        return ans;
    }
}
