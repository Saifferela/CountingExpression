import java.util.ArrayList;
import java.util.List;

public class Calculations {

    public double calculate(String formula){
        List<String> list = List.of(formula.split("\\W"));
        List<String> numbers = new ArrayList<>();

        if(list.get(list.size()-1).equals("0")){
            throw new ArithmeticException("/ by zero");
        }

        for(String str: list){
            if(str.equals(""))
                continue;

            numbers.add(str);
        }

        return (Double.parseDouble(numbers.get(0)) * Double.parseDouble(numbers.get(1))
                + Double.parseDouble(numbers.get(2)) + Double.parseDouble(numbers.get(3)) / Double.parseDouble(numbers.get(4)));
    }
}
