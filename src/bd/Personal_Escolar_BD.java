package bd;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Personal_Escolar_BD extends ConexionSQL {
    
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
    
    public void obtenerPersonalNoAdministativo (JTable tabla) {
        DefaultTableModel modelo = restablecerTabla(tabla);
        try{
            st = con.createStatement();
            String consulta = "SELECT ID_PERSONAL, NOMBRE_PERSONAL, FECHA_NACIMIENTO "
                    + "FROM PERSONAL_ESCOLAR WHERE ID_PERSONAL NOT IN (SELECT ID_PERSONAL FROM ADMINISTRADOR)";
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
    
    public String obtenerNombrePersonal (String idPersonal) {
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
    
    public void obtenerBusquedaPersonal (JTable tabla, String nombre) {
        DefaultTableModel modelo = restablecerTabla(tabla);
        try{
            st = con.createStatement();
            String consulta = "SELECT * FROM PERSONAL_ESCOLAR "
                    + "WHERE NOMBRE_PERSONAL LIKE '%" + nombre + "%'";
            rs = st.executeQuery(consulta);
            
            Object[] fila = new Object[5];
            
            while(rs.next()){
                fila[0] = rs.getInt(7);
                fila[1] = rs.getString(1);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(5);
                fila[4] = rs.getString(6);
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        } catch(Exception e){
            System.err.println("Error: " + e);
        }
    }
    
    public void obtenerBusquedaPersonalNoDocente (JTable tabla, String nombre) {
        DefaultTableModel modelo = restablecerTabla(tabla);
        try{
            st = con.createStatement();
            String consulta = "SELECT ID_PERSONAL, NOMBRE_PERSONAL, FECHA_NACIMIENTO "
                    + "FROM PERSONAL_ESCOLAR WHERE ID_PERSONAL NOT IN (SELECT ID_PERSONAL FROM DOCENTE)"
                    + "AND NOMBRE_PERSONAL LIKE '%" + nombre + "%'";
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
    
    public void obtenerBusquedaPersonalNoAdministrativo (JTable tabla, String nombre) {
        DefaultTableModel modelo = restablecerTabla(tabla);
        try{
            st = con.createStatement();
            String consulta = "SELECT ID_PERSONAL, NOMBRE_PERSONAL, FECHA_NACIMIENTO "
                    + "FROM PERSONAL_ESCOLAR WHERE ID_PERSONAL NOT IN (SELECT ID_PERSONAL FROM ADMINISTRADOR)"
                    + "AND NOMBRE_PERSONAL LIKE '%" + nombre + "%'";
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
    
    public void obtenerPersonal (JTable tabla) {
        DefaultTableModel modelo = restablecerTabla(tabla);
        try{
            st = con.createStatement();
            String consulta = "SELECT * FROM PERSONAL_ESCOLAR";
            rs = st.executeQuery(consulta);
            
            Object[] fila = new Object[5];
            
            while(rs.next()){
                fila[0] = rs.getInt(7);
                fila[1] = rs.getString(1);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(5);
                fila[4] = rs.getString(6);
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        } catch(Exception e){
            System.err.println("Error: " + e);
        }
    }
    
    public Object[] obtenerPersonal (String idPersonal) {
        Object[] fila = new Object[6];
        try{
            st = con.createStatement();
            String consulta = "SELECT * FROM PERSONAL_ESCOLAR WHERE ID_PERSONAL = " + idPersonal;
            rs = st.executeQuery(consulta);
            
            while(rs.next()){
                fila[0] = rs.getString(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getString(5);
                fila[5] = rs.getDate(6);
            }
        } catch(Exception e){
            System.err.println("Error: " + e);
        }
        return fila;
    }
    
    public void obtenerPuestosPersonal (JList lista, String id) {
        DefaultListModel<String> modelo = new DefaultListModel<>();
        try{
            st = con.createStatement();
            String consulta = "SELECT PUESTO FROM PUESTOS WHERE ID_PUESTO IN "
                    + "(SELECT ID_PUESTO FROM PUESTOS_PERSONAL WHERE ID_PERSONAL = " + id + ")";
            rs = st.executeQuery(consulta);
            
            while(rs.next()){
                modelo.addElement(rs.getString(1));
            }
            lista.setModel(modelo);
        } catch(Exception e){
            System.err.println("Error: " + e);
        }
    }
    
    public int agregarPersonal (String nombrePersonal, String correo,
            String sexo, String direccion, String telefono, String fechaNacimiento){
        int resultado;
        try{
            st = con.createStatement();
            String consulta = "INSERT INTO PERSONAL_ESCOLAR (NOMBRE_PERSONAL, "
                    + "CORREO_ELECTRONICO, SEXO, DIRECCION, TELEFONO, FECHA_NACIMIENTO) "
                    + "VALUES ('" + nombrePersonal + "', '" + correo + "',  '" + sexo 
                    + "', '" + direccion + "', '" + telefono + "', '" + fechaNacimiento + "')";
            st.execute(consulta);
            
            st = con.createStatement();
            String verificar = "SELECT COUNT(ID_PERSONAL) FROM PERSONAL_ESCOLAR "
                    + "WHERE NOMBRE_PERSONAL = '" + nombrePersonal + "' AND SEXO = '" 
                    + sexo + "' AND FECHA_NACIMIENTO = '" + fechaNacimiento + "'"; 
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
    
    public int eliminarPersonal (String id) {
        int resultado;
        try {
            st = con.createStatement();
            String consulta = "DELETE FROM PERSONAL_ESCOLAR WHERE ID_PERSONAL = " + id;
            st.execute(consulta);
            
            st = con.createStatement();
            String verificar = "SELECT COUNT(ID_PERSONAL) FROM PERSONAL_ESCOLAR "
                    + "WHERE ID_PERSONAL = " + id; 
            rs = st.executeQuery(verificar);
            
            rs.next();
            
            if (rs.getInt(1) == 0) {
                System.out.println("Se eliminó el personal");
                resultado = 1;
            } else {
                System.err.println("No se borró el personal");
                resultado = 0;
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }
    
    public int editarPersonal (String id, String nombrePersonal, String correo,
            String sexo, String direccion, String telefono, String fechaNacimiento){
        int resultado;
        try {
            st = con.createStatement();
            String consulta = "UPDATE PERSONAL_ESCOLAR SET NOMBRE_PERSONAL = '" + nombrePersonal +
                    "', CORREO_ELECTRONICO = '" + correo + "', SEXO = '" + sexo + 
                    "', DIRECCION = '" + direccion + "', TELEFONO = '" + telefono + 
                    "', FECHA_NACIMIENTO = '" + fechaNacimiento + "' WHERE ID_PERSONAL = " + id;
            st.execute(consulta);
            
            st = con.createStatement();
            String verificar = "SELECT * FROM PERSONAL_ESCOLAR WHERE ID_PERSONAL = " + id;
            rs = st.executeQuery(verificar);
            
            rs.next();
            
            if (rs.getString(1).equals(nombrePersonal) && 
                    rs.getString(2).equals(correo) && rs.getString(3).equals(sexo) &&
                    rs.getString(4).equals(direccion) && rs.getString(5).equals(telefono) &&
                    rs.getString(6).equals(fechaNacimiento)) {
                System.out.println("Se editó el personal");
                resultado = 1;
            } else {
                System.err.println("No se editó el personal");
                resultado = 0;
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }
}
