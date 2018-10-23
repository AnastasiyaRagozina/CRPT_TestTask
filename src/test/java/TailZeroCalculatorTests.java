import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TailZeroCalculatorTests {

    @Test
    void testCalculator1200() {
        Assertions.assertEquals(TailZeroCalculator.calculate(1200), 298, "Wrong zero count!");
    }

    @Test
    void testCalculator10() {
        Assertions.assertEquals(TailZeroCalculator.calculate(10), 2, "Wrong zero count!");
    }

    @Test
    void testCalculator1() {
        Assertions.assertEquals(TailZeroCalculator.calculate(1), 0, "Wrong zero count!");
    }

    @Test
    void testCalculatorMinus1() {
        Assertions.assertEquals(TailZeroCalculator.calculate(-1), 0, "Wrong zero count!");
    }
}
