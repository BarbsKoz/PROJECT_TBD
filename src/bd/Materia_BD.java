package bd;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Materia_BD extends ConexionSQL {
    
    public void obtenerMateria (JTable tabla) {
        DefaultTableModel modelo = restablecerTabla(tabla);
        try{
            st = con.createStatement();
            String consulta = "SELECT * FROM MATERIAS ORDER BY NOMBRE_MATERIA ASC";
            rs = st.executeQuery(consulta);
            
            Object[] fila = new Object[3];
            
            while(rs.next()){
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getInt(3);
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        } catch(Exception e){
            System.err.println("Error: " + e);
        }
    }
    
    public void obtenerMateriasCB (JComboBox combo) {
        combo.removeAllItems();
        try{
            st = con.createStatement();
            String consulta = "SELECT NOMBRE_MATERIA FROM MATERIAS ORDER BY NOMBRE_MATERIA ASC";
            rs = st.executeQuery(consulta);
            
            while(rs.next()){
                combo.addItem(rs.getString(1));
            }
        }catch(Exception e){
            System.err.println("Error: " + e);
        }
    }
    
    public String obtenerIdMateria (String nombreMateria) {
        String id = "";
        try {
            st = con.createStatement();
            String consulta = "SELECT ID_MATERIA FROM MATERIAS WHERE NOMBRE_MATERIA = '" 
                    + nombreMateria + "'";
            rs = st.executeQuery(consulta);
            
            rs.next();
            
            id = rs.getString(1);
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        return id;
    }
    
    public boolean obtenerUsoMateria (String idMateria) {
        try {
            st = con.createStatement();
            String consulta = "SELECT COUNT(MATERIAS.ID_MATERIA) FROM MATERIAS,"
                    + " CLASES WHERE MATERIAS.ID_MATERIA = CLASES.ID_MATERIA AND"
                    + " MATERIAS.ID_MATERIA = " + idMateria;
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
    
    public int agregarMateria (String materia, String creditosMateria){
        int resultado;
        try{
            st = con.createStatement();
            String consulta = "INSERT INTO MATERIAS (NOMBRE_MATERIA, CREDITOS_MATERIA) "
                    + "VALUES ('" + materia + "', " + creditosMateria + ")";
            st.execute(consulta);
            
            st = con.createStatement();
            String verificar = "SELECT COUNT(ID_MATERIA) FROM MATERIAS "
                    + "WHERE NOMBRE_MATERIA = '" + materia + "' AND CREDITOS_MATERIA = " + creditosMateria; 
            rs = st.executeQuery(verificar);
            
            rs.next();
            
            if (rs.getInt(1) > 0) {
                System.out.println("Se agregó la materia: " + materia);
                resultado = 1;
            } else {
                System.err.println("No se añadió la materia.");
                resultado = 0;
            }
        }catch(Exception e){
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }
    
    public int eliminarMateria (String id) {
        int resultado;
        try {
            st = con.createStatement();
            String consulta = "DELETE FROM MATERIAS WHERE ID_MATERIA = " + id;
            st.execute(consulta);
            
            st = con.createStatement();
            String verificar = "SELECT COUNT(ID_MATERIA) FROM MATERIAS "
                    + "WHERE ID_MATERIA = " + id; 
            rs = st.executeQuery(verificar);
            
            rs.next();
            
            if (rs.getInt(1) == 0) {
                System.out.println("Se eliminó la materia");
                resultado = 1;
            } else {
                System.err.println("No se borró la materia");
                resultado = 0;
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }
    
    public int editarMateria (String id, String materia, String creditosMateria){
        int resultado;
        try {
            st = con.createStatement();
            String consulta = "UPDATE MATERIAS SET NOMBRE_MATERIA = '" + materia +
                    "', CREDITOS_MATERIA = " + creditosMateria + " WHERE ID_MATERIA = " + id;
            st.execute(consulta);
            
            st = con.createStatement();
            String verificar = "SELECT * FROM MATERIAS WHERE ID_MATERIA = " + id;
            rs = st.executeQuery(verificar);
            
            rs.next();
            
            if (rs.getString(2).equals(materia) && rs.getInt(3) == Integer.parseInt(creditosMateria)) {
                System.out.println("Se editó la materia");
                resultado = 1;
            } else {
                System.err.println("No se editó la materia");
                resultado = 0;
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }
}
