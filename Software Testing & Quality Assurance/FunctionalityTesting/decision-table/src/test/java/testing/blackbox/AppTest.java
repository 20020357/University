package testing.blackbox;

import static org.junit.Assert.assertEquals;

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
        long actualResultInteger = app.rectangleArea(2, 3);
        double actualResultRealNumber = app.rectangleArea(0.5, 4.0);
        double actualResultIR = app.rectangleArea(2, 3.2);
        double actualResultRI = app.rectangleArea(2.8, 3);

        // Assert
        assertEquals(6, actualResultInteger);
        assertEquals(2.0, actualResultRealNumber, 0.0001);
        assertEquals(6.4, actualResultIR, 0.0001);
        assertEquals(8.4, actualResultRI, 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void area_invalidInput_areaRectangle() {
        // Arrange & Action
        App app = new App();
        long actualResultInteger = app.rectangleArea(-2, 3);
        double actualResultRealNumber = app.rectangleArea(0.5, -4.0);
        double actualResultZeroNumber = app.rectangleArea(0, 3.2);
        long actualResultCharacter = app.rectangleArea('a', 3);

        // Assert: throw exception as above ;))
    }
}
