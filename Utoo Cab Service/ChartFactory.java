public class ChartFactory {

    public static Chart getChart(AbstractChartFactory factory) {
        return factory.createChart();
    }
}
