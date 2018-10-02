package org.cpsc1100.asgmt4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
 
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.cpsc1100.asgmt4.MyCalculator;
 
@DisplayName("Testing MyCalculator")
class MyCalculatorTest {
 
    MyCalculator myCalculator = new MyCalculator();

    @Nested
    @DisplayName("Testing MyCalculator on integers")
    class MyCalculatorIntegerTest {

        @Test
        void addTest() {
            assertEquals(2, myCalculator.add(1, 1));
        }

        @Test
        void subtractTest() {
            assertEquals(0, myCalculator.subtract(1, 1));
        }

        @Test
        void multiplyTest() {
            assertEquals(2, myCalculator.multiply(2, 1));
        }

        @Test
        void divideTest() {
            assertEquals(0, myCalculator.divide(1, 2));
        }
    }

    @Nested
    @DisplayName("Testing MyCalculator on doubles")
    class MyCalculatorDoubleTest {

        @Test
        void addTest() {
            assertEquals(2.0, myCalculator.add(1.0, 1.0));
        }

        @Test
        void subtractTest() {
            assertEquals(0.0, myCalculator.subtract(1.0, 1.0));
        }

        @Test
        void multiplyTest() {
            assertEquals(2.0, myCalculator.multiply(2.0, 1.0));
        }

        @Test
        void divideTest() {
            assertEquals(0.5, myCalculator.divide(1.0, 2.0));
        }
    }
}
