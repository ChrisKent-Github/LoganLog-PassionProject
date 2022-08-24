public class Settings {
    static Integer carbRat;
    static Integer covFact;
    static Integer lowGluc;
    static Integer hiGluc;

    public  static Integer getCarbRat() {
        return carbRat;
    }

    public static void setCarbRat(Integer carbRatio) {
        carbRat = carbRatio;
    }

    public static Integer getCovFact() {
        return covFact;
    }

    public static void setCovFact(Integer covFactor) {
        covFact = covFactor;
    }

    public static Integer getLowGluc() {
        return lowGluc;
    }

    public static void setLowGluc(Integer lowGlucose) {
        lowGluc = lowGlucose;
    }

    public static Integer getHiGluc() {
        return hiGluc;
    }

    public static void setHiGluc(Integer hiGlucose) {
        hiGluc = hiGlucose;
    }
}
