package kata3;

public class Kata3 {
    public static void main(String[] args) {
        Histogram <String> histogram = new Histogram();
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("hotmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("ulpgc.es");
        HistogramDisplay HistogramDisplay = new HistogramDisplay(histogram);
        HistogramDisplay.execute();
    }  
}