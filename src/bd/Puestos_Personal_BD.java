package bd;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Puestos_Personal_BD extends ConexionSQL {
    
    public void obtenerPersonalNoDocente (JTable tabla) {
        DefaultTableModel modelo = restablecerTabla(tabla);
        try{
            st = con.createStatement();
            String consulta = "SELECT ID_PERSONAL, NOMBRE_PERSONAL, FECHA_NACIMIENTO "
                    + "FROM PERSONAL_ESCOLAR WHERE ID_PERSONAL NOT IN (SELECT ID_PERSONAL FROM DOCENTE)";
            rs = st.executeQuery(consulta);
            
            Object[] fila = new Object[3];
            
            while(rs.next()){
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getDate(3);
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        } catch(Exception e){
            System.err.println("Error: " + e);
        }
    }
    
    public String[] obtenerPuestosFaltantesPersonal (String idPersonal) {
        String[] puestos = null;
        try{
            st = con.createStatement();
            String consulta = "SELECT COUNT(PUESTO) FROM PUESTOS WHERE ID_PUESTO NOT IN "
                    + "(SELECT ID_PUESTO FROM PUESTOS_PERSONAL WHERE ID_PERSONAL = " + idPersonal + ")";
            rs = st.executeQuery(consulta);
            rs.next();
            
            puestos = new String[rs.getInt(1)];
            
            st = con.createStatement();
            consulta = "SELECT PUESTO FROM PUESTOS WHERE ID_PUESTO NOT IN "
                    + "(SELECT ID_PUESTO FROM PUESTOS_PERSONAL WHERE ID_PERSONAL = " + idPersonal + ")";
            rs = st.executeQuery(consulta);
            
            for (int i = 0; i < puestos.length; i++) {
                rs.next();
                puestos[i] = rs.getString(1);
            }
        } catch(Exception e){
            System.err.println("Error: " + e);
        }
        return puestos;
    }
    
    public void obtenerClase (JTable tabla) {
        DefaultTableModel modelo = restablecerTabla(tabla);
        try{
            st = con.createStatement();
            String consulta = "SELECT ID_CLASE, IDENTIFICADOR_GRUPO, NOMBRE_MATERIA, NOMBRE_PERSONAL, HORA "
                    + "FROM CLASES, GRUPO, MATERIAS, DOCENTE, PERSONAL_ESCOLAR "
                    + "WHERE CLASES.ID_GRUPO = GRUPO.ID_GRUPO AND CLASES.ID_MATERIA = MATERIAS.ID_MATERIA AND "
                    + "CLASES.ID_DOCENTE = DOCENTE.NO_CONTROL_DOCENTE AND DOCENTE.ID_PERSONAL = PERSONAL_ESCOLAR.ID_PERSONAL";
            rs = st.executeQuery(consulta);
            
            Object[] fila = new Object[5];
            
            while(rs.next()){
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getTime(5);
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        } catch(Exception e){
            System.err.println("Error: " + e);
        }
    }
    
    public int agregarPuestoPersonal (String idPuesto, String idPersonal){
        int resultado;
        try{
            st = con.createStatement();
            String consulta = "INSERT INTO PUESTOS_PERSONAL VALUES (" + idPuesto + ", " + idPersonal + ")";
            st.execute(consulta);
            
            st = con.createStatement();
            String verificar = "SELECT COUNT(ID_PUESTO) FROM PUESTOS_PERSONAL "
                    + "WHERE ID_PUESTO = " + idPuesto + " AND ID_PERSONAL = " + idPersonal;
            rs = st.executeQuery(verificar);
            
            rs.next();
            
            if (rs.getInt(1) > 0) {
                System.out.println("Se agregó");
                resultado = 1;
            } else {
                System.err.println("No se añadió");
                resultado = 0;
            }
        }catch(Exception e){
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }
    
    public int eliminarPuestoPersonal (String idPuesto, String idPersonal) {
        int resultado;
        try {
            st = con.createStatement();
            String consulta = "DELETE FROM PUESTOS_PERSONAL WHERE ID_PERSONAL = " 
                    + idPersonal + "AND ID_PUESTO = " + idPuesto;
            st.execute(consulta);
            
            st = con.createStatement();
            String verificar = "SELECT COUNT(ID_PUESTO) FROM PUESTOS_PERSONAL "
                    + "WHERE ID_PERSONAL = " + idPersonal + " AND ID_PUESTO = " + idPuesto; 
            rs = st.executeQuery(verificar);
            
            rs.next();
            
            if (rs.getInt(1) == 0) {
                System.out.println("Se eliminó el puesto del personal");
                resultado = 1;
            } else {
                System.err.println("No se borró el puesto del personal");
                resultado = 0;
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }
}
