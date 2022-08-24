import java.time.format.DateTimeFormatter;

public class GlucoseCalculator {
    Integer glucose;
    Double totalCarbs;


    public Double calcGlucInsulin (Integer glucose){
        return Math.round(((glucose - 100.0)/Settings.getCovFact()) * 2) /2.0;
    }

    public Double calcCarbInsulin (Double totalCarbs){
        return Math.round((totalCarbs/Settings.getCarbRat()) * 2) /2.0;
    }

    public Double calcTotalInsulin (Integer glucose, Double totalCarbs){
        return Math.round((calcGlucInsulin(glucose) + calcCarbInsulin(totalCarbs)) * 2) / 2.0;
    }

}
