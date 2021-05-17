
package controller;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Polygon;
import java.awt.geom.Point2D;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Proyecto;
import model.Restriccion;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.XYPolygonAnnotation;
import org.jfree.chart.annotations.XYTextAnnotation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.Layer;
import org.jfree.ui.TextAnchor;
import view.frmProcesamiento;

public class ProcesamientoController {
    
    public static frmProcesamiento form = new frmProcesamiento();
    public static Proyecto proyecto = new Proyecto();
    private static double mayorX;
    private static double mayorY;
    private static JFreeChart chart;
    
    public static void mostrar () { 
        formInit();
        form.setLocationRelativeTo(null); 
        form.setVisible(true);
    }
    
    public static void reiniciado () { proyecto = new Proyecto(); form = new frmProcesamiento(); }
    
    public static void ocultar () { form.setVisible(false);} 
    
    public static void dataPrueba(){
        /*proyecto.getFuncionObjetivo().setVariableX("pantalones");
        proyecto.getFuncionObjetivo().setVariableY("camisas");
        Restriccion r1 = new Restriccion();
        r1.setDescripcion("res1"); r1.setCoefX(1); r1.setCoefY(0); r1.setLimite("<="); r1.setR(4); r1.tabularRecta();
        Restriccion r2 = new Restriccion();
        r2.setDescripcion("res2"); r2.setCoefX(0); r2.setCoefY(2); r2.setLimite("<="); r2.setR(12); r2.tabularRecta();
        Restriccion r3 = new Restriccion();
        r3.setDescripcion("res3"); r3.setCoefX(3); r3.setCoefY(2); r3.setLimite("<="); r3.setR(18); r3.tabularRecta();
        proyecto.getRestricciones().add(r1);
        proyecto.getRestricciones().add(r2);
        proyecto.getRestricciones().add(r3);
        
        proyecto.setEmpresa("Textil Camones");
        proyecto.setActividad("confeccionar");
        proyecto.getFuncionObjetivo().setVariableX("pantalones");
        proyecto.getFuncionObjetivo().setVariableY("camisas");
        Restriccion r2 = new Restriccion();
        r2.setDescripcion("res2"); r2.setCoefX(4); r2.setCoefY(8); r2.setLimite("<="); r2.setR(480); r2.tabularRecta();
        Restriccion r3 = new Restriccion();
        r3.setDescripcion("res3"); r3.setCoefX(12); r3.setCoefY(8); r3.setLimite("<="); r3.setR(540); r3.tabularRecta();
        proyecto.getRestricciones().add(r2);
        proyecto.getRestricciones().add(r3);*/
    }
    
    private static void formInit(){
        form.getLblVariableX().setText(proyecto.getFuncionObjetivo().getVariableX().toUpperCase());        
        form.getLblVariableY().setText(proyecto.getFuncionObjetivo().getVariableY().toUpperCase());
        proyecto.getRestricciones().forEach(restriccion -> {
            
            mayorX = restriccion.getEjeX() > mayorX ? restriccion.getEjeX() : mayorX;
            mayorY = restriccion.getEjeX() > mayorY ? restriccion.getEjeX() : mayorY;
        });
        
        proyecto.intersectarRectas();
        graficar();
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
        
        if(form.getTxtDescripcionZ().getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese una descripción de lo que quiere optimizar.", "Validación", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (coefX <= 0 || coefY <= 0){
            JOptionPane.showMessageDialog(null, "Ingrese coeficientes del objetivo mayores a cero.", "Validación", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        proyecto.getFuncionObjetivo().setDescripcionZ(form.getTxtDescripcionZ().getText());
            
        proyecto.getFuncionObjetivo().setCoefX( coefX );
        proyecto.getFuncionObjetivo().setCoefY( coefY );
        proyecto.getFuncionObjetivo().calcularObjetivo(proyecto.getVertices(), objetivo);
        graficarPuntoOptimo();

        form.getLblSugerencia().setText(proyecto.getInterpretacionObjetivo());
        form.getLblRestricciones().setText(proyecto.getInterpretacionRestricciones());
        System.out.println(proyecto.getRestricciones().toString());
        
    }
    
    public static void graficar(){
        // Create dataset          
        JPanel chartPanel = createChartPanel();       
        form.add(chartPanel, BorderLayout.CENTER);
        
        form.getPnlGrafico().setLayout(new java.awt.BorderLayout());
        form.getPnlGrafico().add(chartPanel);
        form.getPnlGrafico().validate();
    }
    
    private static void graficarPuntoOptimo(){
        XYPlot plot = chart.getXYPlot();
        JPanel chartPanel = new ChartPanel(chart);
        form.add(chartPanel, BorderLayout.CENTER);
        XYTextAnnotation textAnnotaion = new XYTextAnnotation("● Z Óptimo", proyecto.getFuncionObjetivo().getX() , proyecto.getFuncionObjetivo().getY());
            textAnnotaion.setFont(new Font("Tahoma", Font.BOLD, 20));
            textAnnotaion.setPaint(Color.RED);
            textAnnotaion.setTextAnchor(TextAnchor.CENTER_LEFT);
            plot.addAnnotation(textAnnotaion);
        
        form.setPnlGrafico(chartPanel);
        form.getPnlGrafico().validate();
    }
    
    private static JPanel createChartPanel() {  
        String chartTitle = "Gráfica de la programación Lineal";
        String xAxisLabel = proyecto.getFuncionObjetivo().getVariableX();
        String yAxisLabel = proyecto.getFuncionObjetivo().getVariableY();

        XYDataset dataset = createDataset();

        chart = ChartFactory.createXYLineChart(chartTitle, 
                xAxisLabel, yAxisLabel, dataset);

        customizeChart(chart);        
        
        for (Point2D.Double v : proyecto.getVertices()) {
            XYPlot plot = chart.getXYPlot();
            XYTextAnnotation textAnnotaion = new XYTextAnnotation("("+v.x+", "+v.y+")", v.x+ (mayorX*0.07), v.y + (mayorY*0.04));
            //textAnnotaion.setRotationAngle(-70.0);
            textAnnotaion.setFont(new Font("Tahoma", Font.BOLD, 11));
            textAnnotaion.setPaint(new Color(244, 246, 247));
            //textAnnotaion.setTextAnchor(TextAnchor.BOTTOM_LEFT);
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
        
        double[] polygon = new double[proyecto.getVertices().size()*2];
        for (int i = 0; i < proyecto.getVertices().size(); i++) {
            Point2D.Double get = proyecto.getVertices().get(i);
            polygon[i*2] = get.x;
            polygon[i*2+1] = get.y;
        }
        
        XYPolygonAnnotation a = new XYPolygonAnnotation(polygon, null, null,
                new Color(200, 200, 255, 100));
        a.setToolTipText("Target Zone");
        renderer.addAnnotation(a, Layer.BACKGROUND);
        plot.addAnnotation(a);
            
        /*// sets paint color for each series
        renderer.setSeriesPaint(0, Color.RED);*/

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
