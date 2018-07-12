public class UtooRateCharts {
    public static void main(String args[]) {
        Chart hyd = ChartFactory.getChart(new HyderabadChartFactory());
        Chart ben = ChartFactory.getChart(new BengaluruChartFactory());
        Chart chen = ChartFactory.getChart(new ChennaiChartFactory());
        hyd.getRateChart();
        ben.getRateChart();
        chen.getRateChart();
    }
}
