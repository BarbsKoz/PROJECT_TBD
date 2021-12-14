package visuales;

import bd.Alumnos_BD;
import bd.Carrera_BD;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;

public class InformacionAlumno extends javax.swing.JFrame {

    private Menu_Admin ObjPadre;
    private Alumnos_BD ObjAlumnos;
    private Carrera_BD ObjCarreras;
    private int x, y, semestre;
    private String noControl;
    private KardexAlumno kardex;
    
    public InformacionAlumno(Menu_Admin frame, String noControl) {
        initComponents();
        
        ObjPadre = frame;
        ObjAlumnos = new Alumnos_BD();
        ObjCarreras = new Carrera_BD();
        
        this.noControl = noControl;
        
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27);
        AWTUtilities.setWindowShape(this, forma);
        
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/ITH_GRANDE.png")).getImage());
        
        ObjCarreras.obtenerCarrerasCB(cb_carrera);
        inicializarFrame(noControl);
        
        kardex = new KardexAlumno(lb_semestreActual.getText(), noControl);
        dp_kardexSemestres.add(kardex);
        kardex.show();
        lb_anteriorSemestre.setEnabled(false);
        if (semestre == 1) {
            lb_siguienteSemestre.setEnabled(false);
        }
    }
    
    public void inicializarFrame (String noControl){
        Object[] elementos = ObjAlumnos.obtenerAlumno(noControl);
        /*
            1. Numero de Control
            2. Nombre del alumno
            3. Semestre
            4. Carrera
            5. Correo Electronico
            6. Telefono
            7. Direccion
            8. Sexo
            9. Fecha de Nacimiento
            10. Estado
            11. Promedio General
            12. Promedio Semestre
            13. Creditos Cursados
            14. Creditos Faltantes
            15. Adeudos
            16. Nip
        */
        tf_noControl.setText(elementos[0].toString());
        tf_noControl.setEditable(false);
        tf_nombreAlumno.setText(elementos[1].toString());
        tf_semestre.setText(elementos[2].toString());
        this.semestre = Integer.parseInt(elementos[2].toString());
        cb_carrera.setSelectedItem(elementos[3]);
        tf_correoElectronico.setText(elementos[4].toString());
        tf_telefono.setText(elementos[5].toString());
        tf_direccion.setText(elementos[6].toString());
        cb_sexo.setSelectedItem(elementos[7]);
        String[] fechaNacimiento = elementos[8].toString().split("-");
        tf_ano.setText(fechaNacimiento[0]);
        sp_mes.setValue(fechaNacimiento[1]);
        sp_dia.setValue(fechaNacimiento[2]);
        cb_estado.setSelectedItem(elementos[9]);
        //promedio general
        //promedio semestre
        tf_creditosCursados.setText(elementos[12].toString());
        tf_creditosFaltantes.setText(elementos[13].toString());
        // adeudos
        tf_nip.setText(elementos[15].toString());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_principal = new javax.swing.JPanel();
        p_toolbar = new javax.swing.JPanel();
        lb_logoEscuela = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lb_cerrar = new javax.swing.JLabel();
        lb_minimizar = new javax.swing.JLabel();
        p_barraHerramientas = new javax.swing.JPanel();
        lb_informacionAlumno = new javax.swing.JLabel();
        lb_kardex = new javax.swing.JLabel();
        lb_clasesInscritas = new javax.swing.JLabel();
        p_contenedor = new javax.swing.JPanel();
        p_informacionAlumno = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        tf_nombreAlumno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_semestre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cb_carrera = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        tf_correoElectronico = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_telefono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_direccion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cb_sexo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        sp_dia = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        sp_mes = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        tf_ano = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tf_noControl = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cb_estado = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        tf_creditosCursados = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tf_creditosFaltantes = new javax.swing.JTextField();
        btn_eliminarAlumno = new javax.swing.JButton();
        btn_editarAlumno = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        tf_nip = new javax.swing.JTextField();
        p_kardex = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        lb_anteriorSemestre = new javax.swing.JLabel();
        lb_semestreActual = new javax.swing.JLabel();
        lb_siguienteSemestre = new javax.swing.JLabel();
        lb_promedioGeneral = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        dp_kardexSemestres = new javax.swing.JDesktopPane();
        p_clasesInscritas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_clasesInscritas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        p_principal.setBackground(new java.awt.Color(255, 255, 255));
        p_principal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                p_principalMouseDragged(evt);
            }
        });
        p_principal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p_principalMousePressed(evt);
            }
        });

        p_toolbar.setBackground(new java.awt.Color(35, 61, 123));

        lb_logoEscuela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_logoEscuela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ITH_LOGO_PEQUEÑO.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INFORMACIÓN ALUMNO");

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

        p_barraHerramientas.setBackground(new java.awt.Color(35, 61, 123));

        lb_informacionAlumno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_informacionAlumno.setForeground(new java.awt.Color(102, 102, 102));
        lb_informacionAlumno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_informacionAlumno.setText("INFORMACIÓN DEL ALUMNO");
        lb_informacionAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_informacionAlumno.setEnabled(false);
        lb_informacionAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_informacionAlumnoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_informacionAlumnoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_informacionAlumnoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lb_informacionAlumnoMouseReleased(evt);
            }
        });

        lb_kardex.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_kardex.setForeground(new java.awt.Color(255, 255, 255));
        lb_kardex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_kardex.setText("KARDEX");
        lb_kardex.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_kardex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_kardexMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_kardexMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_kardexMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lb_kardexMouseReleased(evt);
            }
        });

        lb_clasesInscritas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_clasesInscritas.setForeground(new java.awt.Color(255, 255, 255));
        lb_clasesInscritas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_clasesInscritas.setText("CLASES INSCRITAS");
        lb_clasesInscritas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_clasesInscritas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_clasesInscritasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_clasesInscritasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_clasesInscritasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lb_clasesInscritasMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout p_barraHerramientasLayout = new javax.swing.GroupLayout(p_barraHerramientas);
        p_barraHerramientas.setLayout(p_barraHerramientasLayout);
        p_barraHerramientasLayout.setHorizontalGroup(
            p_barraHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_barraHerramientasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_informacionAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_kardex, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_clasesInscritas, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p_barraHerramientasLayout.setVerticalGroup(
            p_barraHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_barraHerramientasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_barraHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_informacionAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(lb_kardex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_clasesInscritas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout p_toolbarLayout = new javax.swing.GroupLayout(p_toolbar);
        p_toolbar.setLayout(p_toolbarLayout);
        p_toolbarLayout.setHorizontalGroup(
            p_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_toolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_logoEscuela, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_minimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_cerrar)
                .addContainerGap())
            .addComponent(p_barraHerramientas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        p_toolbarLayout.setVerticalGroup(
            p_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_toolbarLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(p_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_minimizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_logoEscuela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_barraHerramientas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        p_contenedor.setLayout(new java.awt.CardLayout());

        p_informacionAlumno.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("INFORMACIÓN PERSONAL");

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("NOMBRE DEL ALUMNO");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("SEMESTRE");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("CARRERA");

        cb_carrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("INFORMACIÓN ESCOLAR");

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("CORREO ELECTRONICO");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("TELEFONO");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("DIRECCION");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("SEXO");

        cb_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FEMENINO", "MASCULINO" }));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("FECHA DE NACIMIENTO");

        jLabel13.setText("DIA");

        sp_dia.setModel(new javax.swing.SpinnerListModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));

        jLabel14.setText("MES");

        sp_mes.setModel(new javax.swing.SpinnerListModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));

        jLabel15.setText("AÑO");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("NUMERO DE CONTROL");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("ESTADO");

        cb_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVO", "BAJA" }));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("CREDITOS CURSADOS");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("CREDITOS FALTANTES");

        btn_eliminarAlumno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_eliminarAlumno.setForeground(new java.awt.Color(255, 90, 90));
        btn_eliminarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminarNormal.png"))); // NOI18N
        btn_eliminarAlumno.setText("ELIMINAR");
        btn_eliminarAlumno.setBorderPainted(false);
        btn_eliminarAlumno.setContentAreaFilled(false);
        btn_eliminarAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminarAlumno.setFocusPainted(false);
        btn_eliminarAlumno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_eliminarAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_eliminarAlumnoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_eliminarAlumnoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_eliminarAlumnoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_eliminarAlumnoMouseReleased(evt);
            }
        });
        btn_eliminarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarAlumnoActionPerformed(evt);
            }
        });

        btn_editarAlumno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_editarAlumno.setForeground(new java.awt.Color(35, 61, 123));
        btn_editarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editarNormal.png"))); // NOI18N
        btn_editarAlumno.setText("EDITAR");
        btn_editarAlumno.setBorderPainted(false);
        btn_editarAlumno.setContentAreaFilled(false);
        btn_editarAlumno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editarAlumno.setFocusPainted(false);
        btn_editarAlumno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_editarAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_editarAlumnoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_editarAlumnoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_editarAlumnoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_editarAlumnoMouseReleased(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("NIP");

        javax.swing.GroupLayout p_informacionAlumnoLayout = new javax.swing.GroupLayout(p_informacionAlumno);
        p_informacionAlumno.setLayout(p_informacionAlumnoLayout);
        p_informacionAlumnoLayout.setHorizontalGroup(
            p_informacionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_informacionAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_informacionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_informacionAlumnoLayout.createSequentialGroup()
                        .addGroup(p_informacionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(p_informacionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)))
                    .addGroup(p_informacionAlumnoLayout.createSequentialGroup()
                        .addGroup(p_informacionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(p_informacionAlumnoLayout.createSequentialGroup()
                                .addComponent(btn_eliminarAlumno)
                                .addGap(91, 91, 91)
                                .addComponent(btn_editarAlumno))
                            .addGroup(p_informacionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb_sexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_direccion)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_telefono)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_nombreAlumno)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_correoElectronico)
                                .addGroup(p_informacionAlumnoLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(sp_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(sp_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tf_ano, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))))
                        .addGroup(p_informacionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p_informacionAlumnoLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(tf_semestre, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_informacionAlumnoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(p_informacionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_informacionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cb_carrera, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tf_noControl)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cb_estado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
                                    .addComponent(tf_creditosCursados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_creditosFaltantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_nip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        p_informacionAlumnoLayout.setVerticalGroup(
            p_informacionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_informacionAlumnoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(p_informacionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_informacionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_informacionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_informacionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_nombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_noControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p_informacionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_informacionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_correoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_semestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p_informacionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_informacionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p_informacionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_informacionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p_informacionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_informacionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_creditosCursados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(p_informacionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_informacionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(sp_dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sp_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(tf_ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_creditosFaltantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(p_informacionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_informacionAlumnoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(p_informacionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_eliminarAlumno)
                            .addComponent(btn_editarAlumno)))
                    .addGroup(p_informacionAlumnoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        p_contenedor.add(p_informacionAlumno, "card2");

        p_kardex.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(35, 61, 123));
        jLabel21.setText("SEMESTRE");

        lb_anteriorSemestre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/moverIzquierdaNormal.png"))); // NOI18N
        lb_anteriorSemestre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_anteriorSemestre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_anteriorSemestreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_anteriorSemestreMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_anteriorSemestreMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lb_anteriorSemestreMouseReleased(evt);
            }
        });

        lb_semestreActual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_semestreActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_semestreActual.setText("1");

        lb_siguienteSemestre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/moverDerechaNormal.png"))); // NOI18N
        lb_siguienteSemestre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_siguienteSemestre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_siguienteSemestreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_siguienteSemestreMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_siguienteSemestreMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lb_siguienteSemestreMouseReleased(evt);
            }
        });

        lb_promedioGeneral.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_promedioGeneral.setText("10");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(35, 61, 123));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel26.setText("PROMEDIO GENERAL:");
        jLabel26.setToolTipText("");

        jSeparator4.setForeground(new java.awt.Color(35, 61, 123));

        javax.swing.GroupLayout dp_kardexSemestresLayout = new javax.swing.GroupLayout(dp_kardexSemestres);
        dp_kardexSemestres.setLayout(dp_kardexSemestresLayout);
        dp_kardexSemestresLayout.setHorizontalGroup(
            dp_kardexSemestresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dp_kardexSemestresLayout.setVerticalGroup(
            dp_kardexSemestresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout p_kardexLayout = new javax.swing.GroupLayout(p_kardex);
        p_kardex.setLayout(p_kardexLayout);
        p_kardexLayout.setHorizontalGroup(
            p_kardexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_kardexLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(p_kardexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addGroup(p_kardexLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(lb_anteriorSemestre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_semestreActual, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_siguienteSemestre)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_promedioGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
            .addGroup(p_kardexLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dp_kardexSemestres)
                .addContainerGap())
        );
        p_kardexLayout.setVerticalGroup(
            p_kardexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_kardexLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_kardexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_anteriorSemestre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_semestreActual, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(lb_siguienteSemestre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_promedioGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dp_kardexSemestres)
                .addContainerGap())
        );

        p_contenedor.add(p_kardex, "card3");

        p_clasesInscritas.setBackground(new java.awt.Color(255, 255, 255));

        t_clasesInscritas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "MATERIA", "GRUPO", "DOCENTE", "HORA", "CALIFICACION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(t_clasesInscritas);
        if (t_clasesInscritas.getColumnModel().getColumnCount() > 0) {
            t_clasesInscritas.getColumnModel().getColumn(0).setMinWidth(50);
            t_clasesInscritas.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        javax.swing.GroupLayout p_clasesInscritasLayout = new javax.swing.GroupLayout(p_clasesInscritas);
        p_clasesInscritas.setLayout(p_clasesInscritasLayout);
        p_clasesInscritasLayout.setHorizontalGroup(
            p_clasesInscritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_clasesInscritasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
                .addContainerGap())
        );
        p_clasesInscritasLayout.setVerticalGroup(
            p_clasesInscritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_clasesInscritasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addContainerGap())
        );

        p_contenedor.add(p_clasesInscritas, "card4");

        javax.swing.GroupLayout p_principalLayout = new javax.swing.GroupLayout(p_principal);
        p_principal.setLayout(p_principalLayout);
        p_principalLayout.setHorizontalGroup(
            p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(p_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        p_principalLayout.setVerticalGroup(
            p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_principalLayout.createSequentialGroup()
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

    private void lb_cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarMouseEntered
        lb_cerrar.setIcon(new ImageIcon(getClass().getResource("/imagenes/cerrarEntered.png")));
    }//GEN-LAST:event_lb_cerrarMouseEntered

    private void lb_cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarMouseExited
        lb_cerrar.setIcon(new ImageIcon(getClass().getResource("/imagenes/cerrarNormal.png")));
    }//GEN-LAST:event_lb_cerrarMouseExited

    private void lb_cerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarMousePressed
        lb_cerrar.setIcon(new ImageIcon(getClass().getResource("/imagenes/cerrarPressed.png")));
        ObjPadre.setEnabled(true);
        ObjPadre.actualizarApartadoAlumnos();
        dispose();
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

    private void p_principalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_principalMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_p_principalMouseDragged

    private void p_principalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_principalMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_p_principalMousePressed

    private void btn_eliminarAlumnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarAlumnoMouseEntered
        btn_eliminarAlumno.setForeground(new Color(203, 73, 73));
        btn_eliminarAlumno.setIcon(new ImageIcon(getClass().getResource("/imagenes/eliminarEntered.png")));
    }//GEN-LAST:event_btn_eliminarAlumnoMouseEntered

    private void btn_eliminarAlumnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarAlumnoMouseExited
        btn_eliminarAlumno.setForeground(new Color(255, 90, 90));
        btn_eliminarAlumno.setIcon(new ImageIcon(getClass().getResource("/imagenes/eliminarNormal.png")));
    }//GEN-LAST:event_btn_eliminarAlumnoMouseExited

    private void btn_eliminarAlumnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarAlumnoMousePressed
        btn_eliminarAlumno.setForeground(new Color(165, 62, 62));
        btn_eliminarAlumno.setIcon(new ImageIcon(getClass().getResource("/imagenes/eliminarPressed.png")));
    }//GEN-LAST:event_btn_eliminarAlumnoMousePressed

    private void btn_eliminarAlumnoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarAlumnoMouseReleased
        btn_eliminarAlumno.setForeground(new Color(203, 73, 73));
        btn_eliminarAlumno.setIcon(new ImageIcon(getClass().getResource("/imagenes/eliminarEntered.png")));
    }//GEN-LAST:event_btn_eliminarAlumnoMouseReleased

    private void btn_editarAlumnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarAlumnoMouseEntered
        btn_editarAlumno.setForeground(new Color(30, 51, 100));
        btn_editarAlumno.setIcon(new ImageIcon(getClass().getResource("/imagenes/editarEntered.png")));
    }//GEN-LAST:event_btn_editarAlumnoMouseEntered

    private void btn_editarAlumnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarAlumnoMouseExited
        btn_editarAlumno.setForeground(new Color(35, 61, 123));
        btn_editarAlumno.setIcon(new ImageIcon(getClass().getResource("/imagenes/editarNormal.png")));
    }//GEN-LAST:event_btn_editarAlumnoMouseExited

    private void btn_editarAlumnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarAlumnoMousePressed
        btn_editarAlumno.setForeground(new Color(35, 61, 123));
        btn_editarAlumno.setIcon(new ImageIcon(getClass().getResource("/imagenes/editarPressed.png")));
    }//GEN-LAST:event_btn_editarAlumnoMousePressed

    private void btn_editarAlumnoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarAlumnoMouseReleased
        btn_editarAlumno.setForeground(new Color(30, 51, 100));
        btn_editarAlumno.setIcon(new ImageIcon(getClass().getResource("/imagenes/editarEntered.png")));
    }//GEN-LAST:event_btn_editarAlumnoMouseReleased

    private void lb_informacionAlumnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_informacionAlumnoMouseEntered
        lb_informacionAlumno.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_lb_informacionAlumnoMouseEntered

    private void lb_informacionAlumnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_informacionAlumnoMouseExited
        lb_informacionAlumno.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_lb_informacionAlumnoMouseExited

    private void lb_informacionAlumnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_informacionAlumnoMousePressed
        lb_informacionAlumno.setForeground(new Color(102, 102, 102));
        cambiarPaneles(1);
    }//GEN-LAST:event_lb_informacionAlumnoMousePressed

    private void lb_informacionAlumnoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_informacionAlumnoMouseReleased
        lb_informacionAlumno.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_lb_informacionAlumnoMouseReleased

    private void lb_kardexMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_kardexMouseEntered
        lb_kardex.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_lb_kardexMouseEntered

    private void lb_kardexMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_kardexMouseExited
        lb_kardex.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_lb_kardexMouseExited

    private void lb_kardexMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_kardexMousePressed
        lb_kardex.setForeground(new Color(102, 102, 102));
        cambiarPaneles(2);
    }//GEN-LAST:event_lb_kardexMousePressed

    private void lb_kardexMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_kardexMouseReleased
        lb_kardex.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_lb_kardexMouseReleased

    private void lb_clasesInscritasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_clasesInscritasMouseEntered
        lb_clasesInscritas.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_lb_clasesInscritasMouseEntered

    private void lb_clasesInscritasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_clasesInscritasMouseExited
        lb_clasesInscritas.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_lb_clasesInscritasMouseExited

    private void lb_clasesInscritasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_clasesInscritasMousePressed
        lb_clasesInscritas.setForeground(new Color(102, 102, 102));
        ObjAlumnos.obtenerClasesInscritasAlumno(t_clasesInscritas, noControl);
        cambiarPaneles(3);
    }//GEN-LAST:event_lb_clasesInscritasMousePressed

    private void lb_clasesInscritasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_clasesInscritasMouseReleased
        lb_clasesInscritas.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_lb_clasesInscritasMouseReleased

    private void btn_eliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarAlumnoActionPerformed
        
    }//GEN-LAST:event_btn_eliminarAlumnoActionPerformed

    private void lb_anteriorSemestreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_anteriorSemestreMouseEntered
        lb_anteriorSemestre.setIcon(new ImageIcon(getClass().getResource("/imagenes/moverIzquierdaEntered.png")));
    }//GEN-LAST:event_lb_anteriorSemestreMouseEntered

    private void lb_anteriorSemestreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_anteriorSemestreMouseExited
        lb_anteriorSemestre.setIcon(new ImageIcon(getClass().getResource("/imagenes/moverIzquierdaNormal.png")));
    }//GEN-LAST:event_lb_anteriorSemestreMouseExited

    private void lb_anteriorSemestreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_anteriorSemestreMousePressed
        lb_anteriorSemestre.setIcon(new ImageIcon(getClass().getResource("/imagenes/moverIzquierdaPressed.png")));
    }//GEN-LAST:event_lb_anteriorSemestreMousePressed

    private void lb_anteriorSemestreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_anteriorSemestreMouseReleased
        lb_anteriorSemestre.setIcon(new ImageIcon(getClass().getResource("/imagenes/moverIzquierdaEntered.png")));
        if (lb_anteriorSemestre.isEnabled()) {
            lb_siguienteSemestre.setEnabled(true);
            int semestreActual = Integer.parseInt(lb_semestreActual.getText()) - 1;
            lb_semestreActual.setText(semestreActual + "");
            dp_kardexSemestres.removeAll();
            kardex = new KardexAlumno(lb_semestreActual.getText(), noControl);
            dp_kardexSemestres.add(kardex);
            kardex.show();
            if (semestreActual == 1) {
                lb_anteriorSemestre.setEnabled(false);
            }
        }
    }//GEN-LAST:event_lb_anteriorSemestreMouseReleased

    private void lb_siguienteSemestreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_siguienteSemestreMouseEntered
        lb_siguienteSemestre.setIcon(new ImageIcon(getClass().getResource("/imagenes/moverDerechaEntered.png")));
    }//GEN-LAST:event_lb_siguienteSemestreMouseEntered

    private void lb_siguienteSemestreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_siguienteSemestreMouseExited
        lb_siguienteSemestre.setIcon(new ImageIcon(getClass().getResource("/imagenes/moverDerechaNormal.png")));
    }//GEN-LAST:event_lb_siguienteSemestreMouseExited

    private void lb_siguienteSemestreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_siguienteSemestreMousePressed
        lb_siguienteSemestre.setIcon(new ImageIcon(getClass().getResource("/imagenes/moverDerechaPressed.png")));
    }//GEN-LAST:event_lb_siguienteSemestreMousePressed

    private void lb_siguienteSemestreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_siguienteSemestreMouseReleased
        lb_siguienteSemestre.setIcon(new ImageIcon(getClass().getResource("/imagenes/moverDerechaEntered.png")));
        if (lb_siguienteSemestre.isEnabled()) {
            lb_anteriorSemestre.setEnabled(true);
            int semestreActual = Integer.parseInt(lb_semestreActual.getText()) + 1;
            lb_semestreActual.setText(semestreActual + "");
            dp_kardexSemestres.removeAll();
            kardex = new KardexAlumno(lb_semestreActual.getText(), noControl);
            dp_kardexSemestres.add(kardex);
            kardex.show();
            if (semestre == semestreActual) {
                lb_siguienteSemestre.setEnabled(false);
            }
        }
    }//GEN-LAST:event_lb_siguienteSemestreMouseReleased

    public void cambiarPaneles(int panel) {
        lb_informacionAlumno.setEnabled(true);
        lb_kardex.setEnabled(true);
        lb_clasesInscritas.setEnabled(true);
        
        p_informacionAlumno.setVisible(false);
        p_kardex.setVisible(false);
        p_clasesInscritas.setVisible(false);
        
        switch(panel){
            case 1:
                lb_informacionAlumno.setEnabled(false);
                p_informacionAlumno.setVisible(true);
                break;
                
            case 2:
                lb_kardex.setEnabled(false);
                p_kardex.setVisible(true);
                break;
                
            case 3:
                lb_clasesInscritas.setEnabled(false);
                p_clasesInscritas.setVisible(true);
                break;
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionAlumno(null, "19330650").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_editarAlumno;
    private javax.swing.JButton btn_eliminarAlumno;
    private javax.swing.JComboBox<String> cb_carrera;
    private javax.swing.JComboBox<String> cb_estado;
    private javax.swing.JComboBox<String> cb_sexo;
    private javax.swing.JDesktopPane dp_kardexSemestres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lb_anteriorSemestre;
    private javax.swing.JLabel lb_cerrar;
    private javax.swing.JLabel lb_clasesInscritas;
    private javax.swing.JLabel lb_informacionAlumno;
    private javax.swing.JLabel lb_kardex;
    private javax.swing.JLabel lb_logoEscuela;
    private javax.swing.JLabel lb_minimizar;
    private javax.swing.JLabel lb_promedioGeneral;
    private javax.swing.JLabel lb_semestreActual;
    private javax.swing.JLabel lb_siguienteSemestre;
    private javax.swing.JPanel p_barraHerramientas;
    private javax.swing.JPanel p_clasesInscritas;
    private javax.swing.JPanel p_contenedor;
    private javax.swing.JPanel p_informacionAlumno;
    private javax.swing.JPanel p_kardex;
    private javax.swing.JPanel p_principal;
    private javax.swing.JPanel p_toolbar;
    private javax.swing.JSpinner sp_dia;
    private javax.swing.JSpinner sp_mes;
    private javax.swing.JTable t_clasesInscritas;
    private javax.swing.JTextField tf_ano;
    private javax.swing.JTextField tf_correoElectronico;
    private javax.swing.JTextField tf_creditosCursados;
    private javax.swing.JTextField tf_creditosFaltantes;
    private javax.swing.JTextField tf_direccion;
    private javax.swing.JTextField tf_nip;
    private javax.swing.JTextField tf_noControl;
    private javax.swing.JTextField tf_nombreAlumno;
    private javax.swing.JTextField tf_semestre;
    private javax.swing.JTextField tf_telefono;
    // End of variables declaration//GEN-END:variables
}
