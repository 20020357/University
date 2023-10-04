package testing.whitebox;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
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
        long actualResult = app.rectangleArea(1, 5);

        // Assert
        assertEquals(5, actualResult);
    }

    @Test(expected = IllegalArgumentException.class)
    public void area_invalidInput_rectangleArea() {
        // Arrange & Action
        App app = new App();
        long actualResult = app.rectangleArea(-1, 5);

        // Assert: throw exception as above ;))
    }
}
