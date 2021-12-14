package bd;

public class Consultas extends ConexionSQL {
    
    public int iniciarSesion(String no_control, String nip){
        int tipoUsuario;
        Docente_BD ObjDocente = new Docente_BD();
        Alumnos_BD ObjAlumnos = new Alumnos_BD();
        Admin_BD ObjAdmin = new Admin_BD();
        
        int docente = 0, alumno = 0, admin = 0;
        if (convertirEntero(no_control) > 0) {
            docente = ObjDocente.encontrarDocente(no_control, nip);
            alumno = ObjAlumnos.encontrarAlumno(no_control, nip);
        } else {
            admin = ObjAdmin.iniciarSesion(no_control, nip);
        }
        
        if (docente == 1) {
            tipoUsuario = 1;
            System.out.println("Modo Docente");
        } else if (alumno == 1) {
            System.out.println("Modo Usuario");
            tipoUsuario = 2;
        }else if (admin == 1){
            tipoUsuario = 3;
            System.out.println("Modo Administrador");
        } else {
            System.err.println("Usuario no encontrado");
            tipoUsuario = -1;
        }
        return tipoUsuario;
    }
}
