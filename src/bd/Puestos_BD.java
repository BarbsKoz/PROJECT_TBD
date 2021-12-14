package bd;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Puestos_BD extends ConexionSQL {
    
    public void obtenerPuestos (JTable tabla) {
        DefaultTableModel modelo = restablecerTabla(tabla);
        try{
            st = con.createStatement();
            String consulta = "SELECT * FROM PUESTOS";
            rs = st.executeQuery(consulta);
            
            Object[] fila = new Object[2];
            
            while(rs.next()){
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        }catch(Exception e){
            System.err.println("Error: " + e);
        }
    }
    
    public String obtenerIdPuesto (String puesto) {
        String id = "";
        try{
            st = con.createStatement();
            String consulta = "SELECT ID_PUESTO FROM PUESTOS WHERE PUESTO = '" + puesto + "'";
            rs = st.executeQuery(consulta);
            rs.next();
            
            id = rs.getInt(1) + "";
        }catch(Exception e){
            System.err.println("Error: " + e);
        }
        return id;
    }
    
    public boolean obtenerUsoPuesto (String idPuesto) {
        try {
            st = con.createStatement();
            String consulta = "SELECT COUNT(PUESTOS.ID_PUESTO) FROM PUESTOS, "
                    + "PUESTOS_PERSONAL WHERE PUESTOS.ID_PUESTO = PUESTOS_PERSONAL.ID_PERSONAL "
                    + "AND PUESTOS.ID_PUESTO = " + idPuesto;
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
    
    public int agregarPuesto (String puesto){
        int resultado;
        try{
            st = con.createStatement();
            String consulta = "INSERT INTO PUESTOS (PUESTO) VALUES ('" + puesto + "')";
            st.execute(consulta);
            
            st = con.createStatement();
            String verificar = "SELECT COUNT(ID_PUESTO) FROM PUESTOS "
                    + "WHERE PUESTO = '" + puesto + "'"; 
            rs = st.executeQuery(verificar);
            
            rs.next();
            
            if (rs.getInt(1) > 0) {
                System.out.println("Se agregó el puesto: " + puesto);
                resultado = 1;
            } else {
                System.err.println("No se añadió el puesto.");
                resultado = 0;
            }
        }catch(Exception e){
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }
    
    public int eliminarPuesto (String id) {
        int resultado;
        try {
            st = con.createStatement();
            String consulta = "DELETE FROM PUESTOS WHERE ID_PUESTO = " + id;
            st.execute(consulta);
            
            st = con.createStatement();
            String verificar = "SELECT COUNT(ID_PUESTO) FROM PUESTOS "
                    + "WHERE ID_PUESTO = " + id; 
            rs = st.executeQuery(verificar);
            
            rs.next();
            
            if (rs.getInt(1) == 0) {
                System.out.println("Se eliminó el puesto");
                resultado = 1;
            } else {
                System.err.println("No se borró el puesto");
                resultado = 0;
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }
    
    public int editarPuesto (String id, String puesto){
        int resultado;
        try {
            st = con.createStatement();
            String consulta = "UPDATE PUESTOS SET PUESTO = '" + puesto + "' WHERE ID_PUESTO = " + id;
            st.execute(consulta);
            
            st = con.createStatement();
            String verificar = "SELECT * FROM PUESTOS WHERE ID_PUESTO = " + id;
            rs = st.executeQuery(verificar);
            
            rs.next();
            
            if (rs.getString(2).equals(puesto)) {
                System.out.println("Se editó el puesto");
                resultado = 1;
            } else {
                System.err.println("No se editó el puesto");
                resultado = 0;
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }
}
