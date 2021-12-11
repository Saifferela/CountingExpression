import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculationsTest {

    @Test
    void calculate_ifTheFormulaIsValid_returnNumberTypeDouble() {
        String formula = "( 10 * 9 ) + ( 3 + (10 / 2))";

        double given = new Calculations().calculate(formula);
        double expected = 98.0;

        assertThat(given).isEqualTo(expected);
    }

    @Test
    void calculate_ifDivisionByZero_returnArithmeticException() {
        String formula = "( 10 * 9 ) + ( 3 + (10 / 0))";

        ArithmeticException thrown = assertThrows(ArithmeticException.class, () -> new Calculations().calculate(formula));

        assertEquals("/ by zero", thrown.getMessage());
    }
}