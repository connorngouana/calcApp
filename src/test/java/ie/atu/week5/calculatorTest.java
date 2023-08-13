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
    void testadd()
    {
        assertEquals(15, myResult.add(5,5,5));
    }

    @AfterEach
    void tearDown()
    {

    }
}