public class HyderabadChartFactory implements AbstractChartFactory{

    public HyderabadChartFactory() {}

    @Override
    public Chart createChart() {
        return new HyderabadChart();
    }
}
