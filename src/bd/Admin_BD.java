package bd;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Admin_BD extends ConexionSQL {

    public int iniciarSesion(String usuario, String contrasena) {
        int resultado = -1;
        try {
            st = con.createStatement();
            String consulta = "SELECT COUNT(ID_PERSONAL) FROM ADMINISTRADOR WHERE USUARIO = '"
                    + usuario + "' AND CONTRASENA_ACCESO = '" + contrasena + "'";
            rs = st.executeQuery(consulta);
            rs.next();

            if (rs.getInt(1) > 0) {
                System.out.println("Usuario encontrado");
                resultado = 1;
            } else {
                resultado = 0;
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        return resultado;
    }

    public String obtenerNombreAdmin(String usuario) {
        String nombre = "";
        try {
            st = con.createStatement();
            String consulta = "SELECT NOMBRE_PERSONAL FROM PERSONAL_ESCOLAR WHERE ID_PERSONAL IN "
                    + "(SELECT ID_PERSONAL FROM ADMINISTRADOR WHERE USUARIO = '" + usuario + "')";
            rs = st.executeQuery(consulta);
            rs.next();

            if (rs.getString(1) != null) {
                nombre = rs.getString(1);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        return nombre;
    }

    public String obtenerIdAdmin(String usuario) {
        String nombre = "";
        try {
            st = con.createStatement();
            String consulta = "SELECT ID_PERSONAL FROM ADMINISTRADOR WHERE USUARIO = '" + usuario + "'";
            rs = st.executeQuery(consulta);
            rs.next();

            if (rs.getString(1) != null) {
                nombre = rs.getString(1);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        return nombre;
    }

    public void obtenerAdministradores(JTable tabla) {
        DefaultTableModel modelo = restablecerTabla(tabla);
        try {
            st = con.createStatement();
            String consulta = "SELECT NOMBRE_PERSONAL, USUARIO, SEXO, FECHA_NACIMIENTO "
                    + "FROM PERSONAL_ESCOLAR, ADMINISTRADOR "
                    + "WHERE PERSONAL_ESCOLAR.ID_PERSONAL = ADMINISTRADOR.ID_PERSONAL";
            rs = st.executeQuery(consulta);

            Object[] fila = new Object[4];

            while (rs.next()) {
                fila[0] = rs.getString(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getDate(4);
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }

    public Object[] obtenerAdministrador(String user) {
        Object[] admin = new Object[5];
        try {
            st = con.createStatement();
            String consulta = "SELECT NOMBRE_PERSONAL, SEXO, FECHA_NACIMIENTO, USUARIO, "
                    + "CONTRASENA_ACCESO FROM PERSONAL_ESCOLAR, ADMINISTRADOR "
                    + "WHERE PERSONAL_ESCOLAR.ID_PERSONAL = ADMINISTRADOR.ID_PERSONAL AND "
                    + "USUARIO = '" + user + "'";
            rs = st.executeQuery(consulta);

            while (rs.next()) {
                admin[0] = rs.getString(1);
                admin[1] = rs.getString(2);
                admin[2] = rs.getDate(3);
                admin[3] = rs.getString(4);
                admin[4] = rs.getString(5);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        return admin;
    }

    public int agregarAdministrador(String idPersonal, String usuario, String pass) {
        int resultado;
        try {
            if (obtenerNombreAdmin(usuario).equals("")) {
                st = con.createStatement();
                String consulta = "INSERT INTO ADMINISTRADOR VALUES ('" + usuario + "', '"
                        + pass + "', " + idPersonal + ")";
                st.execute(consulta);

                st = con.createStatement();
                String verificar = "SELECT COUNT(ID_PERSONAL) FROM ADMINISTRADOR "
                        + "WHERE USUARIO = '" + usuario + "' AND CONTRASENA_ACCESO = '" + pass + "'";
                rs = st.executeQuery(verificar);

                rs.next();

                if (rs.getInt(1) > 0) {
                    System.out.println("Se agregó el administrador");
                    resultado = 1;
                } else {
                    System.err.println("No se añadió el administrador");
                    resultado = 0;
                }
            } else {
                // El usuario ya existe
                resultado = 2;
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }

    public int eliminarAdministrador(String usuario) {
        int resultado;
        try {
            st = con.createStatement();
            String consulta = "DELETE FROM ADMINISTRADOR WHERE USUARIO = '" + usuario + "'";
            st.execute(consulta);

            st = con.createStatement();
            String verificar = "SELECT COUNT(ID_PERSONAL) FROM ADMINISTRADOR "
                    + "WHERE USUARIO = '" + usuario + "'";
            rs = st.executeQuery(verificar);

            rs.next();

            if (rs.getInt(1) == 0) {
                System.out.println("Se eliminó el administrador");
                resultado = 1;
            } else {
                System.err.println("No se borró el administrador");
                resultado = 0;
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }

    public int editarAdministrador(String id, String user, String pass) {
        int resultado;
        try {
            st = con.createStatement();
            String consulta = "UPDATE ADMINISTRADOR SET USUARIO = '" + user
                    + "', CONTRASENA_ACCESO = '" + pass + "' WHERE ID_PERSONAL = " + id;
            st.execute(consulta);

            st = con.createStatement();
            String verificar = "SELECT * FROM ADMINISTRADOR WHERE ID_PERSONAL = " + id;
            rs = st.executeQuery(verificar);

            rs.next();

            if (rs.getString(1).equals(user) && rs.getString(2).equals(pass)) {
                resultado = 1;
            } else {
                resultado = 0;
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }
}
