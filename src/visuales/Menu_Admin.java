package visuales;

import bd.*;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Menu_Admin extends javax.swing.JFrame {

    private final String usuario;
    private int panelActual = 1;
    private Admin_BD ObjAdmin;
    private Alumnos_BD ObjAlumnos;
    private Docente_BD ObjDocentes;
    private Carrera_BD ObjCarrera;
    private Puestos_BD ObjPuestos;
    private Personal_Escolar_BD ObjPersonalEscolar;
    private Materia_BD ObjMateria;
    private Grupos_BD ObjGrupos;
    private Clases_BD ObjClases;

    public Menu_Admin(String usuario) {
        initComponents();

        ObjAdmin = new Admin_BD();
        ObjAlumnos = new Alumnos_BD();
        ObjDocentes = new Docente_BD();
        ObjCarrera = new Carrera_BD();
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/ITH_GRANDE.png")).getImage());
        ObjPuestos = new Puestos_BD();
        ObjPersonalEscolar = new Personal_Escolar_BD();
        ObjMateria = new Materia_BD();
        ObjGrupos = new Grupos_BD();
        ObjClases = new Clases_BD();

        this.usuario = usuario;
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        ObjAlumnos.obtenerAlumnos(t_alumnos);
        String bienvenida = "¡BIENVENIDO " + ObjAdmin.obtenerNombreAdmin(usuario) + "!";
        this.setTitle(bienvenida);
        this.lb_titulo.setText(bienvenida);
        this.sp_hora.setValue("07:00");

        cambiarPanel(1);
        separadorConfiguracionAvanzada.setVisible(false);
        p_cambiarAlumnos.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        separadorAlumnos.setVisible(true);
    }

    public void actualizarApartadoDocentes() {
        ObjDocentes.obtenerDocentes(t_docentes);
        lb_nombreDocenteD.setText("");
        lb_fechaNacimientoD.setText("");
        lb_sexoD.setText("");
    }

    public void actualizarApartadoAlumnos() {
        ObjAlumnos.obtenerAlumnos(t_alumnos);
        lb_nombreAlumnoA.setText("");
        lb_fechaNacimientoA.setText("");
        lb_semestreA.setText("");
        lb_carreraA.setText("");
    }

    public void actualizarApartadoPersonal() {
        ObjPersonalEscolar.obtenerPersonal(t_personalEscolar);
        lb_nombrePersonalP.setText("");
        lb_sexoP.setText("");
        lb_fechaNacimientoP.setText("");
    }

    public void actualizarApartadoAdministrador() {
        ObjAdmin.obtenerAdministradores(t_administradores);
        lb_nombrePersonalAdmin.setText("");
        lb_usuarioAdmin.setText("");
        lb_sexoAdmin.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_principal = new javax.swing.JPanel();
        p_toolbar = new javax.swing.JPanel();
        p_cambiarAlumnos = new javax.swing.JPanel();
        separadorAlumnos = new javax.swing.JSeparator();
        lb_alumnos = new javax.swing.JLabel();
        p_cambiarDocentes = new javax.swing.JPanel();
        separadorDocentes = new javax.swing.JSeparator();
        lb_docentes = new javax.swing.JLabel();
        p_cambiarPersonalEscolar = new javax.swing.JPanel();
        separadorPersonalEscolar = new javax.swing.JSeparator();
        lb_personalEscolar = new javax.swing.JLabel();
        p_cambiarGrupos = new javax.swing.JPanel();
        separadorGrupos = new javax.swing.JSeparator();
        lb_grupos = new javax.swing.JLabel();
        p_cambiarClases = new javax.swing.JPanel();
        separadorClases = new javax.swing.JSeparator();
        lb_clases = new javax.swing.JLabel();
        p_cambiarAdministradores = new javax.swing.JPanel();
        separadorAdministrador = new javax.swing.JSeparator();
        lb_administrador = new javax.swing.JLabel();
        p_configuracionAvanzada = new javax.swing.JPanel();
        separadorConfiguracionAvanzada = new javax.swing.JSeparator();
        lb_configuracionAvanzada = new javax.swing.JLabel();
        lb_logo = new javax.swing.JLabel();
        lb_titulo = new javax.swing.JLabel();
        lb_cerrar = new javax.swing.JLabel();
        lb_minimizar = new javax.swing.JLabel();
        lb_cerrarSesion = new javax.swing.JLabel();
        p_contenedor = new javax.swing.JPanel();
        p_alumnos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_alumnos = new javax.swing.JTable();
        btn_agregarAlumno = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tf_busquedaAlumnoA = new javax.swing.JTextField();
        lb_borrarBusquedaAlumno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        lb_nombreAlumnoA = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lb_fechaNacimientoA = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        lb_semestreA = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lb_carreraA = new javax.swing.JLabel();
        btn_verMasInfoAlumno = new javax.swing.JButton();
        p_docentes = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        t_docentes = new javax.swing.JTable();
        btn_verInfoDetalladaD = new javax.swing.JButton();
        btn_agregarDocente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tf_buscarDocente = new javax.swing.JTextField();
        lb_borrarBusquedaDocente = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        lb_nombreDocenteD = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lb_fechaNacimientoD = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lb_sexoD = new javax.swing.JLabel();
        p_personalEscolar = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        t_personalEscolar = new javax.swing.JTable();
        btn_verInfoDetalladaP = new javax.swing.JButton();
        btn_agregarPersonal = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tf_buscarPersonal = new javax.swing.JTextField();
        lb_borrarBusquedaPersonal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        lb_nombrePersonalP = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lb_sexoP = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lb_fechaNacimientoP = new javax.swing.JLabel();
        p_grupos = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        t_grupos = new javax.swing.JTable();
        btn_agregarGrupo = new javax.swing.JButton();
        btn_eliminarGrupo = new javax.swing.JButton();
        btn_editarGrupo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        tf_nombreGrupoG = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf_semestreG = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cb_carreraG = new javax.swing.JComboBox<>();
        btn_verInfoDetalladaGrupo = new javax.swing.JButton();
        p_clases = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        t_clases = new javax.swing.JTable();
        btn_agregarClase = new javax.swing.JButton();
        btn_eliminarClase = new javax.swing.JButton();
        btn_editarClase = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        cb_grupoC = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        cb_materiaC = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        cb_docenteC = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        sp_hora = new javax.swing.JSpinner();
        btn_verInfoDetalladaClase = new javax.swing.JButton();
        p_administradores = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        t_administradores = new javax.swing.JTable();
        btn_verInfoDetalladaAdmin = new javax.swing.JButton();
        btn_agregarAdministador = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel32 = new javax.swing.JLabel();
        lb_nombrePersonalAdmin = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        lb_usuarioAdmin = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        lb_sexoAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        p_principal.setBackground(new java.awt.Color(255, 255, 255));

        p_toolbar.setBackground(new java.awt.Color(35, 61, 123));

        p_cambiarAlumnos.setBackground(new java.awt.Color(35, 61, 123));
        p_cambiarAlumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        p_cambiarAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_cambiarAlumnosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_cambiarAlumnosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p_cambiarAlumnosMousePressed(evt);
            }
        });

        separadorAlumnos.setForeground(new java.awt.Color(255, 255, 255));

        lb_alumnos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_alumnos.setForeground(new java.awt.Color(255, 255, 255));
        lb_alumnos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_alumnos.setText("ALUMNOS");

        javax.swing.GroupLayout p_cambiarAlumnosLayout = new javax.swing.GroupLayout(p_cambiarAlumnos);
        p_cambiarAlumnos.setLayout(p_cambiarAlumnosLayout);
        p_cambiarAlumnosLayout.setHorizontalGroup(
            p_cambiarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separadorAlumnos)
            .addComponent(lb_alumnos, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        p_cambiarAlumnosLayout.setVerticalGroup(
            p_cambiarAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_cambiarAlumnosLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lb_alumnos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(separadorAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        p_cambiarDocentes.setBackground(new java.awt.Color(35, 61, 123));
        p_cambiarDocentes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p_cambiarDocentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_cambiarDocentesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_cambiarDocentesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p_cambiarDocentesMousePressed(evt);
            }
        });

        separadorDocentes.setForeground(new java.awt.Color(255, 255, 255));

        lb_docentes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_docentes.setForeground(new java.awt.Color(255, 255, 255));
        lb_docentes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_docentes.setText("DOCENTES");

        javax.swing.GroupLayout p_cambiarDocentesLayout = new javax.swing.GroupLayout(p_cambiarDocentes);
        p_cambiarDocentes.setLayout(p_cambiarDocentesLayout);
        p_cambiarDocentesLayout.setHorizontalGroup(
            p_cambiarDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separadorDocentes)
            .addComponent(lb_docentes, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        p_cambiarDocentesLayout.setVerticalGroup(
            p_cambiarDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_cambiarDocentesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lb_docentes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(separadorDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        p_cambiarPersonalEscolar.setBackground(new java.awt.Color(35, 61, 123));
        p_cambiarPersonalEscolar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p_cambiarPersonalEscolar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_cambiarPersonalEscolarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_cambiarPersonalEscolarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p_cambiarPersonalEscolarMousePressed(evt);
            }
        });

        separadorPersonalEscolar.setForeground(new java.awt.Color(255, 255, 255));

        lb_personalEscolar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_personalEscolar.setForeground(new java.awt.Color(255, 255, 255));
        lb_personalEscolar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_personalEscolar.setText("PERSONAL ESCOLAR");

        javax.swing.GroupLayout p_cambiarPersonalEscolarLayout = new javax.swing.GroupLayout(p_cambiarPersonalEscolar);
        p_cambiarPersonalEscolar.setLayout(p_cambiarPersonalEscolarLayout);
        p_cambiarPersonalEscolarLayout.setHorizontalGroup(
            p_cambiarPersonalEscolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separadorPersonalEscolar)
            .addComponent(lb_personalEscolar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        p_cambiarPersonalEscolarLayout.setVerticalGroup(
            p_cambiarPersonalEscolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_cambiarPersonalEscolarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lb_personalEscolar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(separadorPersonalEscolar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        p_cambiarGrupos.setBackground(new java.awt.Color(35, 61, 123));
        p_cambiarGrupos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p_cambiarGrupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_cambiarGruposMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_cambiarGruposMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p_cambiarGruposMousePressed(evt);
            }
        });

        separadorGrupos.setForeground(new java.awt.Color(255, 255, 255));

        lb_grupos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_grupos.setForeground(new java.awt.Color(255, 255, 255));
        lb_grupos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_grupos.setText("GRUPOS");

        javax.swing.GroupLayout p_cambiarGruposLayout = new javax.swing.GroupLayout(p_cambiarGrupos);
        p_cambiarGrupos.setLayout(p_cambiarGruposLayout);
        p_cambiarGruposLayout.setHorizontalGroup(
            p_cambiarGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separadorGrupos)
            .addComponent(lb_grupos, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        p_cambiarGruposLayout.setVerticalGroup(
            p_cambiarGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_cambiarGruposLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lb_grupos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(separadorGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        p_cambiarClases.setBackground(new java.awt.Color(35, 61, 123));
        p_cambiarClases.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p_cambiarClases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_cambiarClasesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_cambiarClasesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p_cambiarClasesMousePressed(evt);
            }
        });

        separadorClases.setForeground(new java.awt.Color(255, 255, 255));

        lb_clases.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_clases.setForeground(new java.awt.Color(255, 255, 255));
        lb_clases.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_clases.setText("CLASES");

        javax.swing.GroupLayout p_cambiarClasesLayout = new javax.swing.GroupLayout(p_cambiarClases);
        p_cambiarClases.setLayout(p_cambiarClasesLayout);
        p_cambiarClasesLayout.setHorizontalGroup(
            p_cambiarClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separadorClases)
            .addComponent(lb_clases, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        p_cambiarClasesLayout.setVerticalGroup(
            p_cambiarClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_cambiarClasesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lb_clases)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(separadorClases, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        p_cambiarAdministradores.setBackground(new java.awt.Color(35, 61, 123));
        p_cambiarAdministradores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p_cambiarAdministradores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_cambiarAdministradoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_cambiarAdministradoresMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p_cambiarAdministradoresMousePressed(evt);
            }
        });

        separadorAdministrador.setForeground(new java.awt.Color(255, 255, 255));

        lb_administrador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_administrador.setForeground(new java.awt.Color(255, 255, 255));
        lb_administrador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_administrador.setText("ADMINISTRADORES");

        javax.swing.GroupLayout p_cambiarAdministradoresLayout = new javax.swing.GroupLayout(p_cambiarAdministradores);
        p_cambiarAdministradores.setLayout(p_cambiarAdministradoresLayout);
        p_cambiarAdministradoresLayout.setHorizontalGroup(
            p_cambiarAdministradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separadorAdministrador)
            .addComponent(lb_administrador, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        p_cambiarAdministradoresLayout.setVerticalGroup(
            p_cambiarAdministradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_cambiarAdministradoresLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lb_administrador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(separadorAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        p_configuracionAvanzada.setBackground(new java.awt.Color(35, 61, 123));
        p_configuracionAvanzada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p_configuracionAvanzada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_configuracionAvanzadaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_configuracionAvanzadaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p_configuracionAvanzadaMousePressed(evt);
            }
        });

        separadorConfiguracionAvanzada.setForeground(new java.awt.Color(255, 255, 255));

        lb_configuracionAvanzada.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_configuracionAvanzada.setForeground(new java.awt.Color(255, 255, 255));
        lb_configuracionAvanzada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_configuracionAvanzada.setText("CONFIGURACION AVANZADA");

        javax.swing.GroupLayout p_configuracionAvanzadaLayout = new javax.swing.GroupLayout(p_configuracionAvanzada);
        p_configuracionAvanzada.setLayout(p_configuracionAvanzadaLayout);
        p_configuracionAvanzadaLayout.setHorizontalGroup(
            p_configuracionAvanzadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separadorConfiguracionAvanzada)
            .addComponent(lb_configuracionAvanzada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        p_configuracionAvanzadaLayout.setVerticalGroup(
            p_configuracionAvanzadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_configuracionAvanzadaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lb_configuracionAvanzada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(separadorConfiguracionAvanzada, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lb_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ITH_LOGO_PEQUEÑO.png"))); // NOI18N

        lb_titulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_titulo.setText("¡BIENVENIDO ADMINISTRADOR!");

        lb_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrarNormal.png"))); // NOI18N
        lb_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_cerrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_cerrarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lb_cerrarMouseReleased(evt);
            }
        });

        lb_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minimizarNormal.png"))); // NOI18N
        lb_minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_minimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_minimizarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_minimizarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lb_minimizarMouseReleased(evt);
            }
        });

        lb_cerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_cerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        lb_cerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrarSesionNormal.png"))); // NOI18N
        lb_cerrarSesion.setText("CERRAR SESIÓN");
        lb_cerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_cerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_cerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_cerrarSesionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_cerrarSesionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lb_cerrarSesionMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout p_toolbarLayout = new javax.swing.GroupLayout(p_toolbar);
        p_toolbar.setLayout(p_toolbarLayout);
        p_toolbarLayout.setHorizontalGroup(
            p_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_toolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_toolbarLayout.createSequentialGroup()
                        .addComponent(lb_logo)
                        .addGap(18, 18, 18)
                        .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lb_minimizar)
                        .addGap(10, 10, 10)
                        .addComponent(lb_cerrar))
                    .addGroup(p_toolbarLayout.createSequentialGroup()
                        .addComponent(p_cambiarAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p_cambiarDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p_cambiarPersonalEscolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p_cambiarGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p_cambiarClases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p_cambiarAdministradores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p_configuracionAvanzada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lb_cerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        p_toolbarLayout.setVerticalGroup(
            p_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_toolbarLayout.createSequentialGroup()
                .addGroup(p_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_minimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(p_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_cambiarAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_cambiarDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_cambiarPersonalEscolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_cambiarGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_cambiarClases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_cambiarAdministradores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_configuracionAvanzada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        p_contenedor.setBackground(new java.awt.Color(255, 255, 255));
        p_contenedor.setLayout(new java.awt.CardLayout());

        p_alumnos.setBackground(new java.awt.Color(255, 255, 255));

        t_alumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NO. CONTROL", "NOMBRE DE ALUMNO", "SEMESTRE", "CARRERA", "FECHA DE NACIMIENTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_alumnos.getTableHeader().setReorderingAllowed(false);
        t_alumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                t_alumnosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(t_alumnos);

        btn_agregarAlumno.setText("AGREGAR ALUMNO");
        btn_agregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarAlumnoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(35, 61, 123));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("BUSCAR ALUMNO:");

        tf_busquedaAlumnoA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_busquedaAlumnoAKeyReleased(evt);
            }
        });

        lb_borrarBusquedaAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrarNormal.png"))); // NOI18N
        lb_borrarBusquedaAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_borrarBusquedaAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_borrarBusquedaAlumnoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_borrarBusquedaAlumnoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_borrarBusquedaAlumnoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lb_borrarBusquedaAlumnoMouseReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("DATOS DEL ALUMNO");

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("NOMBRE DEL ALUMNO:");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("FECHA DE NACIMIENTO:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("SEMESTRE:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("CARRERA:");

        btn_verMasInfoAlumno.setText("VER MAS INFORMACION DE ALUMNO");
        btn_verMasInfoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verMasInfoAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_alumnosLayout = new javax.swing.GroupLayout(p_alumnos);
        p_alumnos.setLayout(p_alumnosLayout);
        p_alumnosLayout.setHorizontalGroup(
            p_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_alumnosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_alumnosLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_busquedaAlumnoA, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lb_borrarBusquedaAlumno)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(p_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_alumnosLayout.createSequentialGroup()
                        .addGroup(p_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addComponent(jSeparator1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_verMasInfoAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_alumnosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_agregarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p_alumnosLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(p_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_carreraA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_semestreA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_fechaNacimientoA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_nombreAlumnoA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        p_alumnosLayout.setVerticalGroup(
            p_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_alumnosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(p_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_busquedaAlumnoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_borrarBusquedaAlumno))
                .addGap(18, 18, 18)
                .addGroup(p_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_alumnosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_nombreAlumnoA, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_fechaNacimientoA, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_semestreA, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_carreraA, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btn_verMasInfoAlumno)
                        .addGap(18, 18, 18)
                        .addComponent(btn_agregarAlumno)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(p_alumnosLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        p_contenedor.add(p_alumnos, "card2");

        p_docentes.setBackground(new java.awt.Color(255, 255, 255));

        t_docentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NO. CONTROL", "NOMBRE DEL DOCENTE", "SEXO", "TELEFONO", "FECHA DE NACIMIENTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_docentes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        t_docentes.getTableHeader().setReorderingAllowed(false);
        t_docentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                t_docentesMousePressed(evt);
            }
        });
        jScrollPane7.setViewportView(t_docentes);

        btn_verInfoDetalladaD.setText("VER INFORMACION DETALLADA");
        btn_verInfoDetalladaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verInfoDetalladaDActionPerformed(evt);
            }
        });

        btn_agregarDocente.setText("AGREGAR DOCENTE");
        btn_agregarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarDocenteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(35, 61, 123));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("BUSCAR DOCENTE:");

        tf_buscarDocente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_buscarDocenteKeyReleased(evt);
            }
        });

        lb_borrarBusquedaDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrarNormal.png"))); // NOI18N
        lb_borrarBusquedaDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_borrarBusquedaDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_borrarBusquedaDocenteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_borrarBusquedaDocenteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_borrarBusquedaDocenteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lb_borrarBusquedaDocenteMouseReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("DATOS DEL DOCENTE:");

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("NOMBRE DEL DOCENTE:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("FECHA DE NACIMIENTO:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("SEXO:");

        javax.swing.GroupLayout p_docentesLayout = new javax.swing.GroupLayout(p_docentes);
        p_docentes.setLayout(p_docentesLayout);
        p_docentesLayout.setHorizontalGroup(
            p_docentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_docentesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_docentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_docentesLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_buscarDocente)
                        .addGap(18, 18, 18)
                        .addComponent(lb_borrarBusquedaDocente))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(p_docentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_docentesLayout.createSequentialGroup()
                        .addGroup(p_docentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_verInfoDetalladaD, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addComponent(btn_agregarDocente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(p_docentesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(p_docentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_sexoD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_fechaNacimientoD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_nombreDocenteD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        p_docentesLayout.setVerticalGroup(
            p_docentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_docentesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(p_docentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_borrarBusquedaDocente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(p_docentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(tf_buscarDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(p_docentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_docentesLayout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(p_docentesLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_nombreDocenteD, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_fechaNacimientoD, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_sexoD, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btn_verInfoDetalladaD)
                        .addGap(18, 18, 18)
                        .addComponent(btn_agregarDocente)
                        .addGap(34, 34, 34))))
        );

        p_contenedor.add(p_docentes, "card3");

        p_personalEscolar.setBackground(new java.awt.Color(255, 255, 255));

        t_personalEscolar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRES", "SEXO", "TELEFONO", "FECHA DE NACIMIENTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_personalEscolar.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        t_personalEscolar.getTableHeader().setReorderingAllowed(false);
        t_personalEscolar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                t_personalEscolarMousePressed(evt);
            }
        });
        jScrollPane8.setViewportView(t_personalEscolar);
        if (t_personalEscolar.getColumnModel().getColumnCount() > 0) {
            t_personalEscolar.getColumnModel().getColumn(4).setHeaderValue("FECHA DE NACIMIENTO");
        }

        btn_verInfoDetalladaP.setText("VER INFORMACION DETALLADA");
        btn_verInfoDetalladaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verInfoDetalladaPActionPerformed(evt);
            }
        });

        btn_agregarPersonal.setText("AGREGAR PERSONAL");
        btn_agregarPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarPersonalActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(35, 61, 123));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("BUSCAR PERSONAL:");

        tf_buscarPersonal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_buscarPersonalKeyReleased(evt);
            }
        });

        lb_borrarBusquedaPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrarNormal.png"))); // NOI18N
        lb_borrarBusquedaPersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_borrarBusquedaPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_borrarBusquedaPersonalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_borrarBusquedaPersonalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_borrarBusquedaPersonalMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lb_borrarBusquedaPersonalMouseReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("DATOS DEL PERSONAL:");

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("NOMBRE DEL PERSONAL:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("SEXO:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("FECHA DE NACIMIENTO:");

        javax.swing.GroupLayout p_personalEscolarLayout = new javax.swing.GroupLayout(p_personalEscolar);
        p_personalEscolar.setLayout(p_personalEscolarLayout);
        p_personalEscolarLayout.setHorizontalGroup(
            p_personalEscolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_personalEscolarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_personalEscolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_personalEscolarLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_buscarPersonal)
                        .addGap(18, 18, 18)
                        .addComponent(lb_borrarBusquedaPersonal))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(p_personalEscolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_personalEscolarLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(p_personalEscolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_fechaNacimientoP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_sexoP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_nombrePersonalP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(p_personalEscolarLayout.createSequentialGroup()
                        .addGroup(p_personalEscolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p_personalEscolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                                .addComponent(jSeparator3))
                            .addComponent(btn_verInfoDetalladaP, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_agregarPersonal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        p_personalEscolarLayout.setVerticalGroup(
            p_personalEscolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_personalEscolarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(p_personalEscolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_buscarPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_borrarBusquedaPersonal))
                .addGap(18, 18, 18)
                .addGroup(p_personalEscolarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_personalEscolarLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_nombrePersonalP, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_sexoP, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_fechaNacimientoP, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btn_verInfoDetalladaP)
                        .addGap(18, 18, 18)
                        .addComponent(btn_agregarPersonal)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE))
                .addContainerGap())
        );

        p_contenedor.add(p_personalEscolar, "card3");

        p_grupos.setBackground(new java.awt.Color(255, 255, 255));

        t_grupos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "IDENTIFICADOR DE GRUPO", "SEMESTRE", "CARRERA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_grupos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        t_grupos.getTableHeader().setReorderingAllowed(false);
        t_grupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                t_gruposMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(t_grupos);
        if (t_grupos.getColumnModel().getColumnCount() > 0) {
            t_grupos.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        btn_agregarGrupo.setText("AGREGAR GRUPO");
        btn_agregarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarGrupoActionPerformed(evt);
            }
        });

        btn_eliminarGrupo.setText("ELIMINAR GRUPO");
        btn_eliminarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarGrupoActionPerformed(evt);
            }
        });

        btn_editarGrupo.setText("EDITAR GRUPO");
        btn_editarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarGrupoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("DATOS DEL GRUPO");

        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("IDENTIFICADOR DEL GRUPO:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("SEMESTRE:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("CARRERA:");

        cb_carreraG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_verInfoDetalladaGrupo.setText("VER INFORMACIÓN DETALLADA");
        btn_verInfoDetalladaGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verInfoDetalladaGrupoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_gruposLayout = new javax.swing.GroupLayout(p_grupos);
        p_grupos.setLayout(p_gruposLayout);
        p_gruposLayout.setHorizontalGroup(
            p_gruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_gruposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(p_gruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_eliminarGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_agregarGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_editarGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(p_gruposLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(p_gruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_carreraG, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_semestreG, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(p_gruposLayout.createSequentialGroup()
                        .addGroup(p_gruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator4)
                            .addGroup(p_gruposLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(p_gruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                                    .addComponent(tf_nombreGrupoG))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_verInfoDetalladaGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        p_gruposLayout.setVerticalGroup(
            p_gruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_gruposLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(p_gruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                    .addGroup(p_gruposLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nombreGrupoG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_semestreG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_carreraG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btn_agregarGrupo)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminarGrupo)
                        .addGap(18, 18, 18)
                        .addComponent(btn_editarGrupo)
                        .addGap(18, 18, 18)
                        .addComponent(btn_verInfoDetalladaGrupo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        p_contenedor.add(p_grupos, "card3");

        p_clases.setBackground(new java.awt.Color(255, 255, 255));

        t_clases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "GRUPO", "MATERIA", "DOCENTE", "HORA DE CLASE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_clases.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        t_clases.getTableHeader().setReorderingAllowed(false);
        t_clases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                t_clasesMousePressed(evt);
            }
        });
        jScrollPane6.setViewportView(t_clases);
        if (t_clases.getColumnModel().getColumnCount() > 0) {
            t_clases.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        btn_agregarClase.setText("AGREGAR CLASE");
        btn_agregarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarClaseActionPerformed(evt);
            }
        });

        btn_eliminarClase.setText("ELIMINAR CLASE");
        btn_eliminarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarClaseActionPerformed(evt);
            }
        });

        btn_editarClase.setText("EDITAR CLASE");
        btn_editarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarClaseActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("DATOS DE LA CLASE");

        jSeparator5.setForeground(new java.awt.Color(102, 102, 102));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("GRUPO:");

        cb_grupoC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("MATERIA:");

        cb_materiaC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("DOCENTE:");

        cb_docenteC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("HORA:");

        sp_hora.setModel(new javax.swing.SpinnerListModel(new String[] {"00:00", "01:00", "02:00", "03:00", "04:00", "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00", "24:00"}));

        btn_verInfoDetalladaClase.setText("VER INFORMACIÓN DETALLADA");
        btn_verInfoDetalladaClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verInfoDetalladaClaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_clasesLayout = new javax.swing.GroupLayout(p_clases);
        p_clases.setLayout(p_clasesLayout);
        p_clasesLayout.setHorizontalGroup(
            p_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_clasesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(p_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_agregarClase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_eliminarClase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_editarClase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(p_clasesLayout.createSequentialGroup()
                        .addGroup(p_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addComponent(jSeparator5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_verInfoDetalladaClase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(p_clasesLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(p_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sp_hora, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_docenteC, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_materiaC, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_grupoC, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        p_clasesLayout.setVerticalGroup(
            p_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_clasesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(p_clasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(p_clasesLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_grupoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_materiaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_docenteC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sp_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btn_agregarClase)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminarClase)
                        .addGap(18, 18, 18)
                        .addComponent(btn_editarClase)
                        .addGap(18, 18, 18)
                        .addComponent(btn_verInfoDetalladaClase)
                        .addContainerGap(260, Short.MAX_VALUE))))
        );

        p_contenedor.add(p_clases, "card3");

        p_administradores.setBackground(new java.awt.Color(255, 255, 255));

        t_administradores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOMBRE DEL PERSONAL", "USUARIO", "SEXO", "FECHA DE NACIMIENTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_administradores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        t_administradores.getTableHeader().setReorderingAllowed(false);
        t_administradores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                t_administradoresMousePressed(evt);
            }
        });
        jScrollPane9.setViewportView(t_administradores);

        btn_verInfoDetalladaAdmin.setText("VER INFORMACION DETALLADA");
        btn_verInfoDetalladaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verInfoDetalladaAdminActionPerformed(evt);
            }
        });

        btn_agregarAdministador.setText("AGREGAR ADMINISTRADOR");
        btn_agregarAdministador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarAdministadorActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("DATOS DEL ADMINISTRADOR");

        jSeparator6.setForeground(new java.awt.Color(102, 102, 102));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("NOMBRE DEL PERSONAL:");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setText("USUARIO:");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setText("SEXO:");

        javax.swing.GroupLayout p_administradoresLayout = new javax.swing.GroupLayout(p_administradores);
        p_administradores.setLayout(p_administradoresLayout);
        p_administradoresLayout.setHorizontalGroup(
            p_administradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_administradoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(p_administradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_administradoresLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(p_administradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_verInfoDetalladaAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addComponent(btn_agregarAdministador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(p_administradoresLayout.createSequentialGroup()
                        .addGroup(p_administradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                            .addComponent(jSeparator6))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(p_administradoresLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(p_administradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_sexoAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_usuarioAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_nombrePersonalAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        p_administradoresLayout.setVerticalGroup(
            p_administradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_administradoresLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(p_administradoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                    .addGroup(p_administradoresLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_nombrePersonalAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_usuarioAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_sexoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btn_verInfoDetalladaAdmin)
                        .addGap(18, 18, 18)
                        .addComponent(btn_agregarAdministador)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        p_contenedor.add(p_administradores, "card3");

        javax.swing.GroupLayout p_principalLayout = new javax.swing.GroupLayout(p_principal);
        p_principal.setLayout(p_principalLayout);
        p_principalLayout.setHorizontalGroup(
            p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(p_toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        p_principalLayout.setVerticalGroup(
            p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_principalLayout.createSequentialGroup()
                .addComponent(p_toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_gruposMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_gruposMousePressed
        tf_nombreGrupoG.setText(t_grupos.getValueAt(t_grupos.getSelectedRow(), 1).toString());
        tf_semestreG.setText(t_grupos.getValueAt(t_grupos.getSelectedRow(), 2).toString());
        cb_carreraG.setSelectedItem(t_grupos.getValueAt(t_grupos.getSelectedRow(), 3));
    }//GEN-LAST:event_t_gruposMousePressed

    private void btn_agregarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarGrupoActionPerformed
        if (!tf_nombreGrupoG.getText().equals("") && !tf_semestreG.getText().equals("")) {
            if (!ObjGrupos.verificarNombreRepetidoGrupo(tf_nombreGrupoG.getText())) {
                int i = ObjGrupos.agregarGrupo(tf_nombreGrupoG.getText(),
                        tf_semestreG.getText(), ObjCarrera.obtenerIdCarrera(cb_carreraG.getSelectedItem().toString()));
                if (i == 1) {
                    ObjGrupos.obtenerGrupo(t_grupos);
                    ObjCarrera.obtenerCarrerasCB(cb_carreraG);
                    this.tf_nombreGrupoG.setText("");
                    this.tf_semestreG.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Este grupo ya existe", "Error", 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debes llenar los campos", "Error", 0);
        }
    }//GEN-LAST:event_btn_agregarGrupoActionPerformed

    private void btn_eliminarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarGrupoActionPerformed
        try {
            int p = JOptionPane.showConfirmDialog(this, "¿Deseas BORRAR el grupo '"
                    + t_grupos.getValueAt(t_grupos.getSelectedRow(), 1).toString() + "'?", "PRECAUCION", JOptionPane.YES_NO_OPTION, 2);

            if (p == 0) {
                int i = ObjGrupos.eliminarGrupo(t_grupos.getValueAt(t_grupos.getSelectedRow(), 0).toString());
                if (i == 1) {
                    ObjGrupos.obtenerGrupo(t_grupos);
                    ObjCarrera.obtenerCarrerasCB(cb_carreraG);
                    this.tf_nombreGrupoG.setText("");
                    this.tf_semestreG.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar el grupo", "Error", 0);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un grupo de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btn_eliminarGrupoActionPerformed

    private void btn_editarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarGrupoActionPerformed
        try {
            if (!ObjGrupos.verificarNombreRepetidoGrupo(tf_nombreGrupoG.getText(),
                    t_grupos.getValueAt(t_grupos.getSelectedRow(), 0).toString())) {
                int p = JOptionPane.showConfirmDialog(this, "¿Deseas EDITAR el grupo '"
                        + t_grupos.getValueAt(t_grupos.getSelectedRow(), 1).toString() + "'?", "PRECAUCION", JOptionPane.YES_NO_OPTION, 1);

                if (p == 0) {
                    String id = t_grupos.getValueAt(t_grupos.getSelectedRow(), 0).toString();
                    int i = ObjGrupos.editarGrupo(id, tf_nombreGrupoG.getText(), tf_semestreG.getText(),
                            ObjCarrera.obtenerIdCarrera(cb_carreraG.getSelectedItem().toString()));
                    if (i == 1) {
                        ObjGrupos.obtenerGrupo(t_grupos);
                        ObjCarrera.obtenerCarrerasCB(cb_carreraG);
                        this.tf_nombreGrupoG.setText("");
                        this.tf_semestreG.setText("");
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo editar el grupo", "Error", 0);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "El identificador de grupo ya esta en uso", "Error", 0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un grupo de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btn_editarGrupoActionPerformed

    private void t_docentesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_docentesMousePressed
        lb_nombreDocenteD.setText(t_docentes.getValueAt(t_docentes.getSelectedRow(), 1).toString());
        lb_fechaNacimientoD.setText(convertirFechas(t_docentes.getValueAt(t_docentes.getSelectedRow(), 4).toString()));
        lb_sexoD.setText(t_docentes.getValueAt(t_docentes.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_t_docentesMousePressed

    private void btn_verInfoDetalladaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verInfoDetalladaDActionPerformed
        try {
            InformacionDocente visual = new InformacionDocente(t_docentes.getValueAt(t_docentes.getSelectedRow(), 0).toString(), this);
            visual.setAlwaysOnTop(true);
            this.setEnabled(false);
            visual.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un docente de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btn_verInfoDetalladaDActionPerformed

    private void t_clasesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_clasesMousePressed
        cb_grupoC.setSelectedItem(t_clases.getValueAt(t_clases.getSelectedRow(), 1));
        cb_materiaC.setSelectedItem(t_clases.getValueAt(t_clases.getSelectedRow(), 2));
        cb_docenteC.setSelectedItem(t_clases.getValueAt(t_clases.getSelectedRow(), 3));
        String hora = t_clases.getValueAt(t_clases.getSelectedRow(), 4).toString().substring(0, 5);
        sp_hora.setValue(hora);
    }//GEN-LAST:event_t_clasesMousePressed

    private void btn_agregarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarClaseActionPerformed
        // OBTENEMOS LOS PARAMETROS
        String idGrupo = ObjGrupos.obtenerIdGrupo(cb_grupoC.getSelectedItem().toString()),
                idMateria = ObjMateria.obtenerIdMateria(cb_materiaC.getSelectedItem().toString()),
                noControlDocente = ObjDocentes.obtenerNoControlDocente(cb_docenteC.getSelectedItem().toString()),
                hora = sp_hora.getValue().toString();

        // VERIFICAMOS SI EL GRUPO YA POSEE UNA CLASE A ESA HORA
        if (!ObjGrupos.verificarEmpalmeGrupo(idGrupo, hora)) {
            // VERIFICAMOS SI EL GRUPO YA TIENE ESA MATERIA
            if (!ObjGrupos.verificarMateriaRepetidaGrupo(idGrupo, idMateria)) {
                // VERIFICAMOS SI EL DOCENTE ESTA DESOCUPADO A ESA HORA
                if (!ObjDocentes.verificarEmpalmeDocente(noControlDocente, hora)) {
                    int i = ObjClases.agregarClase(idGrupo, idMateria, noControlDocente, hora);
                    if (i == 1) {
                        ObjClases.obtenerClases(t_clases);
                        ObjGrupos.obtenerGruposCB(cb_grupoC);
                        ObjMateria.obtenerMateriasCB(cb_materiaC);
                        ObjDocentes.obtenerDocentesCB(cb_docenteC);
                        sp_hora.setValue("07:00");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "El docente ya posee una clase a esa hora", "Error", 0);
                }
            } else {
                JOptionPane.showMessageDialog(this, "El grupo ya posee esa materia", "Error", 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "El grupo ya posee una clase a esa hora", "Error", 0);
        }
    }//GEN-LAST:event_btn_agregarClaseActionPerformed

    private void btn_eliminarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarClaseActionPerformed
        try {
            int p = JOptionPane.showConfirmDialog(this, "¿Deseas BORRAR la clase del grupo '"
                    + t_clases.getValueAt(t_clases.getSelectedRow(), 1).toString() + "'?", "PRECAUCION", JOptionPane.YES_NO_OPTION, 2);

            if (p == 0) {
                int i = ObjClases.eliminarClase(t_clases.getValueAt(t_clases.getSelectedRow(), 0).toString());
                if (i == 1) {
                    ObjClases.obtenerClases(t_clases);
                    ObjGrupos.obtenerGruposCB(cb_grupoC);
                    ObjMateria.obtenerMateriasCB(cb_materiaC);
                    ObjDocentes.obtenerDocentesCB(cb_docenteC);
                    sp_hora.setValue("07:00");
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar la clase", "Error", 0);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar una clase de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btn_eliminarClaseActionPerformed

    private void btn_editarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarClaseActionPerformed
        try {
            // OBTENEMOS LOS PARAMETROS
            String idGrupo = ObjGrupos.obtenerIdGrupo(cb_grupoC.getSelectedItem().toString()),
                    idMateria = ObjMateria.obtenerIdMateria(cb_materiaC.getSelectedItem().toString()),
                    noControlDocente = ObjDocentes.obtenerNoControlDocente(cb_docenteC.getSelectedItem().toString()),
                    hora = sp_hora.getValue().toString(), id = t_clases.getValueAt(t_clases.getSelectedRow(), 0).toString();

            // VERIFICAMOS SI EL GRUPO YA POSEE UNA CLASE A ESA HORA
            if (!ObjGrupos.verificarEmpalmeGrupo(idGrupo, hora, id)) {
                // VERIFICAMOS SI EL GRUPO YA TIENE ESA MATERIA
                if (!ObjGrupos.verificarMateriaRepetidaGrupo(idGrupo, idMateria)) {
                    // VERIFICAMOS SI EL DOCENTE ESTA DESOCUPADO A ESA HORA
                    if (!ObjDocentes.verificarEmpalmeDocente(noControlDocente, hora, id)) {
                        int p = JOptionPane.showConfirmDialog(this, "¿Deseas EDITAR la clase del grupo '"
                                + t_clases.getValueAt(t_clases.getSelectedRow(), 1).toString() + "'?", "PRECAUCION", JOptionPane.YES_NO_OPTION, 1);

                        if (p == 0) {
                            int i = ObjClases.editarClase(id, ObjGrupos.obtenerIdGrupo(cb_grupoC.getSelectedItem().toString()),
                                    ObjMateria.obtenerIdMateria(cb_materiaC.getSelectedItem().toString()),
                                    ObjDocentes.obtenerNoControlDocente(cb_docenteC.getSelectedItem().toString()),
                                    sp_hora.getValue().toString());
                            if (i == 1) {
                                ObjClases.obtenerClases(t_clases);
                                ObjGrupos.obtenerGruposCB(cb_grupoC);
                                ObjMateria.obtenerMateriasCB(cb_materiaC);
                                ObjDocentes.obtenerDocentesCB(cb_docenteC);
                                sp_hora.setValue("07:00");
                            } else {
                                JOptionPane.showMessageDialog(this, "No se pudo editar la clase", "Error", 0);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "El docente ya posee una clase a esa hora", "Error", 0);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "El grupo ya posee esa materia", "Error", 0);
                }
            } else {
                JOptionPane.showMessageDialog(this, "El grupo ya posee una clase a esa hora", "Error", 0);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar una clase de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btn_editarClaseActionPerformed

    private void btn_agregarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarDocenteActionPerformed
        AgregarDocente ObjAgD = new AgregarDocente(this);
        ObjAgD.setAlwaysOnTop(true);
        this.setEnabled(false);
        ObjAgD.setVisible(true);
    }//GEN-LAST:event_btn_agregarDocenteActionPerformed

    private void tf_buscarDocenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_buscarDocenteKeyReleased
        ObjDocentes.obtenerBusquedaDocente(t_docentes, tf_buscarDocente.getText());
    }//GEN-LAST:event_tf_buscarDocenteKeyReleased

    private void t_personalEscolarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_personalEscolarMousePressed
        lb_nombrePersonalP.setText(t_personalEscolar.getValueAt(t_personalEscolar.getSelectedRow(), 1).toString());
        lb_sexoP.setText(t_personalEscolar.getValueAt(t_personalEscolar.getSelectedRow(), 2).toString());
        lb_fechaNacimientoP.setText(convertirFechas(t_personalEscolar.getValueAt(t_personalEscolar.getSelectedRow(), 4).toString()));
    }//GEN-LAST:event_t_personalEscolarMousePressed

    private void btn_verInfoDetalladaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verInfoDetalladaPActionPerformed
        try {
            InformacionPersonalEscolar frame = new InformacionPersonalEscolar(this,
                    t_personalEscolar.getValueAt(t_personalEscolar.getSelectedRow(), 0).toString());
            frame.setAlwaysOnTop(true);
            this.setEnabled(false);
            frame.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un personal de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btn_verInfoDetalladaPActionPerformed

    private void btn_agregarPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarPersonalActionPerformed
        AgregarPersonal ObjAgregarPersonal = new AgregarPersonal(this);
        ObjAgregarPersonal.setAlwaysOnTop(true);
        this.setEnabled(false);
        ObjAgregarPersonal.setVisible(true);
    }//GEN-LAST:event_btn_agregarPersonalActionPerformed

    private void tf_buscarPersonalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_buscarPersonalKeyReleased
        ObjPersonalEscolar.obtenerBusquedaPersonal(t_personalEscolar, tf_buscarPersonal.getText());
    }//GEN-LAST:event_tf_buscarPersonalKeyReleased

    private void btn_agregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarAlumnoActionPerformed
        AgregarAlumno frame = new AgregarAlumno(this);
        this.setEnabled(false);
        frame.setAlwaysOnTop(true);
        frame.setVisible(true);
    }//GEN-LAST:event_btn_agregarAlumnoActionPerformed

    private void tf_busquedaAlumnoAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_busquedaAlumnoAKeyReleased
        ObjAlumnos.obtenerBusquedaAlumno(t_alumnos, tf_busquedaAlumnoA.getText());
    }//GEN-LAST:event_tf_busquedaAlumnoAKeyReleased

    private void t_alumnosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_alumnosMousePressed
        lb_nombreAlumnoA.setText(t_alumnos.getValueAt(t_alumnos.getSelectedRow(), 1).toString());
        lb_fechaNacimientoA.setText(convertirFechas(t_alumnos.getValueAt(t_alumnos.getSelectedRow(), 4).toString()));
        lb_semestreA.setText(t_alumnos.getValueAt(t_alumnos.getSelectedRow(), 2).toString());
        lb_carreraA.setText(t_alumnos.getValueAt(t_alumnos.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_t_alumnosMousePressed

    private void btn_verMasInfoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verMasInfoAlumnoActionPerformed
        try {
            InformacionAlumno frame = new InformacionAlumno(this,
                    t_alumnos.getValueAt(t_alumnos.getSelectedRow(), 0).toString());
            frame.setAlwaysOnTop(true);
            this.setEnabled(false);
            frame.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Necesitas seleccionar un alumno de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btn_verMasInfoAlumnoActionPerformed

    private void btn_verInfoDetalladaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verInfoDetalladaAdminActionPerformed
        try {
            InformacionAdministrador frame = new InformacionAdministrador(this,
                    t_administradores.getValueAt(t_administradores.getSelectedRow(), 1).toString(), usuario);
            frame.setAlwaysOnTop(true);
            this.setEnabled(false);
            frame.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Necesitas seleccionar un administrador de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btn_verInfoDetalladaAdminActionPerformed

    private void btn_agregarAdministadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarAdministadorActionPerformed
        AgregarAdministrador frame = new AgregarAdministrador(this);
        frame.setAlwaysOnTop(true);
        this.setEnabled(false);
        frame.setVisible(true);
    }//GEN-LAST:event_btn_agregarAdministadorActionPerformed

    private void t_administradoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_administradoresMousePressed
        this.lb_nombrePersonalAdmin.setText(t_administradores.getValueAt(t_administradores.getSelectedRow(), 0).toString());
        this.lb_usuarioAdmin.setText(t_administradores.getValueAt(t_administradores.getSelectedRow(), 1).toString());
        this.lb_sexoAdmin.setText(t_administradores.getValueAt(t_administradores.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_t_administradoresMousePressed

    private void p_cambiarAlumnosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarAlumnosMouseEntered
        if (panelActual != 1) {
            separadorAlumnos.setVisible(true);
        }
    }//GEN-LAST:event_p_cambiarAlumnosMouseEntered

    private void p_cambiarAlumnosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarAlumnosMouseExited
        if (panelActual != 1) {
            separadorAlumnos.setVisible(false);
        }
    }//GEN-LAST:event_p_cambiarAlumnosMouseExited

    private void p_cambiarAlumnosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarAlumnosMousePressed
        if (panelActual != 1) {
            ObjAlumnos.obtenerAlumnos(t_alumnos);
            panelActual = 1;
            cambiarPanel(panelActual);
            separadorAlumnos.setVisible(true);
            p_cambiarAlumnos.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_p_cambiarAlumnosMousePressed

    private void p_cambiarDocentesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarDocentesMouseEntered
        if (panelActual != 2) {
            separadorDocentes.setVisible(true);
        }
    }//GEN-LAST:event_p_cambiarDocentesMouseEntered

    private void p_cambiarDocentesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarDocentesMouseExited
        if (panelActual != 2) {
            separadorDocentes.setVisible(false);
        }
    }//GEN-LAST:event_p_cambiarDocentesMouseExited

    private void p_cambiarDocentesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarDocentesMousePressed
        if (panelActual != 2) {
            ObjDocentes.obtenerDocentes(t_docentes);
            panelActual = 2;
            cambiarPanel(panelActual);
            separadorDocentes.setVisible(true);
            p_cambiarDocentes.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_p_cambiarDocentesMousePressed

    private void p_cambiarPersonalEscolarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarPersonalEscolarMouseEntered
        if (panelActual != 3) {
            separadorPersonalEscolar.setVisible(true);
        }
    }//GEN-LAST:event_p_cambiarPersonalEscolarMouseEntered

    private void p_cambiarPersonalEscolarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarPersonalEscolarMouseExited
        if (panelActual != 3) {
            separadorPersonalEscolar.setVisible(false);
        }
    }//GEN-LAST:event_p_cambiarPersonalEscolarMouseExited

    private void p_cambiarPersonalEscolarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarPersonalEscolarMousePressed
        if (panelActual != 3) {
            ObjPersonalEscolar.obtenerPersonal(t_personalEscolar);
            panelActual = 3;
            cambiarPanel(panelActual);
            separadorPersonalEscolar.setVisible(true);
            p_cambiarPersonalEscolar.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_p_cambiarPersonalEscolarMousePressed

    private void p_cambiarGruposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarGruposMouseEntered
        if (panelActual != 4) {
            separadorGrupos.setVisible(true);
        }
    }//GEN-LAST:event_p_cambiarGruposMouseEntered

    private void p_cambiarGruposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarGruposMouseExited
        if (panelActual != 4) {
            separadorGrupos.setVisible(false);
        }
    }//GEN-LAST:event_p_cambiarGruposMouseExited

    private void p_cambiarGruposMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarGruposMousePressed
        if (panelActual != 4) {
            ObjGrupos.obtenerGrupo(t_grupos);
            ObjCarrera.obtenerCarrerasCB(cb_carreraG);
            panelActual = 4;
            cambiarPanel(panelActual);
            separadorGrupos.setVisible(true);
            p_cambiarGrupos.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_p_cambiarGruposMousePressed

    private void p_cambiarClasesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarClasesMouseEntered
        if (panelActual != 5) {
            separadorClases.setVisible(true);
        }
    }//GEN-LAST:event_p_cambiarClasesMouseEntered

    private void p_cambiarClasesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarClasesMouseExited
        if (panelActual != 5) {
            separadorClases.setVisible(false);
        }
    }//GEN-LAST:event_p_cambiarClasesMouseExited

    private void p_cambiarClasesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarClasesMousePressed
        if (panelActual != 5) {
            ObjClases.obtenerClases(t_clases);
            ObjGrupos.obtenerGruposCB(cb_grupoC);
            ObjMateria.obtenerMateriasCB(cb_materiaC);
            ObjDocentes.obtenerDocentesCB(cb_docenteC);
            sp_hora.setValue("07:00");
            panelActual = 5;
            cambiarPanel(panelActual);
            separadorClases.setVisible(true);
            p_cambiarClases.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_p_cambiarClasesMousePressed

    private void p_cambiarAdministradoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarAdministradoresMouseEntered
        if (panelActual != 6) {
            separadorAdministrador.setVisible(true);
        }
    }//GEN-LAST:event_p_cambiarAdministradoresMouseEntered

    private void p_cambiarAdministradoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarAdministradoresMouseExited
        if (panelActual != 6) {
            separadorAdministrador.setVisible(false);
        }
    }//GEN-LAST:event_p_cambiarAdministradoresMouseExited

    private void p_cambiarAdministradoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarAdministradoresMousePressed
        if (panelActual != 6) {
            ObjAdmin.obtenerAdministradores(t_administradores);
            panelActual = 6;
            cambiarPanel(panelActual);
            separadorAdministrador.setVisible(true);
            p_cambiarAdministradores.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_p_cambiarAdministradoresMousePressed

    private void p_configuracionAvanzadaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_configuracionAvanzadaMouseEntered
        separadorConfiguracionAvanzada.setVisible(true);
    }//GEN-LAST:event_p_configuracionAvanzadaMouseEntered

    private void p_configuracionAvanzadaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_configuracionAvanzadaMouseExited
        separadorConfiguracionAvanzada.setVisible(false);
    }//GEN-LAST:event_p_configuracionAvanzadaMouseExited

    private void p_configuracionAvanzadaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_configuracionAvanzadaMousePressed
        ConAvanzada frame = new ConAvanzada(this);
        frame.setAlwaysOnTop(true);
        this.setEnabled(false);
        frame.setVisible(true);
    }//GEN-LAST:event_p_configuracionAvanzadaMousePressed

    private void lb_cerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarSesionMouseEntered
        lb_cerrarSesion.setForeground(new Color(153, 153, 153));
        lb_cerrarSesion.setIcon(new ImageIcon(getClass().getResource("/imagenes/cerrarSesionEntered.png")));
    }//GEN-LAST:event_lb_cerrarSesionMouseEntered

    private void lb_cerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarSesionMouseExited
        lb_cerrarSesion.setForeground(new Color(255, 255, 255));
        lb_cerrarSesion.setIcon(new ImageIcon(getClass().getResource("/imagenes/cerrarSesionNormal.png")));
    }//GEN-LAST:event_lb_cerrarSesionMouseExited

    private void lb_cerrarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarSesionMousePressed
        lb_cerrarSesion.setForeground(new Color(102, 102, 102));
        lb_cerrarSesion.setIcon(new ImageIcon(getClass().getResource("/imagenes/cerrarSesionPressed.png")));
        int p = JOptionPane.showConfirmDialog(this, "¿Esta seguro de cerrar tu sesión?", "", JOptionPane.YES_NO_OPTION, 1);
        if (p == 0) {
            InicioSesion frame = new InicioSesion();
            frame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_lb_cerrarSesionMousePressed

    private void lb_cerrarSesionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarSesionMouseReleased
        lb_cerrarSesion.setForeground(new Color(153, 153, 153));
        lb_cerrarSesion.setIcon(new ImageIcon(getClass().getResource("/imagenes/cerrarSesionEntered.png")));
    }//GEN-LAST:event_lb_cerrarSesionMouseReleased

    private void lb_cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarMouseEntered
        lb_cerrar.setIcon(new ImageIcon(getClass().getResource("/imagenes/cerrarEntered.png")));
    }//GEN-LAST:event_lb_cerrarMouseEntered

    private void lb_cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarMouseExited
        lb_cerrar.setIcon(new ImageIcon(getClass().getResource("/imagenes/cerrarNormal.png")));
    }//GEN-LAST:event_lb_cerrarMouseExited

    private void lb_cerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarMousePressed
        lb_cerrar.setIcon(new ImageIcon(getClass().getResource("/imagenes/cerrarPressed.png")));
        int p = JOptionPane.showConfirmDialog(this, "¿Esta seguro de salir del programa?", "", JOptionPane.YES_NO_OPTION, 1);
        if (p == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_lb_cerrarMousePressed

    private void lb_cerrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarMouseReleased
        lb_cerrar.setIcon(new ImageIcon(getClass().getResource("/imagenes/cerrarEntered.png")));
    }//GEN-LAST:event_lb_cerrarMouseReleased

    private void lb_minimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_minimizarMouseEntered
        lb_minimizar.setIcon(new ImageIcon(getClass().getResource("/imagenes/minimizarEntered.png")));
    }//GEN-LAST:event_lb_minimizarMouseEntered

    private void lb_minimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_minimizarMouseExited
        lb_minimizar.setIcon(new ImageIcon(getClass().getResource("/imagenes/minimizarNormal.png")));
    }//GEN-LAST:event_lb_minimizarMouseExited

    private void lb_minimizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_minimizarMousePressed
        lb_minimizar.setIcon(new ImageIcon(getClass().getResource("/imagenes/minimizarPressed.png")));
        this.setState(ICONIFIED);
    }//GEN-LAST:event_lb_minimizarMousePressed

    private void lb_minimizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_minimizarMouseReleased
        lb_minimizar.setIcon(new ImageIcon(getClass().getResource("/imagenes/minimizarEntered.png")));
    }//GEN-LAST:event_lb_minimizarMouseReleased

    private void lb_borrarBusquedaAlumnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarBusquedaAlumnoMouseEntered
        lb_borrarBusquedaAlumno.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarEntered.png")));
    }//GEN-LAST:event_lb_borrarBusquedaAlumnoMouseEntered

    private void lb_borrarBusquedaAlumnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarBusquedaAlumnoMouseExited
        lb_borrarBusquedaAlumno.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarNormal.png")));
    }//GEN-LAST:event_lb_borrarBusquedaAlumnoMouseExited

    private void lb_borrarBusquedaAlumnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarBusquedaAlumnoMousePressed
        lb_borrarBusquedaAlumno.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarPressed.png")));
    }//GEN-LAST:event_lb_borrarBusquedaAlumnoMousePressed

    private void lb_borrarBusquedaAlumnoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarBusquedaAlumnoMouseReleased
        lb_borrarBusquedaAlumno.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarEntered.png")));
        tf_busquedaAlumnoA.setText("");
        ObjAlumnos.obtenerAlumnos(t_alumnos);
    }//GEN-LAST:event_lb_borrarBusquedaAlumnoMouseReleased

    private void lb_borrarBusquedaDocenteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarBusquedaDocenteMouseEntered
        lb_borrarBusquedaDocente.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarEntered.png")));
    }//GEN-LAST:event_lb_borrarBusquedaDocenteMouseEntered

    private void lb_borrarBusquedaDocenteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarBusquedaDocenteMouseExited
        lb_borrarBusquedaDocente.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarNormal.png")));
    }//GEN-LAST:event_lb_borrarBusquedaDocenteMouseExited

    private void lb_borrarBusquedaDocenteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarBusquedaDocenteMousePressed
        lb_borrarBusquedaDocente.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarPressed.png")));
    }//GEN-LAST:event_lb_borrarBusquedaDocenteMousePressed

    private void lb_borrarBusquedaDocenteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarBusquedaDocenteMouseReleased
        lb_borrarBusquedaDocente.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarEntered.png")));
        tf_buscarDocente.setText("");
        ObjDocentes.obtenerDocentes(t_docentes);
    }//GEN-LAST:event_lb_borrarBusquedaDocenteMouseReleased

    private void lb_borrarBusquedaPersonalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarBusquedaPersonalMouseEntered
        lb_borrarBusquedaPersonal.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarEntered.png")));
    }//GEN-LAST:event_lb_borrarBusquedaPersonalMouseEntered

    private void lb_borrarBusquedaPersonalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarBusquedaPersonalMouseExited
        lb_borrarBusquedaPersonal.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarNormal.png")));
    }//GEN-LAST:event_lb_borrarBusquedaPersonalMouseExited

    private void lb_borrarBusquedaPersonalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarBusquedaPersonalMousePressed
        lb_borrarBusquedaPersonal.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarPressed.png")));
    }//GEN-LAST:event_lb_borrarBusquedaPersonalMousePressed

    private void lb_borrarBusquedaPersonalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarBusquedaPersonalMouseReleased
        lb_borrarBusquedaPersonal.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarEntered.png")));
        tf_buscarPersonal.setText("");
        ObjPersonalEscolar.obtenerPersonal(t_personalEscolar);
    }//GEN-LAST:event_lb_borrarBusquedaPersonalMouseReleased

    private void btn_verInfoDetalladaGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verInfoDetalladaGrupoActionPerformed
        try {
            InformacionGrupo frame = new InformacionGrupo(this,
                    t_grupos.getValueAt(t_grupos.getSelectedRow(), 0).toString());
            frame.setAlwaysOnTop(true);
            this.setEnabled(false);
            frame.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Necesitas seleccionar un grupo de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btn_verInfoDetalladaGrupoActionPerformed

    private void btn_verInfoDetalladaClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verInfoDetalladaClaseActionPerformed
        try {
            InformacionClase frame = new InformacionClase(this,
                    t_clases.getValueAt(t_clases.getSelectedRow(), 0).toString());
            frame.setAlwaysOnTop(true);
            this.setEnabled(false);
            frame.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Necesitas seleccionar una clase de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btn_verInfoDetalladaClaseActionPerformed

    public void cambiarPanel(int panel) {
        // ESCONDEMOS Y PONEMOS BOTONES EN DEFUALT
        separadorAlumnos.setVisible(false);
        p_cambiarAlumnos.setCursor(new Cursor(Cursor.HAND_CURSOR));
        separadorDocentes.setVisible(false);
        p_cambiarDocentes.setCursor(new Cursor(Cursor.HAND_CURSOR));
        separadorPersonalEscolar.setVisible(false);
        p_cambiarPersonalEscolar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        separadorGrupos.setVisible(false);
        p_cambiarGrupos.setCursor(new Cursor(Cursor.HAND_CURSOR));
        separadorClases.setVisible(false);
        p_cambiarClases.setCursor(new Cursor(Cursor.HAND_CURSOR));
        separadorAdministrador.setVisible(false);
        p_cambiarAdministradores.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // ESCONDEMOS PANELES
        p_alumnos.setVisible(false);
        p_docentes.setVisible(false);
        p_personalEscolar.setVisible(false);
        p_grupos.setVisible(false);
        p_clases.setVisible(false);
        p_administradores.setVisible(false);

        switch (panel) {
            case 1:
                p_alumnos.setVisible(true);
                break;

            case 2:
                p_docentes.setVisible(true);
                break;

            case 3:
                p_personalEscolar.setVisible(true);
                break;

            case 4:
                p_grupos.setVisible(true);
                break;

            case 5:
                p_clases.setVisible(true);
                break;

            case 6:
                p_administradores.setVisible(true);
                break;
        }
    }

    public String convertirFechas(String fechaEntrada) {
        String fecha = "";
        String[] dma = fechaEntrada.split("-");
        fecha = dma[2] + " de ";
        switch (dma[1]) {
            case "01":
                fecha += "Enero ";
                break;
            case "02":
                fecha += "Febrero ";
                break;
            case "03":
                fecha += "Marzo ";
                break;
            case "04":
                fecha += "Abril ";
                break;
            case "05":
                fecha += "Mayo ";
                break;
            case "06":
                fecha += "Junio ";
                break;
            case "07":
                fecha += "Julio ";
                break;
            case "08":
                fecha += "Agosto ";
                break;
            case "09":
                fecha += "Septiembre ";
                break;
            case "10":
                fecha += "Octubre ";
                break;
            case "11":
                fecha += "Noviembre ";
                break;
            case "12":
                fecha += "Diciembre ";
                break;
        }

        fecha += "del " + dma[0];
        return fecha;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Admin(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarAdministador;
    private javax.swing.JButton btn_agregarAlumno;
    private javax.swing.JButton btn_agregarClase;
    private javax.swing.JButton btn_agregarDocente;
    private javax.swing.JButton btn_agregarGrupo;
    private javax.swing.JButton btn_agregarPersonal;
    private javax.swing.JButton btn_editarClase;
    private javax.swing.JButton btn_editarGrupo;
    private javax.swing.JButton btn_eliminarClase;
    private javax.swing.JButton btn_eliminarGrupo;
    private javax.swing.JButton btn_verInfoDetalladaAdmin;
    private javax.swing.JButton btn_verInfoDetalladaClase;
    private javax.swing.JButton btn_verInfoDetalladaD;
    private javax.swing.JButton btn_verInfoDetalladaGrupo;
    private javax.swing.JButton btn_verInfoDetalladaP;
    private javax.swing.JButton btn_verMasInfoAlumno;
    private javax.swing.JComboBox<String> cb_carreraG;
    private javax.swing.JComboBox<String> cb_docenteC;
    private javax.swing.JComboBox<String> cb_grupoC;
    private javax.swing.JComboBox<String> cb_materiaC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lb_administrador;
    private javax.swing.JLabel lb_alumnos;
    private javax.swing.JLabel lb_borrarBusquedaAlumno;
    private javax.swing.JLabel lb_borrarBusquedaDocente;
    private javax.swing.JLabel lb_borrarBusquedaPersonal;
    private javax.swing.JLabel lb_carreraA;
    private javax.swing.JLabel lb_cerrar;
    private javax.swing.JLabel lb_cerrarSesion;
    private javax.swing.JLabel lb_clases;
    private javax.swing.JLabel lb_configuracionAvanzada;
    private javax.swing.JLabel lb_docentes;
    private javax.swing.JLabel lb_fechaNacimientoA;
    private javax.swing.JLabel lb_fechaNacimientoD;
    private javax.swing.JLabel lb_fechaNacimientoP;
    private javax.swing.JLabel lb_grupos;
    private javax.swing.JLabel lb_logo;
    private javax.swing.JLabel lb_minimizar;
    private javax.swing.JLabel lb_nombreAlumnoA;
    private javax.swing.JLabel lb_nombreDocenteD;
    private javax.swing.JLabel lb_nombrePersonalAdmin;
    private javax.swing.JLabel lb_nombrePersonalP;
    private javax.swing.JLabel lb_personalEscolar;
    private javax.swing.JLabel lb_semestreA;
    private javax.swing.JLabel lb_sexoAdmin;
    private javax.swing.JLabel lb_sexoD;
    private javax.swing.JLabel lb_sexoP;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JLabel lb_usuarioAdmin;
    private javax.swing.JPanel p_administradores;
    private javax.swing.JPanel p_alumnos;
    private javax.swing.JPanel p_cambiarAdministradores;
    private javax.swing.JPanel p_cambiarAlumnos;
    private javax.swing.JPanel p_cambiarClases;
    private javax.swing.JPanel p_cambiarDocentes;
    private javax.swing.JPanel p_cambiarGrupos;
    private javax.swing.JPanel p_cambiarPersonalEscolar;
    private javax.swing.JPanel p_clases;
    private javax.swing.JPanel p_configuracionAvanzada;
    private javax.swing.JPanel p_contenedor;
    private javax.swing.JPanel p_docentes;
    private javax.swing.JPanel p_grupos;
    private javax.swing.JPanel p_personalEscolar;
    private javax.swing.JPanel p_principal;
    private javax.swing.JPanel p_toolbar;
    private javax.swing.JSeparator separadorAdministrador;
    private javax.swing.JSeparator separadorAlumnos;
    private javax.swing.JSeparator separadorClases;
    private javax.swing.JSeparator separadorConfiguracionAvanzada;
    private javax.swing.JSeparator separadorDocentes;
    private javax.swing.JSeparator separadorGrupos;
    private javax.swing.JSeparator separadorPersonalEscolar;
    private javax.swing.JSpinner sp_hora;
    private javax.swing.JTable t_administradores;
    private javax.swing.JTable t_alumnos;
    private javax.swing.JTable t_clases;
    private javax.swing.JTable t_docentes;
    private javax.swing.JTable t_grupos;
    private javax.swing.JTable t_personalEscolar;
    private javax.swing.JTextField tf_buscarDocente;
    private javax.swing.JTextField tf_buscarPersonal;
    private javax.swing.JTextField tf_busquedaAlumnoA;
    private javax.swing.JTextField tf_nombreGrupoG;
    private javax.swing.JTextField tf_semestreG;
    // End of variables declaration//GEN-END:variables
}
