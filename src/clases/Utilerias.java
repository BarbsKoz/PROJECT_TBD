package clases;

import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Utilerias {
    
    public int convertirEntero (String sentencia) {
        int numeroConvertido = 0;
        try {
            numeroConvertido = Integer.parseInt(sentencia);
        } catch (NumberFormatException e) {
            numeroConvertido = -1;
        }
        return numeroConvertido;
    }
    
    public DefaultTableModel restablecerTabla (JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        
        while(modelo.getRowCount() != 0) {
            modelo.removeRow(0);
        }
        
        return modelo;
    }
}
