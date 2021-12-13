public class CountingExpressionApp {
    public static void main(String[] args) {

        String formula = "( 10 * 9 ) + ( 3 + ( 10 / 2 ) )";

        double result = new Calculations().calculate(formula);

        System.out.println(formula + " = " + result);
    }
}
