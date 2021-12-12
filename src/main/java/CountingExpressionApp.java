public class CountingExpressionApp {
    public static void main(String[] args) {

        String formula = "( 10 * 9 ) + ( 3 + ( 10 / 2 ) )";
        String easyFormula = "10 * 9 / 10 + 5 - 100";

        double result = new Calculations().calculate(formula);
        double easyResult = new Calculations().calculate(easyFormula);

        System.out.println("Expression result: " + result);
        System.out.println("Expression result: " + easyResult);
    }
}
