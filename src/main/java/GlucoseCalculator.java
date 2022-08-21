import java.time.format.DateTimeFormatter;

public class GlucoseCalculator {
    Integer glucose;
    Double totalCarbs;


    public Double calcGlucInsulin (Integer glucose){
        Settings settings = new Settings();
        return (glucose - 100.0)/settings.getCovFact();
    }

    public Double calcCarbInsulin (Double totalCarbs){
        Settings settings = new Settings();
        return (totalCarbs/settings.getCarbRat());
    }

    public Double calcTotalInsulin (Integer glucose, Double totalCarbs){
        return calcGlucInsulin(glucose) + calcCarbInsulin(totalCarbs);
    }

}
