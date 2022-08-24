import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class GlucoseCalculatorTest {

    @BeforeEach
    public void setup(){
        Settings.setCarbRat(11);
        Settings.setCovFact(40);
    }

    @Test
    void calcGlucInsulinNoRound() {
        Integer givenGlucose = 200;
        GlucoseCalculator gc = new GlucoseCalculator();

        Double actualInsulin = gc.calcGlucInsulin(givenGlucose);
        Double expectedInsulin = 2.5;

        Assertions.assertEquals(expectedInsulin, actualInsulin);
    }

    @Test
    void calcGlucInsulinRoundUp() {
        Integer givenGlucose = 195;
        GlucoseCalculator gc = new GlucoseCalculator();

        Double actualInsulin = gc.calcGlucInsulin(givenGlucose);
        Double expectedInsulin = 2.5;

        Assertions.assertEquals(expectedInsulin, actualInsulin);
    }

    @Test
    void calcGlucInsulinRoundDown() {
        Integer givenGlucose = 205;
        GlucoseCalculator gc = new GlucoseCalculator();

        Double actualInsulin = gc.calcGlucInsulin(givenGlucose);
        Double expectedInsulin = 2.5;

        Assertions.assertEquals(expectedInsulin, actualInsulin);
    }

    @Test
    void calcGlucInsulinZero() {
        Integer givenGlucose = 109;
        GlucoseCalculator gc = new GlucoseCalculator();

        Double actualInsulin = gc.calcGlucInsulin(givenGlucose);
        Double expectedInsulin = 0.0;

        Assertions.assertEquals(expectedInsulin, actualInsulin);
    }

    @Test
    void calcGlucInsulinRoundUpPointFive() {
        Integer givenGlucose = 115;
        GlucoseCalculator gc = new GlucoseCalculator();

        Double actualInsulin = gc.calcGlucInsulin(givenGlucose);
        Double expectedInsulin = 0.5;

        Assertions.assertEquals(expectedInsulin, actualInsulin);
    }

    @Test
    void calcGlucInsulinRoundDownZero() {
        Integer givenGlucose = 105;
        GlucoseCalculator gc = new GlucoseCalculator();

        Double actualInsulin = gc.calcGlucInsulin(givenGlucose);
        Double expectedInsulin = 0.0;

        Assertions.assertEquals(expectedInsulin, actualInsulin);
    }



    @Test
    void calcCarbInsulin() {
        Integer givenCarbs = 11;
        GlucoseCalculator gc = new GlucoseCalculator();

        Double actualInsulin = gc.calcCarbInsulin(Double.valueOf(givenCarbs));
        Double expectedInsulin = 1.0;

        Assertions.assertEquals(expectedInsulin, actualInsulin);
    }

    @Test
    void calcCarbInsulin1() {
        Integer givenCarbs = 40;
        GlucoseCalculator gc = new GlucoseCalculator();

        Double actualInsulin = gc.calcCarbInsulin(Double.valueOf(givenCarbs));
        Double expectedInsulin = 3.5;

        Assertions.assertEquals(expectedInsulin, actualInsulin);
    }

    @Test
    void calcCarbInsulin2() {
        Double givenCarbs = 5.0;
        GlucoseCalculator gc = new GlucoseCalculator();

        Double actualInsulin = gc.calcCarbInsulin(givenCarbs);
        Double expectedInsulin = 0.5;

        Assertions.assertEquals(expectedInsulin, actualInsulin);
    }

    @Test
    void calcCarbInsulin3() {
        Double givenCarbs = 99.0;
        GlucoseCalculator gc = new GlucoseCalculator();

        Double actualInsulin = gc.calcCarbInsulin(givenCarbs);
        Double expectedInsulin = 9.0;

        Assertions.assertEquals(expectedInsulin, actualInsulin);
    }

    @Test
    void calcCarbInsulin4() {
        Double givenCarbs = 35.5;
        GlucoseCalculator gc = new GlucoseCalculator();

        Double actualInsulin = gc.calcCarbInsulin(givenCarbs);
        Double expectedInsulin = 3.0;

        Assertions.assertEquals(expectedInsulin, actualInsulin);
    }
    @Test
    void calcTotalInsulin() {
        Double givenCarbs = 35.5;
        Integer givenGlucose = 200;
        GlucoseCalculator gc = new GlucoseCalculator();

        Double actualInsulin = gc.calcTotalInsulin(givenGlucose, givenCarbs);
        Double expectedInsulin = 5.5;

        Assertions.assertEquals(expectedInsulin, actualInsulin);
    }
}