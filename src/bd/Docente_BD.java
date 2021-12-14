package bd;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Docente_BD extends ConexionSQL {
    
    public void obtenerClaseDocente (JTable tabla, String noControlDocente) {
        DefaultTableModel modelo = restablecerTabla(tabla);
        try{
            st = con.createStatement();
            String consulta = "SELECT ID_CLASE, IDENTIFICADOR_GRUPO, NOMBRE_MATERIA, HORA "
                    + "FROM CLASES, GRUPO, MATERIAS, DOCENTE "
                    + "WHERE CLASES.ID_GRUPO = GRUPO.ID_GRUPO AND CLASES.ID_MATERIA = MATERIAS.ID_MATERIA AND "
                    + "CLASES.ID_DOCENTE = DOCENTE.NO_CONTROL_DOCENTE AND NO_CONTROL_DOCENTE = " + noControlDocente;
            rs = st.executeQuery(consulta);
            
            Object[] fila = new Object[5];
            
            while(rs.next()){
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getTime(4);
                modelo.addRow(fila);
            }
            for (int i = 0; i < modelo.getRowCount(); i++) {
                modelo.setValueAt(obtenerAlumnosClase(modelo.getValueAt(i, 0).toString()), i, 4);
            }
            tabla.setModel(modelo);
        } catch(Exception e){
            System.err.println("Error: " + e);
        }
    }
    
    public Object[] obtenerClasesDocente (String noControlDocente) {
        Object[] objetos = null;
        try{
            st = con.createStatement();
            String consulta = "SELECT COUNT(ID_CLASE) FROM CLASES "
                    + "WHERE CLASES.ID_DOCENTE = " + noControlDocente;
            rs = st.executeQuery(consulta);
            
            rs.next();
            int tamano = rs.getInt(1);
            if (tamano > 0) {
                objetos = new Object[tamano];
            } else {
                return null;
            }
            
            st = con.createStatement();
            consulta = "SELECT ID_CLASE, IDENTIFICADOR_GRUPO, NOMBRE_MATERIA "
                    + "FROM CLASES, GRUPO, MATERIAS, DOCENTE "
                    + "WHERE CLASES.ID_GRUPO = GRUPO.ID_GRUPO AND CLASES.ID_MATERIA = MATERIAS.ID_MATERIA AND "
                    + "CLASES.ID_DOCENTE = DOCENTE.NO_CONTROL_DOCENTE AND NO_CONTROL_DOCENTE = " + noControlDocente;
            rs = st.executeQuery(consulta);
            
            rs.next();
            
            String[] fila;
            for (int i = 0; i < tamano; i++) {
                fila = new String[3];
                fila[0] = rs.getInt(1) + "";
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                objetos[i] = fila;
                rs.next();
            }
        } catch(Exception e){
            System.err.println("Error: " + e);
        }
        return objetos;
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
    
    public int encontrarDocente (String no_control, String nip){
        int resultado = -1;
        try{
            st = con.createStatement();
            String consulta = "SELECT COUNT(NO_CONTROL_DOCENTE) FROM DOCENTE "
                    + "WHERE NO_CONTROL_DOCENTE = " + no_control + " AND NIP = " + nip;
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
    
    public void obtenerDocentes (JTable tabla) {
        DefaultTableModel modelo = restablecerTabla(tabla);
        try{
            st = con.createStatement();
            String consulta = "SELECT NO_CONTROL_DOCENTE, NOMBRE_PERSONAL, SEXO, TELEFONO, FECHA_NACIMIENTO "
                    + "FROM DOCENTE, PERSONAL_ESCOLAR WHERE PERSONAL_ESCOLAR.ID_PERSONAL = DOCENTE.ID_PERSONAL";
            rs = st.executeQuery(consulta);
            
            Object[] fila = new Object[5];
            
            while(rs.next()){
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getDate(5);
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        } catch(Exception e){
            System.err.println("Error: " + e);
        }
    }
    
    public void obtenerDocentesCambio (JComboBox combo, String noControl) {
        combo.removeAllItems();
        try{
            st = con.createStatement();
            String consulta = "SELECT NOMBRE_PERSONAL "
                    + "FROM PERSONAL_ESCOLAR, DOCENTE "
                    + "WHERE PERSONAL_ESCOLAR.ID_PERSONAL = DOCENTE.ID_PERSONAL AND "
                    + "DOCENTE.NO_CONTROL_DOCENTE != " + noControl;
            rs = st.executeQuery(consulta);
            
            while(rs.next()){
                combo.addItem(rs.getString(1));
            }
        } catch(Exception e){
            System.err.println("Error: " + e);
        }
    }
    
    public Object[] obtenerDocente(String noControl){
        Object[] datosDocente = new Object[9];
        try{
            st = con.createStatement();
            String consulta = "SELECT PERSONAL_ESCOLAR.ID_PERSONAL, NOMBRE_PERSONAL, SEXO, FECHA_NACIMIENTO, "
                    + "DIRECCION, TELEFONO, CORREO_ELECTRONICO, NO_CONTROL_DOCENTE, NIP "
                    + "FROM DOCENTE, PERSONAL_ESCOLAR WHERE PERSONAL_ESCOLAR.ID_PERSONAL = DOCENTE.ID_PERSONAL "
                    + "AND DOCENTE.NO_CONTROL_DOCENTE = " + noControl;
            rs = st.executeQuery(consulta);
            
            while(rs.next()){
                datosDocente[0] = rs.getInt(1);
                datosDocente[1] = rs.getString(2);
                datosDocente[2] = rs.getString(3);
                datosDocente[3] = rs.getDate(4);
                datosDocente[4] = rs.getString(5);
                datosDocente[5] = rs.getString(6);
                datosDocente[6] = rs.getString(7);
                datosDocente[7] = rs.getInt(8);
                datosDocente[8] = rs.getInt(9);
            }
        } catch(Exception e){
            System.err.println("Error: " + e);
        }
        return datosDocente;
    }
    
    public void obtenerBusquedaDocente (JTable tabla, String nombre) {
        DefaultTableModel modelo = restablecerTabla(tabla);
        try{
            st = con.createStatement();
            String consulta = "SELECT NO_CONTROL_DOCENTE, NOMBRE_PERSONAL, SEXO, TELEFONO, FECHA_NACIMIENTO "
                    + "FROM PERSONAL_ESCOLAR, DOCENTE WHERE DOCENTE.ID_PERSONAL = PERSONAL_ESCOLAR.ID_PERSONAL"
                    + " AND NOMBRE_PERSONAL LIKE '%" + nombre + "%'";
            rs = st.executeQuery(consulta);
            
            Object[] fila = new Object[5];
            
            while(rs.next()){
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getDate(5);
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        } catch(Exception e){
            System.err.println("Error: " + e);
        }
    }
    
    public boolean verificarEmpalmeDocente (String noControl, String hora) {
        try{
            st = con.createStatement();
            String consulta = "SELECT COUNT(ID_DOCENTE) FROM CLASES "
                    + "WHERE ID_DOCENTE = " + noControl + " AND HORA = '" + hora + "'";
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
    
    public boolean verificarEmpalmeDocente (String noControl, String hora, String idClase) {
        try{
            st = con.createStatement();
            String consulta = "SELECT COUNT(ID_DOCENTE) FROM CLASES "
                    + "WHERE ID_DOCENTE = " + noControl + " AND HORA = '" 
                    + hora + "' AND ID_CLASE != " + idClase;
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
    
    public boolean encontrarDocente(String noControl){
        try{
            st = con.createStatement();
            String consulta = "SELECT COUNT(NO_CONTROL_DOCENTE) FROM DOCENTE "
                    + "WHERE NO_CONTROL_DOCENTE = " + noControl;
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
    
    public String obtenerNombreDocente (String idPersonal) {
        String nombre = "";
        try{
            st = con.createStatement();
            String consulta = "SELECT NOMBRE_PERSONAL FROM PERSONAL_ESCOLAR "
                    + "WHERE ID_PERSONAL  = " + idPersonal + "";
            rs = st.executeQuery(consulta);
            
            rs.next();
            nombre = rs.getString(1);
            
        } catch(Exception e){
            System.err.println("Error: " + e);
        }
        return nombre;
    }
    
    public String obtenerNomDocente (String noControl) {
        String nombre = "";
        try{
            st = con.createStatement();
            String consulta = "SELECT NOMBRE_PERSONAL FROM PERSONAL_ESCOLAR "
                    + "WHERE ID_PERSONAL IN (SELECT ID_PERSONAL FROM DOCENTE "
                    + "WHERE NO_CONTROL_DOCENTE = " + noControl + ")";
            rs = st.executeQuery(consulta);
            
            rs.next();
            nombre = rs.getString(1);
            
        } catch(Exception e){
            System.err.println("Error: " + e);
        }
        return nombre;
    }
    
    public String obtenerNoControl (String id) {
        String nombre = "";
        try{
            st = con.createStatement();
            String consulta = "SELECT NO_CONTROL_DOCENTE FROM DOCENTE "
                    + "WHERE ID_PERSONAL  = " + id + "";
            rs = st.executeQuery(consulta);
            
            rs.next();
            nombre = rs.getString(1);
            
        } catch(Exception e){
            System.err.println("Error: " + e);
        }
        return nombre;
    }
    
    public void obtenerDocentesCB (JComboBox combo) {
        combo.removeAllItems();
        try{
            st = con.createStatement();
            String consulta = "SELECT NOMBRE_PERSONAL FROM PERSONAL_ESCOLAR "
                    + "WHERE ID_PERSONAL IN (SELECT ID_PERSONAL FROM DOCENTE)";
            rs = st.executeQuery(consulta);
            
            while(rs.next()){
                combo.addItem(rs.getString(1));
            }
        }catch(Exception e){
            System.err.println("Error: " + e);
        }
    }
    
    public String obtenerNoControlDocente (String nombre) {
        String id = "";
        try {
            st = con.createStatement();
            String consulta = "SELECT NO_CONTROL_DOCENTE FROM DOCENTE "
                    + "WHERE ID_PERSONAL IN (SELECT ID_PERSONAL FROM PERSONAL_ESCOLAR "
                    + "WHERE NOMBRE_PERSONAL = '" + nombre + "')";
            rs = st.executeQuery(consulta);
            
            rs.next();
            
            id = rs.getString(1);
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        return id;
    }
    
    public int agregarDocente (String noControl, String nip, String idPersonal){
        int resultado;
        try{
            st = con.createStatement();
            String consulta = "INSERT INTO DOCENTE (NO_CONTROL_DOCENTE, NIP, ID_PERSONAL) "
                    + "VALUES (" + noControl + ", " + nip + ",  " + idPersonal + ")";
            st.execute(consulta);
            
            st = con.createStatement();
            String verificar = "SELECT COUNT(ID_PERSONAL) FROM DOCENTE "
                    + "WHERE NO_CONTROL_DOCENTE = " + noControl +
                    " AND NIP = " + nip + " AND ID_PERSONAL = " + idPersonal; 
            rs = st.executeQuery(verificar);
            
            rs.next();
            
            if (rs.getInt(1) > 0) {
                System.out.println("Se agregó el docente");
                resultado = 1;
            } else {
                System.err.println("No se añadió el docente");
                resultado = 0;
            }
        }catch(Exception e){
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }
    
    public int eliminarDocente (String noControl) {
        int resultado;
        try {
            st = con.createStatement();
            String consulta = "DELETE FROM DOCENTE WHERE NO_CONTROL_DOCENTE = " + noControl;
            st.execute(consulta);
            
            st = con.createStatement();
            String verificar = "SELECT COUNT(NO_CONTROL_DOCENTE) FROM DOCENTE "
                    + "WHERE NO_CONTROL_DOCENTE = " + noControl; 
            rs = st.executeQuery(verificar);
            
            rs.next();
            
            if (rs.getInt(1) == 0) {
                System.out.println("Se eliminó el docente");
                resultado = 1;
            } else {
                System.err.println("No se borró el docente");
                resultado = 0;
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }
    
    public int editarDocente (String id, String nombreDocente, String sexo, String fechaNacimiento,
            String direccion, String telefono, String correoElectronico, String noControl, String nip){
        int resultado;
        try {
            st = con.createStatement();
            String consulta = "UPDATE PERSONAL_ESCOLAR SET NOMBRE_PERSONAL = '" + nombreDocente +
                    "', CORREO_ELECTRONICO = '" + correoElectronico + "', SEXO = '" + sexo + 
                    "', DIRECCION = '" + direccion + "', TELEFONO = '" + telefono + 
                    "', FECHA_NACIMIENTO = '" + fechaNacimiento + "' WHERE ID_PERSONAL = " + id;
            st.execute(consulta);
            
            st = con.createStatement();
            String verificar = "SELECT * FROM PERSONAL_ESCOLAR WHERE ID_PERSONAL = " + id;
            rs = st.executeQuery(verificar);
            
            rs.next();
            
            if (rs.getString(1).equals(nombreDocente) &&
                    rs.getString(2).equals(correoElectronico) && rs.getString(3).equals(sexo) &&
                    rs.getString(4).equals(direccion) && rs.getString(5).equals(telefono) &&
                    rs.getDate(6).toString().equals(fechaNacimiento)) {
                resultado = 1;
            } else {
                resultado = 0;
            }
            
            st = con.createStatement();
            consulta = "UPDATE DOCENTE SET NO_CONTROL_DOCENTE = " + noControl +
                    ", NIP = " + nip + " WHERE ID_PERSONAL = " + id;
            st.execute(consulta);
            
            st = con.createStatement();
            verificar = "SELECT * FROM DOCENTE WHERE ID_PERSONAL = " + id;
            rs = st.executeQuery(verificar);
            
            rs.next();
            
            if (rs.getInt(1) == Integer.parseInt(noControl) &&
                    rs.getInt(2) == Integer.parseInt(nip)) {
                resultado = 1;
            } else {
                resultado = 0;
            }
            
            if (resultado == 1) {
                System.out.println("Se editó el docente");
            } else {
                System.out.println("No se editó el docente");
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }
}
