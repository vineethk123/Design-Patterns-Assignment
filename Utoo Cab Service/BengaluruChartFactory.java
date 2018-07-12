public class BengaluruChartFactory implements AbstractChartFactory {

    public BengaluruChartFactory() {}

    @Override
    public Chart createChart() {
        return new BengaluruChart();
    }
}
