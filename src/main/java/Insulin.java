import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Insulin extends GlucoseCalculator {
    Double insulin;
    DateTimeFormatter dateTime;


    public Insulin (Double carbs, Integer glucose){
        GlucoseCalculator gc = new GlucoseCalculator();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.insulin = gc.calcTotalInsulin(glucose, carbs);
        this.dateTime = DateTimeFormatter.ofPattern(dtf.format(now));
        this.totalCarbs = carbs;
        this.glucose = glucose;
    }

    public Insulin (Double carbs){
        GlucoseCalculator gc = new GlucoseCalculator();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.insulin = gc.calcCarbInsulin(carbs);
        this.dateTime = DateTimeFormatter.ofPattern(dtf.format(now));
        this.totalCarbs = carbs;
    }

    public Insulin (Integer glucose){
        GlucoseCalculator gc = new GlucoseCalculator();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        this.insulin = gc.calcGlucInsulin(glucose);
        this.dateTime = DateTimeFormatter.ofPattern(dtf.format(now));
        this.glucose = glucose;
    }

    public Double getInsulin() {
        return insulin;
    }

    public void setInsulin(Double insulin) {
        this.insulin = insulin;
    }

    public DateTimeFormatter getDateTime() {
        return dateTime;
    }

    public void setDateTime(DateTimeFormatter dateTime) {
        this.dateTime = dateTime;
    }
}
