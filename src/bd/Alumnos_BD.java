package bd;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Alumnos_BD extends ConexionSQL {
 
    public int encontrarAlumno (String no_control, String nip){
        int resultado = -1;
        try{
            st = con.createStatement();
            String consulta = "SELECT COUNT(NO_CONTROL) FROM ALUMNO WHERE NO_CONTROL = " + no_control + " AND NIP = " + nip;
            rs = st.executeQuery(consulta);
            rs.next();
            
            if (rs.getInt(1) == 1) {
                System.out.println("Usuario encontrado");
                resultado = 1;
            } else {
                resultado = 0;
            }
        }catch(Exception e){
            System.err.println("Error: " + e);
        }
        return resultado;
    }
    
    public boolean encontrarAlumno(String noControl){
        try{
            st = con.createStatement();
            String consulta = "SELECT COUNT(NO_CONTROL) FROM ALUMNO "
                    + "WHERE NO_CONTROL = " + noControl;
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
    
    public String obtenerNombreAlumno (String no_control){
        String nombre = "";
        try{
            st = con.createStatement();
            String consulta = "SELECT NOMBRE_ALUMNO FROM ALUMNO WHERE NO_CONTROL = " + no_control;
            rs = st.executeQuery(consulta);
            rs.next();
            
            if (rs.getString(1) != null) {
                nombre = rs.getString(1);
            }
        }catch(Exception e){
            System.err.println("Error: " + e);
        }
        return nombre;
    }
    
    public void obtenerAlumnos (JTable tabla) {
        DefaultTableModel modelo = restablecerTabla(tabla);
        try{
            st = con.createStatement();
            String consulta = "SELECT NO_CONTROL, NOMBRE_ALUMNO, SEMESTRE, NOMBRE_CARRERA, "
                    + "FECHA_NACIMIENTO FROM ALUMNO, CARRERA WHERE ALUMNO.ID_CARRERA = CARRERA.ID_CARRERA";
            rs = st.executeQuery(consulta);
            
            Object[] fila = new Object[5];
            
            while(rs.next()){
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getInt(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getDate(5);
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        }catch(Exception e){
            System.err.println("Error: " + e);
        }
    }
    
    public Object[] obtenerAlumno (String noControl){
        Object[] objetos = new Object[16];
        try{
            st = con.createStatement();
            String consulta = "SELECT NO_CONTROL, NOMBRE_ALUMNO, SEMESTRE, NOMBRE_CARRERA, "
                    + "CORREO_ELECTRONICO,TELEFONO, DIRECCION, SEXO, FECHA_NACIMIENTO, "
                    + "ESTADO, PROMEDIO_GENERAL, PROMEDIO_SEMESTRE, CREDITOS_CURSADOS, "
                    + "CREDITOS_FALTANTES, ADEUDOS, NIP FROM ALUMNO, CARRERA "
                    + "WHERE ALUMNO.ID_CARRERA = CARRERA.ID_CARRERA AND NO_CONTROL = " + noControl;
            rs = st.executeQuery(consulta);
            
            while(rs.next()){
                objetos[0] = rs.getInt(1);
                objetos[1] = rs.getString(2);
                objetos[2] = rs.getInt(3);
                objetos[3] = rs.getString(4);
                objetos[4] = rs.getString(5);
                objetos[5] = rs.getString(6);
                objetos[6] = rs.getString(7);
                objetos[7] = rs.getString(8);
                objetos[8] = rs.getDate(9);
                objetos[9] = rs.getString(10);
                objetos[10] = rs.getDouble(11);
                objetos[11] = rs.getDouble(12);
                objetos[12] = rs.getInt(13);
                objetos[13] = rs.getInt(14);
                objetos[14] = rs.getString(15);
                objetos[15] = rs.getInt(16);
            }
        }catch(Exception e){
            System.err.println("Error: " + e);
        }
        return objetos;
    }
    
    public void obtenerClasesInscritasAlumno (JTable tabla, String noControl) {
        DefaultTableModel modelo = restablecerTabla(tabla);
        try{
            st = con.createStatement();
            String consulta = "SELECT CLASES.ID_CLASE, NOMBRE_MATERIA, IDENTIFICADOR_GRUPO, NOMBRE_PERSONAL, HORA, CALIFICACION " +
                    "FROM ALUMNO, INSCRITOS_CLASE, CLASES, MATERIAS, GRUPO, DOCENTE, PERSONAL_ESCOLAR " +
                    "WHERE ALUMNO.NO_CONTROL = INSCRITOS_CLASE.NO_CONTROL AND "
                    + "INSCRITOS_CLASE.ID_CLASE = CLASES.ID_CLASE AND " +
                    "CLASES.ID_MATERIA = MATERIAS.ID_MATERIA AND "
                    + "CLASES.ID_GRUPO = GRUPO.ID_GRUPO AND CLASES.ID_DOCENTE = DOCENTE.NO_CONTROL_DOCENTE AND " +
                    "DOCENTE.ID_PERSONAL = PERSONAL_ESCOLAR.ID_PERSONAL AND "
                    + "ALUMNO.NO_CONTROL = " + noControl + " AND ALUMNO.SEMESTRE = GRUPO.SEMESTRE";
            rs = st.executeQuery(consulta);
            
            Object[] fila = new Object[6];
            
            while(rs.next()){
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getTime(5);
                fila[5] = rs.getDouble(6);
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        }catch(Exception e){
            System.err.println("Error: " + e);
        }
    }
    
    public void obtenerKardexAlumno (JTable tabla, String noControl, String semestre) {
        DefaultTableModel modelo = restablecerTabla(tabla);
        try{
            st = con.createStatement();
            String consulta = "SELECT CLASES.ID_CLASE, NOMBRE_MATERIA, IDENTIFICADOR_GRUPO, NOMBRE_PERSONAL, HORA, CALIFICACION " +
                    "FROM ALUMNO, INSCRITOS_CLASE, CLASES, MATERIAS, GRUPO, DOCENTE, PERSONAL_ESCOLAR " +
                    "WHERE ALUMNO.NO_CONTROL = INSCRITOS_CLASE.NO_CONTROL AND "
                    + "INSCRITOS_CLASE.ID_CLASE = CLASES.ID_CLASE AND " +
                    "CLASES.ID_MATERIA = MATERIAS.ID_MATERIA AND "
                    + "CLASES.ID_GRUPO = GRUPO.ID_GRUPO AND CLASES.ID_DOCENTE = DOCENTE.NO_CONTROL_DOCENTE AND " +
                    "DOCENTE.ID_PERSONAL = PERSONAL_ESCOLAR.ID_PERSONAL AND "
                    + "ALUMNO.NO_CONTROL = " + noControl + " AND GRUPO.SEMESTRE = " + semestre;
            rs = st.executeQuery(consulta);
            
            Object[] fila = new Object[6];
            
            while(rs.next()){
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getTime(5);
                fila[5] = rs.getDouble(6);
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        }catch(Exception e){
            System.err.println("Error: " + e);
        }
    }
    
    public void obtenerBusquedaAlumno (JTable tabla, String nombre) {
        DefaultTableModel modelo = restablecerTabla(tabla);
        try{
            st = con.createStatement();
            String consulta = "SELECT NO_CONTROL, NOMBRE_ALUMNO, SEMESTRE, NOMBRE_CARRERA, "
                    + "FECHA_NACIMIENTO FROM ALUMNO, CARRERA WHERE ALUMNO.ID_CARRERA = CARRERA.ID_CARRERA"
                    + " AND NOMBRE_ALUMNO LIKE '%" + nombre + "%'";
            rs = st.executeQuery(consulta);
            
            Object[] fila = new Object[5];
            
            while(rs.next()){
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getInt(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getDate(5);
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        } catch(Exception e){
            System.err.println("Error: " + e);
        }
    }
    
    public int agregarAlumno (String noControl, String nombres,
            String idCarrera, String correoElectronico, String telefono, String direccion,
            String sexo, String fechaNacimiento, String nip){
        int resultado;
        try{
            st = con.createStatement();
            String consulta = "INSERT INTO ALUMNO VALUES (" + noControl + ", '" + 
                    nombres + "', 1, " + idCarrera + ", '" + correoElectronico + 
                    "', '" + telefono + "', '" + direccion + "', '" + sexo + "', '" +
                    fechaNacimiento + "', 'ACTIVO', 0, 0, 0, 0, 'N', " + nip + ")";
            st.execute(consulta);
            
            st = con.createStatement();
            String verificar = "SELECT COUNT(NO_CONTROL) FROM ALUMNO "
                    + "WHERE NO_CONTROL = " + noControl + " AND NIP = " + nip; 
            rs = st.executeQuery(verificar);
            
            rs.next();
            
            if (rs.getInt(1) > 0) {
                System.out.println("Se agregó el alumno");
                resultado = 1;
            } else {
                System.err.println("No se añadió el alumno");
                resultado = 0;
            }
        }catch(Exception e){
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }
}
