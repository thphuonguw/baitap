import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import test.Calculator;

public class TestCalculator {
    @Test
    public void testAdd() {
        Calculator a = new Calculator();
        int result = a.add(2, 4);
        assertEquals(6, result);

        int result2 = a.add(-2, 7);
        assertEquals(5, result2);
    }
    
  
}
