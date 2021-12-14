package bd;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Grupos_BD extends ConexionSQL {
    
    public void obtenerGrupo (JTable tabla) {
        DefaultTableModel modelo = restablecerTabla(tabla);
        try{
            st = con.createStatement();
            String consulta = "SELECT ID_GRUPO, IDENTIFICADOR_GRUPO, SEMESTRE, NOMBRE_CARRERA "
                    + "FROM GRUPO, CARRERA WHERE GRUPO.ID_CARRERA = CARRERA.ID_CARRERA";
            rs = st.executeQuery(consulta);
            
            Object[] fila = new Object[4];
            
            while(rs.next()){
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getInt(3);
                fila[3] = rs.getString(4);
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        } catch(Exception e){
            System.err.println("Error: " + e);
        }
    }
    
    public void obtenerGruposCB (JComboBox combo) {
        combo.removeAllItems();
        try{
            st = con.createStatement();
            String consulta = "SELECT IDENTIFICADOR_GRUPO FROM GRUPO";
            rs = st.executeQuery(consulta);
            
            while(rs.next()){
                combo.addItem(rs.getString(1));
            }
        }catch(Exception e){
            System.err.println("Error: " + e);
        }
    }
    
    public String obtenerIdGrupo (String identificadorGrupo) {
        String id = "";
        try {
            st = con.createStatement();
            String consulta = "SELECT ID_GRUPO FROM GRUPO WHERE IDENTIFICADOR_GRUPO = '" 
                    + identificadorGrupo + "'";
            rs = st.executeQuery(consulta);
            
            rs.next();
            
            id = rs.getString(1);
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        return id;
    }
    
    public void obtenerClasesGrupo (JTable tabla, String idGrupo) {
        DefaultTableModel modelo = restablecerTabla(tabla);
        try{
            st = con.createStatement();
            String consulta = "SELECT ID_CLASE, NOMBRE_MATERIA, NOMBRE_PERSONAL, HORA, NOMBRE_CARRERA "
                    + "FROM CLASES, GRUPO, MATERIAS, DOCENTE, PERSONAL_ESCOLAR, CARRERA "
                    + "WHERE CLASES.ID_GRUPO = GRUPO.ID_GRUPO AND GRUPO.ID_CARRERA = CARRERA.ID_CARRERA AND "
                    + "CLASES.ID_MATERIA = MATERIAS.ID_MATERIA AND "
                    + "CLASES.ID_DOCENTE = DOCENTE.NO_CONTROL_DOCENTE AND "
                    + "DOCENTE.ID_PERSONAL = PERSONAL_ESCOLAR.ID_PERSONAL AND CLASES.ID_GRUPO = " + idGrupo;
            rs = st.executeQuery(consulta);
            
            Object[] fila = new Object[5];
            
            while(rs.next()){
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getTime(4);
                fila[4] = rs.getString(5);
                modelo.addRow(fila);
            }
            for (int i = 0; i < modelo.getRowCount(); i++) {
                modelo.setValueAt(obtenerAlumnosClase(modelo.getValueAt(i, 0).toString()), i, 5);
            }
            tabla.setModel(modelo);
        } catch(Exception e){
            System.err.println("Error: " + e);
        }
    }
    
    public String obtenerAlumnosClase(String idClase){
        String alumnos;
        try{
            st = con.createStatement();
            String consulta = "SELECT COUNT(NO_CONTROL) FROM INSCRITOS_CLASE "
                    + "WHERE ID_CLASE = " + idClase + " GROUP BY ID_CLASE";
            rs = st.executeQuery(consulta);
            rs.next();
            
            alumnos = rs.getInt(1) + "";
        } catch(Exception e){
            alumnos = "0";
        }
        return alumnos;
    }
    
    public boolean verificarEmpalmeGrupo (String idGrupo, String hora) {
        try{
            st = con.createStatement();
            String consulta = "SELECT COUNT(ID_CLASE) FROM CLASES "
                    + "WHERE ID_GRUPO = " + idGrupo + " AND HORA = '" + hora + "'";
            rs = st.executeQuery(consulta);
            rs.next();
            
            if (rs.getInt(1) > 0) {
                return true;
            }
            
        } catch(Exception e){
            System.err.println("Error: " + e);
        }
        return false;
    }
    
    public boolean verificarEmpalmeGrupo (String idGrupo, String hora, String idClase) {
        try{
            st = con.createStatement();
            String consulta = "SELECT COUNT(ID_CLASE) FROM CLASES "
                    + "WHERE ID_GRUPO = " + idGrupo + " AND HORA = '" + hora 
                    + "' AND ID_CLASE != " + idClase;
            rs = st.executeQuery(consulta);
            rs.next();
            
            if (rs.getInt(1) > 0) {
                return true;
            }
            
        } catch(Exception e){
            System.err.println("Error: " + e);
        }
        return false;
    }
    
    public boolean verificarMateriaRepetidaGrupo (String idGrupo, String idMateria) {
        try{
            st = con.createStatement();
            String consulta = "SELECT COUNT(ID_CLASE) FROM CLASES "
                    + "WHERE ID_GRUPO = " + idGrupo + " AND ID_MATERIA = '" + idMateria + "'";
            rs = st.executeQuery(consulta);
            rs.next();
            
            if (rs.getInt(1) > 0) {
                return true;
            }
            
        } catch(Exception e){
            System.err.println("Error: " + e);
        }
        return false;
    }
    
    public boolean verificarNombreRepetidoGrupo (String identificadorGrupo) {
        try{
            st = con.createStatement();
            String consulta = "SELECT COUNT(ID_GRUPO) FROM GRUPO "
                    + "WHERE IDENTIFICADOR_GRUPO = '" + identificadorGrupo + "'";
            rs = st.executeQuery(consulta);
            rs.next();
            
            if (rs.getInt(1) > 0) {
                return true;
            }
            
        } catch(Exception e){
            System.err.println("Error: " + e);
        }
        return false;
    }
    
    public boolean verificarNombreRepetidoGrupo (String identificadorGrupo, String idGrupo) {
        try{
            st = con.createStatement();
            String consulta = "SELECT COUNT(ID_GRUPO) FROM GRUPO "
                    + "WHERE IDENTIFICADOR_GRUPO = '" + identificadorGrupo + "' AND"
                    + " ID_GRUPO != " + idGrupo;
            rs = st.executeQuery(consulta);
            rs.next();
            
            if (rs.getInt(1) > 0) {
                return true;
            }
            
        } catch(Exception e){
            System.err.println("Error: " + e);
        }
        return false;
    }
    
    public int agregarGrupo (String identificadorGrupo, String semestre, String idCarrera){
        int resultado;
        try{
            st = con.createStatement();
            String consulta = "INSERT INTO GRUPO (IDENTIFICADOR_GRUPO, SEMESTRE, ID_CARRERA) "
                    + "VALUES ('" + identificadorGrupo + "', " + semestre + ",  " + idCarrera + ")";
            st.execute(consulta);
            
            st = con.createStatement();
            String verificar = "SELECT COUNT(ID_GRUPO) FROM GRUPO "
                    + "WHERE IDENTIFICADOR_GRUPO = '" + identificadorGrupo +
                    "' AND SEMESTRE = " + semestre + " AND ID_CARRERA = " + idCarrera; 
            rs = st.executeQuery(verificar);
            
            rs.next();
            
            if (rs.getInt(1) > 0) {
                System.out.println("Se agregó el grupo: " + identificadorGrupo);
                resultado = 1;
            } else {
                System.err.println("No se añadió el grupo.");
                resultado = 0;
            }
        }catch(Exception e){
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }
    
    public int eliminarGrupo (String id) {
        int resultado;
        try {
            st = con.createStatement();
            String consulta = "DELETE FROM GRUPO WHERE ID_GRUPO = " + id;
            st.execute(consulta);
            
            st = con.createStatement();
            String verificar = "SELECT COUNT(ID_GRUPO) FROM GRUPO "
                    + "WHERE ID_GRUPO = " + id; 
            rs = st.executeQuery(verificar);
            
            rs.next();
            
            if (rs.getInt(1) == 0) {
                System.out.println("Se eliminó el grupo");
                resultado = 1;
            } else {
                System.err.println("No se borró el grupo");
                resultado = 0;
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }
    
    public int editarGrupo (String id, String identificadorGrupo, String semestre, String idCarrera){
        int resultado;
        try {
            st = con.createStatement();
            String consulta = "UPDATE GRUPO SET IDENTIFICADOR_GRUPO = '" + identificadorGrupo +
                    "', SEMESTRE = " + semestre + ", ID_CARRERA = " + idCarrera + " WHERE ID_GRUPO = " + id;
            st.execute(consulta);
            
            st = con.createStatement();
            String verificar = "SELECT * FROM GRUPO WHERE ID_GRUPO = " + id;
            rs = st.executeQuery(verificar);
            
            rs.next();
            
            if (rs.getString(2).equals(identificadorGrupo) &&
                    rs.getInt(3) == Integer.parseInt(semestre) &&
                    rs.getInt(4) == Integer.parseInt(idCarrera)) {
                System.out.println("Se editó el grupo");
                resultado = 1;
            } else {
                System.err.println("No se editó el grupo");
                resultado = 0;
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }
}
