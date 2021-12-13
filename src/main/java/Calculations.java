import java.util.List;

public class Calculations {

    private String formula = "";
    private List<String> expression;
    private int index = 0;

    // Метод вычисления '+' , '-'
    public double calculate(String formula) {

        this.formula = formula;

        // Получение элементов выражения.
        this.expression = List.of(formula.split(" "));

        // Сначала отработает метод на поиск "*, /"
        double first = multiply();

        while (index < expression.size()) {

            String operator = expression.get(index);

            if (!operator.equals("+") && !operator.equals("-")) {
                break;
            } else {
                index++;
            }

            double second = multiply();

            if (operator.equals("+")) {
                first += second;
            } else {
                first -= second;
            }
        }

        return first;
    }

    // Метод вычисления '*' , '/'
    private double multiply() {

        // Сначала отработает метод на поиск "(, )"
        double first = factor();

        while (index < expression.size()) {

            String operator = expression.get(index);

            if (!operator.equals("*") && !operator.equals("/")) {
                break;
            } else {
                index++;
            }

            double second = factor();

            if (operator.equals("*")) {
                first *= second;
            } else {
                if (second == 0)
                    throw new ArithmeticException("/ by zero");
                first /= second;
            }
        }
        return first;
    }

    // Метод для поиска скобок.
    private double factor() {

        String next = expression.get(index);
        double result;

        if (next.equals("(")) {
            index++;
            result = calculate(this.formula);
            String closingBracket;

            if (index < expression.size()) {
                closingBracket = expression.get(index);
            } else {
                throw new IllegalArgumentException("Unexpected end of expression");
            }

            if (closingBracket.equals(")")) {
                index++;

                return result;
            }
            throw new IllegalArgumentException("')' expected but " + closingBracket + " fount");
        }

        index++;

        try {
            return Double.parseDouble(next);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Spaces are not inserted!");
        }
    }
}




