public class ChennaiChartFactory implements AbstractChartFactory {
    public ChennaiChartFactory() {}

    @Override
    public Chart createChart() {
        return new ChennaiChart();
    }
}
