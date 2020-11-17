
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addition() {
        var calc = new com.company.Calculator();
        assertEquals(8,calc.addition(5,3));
    }

    @Test
    void substraction() {
        var calc = new com.company.Calculator();
        assertEquals(11,calc.substraction(16,5));
    }


}