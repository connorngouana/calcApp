package ie.atu.week5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest
{
    calculator myResult;
    @BeforeEach
    void setUp()
    {
        myResult = new calculator();
    }

    @Test
    void testSubtract()
    {
        assertEquals(4, myResult.subtract(5,1));
    }

    @AfterEach
    void tearDown()
    {
    }
}