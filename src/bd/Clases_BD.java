package bd;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Clases_BD extends ConexionSQL {

    public void obtenerClases(JTable tabla) {
        DefaultTableModel modelo = restablecerTabla(tabla);
        try {
            st = con.createStatement();
            String consulta = "SELECT ID_CLASE, IDENTIFICADOR_GRUPO, NOMBRE_MATERIA, NOMBRE_PERSONAL, HORA "
                    + "FROM CLASES, GRUPO, MATERIAS, DOCENTE, PERSONAL_ESCOLAR "
                    + "WHERE CLASES.ID_GRUPO = GRUPO.ID_GRUPO AND CLASES.ID_MATERIA = MATERIAS.ID_MATERIA AND "
                    + "CLASES.ID_DOCENTE = DOCENTE.NO_CONTROL_DOCENTE AND DOCENTE.ID_PERSONAL = PERSONAL_ESCOLAR.ID_PERSONAL";
            rs = st.executeQuery(consulta);

            Object[] fila = new Object[5];

            while (rs.next()) {
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getTime(5);
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }

    public Object[] obtenerClase(String idClase) {
        Object[] clase = new Object[5];
        try {
            st = con.createStatement();
            String consulta = "SELECT ID_CLASE, IDENTIFICADOR_GRUPO, NOMBRE_MATERIA, NOMBRE_PERSONAL, HORA "
                    + "FROM CLASES, GRUPO, MATERIAS, DOCENTE, PERSONAL_ESCOLAR "
                    + "WHERE CLASES.ID_GRUPO = GRUPO.ID_GRUPO AND CLASES.ID_MATERIA = MATERIAS.ID_MATERIA AND "
                    + "CLASES.ID_DOCENTE = DOCENTE.NO_CONTROL_DOCENTE AND DOCENTE.ID_PERSONAL = PERSONAL_ESCOLAR.ID_PERSONAL "
                    + "AND ID_CLASE = " + idClase;
            rs = st.executeQuery(consulta);

            while (rs.next()) {
                clase[0] = rs.getInt(1);
                clase[1] = rs.getString(2);
                clase[2] = rs.getString(3);
                clase[3] = rs.getString(4);
                clase[4] = rs.getTime(5);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        return clase;
    }

    public void obtenerAlumnosClase(JTable tabla, String idClase) {
        DefaultTableModel modelo = restablecerTabla(tabla);
        try {
            st = con.createStatement();
            String consulta = "SELECT ID_CLASE, ALUMNO.NO_CONTROL, NOMBRE_ALUMNO, "
                    + "SEMESTRE, CORREO_ELECTRONICO, CALIFICACION "
                    + "FROM INSCRITOS_CLASE, ALUMNO "
                    + "WHERE INSCRITOS_CLASE.NO_CONTROL = ALUMNO.NO_CONTROL AND "
                    + "INSCRITOS_CLASE.ID_CLASE = " + idClase;
            rs = st.executeQuery(consulta);

            Object[] fila = new Object[6];

            while (rs.next()) {
                fila[0] = rs.getInt(1);
                fila[1] = rs.getInt(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getInt(4);
                fila[4] = rs.getString(5);
                fila[5] = rs.getString(6);
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }

    public void obtenerAlumnosNoInscritosClase(JTable tabla, String idClase) {
        DefaultTableModel modelo = restablecerTabla(tabla);
        try {
            st = con.createStatement();
            String consulta = "SELECT NO_CONTROL, NOMBRE_ALUMNO, NOMBRE_CARRERA, SEMESTRE "
                    + "FROM CARRERA, ALUMNO WHERE ALUMNO.ID_CARRERA = CARRERA.ID_CARRERA AND "
                    + "ALUMNO.NO_CONTROL NOT IN (SELECT NO_CONTROL FROM INSCRITOS_CLASE WHERE ID_CLASE = " + idClase + ") ";
            rs = st.executeQuery(consulta);

            Object[] fila = new Object[4];

            while (rs.next()) {
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getInt(4);
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }

    public void obtenerBusquedaAlumnosNoInscritosClase(JTable tabla, String idClase,
            String nombreAlumno, String semestre) {
        DefaultTableModel modelo = restablecerTabla(tabla);
        try {
            st = con.createStatement();
            String consulta = "SELECT NO_CONTROL, NOMBRE_ALUMNO, NOMBRE_CARRERA, SEMESTRE "
                    + "FROM CARRERA, ALUMNO WHERE ALUMNO.ID_CARRERA = CARRERA.ID_CARRERA AND "
                    + "ALUMNO.NO_CONTROL NOT IN (SELECT NO_CONTROL FROM INSCRITOS_CLASE "
                    + "WHERE ID_CLASE = " + idClase + ") ";

            if (!nombreAlumno.equals("") && semestre.equals("")) {
                consulta += "AND NOMBRE_ALUMNO LIKE '%" + nombreAlumno + "%'";
            } else if (!nombreAlumno.equals("") && !semestre.equals("")) {
                consulta += "AND NOMBRE_ALUMNO LIKE '%" + nombreAlumno + "%' "
                        + "AND SEMESTRE = " + semestre;
            } else if (nombreAlumno.equals("") && !semestre.equals("")) {
                consulta += "AND SEMESTRE = " + semestre;
            }

            rs = st.executeQuery(consulta);

            Object[] fila = new Object[4];

            while (rs.next()) {
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getInt(4);
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }

    public void obtenerBusquedaAlumnosClase(JTable tabla, String idClase, String nombre) {
        DefaultTableModel modelo = restablecerTabla(tabla);
        try {
            st = con.createStatement();
            String consulta = "SELECT ID_CLASE, ALUMNO.NO_CONTROL, NOMBRE_ALUMNO, "
                    + "SEMESTRE, CORREO_ELECTRONICO, CALIFICACION "
                    + "FROM INSCRITOS_CLASE, ALUMNO "
                    + "WHERE INSCRITOS_CLASE.NO_CONTROL = ALUMNO.NO_CONTROL AND "
                    + "INSCRITOS_CLASE.ID_CLASE = " + idClase + " AND "
                    + "NOMBRE_ALUMNO LIKE '%" + nombre + "%'";
            rs = st.executeQuery(consulta);

            Object[] fila = new Object[6];

            while (rs.next()) {
                fila[0] = rs.getInt(1);
                fila[1] = rs.getInt(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getInt(4);
                fila[4] = rs.getString(5);
                fila[5] = rs.getString(6);
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }

    public void obtenerClaseDocente(JTable tabla, String noControlDocente) {
        DefaultTableModel modelo = restablecerTabla(tabla);
        try {
            st = con.createStatement();
            String consulta = "SELECT ID_CLASE, IDENTIFICADOR_GRUPO, NOMBRE_MATERIA, HORA "
                    + "FROM CLASES, GRUPO, MATERIAS, DOCENTE "
                    + "WHERE CLASES.ID_GRUPO = GRUPO.ID_GRUPO AND CLASES.ID_MATERIA = MATERIAS.ID_MATERIA AND "
                    + "CLASES.ID_DOCENTE = DOCENTE.NO_CONTROL_DOCENTE AND NO_CONTROL_DOCENTE = " + noControlDocente;
            rs = st.executeQuery(consulta);

            Object[] fila = new Object[4];

            while (rs.next()) {
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getTime(4);
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }

    public int subirCalificaciones(String idClase, String noControl, String calificacion) {
        int resultado;
        try {
            st = con.createStatement();
            String consulta = "UPDATE INSCRITOS_CLASE SET CALIFICACION = " + calificacion
                    + " WHERE ID_CLASE = " + idClase + " AND NO_CONTROL = " + noControl;
            st.execute(consulta);

            st = con.createStatement();
            String verificar = "SELECT * FROM INSCRITOS_CLASE WHERE ID_CLASE = "
                    + idClase + " AND NO_CONTROL = " + noControl;
            rs = st.executeQuery(verificar);

            rs.next();

            if (rs.getInt(3) == Integer.parseInt(calificacion)) {
                System.out.println("Se le añadió la califacion");
                resultado = 1;
            } else {
                System.err.println("No se le añadió la califacion");
                resultado = 0;
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }
    
    public int darAltaAlumno (String idClase, String noControl) {
        int resultado;
        try {
            st = con.createStatement();
            String consulta = "INSERT INTO INSCRITOS_CLASE (ID_CLASE, NO_CONTROL) "
                    + "VALUES (" + idClase + ", " + noControl + ")";
            st.execute(consulta);

            st = con.createStatement();
            String verificar = "SELECT * FROM INSCRITOS_CLASE WHERE ID_CLASE = "
                    + idClase + " AND NO_CONTROL = " + noControl;
            rs = st.executeQuery(verificar);

            rs.next();

            if (rs.getInt(2) == Integer.parseInt(noControl)) {
                System.out.println("Se dió de alta el alumno");
                resultado = 1;
            } else {
                System.err.println("No se dió de alta el alumno");
                resultado = 0;
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }
    
    public int darBajaAlumno (String idClase, String noControl) {
        int resultado;
        try {
            st = con.createStatement();
            String consulta = "DELETE FROM INSCRITOS_CLASE "
                    + "WHERE ID_CLASE = " + idClase + "AND NO_CONTROL = " + noControl;
            st.execute(consulta);

            st = con.createStatement();
            String verificar = "SELECT COUNT(NO_CONTROL) FROM INSCRITOS_CLASE WHERE ID_CLASE = "
                    + idClase + " AND NO_CONTROL = " + noControl;
            rs = st.executeQuery(verificar);

            rs.next();

            if (rs.getInt(1) == 0) {
                System.out.println("Se dió de baja el alumno");
                resultado = 1;
            } else {
                System.err.println("No se dió de baja el alumno");
                resultado = 0;
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }

    public int agregarClase(String idGrupo, String idMateria, String idDocente, String hora) {
        int resultado;
        try {
            st = con.createStatement();
            String consulta = "INSERT INTO CLASES (ID_GRUPO, ID_MATERIA, ID_DOCENTE, HORA) "
                    + "VALUES ('" + idGrupo + "', " + idMateria + ",  " + idDocente + ", '" + hora + "')";
            st.execute(consulta);

            st = con.createStatement();
            String verificar = "SELECT COUNT(ID_CLASE) FROM CLASES "
                    + "WHERE ID_GRUPO = '" + idGrupo
                    + "' AND ID_MATERIA = " + idMateria + " AND ID_DOCENTE = " + idDocente
                    + "AND HORA = '" + hora + "'";
            rs = st.executeQuery(verificar);

            rs.next();

            if (rs.getInt(1) > 0) {
                System.out.println("Se agregó la clase");
                resultado = 1;
            } else {
                System.err.println("No se añadió la clase.");
                resultado = 0;
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }

    public int eliminarClase(String id) {
        int resultado;
        try {
            st = con.createStatement();
            String consulta = "DELETE FROM CLASES WHERE ID_CLASE = " + id;
            st.execute(consulta);

            st = con.createStatement();
            String verificar = "SELECT COUNT(ID_CLASE) FROM CLASES "
                    + "WHERE ID_CLASE = " + id;
            rs = st.executeQuery(verificar);

            rs.next();

            if (rs.getInt(1) == 0) {
                System.out.println("Se eliminó la clase");
                resultado = 1;
            } else {
                System.err.println("No se borró la clase");
                resultado = 0;
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }

    public int editarClase(String id, String idGrupo, String idMateria, String idDocente, String hora) {
        int resultado;
        try {
            st = con.createStatement();
            String consulta = "UPDATE CLASES SET ID_GRUPO = " + idGrupo
                    + ", ID_MATERIA = " + idMateria + ", ID_DOCENTE = " + idDocente
                    + ", HORA = '" + hora + "' WHERE ID_CLASE = " + id;
            st.execute(consulta);

            st = con.createStatement();
            String verificar = "SELECT * FROM CLASES WHERE ID_CLASE = " + id;
            rs = st.executeQuery(verificar);

            rs.next();

            if (rs.getInt(2) == Integer.parseInt(idGrupo)
                    && rs.getInt(3) == Integer.parseInt(idMateria)
                    && rs.getInt(4) == Integer.parseInt(idDocente)
                    && rs.getString(5).substring(0, 5).equals(hora)) {
                System.out.println("Se editó la clase");
                resultado = 1;
            } else {
                System.err.println("No se editó la clase");
                resultado = 0;
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }
    
    public int cederClase(String id, String idDocente) {
        int resultado;
        try {
            st = con.createStatement();
            String consulta = "UPDATE CLASES SET ID_DOCENTE = " + idDocente
                    + "WHERE ID_CLASE = " + id;
            st.execute(consulta);

            st = con.createStatement();
            String verificar = "SELECT ID_DOCENTE FROM CLASES WHERE ID_CLASE = " + id;
            rs = st.executeQuery(verificar);

            rs.next();

            if (rs.getInt(1) == Integer.parseInt(idDocente)) {
                System.out.println("Se cedió la clase");
                resultado = 1;
            } else {
                System.err.println("No se cedió la clase");
                resultado = 0;
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
            resultado = -1;
        }
        return resultado;
    }
}
