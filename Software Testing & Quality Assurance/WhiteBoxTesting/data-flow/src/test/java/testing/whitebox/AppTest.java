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
        long actualResultFirstEdge1 = app.rectangleArea(1, 2);
        long actualResultFirstEdge2 = app.rectangleArea(2, 3);
        long actualResultSecondEdge1 = app.rectangleArea(2, 1);
        long actualResultSecondEdge2 = app.rectangleArea(3, 2);

        // Assert
        assertEquals(2, actualResultFirstEdge1);
        assertEquals(6, actualResultFirstEdge2);
        assertEquals(2, actualResultSecondEdge1);
        assertEquals(6, actualResultSecondEdge2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void area_invalidInput_rectangleArea() {
        // Arrange & Action
        App app = new App();
        long actualResultFirstEdge = app.rectangleArea(0, 1);
        long actualResultSecondEdge = app.rectangleArea(1, 0);

        // Assert: throw exception as above ;))
    }
}
