import java.util.List;

public class Calculations {

    public double calculate(String formula) {

        List<String> str = List.of(formula.split("[ ]"));

        // Если есть скобочки.
        if (str.contains("(")) {
            for (int i = str.indexOf("("); i < str.size(); i++) {

                if (str.get(i).equals("(")) {
                    for (int j = i; j < str.lastIndexOf(")"); j++) {

                    }
                }

                if (str.contains(")")) {
                    for (int j = i; j < str.lastIndexOf(")"); j++) {
                        System.out.println();
                    }
                }
            }
        }

        // Если нет скобочек.
        else {
            double result;
            result = Double.parseDouble(str.get(0));

            for (int i = 0; i < str.size(); i++) {
                if (str.get(i).equals("*")) {
                    result *= Double.parseDouble(str.get(i + 2));
                }
                if (str.get(i).equals("/")) {
                    result /= Double.parseDouble(str.get(i + 2));
                }
                if (str.get(i).equals("+")) {
                    result += Double.parseDouble(str.get(i + 2));
                }
                if (str.get(i).equals("-")) {
                    result -= Double.parseDouble(str.get(i + 2));
                }
            }

            return result;

        }

        return 0;
    }
}
