package testing.blackbox;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void area_validInput_rectangleArea()
    {
        // Arrange & Action
        App app = new App();
        double actualResultInteger = app.rectangleArea(7, 3.2);

        // Assert
        assertEquals(22.4, actualResultInteger, 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void area_invalidInput_rectangleArea() {
        // Arrange & Action
        App app = new App();
        double actualResultNegNeg = app.rectangleArea(-5, -6.2);
        double actualResultCharacterString = app.rectangleArea("bcd", 'a');
        double actualResultPosNeg = app.rectangleArea(7, -5);
        double actualResultCharacterNeg = app.rectangleArea('a', -6.2);
        int actualResultPosString = app.rectangleArea(7, "bcd");
        double actualResultNegPos = app.rectangleArea(-6.2, 7);

        // Assert: throw exception as above ;))
    }
}
