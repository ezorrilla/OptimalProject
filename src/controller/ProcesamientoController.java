
package controller;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.geom.Point2D;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Proyecto;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.XYTextAnnotation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import view.frmProcesamiento;

public class ProcesamientoController {
    
    public static frmProcesamiento form = new frmProcesamiento();
    public static Proyecto proyecto = new Proyecto();
    private static double mayorX;
    private static double mayorY;
    
    public static void mostrar () { 
        formInit();
        form.setLocationRelativeTo(null); 
        form.setVisible(true);
    }
    public static void ocultar () { form.setVisible(false);} 
    
    
    private static void formInit(){
        
        proyecto.getRestricciones().forEach(restriccion -> {
            
            mayorX = restriccion.getEjeX() > mayorX ? restriccion.getEjeX() : mayorX;
            mayorY = restriccion.getEjeX() > mayorY ? restriccion.getEjeX() : mayorY;
        });
        
        form.getLblVariableX().setText(proyecto.getFuncionObjetivo().getVariableX());        
        form.getLblVariableY().setText(proyecto.getFuncionObjetivo().getVariableY());
    }
    
    public static void maximizar(){
        optimizarProyecto(proyecto.getFuncionObjetivo().Max);        
    }
    
    public static void minimizar(){
        optimizarProyecto(proyecto.getFuncionObjetivo().Min);
    }
    
    private static void optimizarProyecto(String objetivo){
        int coefX = Integer.parseInt(form.getSpnCoefXObjetivo().getValue().toString());
        int coefY = Integer.parseInt(form.getSpnCoefYObjetivo().getValue().toString());
        
        if (coefX > 0 && coefY > 0){
            
            proyecto.intersectarRectas();
            proyecto.getFuncionObjetivo().setCoefX( coefX );
            proyecto.getFuncionObjetivo().setCoefY( coefY );
            proyecto.getFuncionObjetivo().calcularObjetivo(proyecto.getVertices(), objetivo);
            
            graficar();
            
            form.getLblSugerencia().setText(proyecto.getFuncionObjetivo().toString());
            System.out.println(proyecto.getRestricciones().toString());
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese coeficientes del objetivo mayores a cero.", "Validación", JOptionPane.WARNING_MESSAGE);
        } 
    }
    
    public static void graficar(){
        // Create dataset  
        
        JPanel chartPanel = createChartPanel();       
        form.add(chartPanel, BorderLayout.CENTER);
        
        form.getPnlGrafico().setLayout(new java.awt.BorderLayout());
        form.getPnlGrafico().add(chartPanel);
        form.getPnlGrafico().validate();
    }
    
    private static JPanel createChartPanel() {  
        String chartTitle = "Gráfica de la programación Lineal";
        String xAxisLabel = proyecto.getFuncionObjetivo().getVariableX();
        String yAxisLabel = proyecto.getFuncionObjetivo().getVariableY();

        XYDataset dataset = createDataset();

        JFreeChart chart = ChartFactory.createXYLineChart(chartTitle, 
                xAxisLabel, yAxisLabel, dataset);

        customizeChart(chart);        
        
        for (Point2D.Double v : proyecto.getVertices()) {
            XYPlot plot = chart.getXYPlot();
            XYTextAnnotation textAnnotaion = new XYTextAnnotation("("+v.x+","+v.y+")", v.x, v.y);
            plot.addAnnotation(textAnnotaion);
            
        }
        // saves the chart as an image files
        /*File imageFile = new File("XYLineChart.png");
        int width = 640;
        int height = 480;

        try {
            ChartUtilities.saveChartAsPNG(imageFile, chart, width, height);
        } catch (IOException ex) {
            System.err.println(ex);
        }*/

        return new ChartPanel(chart);
    }
        
    private static XYDataset createDataset() { 
        XYSeriesCollection dataset = new XYSeriesCollection();                    
        
        proyecto.getRestricciones().forEach(restriccion -> {            
            XYSeries recta = new XYSeries(restriccion.getDescripcion());
            if(restriccion.isDiagonal()){
                recta.add(restriccion.getEjeX(), 0);
                recta.add(0, restriccion.getEjeY());  
            }
            
            if(restriccion.isHorizontal()){
                recta.add(0, restriccion.getEjeY());
                recta.add(mayorX + 2, restriccion.getEjeY());
            }
            
            if(restriccion.isVertical()){
                recta.add(restriccion.getEjeX(), 0);
                recta.add(restriccion.getEjeX(), mayorY + 2);
            }
            
            dataset.addSeries(recta);
        });
        
        /*XYSeries series1 = new XYSeries("Object 1");
        XYSeries series2 = new XYSeries("Object 2");
        XYSeries series3 = new XYSeries("Object 3");

        series1.add(1.0, 2.0);
        series1.add(2.0, 3.0);
        series1.add(3.0, 2.5);
        series1.add(3.5, 2.8);
        series1.add(4.2, 6.0);

        series2.add(2.0, 1.0);
        series2.add(2.5, 2.4);
        series2.add(3.2, 1.2);
        series2.add(3.9, 2.8);
        series2.add(4.6, 3.0);

        series3.add(1.2, 4.0);
        series3.add(2.5, 4.4);
        series3.add(3.8, 4.2);
        series3.add(4.3, 3.8);
        series3.add(4.5, 4.0);

        dataset.addSeries(series1);
        dataset.addSeries(series2);
        dataset.addSeries(series3);*/

        return dataset;
    }
    
    private static void customizeChart(JFreeChart chart) {   // here we make some customization
        XYPlot plot = chart.getXYPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();

        Random rand = new Random();
        
        for (int i = 0; i < proyecto.getRestricciones().size(); i++) {            
            int r = rand.nextInt(255);
            int g = rand.nextInt(255);
            int b = rand.nextInt(255);

            renderer.setSeriesPaint(i, new Color(r, g, b));
            
            renderer.setSeriesStroke(i, new BasicStroke(4.0f));
        }
        
        /*// sets paint color for each series
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesPaint(1, Color.GREEN);
        renderer.setSeriesPaint(2, Color.YELLOW);

        // sets thickness for series (using strokes)
        renderer.setSeriesStroke(0, new BasicStroke(4.0f));
        renderer.setSeriesStroke(1, new BasicStroke(3.0f));
        renderer.setSeriesStroke(2, new BasicStroke(2.0f));*/

        // sets paint color for plot outlines
        plot.setOutlinePaint(Color.BLUE);
        plot.setOutlineStroke(new BasicStroke(2.0f));

        // sets renderer for lines
        plot.setRenderer(renderer);

        // sets plot background
        plot.setBackgroundPaint(Color.DARK_GRAY);

        // sets paint color for the grid lines
        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.BLACK);

        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.BLACK);

    }
    
}
