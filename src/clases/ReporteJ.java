package Clases;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class ReporteJ {

    PreparedStatement pst;
    ResultSet rs;
    String sql;
    String nameReporte = "";
    Map<String, Object> pams = new HashMap<String, Object>();

    public ReporteJ() {

    }

    public ReporteJ(String nameReporte) {
        this.nameReporte = nameReporte;
    }

    public void llamarReporte() {
        try (Connection con = new ConectarCloudcPanel("corporacionagama_mainbigmedic").getCon()) {
            String reporteName = "";
            String rutaReporte = "";
            JasperReport jasperReport;
            JasperPrint jasperPrintWindow;
            JasperViewer jasperViewer;

            switch (nameReporte) {

                case "kardex":
                    
                    
                    reporteName = "RP-Kardex.jrxml";
                    rutaReporte = (getClass().getResource("/reportes/") + reporteName);
                    
                    InputStream jasperStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("/reportes/"+reporteName);
                    jasperReport = (JasperReport) JRLoader.loadObject(jasperStream);

                    
                    //jasperReport= JasperCompileManager.compileReport(rutaReporte);
                    jasperPrintWindow = JasperFillManager.fillReport(jasperReport, pams, con);
                    jasperViewer = new JasperViewer(jasperPrintWindow, false);
                    jasperViewer.setVisible(true);

                    break;

                case "cotizacion":
                    reporteName = "rpPedidoDetalle.jrxml";
                    rutaReporte = (getClass().getResource("/reportes/") + reporteName);
                    jasperReport= JasperCompileManager.compileReport(rutaReporte);
                    jasperPrintWindow = JasperFillManager.fillReport(jasperReport, pams, con);
                    jasperViewer = new JasperViewer(jasperPrintWindow, false);
                    jasperViewer.setVisible(true);

                    break;

            }

        } catch (Exception e) {
            Logger.getLogger(ReporteJ.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Error con el manejo de base de datos, contacte con el adm.\n" + e);
        } finally {
            cerrar();
        }

    }

    public void setParametros(String tittle, Object value) {
        pams.put(tittle, value);
    }

    private void cerrar() {
        try {
            if (pst != null) {
                pst.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Kardex.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
