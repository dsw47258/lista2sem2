public class zad3 {
    public static void main(String[] args) {
        //Powstanie wielomianu w pewnym stopniu
        Polynomial test = new Polynomial(6);
        //Użycie metody z varargs
        test.varargsCoefficients(1, 2, 3, 7, 90, 33, 99, 70);
        //Powstanie randomowych współczynników
        test.randomCoefficients();
//Użycie Hornera i wyśietlenie policzonego wielomianu
        System.out.println(test.hornerAlgoritm(5));
    }
}