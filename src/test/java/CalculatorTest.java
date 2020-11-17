
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addition() {
        var calc = new com.company.Calculator();
        assertEquals(7,calc.addition(3,4));
    }
}