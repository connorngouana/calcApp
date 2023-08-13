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
    void testMultiply()
    {
        assertEquals(20, myResult.multiply(10,2));
    }

    @AfterEach
    void tearDown()
    {

    }
}