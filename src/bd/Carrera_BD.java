package bd;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Carrera_BD extends ConexionSQL {
    
    public void obtenerCarreras (JTable tabla) {
        DefaultTableModel modelo = restablecerTabla(tabla);
        try{
            st = con.createStatement();
            String consulta = "SELECT * FROM CARRERA";
            rs = st.executeQuery(consulta);
            
            Object[] fila = new Object[3];
            
            while(rs.next()){
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getInt(3);
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        }catch(Exception e){
            System.err.println("Error: " + e);
        }
    }
    
    public void obtenerCarrerasCB (JComboBox combo) {
        combo.removeAllItems();
        try{
            st = con.createStatement();
            String consulta = "SELECT NOMBRE_CARRERA FROM CARRERA";
            rs = st.executeQuery(consulta);
            
            while(rs.next()){
                combo.addItem(rs.getString(1));
            }
        }catch(Exception e){
            System.err.println("Error: " + e);
        }
    }
    
    public void obtenerCarrerasCBCustom (JComboBox combo) {
        combo.removeAllItems();
        try{
            st = con.createStatement();
            String consulta = "SELECT NOMBRE_CARRERA FROM CARRERA";
            rs = st.executeQuery(consulta);
            combo.addItem("- Selecciona una Carrera -");
            while(rs.next()){
                combo.addItem(rs.getString(1));
            }
        }catch(Exception e){
            System.err.println("Error: " + e);
        }
    }
    
    public String obtenerIdCarrera (String nombreCarrera) {
        String id = "";
        try {
            st = con.createStatement();
            String consulta = "SELECT ID_CARRERA FROM CARRERA WHERE NOMBRE_CARRERA = '" 
                    + nombreCarrera + "'";
            rs = st.executeQuery(consulta);
            
            rs.next();
            
            id = rs.getString(1);
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        return id;
    }
    
    public boolean obtenerUsoCarrera (String idCarrera) {
        try {
            st = con.createStatement();
            String consulta = "SELECT COUNT(CARRERA.ID_CARRERA) FROM CARRERA, ALUMNO "
                    + "WHERE CARRERA.ID_CARRERA = ALUMNO.ID_CARRERA AND CARRERA.ID_CARRERA = " + idCarrera;
            rs = st.executeQuery(consulta);
            
            rs.next();
            
            if (rs.getInt(1) > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
            return false;
        }
    }
    
    public int agregarCarrera (String nombreCarrera, String creditosCarrera){
        int resultado;
        try{
            st = con.createStatement();
            String consulta = "INSERT INTO CARRERA (NOMBRE_CARRERA, CREDITOS_CARRERA) "
                    + "VALUES ('" + nombreCarrera + "', " + creditosCarrera + ")";
            st.execute(consulta);
            
            st = con.createStatement();
            String verificar = "SELECT COUNT(ID_CARRERA) FROM CARRERA "
                    + "WHERE NOMBRE_CARRERA = '" + nombreCarrera + "' AND CREDITOS_CARRERA = " + creditosCarrera; 
            rs = st.executeQuery(verificar);
            
            rs.next();
            
            if (rs.getInt(1) > 0) {
                System.out.println("Se agregó la carrera: " + nombreCarrera);
                resultado = 1;
            } else {
                System.err.println("No se añadió la carrera");
                resultado = 0;
            }
        }catch(Exception e){
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }
    
    public int eliminarCarrera (String id) {
        int resultado;
        try {
            st = con.createStatement();
            String consulta = "DELETE FROM CARRERA WHERE ID_CARRERA = " + id;
            st.execute(consulta);
            
            st = con.createStatement();
            String verificar = "SELECT COUNT(ID_CARRERA) FROM CARRERA "
                    + "WHERE ID_CARRERA = " + id; 
            rs = st.executeQuery(verificar);
            
            rs.next();
            
            if (rs.getInt(1) == 0) {
                System.out.println("Se eliminó la carrera");
                resultado = 1;
            } else {
                System.err.println("No se borró la carrera");
                resultado = 0;
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }
    
    public int editarCarrera (String id, String nombreCarrera, String creditosCarrera){
        int resultado;
        try {
            st = con.createStatement();
            String consulta = "UPDATE CARRERA SET NOMBRE_CARRERA = '" +
                    nombreCarrera + "', CREDITOS_CARRERA = " + creditosCarrera + " WHERE ID_CARRERA = " + id;
            st.execute(consulta);
            
            st = con.createStatement();
            String verificar = "SELECT * FROM CARRERA WHERE ID_CARRERA = " + id;
            rs = st.executeQuery(verificar);
            
            rs.next();
            
            if (rs.getString(2).equals(nombreCarrera) && rs.getInt(3) == Integer.parseInt(creditosCarrera)) {
                System.out.println("Se editó la carrera");
                resultado = 1;
            } else {
                System.err.println("No se editó la carrera");
                resultado = 0;
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }
}
