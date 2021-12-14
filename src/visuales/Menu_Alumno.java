package visuales;

import bd.Alumnos_BD;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Menu_Alumno extends javax.swing.JFrame {

    private Alumnos_BD ObjAlumnos;
    private final String noControl;
    private int panelActual = 1, x, y;
    private KardexAlumno kardex;

    public Menu_Alumno(String noControl) {
        initComponents();

        ObjAlumnos = new Alumnos_BD();

        this.noControl = noControl;
        this.setLocationRelativeTo(null);
        this.setTitle("¡BIENVENIDO " + ObjAlumnos.obtenerNombreAlumno(noControl) + "!");

        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27);
        AWTUtilities.setWindowShape(this, forma);

        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/ITH_GRANDE.png")).getImage());

        lb_titulo.setText("¡BIENVENIDO " + ObjAlumnos.obtenerNombreAlumno(noControl) + "!");

        cambiarPanel(1);
        p_cambiarMiInfo.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        separadorInfo.setVisible(true);

        inicializarFrame(noControl);

        kardex = new KardexAlumno(lb_semestreActual.getText(), noControl);
        dp_kardex.add(kardex);
        kardex.show();
        lb_anteriorSemestre.setEnabled(false);
        if (lb_semestre.getText().equals(lb_semestreActual.getText())) {
            lb_siguienteSemestre.setEnabled(false);
        }
    }

    public void inicializarFrame(String noControl) {
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
        lb_nombreAlumno.setText(elementos[1].toString());
        lb_semestre.setText(elementos[2].toString());
        lb_carrera.setText(elementos[3].toString());
        lb_correoElectronico.setText(elementos[4].toString());
        lb_telefono.setText(elementos[5].toString());
        lb_direccion.setText(elementos[6].toString());
        lb_sexo.setText(elementos[7].toString());
        lb_fechaNacimiento.setText(convertirFechas(elementos[8].toString()));
        lb_estado.setText(elementos[9].toString());
        lb_promedioGeneral.setText(elementos[10].toString());
        //promedio semestre
        lb_creditosCursados.setText(elementos[12].toString());
        lb_creditosFaltantes.setText(elementos[13].toString());
        // adeudos
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_principal = new javax.swing.JPanel();
        p_toolbar = new javax.swing.JPanel();
        p_cambiarMiInfo = new javax.swing.JPanel();
        separadorInfo = new javax.swing.JSeparator();
        lb_miInfo = new javax.swing.JLabel();
        p_cambiarKardex = new javax.swing.JPanel();
        separadorKardex = new javax.swing.JSeparator();
        lb_kardex = new javax.swing.JLabel();
        p_cambiarClasesInscritas = new javax.swing.JPanel();
        separadorClasesInscritas = new javax.swing.JSeparator();
        lb_clasesInscritas = new javax.swing.JLabel();
        lb_logo = new javax.swing.JLabel();
        lb_titulo = new javax.swing.JLabel();
        lb_cerrar = new javax.swing.JLabel();
        lb_minimizar = new javax.swing.JLabel();
        lb_cerrarSesion = new javax.swing.JLabel();
        p_contenedor = new javax.swing.JPanel();
        p_miInfo = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lb_nombreAlumno = new javax.swing.JLabel();
        lb_correoElectronico = new javax.swing.JLabel();
        lb_telefono = new javax.swing.JLabel();
        lb_direccion = new javax.swing.JLabel();
        lb_sexo = new javax.swing.JLabel();
        lb_fechaNacimiento = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        lb_semestre = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lb_carrera = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lb_estado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lb_creditosCursados = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lb_creditosFaltantes = new javax.swing.JLabel();
        p_kardex = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lb_anteriorSemestre = new javax.swing.JLabel();
        lb_semestreActual = new javax.swing.JLabel();
        lb_siguienteSemestre = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lb_promedioGeneral = new javax.swing.JLabel();
        dp_kardex = new javax.swing.JDesktopPane();
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

        p_cambiarMiInfo.setBackground(new java.awt.Color(35, 61, 123));
        p_cambiarMiInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        p_cambiarMiInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_cambiarMiInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_cambiarMiInfoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p_cambiarMiInfoMousePressed(evt);
            }
        });

        separadorInfo.setForeground(new java.awt.Color(255, 255, 255));

        lb_miInfo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_miInfo.setForeground(new java.awt.Color(255, 255, 255));
        lb_miInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_miInfo.setText("MI INFORMACIÓN");

        javax.swing.GroupLayout p_cambiarMiInfoLayout = new javax.swing.GroupLayout(p_cambiarMiInfo);
        p_cambiarMiInfo.setLayout(p_cambiarMiInfoLayout);
        p_cambiarMiInfoLayout.setHorizontalGroup(
            p_cambiarMiInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separadorInfo)
            .addComponent(lb_miInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        p_cambiarMiInfoLayout.setVerticalGroup(
            p_cambiarMiInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_cambiarMiInfoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lb_miInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(separadorInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        p_cambiarKardex.setBackground(new java.awt.Color(35, 61, 123));
        p_cambiarKardex.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p_cambiarKardex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_cambiarKardexMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_cambiarKardexMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p_cambiarKardexMousePressed(evt);
            }
        });

        separadorKardex.setForeground(new java.awt.Color(255, 255, 255));

        lb_kardex.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_kardex.setForeground(new java.awt.Color(255, 255, 255));
        lb_kardex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_kardex.setText("KARDEX");

        javax.swing.GroupLayout p_cambiarKardexLayout = new javax.swing.GroupLayout(p_cambiarKardex);
        p_cambiarKardex.setLayout(p_cambiarKardexLayout);
        p_cambiarKardexLayout.setHorizontalGroup(
            p_cambiarKardexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separadorKardex)
            .addComponent(lb_kardex, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        p_cambiarKardexLayout.setVerticalGroup(
            p_cambiarKardexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_cambiarKardexLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lb_kardex)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(separadorKardex, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        p_cambiarClasesInscritas.setBackground(new java.awt.Color(35, 61, 123));
        p_cambiarClasesInscritas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p_cambiarClasesInscritas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_cambiarClasesInscritasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_cambiarClasesInscritasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p_cambiarClasesInscritasMousePressed(evt);
            }
        });

        separadorClasesInscritas.setForeground(new java.awt.Color(255, 255, 255));

        lb_clasesInscritas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_clasesInscritas.setForeground(new java.awt.Color(255, 255, 255));
        lb_clasesInscritas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_clasesInscritas.setText("CLASES INSCRITAS");

        javax.swing.GroupLayout p_cambiarClasesInscritasLayout = new javax.swing.GroupLayout(p_cambiarClasesInscritas);
        p_cambiarClasesInscritas.setLayout(p_cambiarClasesInscritasLayout);
        p_cambiarClasesInscritasLayout.setHorizontalGroup(
            p_cambiarClasesInscritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separadorClasesInscritas)
            .addComponent(lb_clasesInscritas, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        p_cambiarClasesInscritasLayout.setVerticalGroup(
            p_cambiarClasesInscritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_cambiarClasesInscritasLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lb_clasesInscritas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(separadorClasesInscritas, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lb_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ITH_LOGO_PEQUEÑO.png"))); // NOI18N

        lb_titulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_titulo.setText("¡BIENVENIDO ALUMNO!");

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
                        .addComponent(p_cambiarMiInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p_cambiarKardex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p_cambiarClasesInscritas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_cerrarSesion)))
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
                    .addComponent(p_cambiarMiInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_cambiarKardex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_cambiarClasesInscritas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        p_contenedor.setBackground(new java.awt.Color(255, 255, 255));
        p_contenedor.setLayout(new java.awt.CardLayout());

        p_miInfo.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("INFORMACIÓN PERSONAL");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("NOMBRE DEL ALUMNO");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("CORREO ELECTRONICO");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("TELEFONO");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("DIRECCION");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("SEXO");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("FECHA DE NACIMIENTO");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("INFORMACIÓN ESCOLAR");

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("SEMESTRE");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("CARRERA");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("ESTADO");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("CREDITOS CURSADOS");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("CREDITOS FALTANTES");

        javax.swing.GroupLayout p_miInfoLayout = new javax.swing.GroupLayout(p_miInfo);
        p_miInfo.setLayout(p_miInfoLayout);
        p_miInfoLayout.setHorizontalGroup(
            p_miInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_miInfoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(p_miInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_nombreAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_correoElectronico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_sexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_fechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(p_miInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_semestre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_carrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_estado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_creditosCursados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_creditosFaltantes, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        p_miInfoLayout.setVerticalGroup(
            p_miInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_miInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_miInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_miInfoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_nombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_correoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p_miInfoLayout.createSequentialGroup()
                        .addGroup(p_miInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(p_miInfoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(24, 24, 24))
                            .addComponent(lb_semestre, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_creditosCursados, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_creditosFaltantes, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_fechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        p_contenedor.add(p_miInfo, "card2");

        p_kardex.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(35, 61, 123));
        jLabel21.setText("SEMESTRE");

        jSeparator4.setForeground(new java.awt.Color(35, 61, 123));

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

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(35, 61, 123));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel26.setText("PROMEDIO GENERAL:");
        jLabel26.setToolTipText("");

        lb_promedioGeneral.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_promedioGeneral.setText("10");

        javax.swing.GroupLayout dp_kardexLayout = new javax.swing.GroupLayout(dp_kardex);
        dp_kardex.setLayout(dp_kardexLayout);
        dp_kardexLayout.setHorizontalGroup(
            dp_kardexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dp_kardexLayout.setVerticalGroup(
            dp_kardexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout p_kardexLayout = new javax.swing.GroupLayout(p_kardex);
        p_kardex.setLayout(p_kardexLayout);
        p_kardexLayout.setHorizontalGroup(
            p_kardexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_kardexLayout.createSequentialGroup()
                .addContainerGap()
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
                        .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_promedioGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dp_kardex))
                .addContainerGap())
        );
        p_kardexLayout.setVerticalGroup(
            p_kardexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_kardexLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_kardexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_anteriorSemestre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_semestreActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_siguienteSemestre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_promedioGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dp_kardex)
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
        t_clasesInscritas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        t_clasesInscritas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(t_clasesInscritas);
        if (t_clasesInscritas.getColumnModel().getColumnCount() > 0) {
            t_clasesInscritas.getColumnModel().getColumn(0).setMinWidth(0);
            t_clasesInscritas.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        javax.swing.GroupLayout p_clasesInscritasLayout = new javax.swing.GroupLayout(p_clasesInscritas);
        p_clasesInscritas.setLayout(p_clasesInscritasLayout);
        p_clasesInscritasLayout.setHorizontalGroup(
            p_clasesInscritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_clasesInscritasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                .addContainerGap())
        );
        p_clasesInscritasLayout.setVerticalGroup(
            p_clasesInscritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_clasesInscritasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
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

    private void p_cambiarMiInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarMiInfoMouseEntered
        if (panelActual != 1) {
            separadorInfo.setVisible(true);
        }
    }//GEN-LAST:event_p_cambiarMiInfoMouseEntered

    private void p_cambiarMiInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarMiInfoMouseExited
        if (panelActual != 1) {
            separadorInfo.setVisible(false);
        }
    }//GEN-LAST:event_p_cambiarMiInfoMouseExited

    private void p_cambiarMiInfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarMiInfoMousePressed
        if (panelActual != 1) {
            panelActual = 1;
            cambiarPanel(panelActual);
            separadorInfo.setVisible(true);
            p_cambiarMiInfo.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_p_cambiarMiInfoMousePressed

    private void p_cambiarKardexMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarKardexMouseEntered
        if (panelActual != 2) {
            separadorKardex.setVisible(true);
        }
    }//GEN-LAST:event_p_cambiarKardexMouseEntered

    private void p_cambiarKardexMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarKardexMouseExited
        if (panelActual != 2) {
            separadorKardex.setVisible(false);
        }
    }//GEN-LAST:event_p_cambiarKardexMouseExited

    private void p_cambiarKardexMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarKardexMousePressed
        if (panelActual != 2) {
            //ObjDocentes.obtenerDocentes(t_docentes);
            panelActual = 2;
            cambiarPanel(panelActual);
            separadorKardex.setVisible(true);
            p_cambiarKardex.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_p_cambiarKardexMousePressed

    private void p_cambiarClasesInscritasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarClasesInscritasMouseEntered
        if (panelActual != 3) {
            separadorClasesInscritas.setVisible(true);
        }
    }//GEN-LAST:event_p_cambiarClasesInscritasMouseEntered

    private void p_cambiarClasesInscritasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarClasesInscritasMouseExited
        if (panelActual != 3) {
            separadorClasesInscritas.setVisible(false);
        }
    }//GEN-LAST:event_p_cambiarClasesInscritasMouseExited

    private void p_cambiarClasesInscritasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarClasesInscritasMousePressed
        if (panelActual != 3) {
            ObjAlumnos.obtenerClasesInscritasAlumno(t_clasesInscritas, noControl);
            panelActual = 3;
            cambiarPanel(panelActual);
            separadorClasesInscritas.setVisible(true);
            p_cambiarClasesInscritas.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_p_cambiarClasesInscritasMousePressed

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

    private void p_principalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_principalMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_p_principalMouseDragged

    private void p_principalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_principalMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_p_principalMousePressed

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
            dp_kardex.removeAll();
            kardex = new KardexAlumno(lb_semestreActual.getText(), noControl);
            dp_kardex.add(kardex);
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
            dp_kardex.removeAll();
            kardex = new KardexAlumno(lb_semestreActual.getText(), noControl);
            dp_kardex.add(kardex);
            kardex.show();
            if (lb_semestre.getText().equals((semestreActual) + "")) {
                lb_siguienteSemestre.setEnabled(false);
            }
        }
    }//GEN-LAST:event_lb_siguienteSemestreMouseReleased

    public void cambiarPanel(int panel) {
        // ESCONDEMOS Y PONEMOS BOTONES EN DEFUALT
        separadorInfo.setVisible(false);
        p_cambiarMiInfo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        separadorKardex.setVisible(false);
        p_cambiarKardex.setCursor(new Cursor(Cursor.HAND_CURSOR));
        separadorClasesInscritas.setVisible(false);
        p_cambiarClasesInscritas.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // ESCONDEMOS PANELES
        p_miInfo.setVisible(false);
        p_kardex.setVisible(false);
        p_clasesInscritas.setVisible(false);

        switch (panel) {
            case 1:
                p_miInfo.setVisible(true);
                break;

            case 2:
                p_kardex.setVisible(true);
                break;

            case 3:
                p_clasesInscritas.setVisible(true);
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
                new Menu_Alumno("19330650").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dp_kardex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lb_anteriorSemestre;
    private javax.swing.JLabel lb_carrera;
    private javax.swing.JLabel lb_cerrar;
    private javax.swing.JLabel lb_cerrarSesion;
    private javax.swing.JLabel lb_clasesInscritas;
    private javax.swing.JLabel lb_correoElectronico;
    private javax.swing.JLabel lb_creditosCursados;
    private javax.swing.JLabel lb_creditosFaltantes;
    private javax.swing.JLabel lb_direccion;
    private javax.swing.JLabel lb_estado;
    private javax.swing.JLabel lb_fechaNacimiento;
    private javax.swing.JLabel lb_kardex;
    private javax.swing.JLabel lb_logo;
    private javax.swing.JLabel lb_miInfo;
    private javax.swing.JLabel lb_minimizar;
    private javax.swing.JLabel lb_nombreAlumno;
    private javax.swing.JLabel lb_promedioGeneral;
    private javax.swing.JLabel lb_semestre;
    private javax.swing.JLabel lb_semestreActual;
    private javax.swing.JLabel lb_sexo;
    private javax.swing.JLabel lb_siguienteSemestre;
    private javax.swing.JLabel lb_telefono;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JPanel p_cambiarClasesInscritas;
    private javax.swing.JPanel p_cambiarKardex;
    private javax.swing.JPanel p_cambiarMiInfo;
    private javax.swing.JPanel p_clasesInscritas;
    private javax.swing.JPanel p_contenedor;
    private javax.swing.JPanel p_kardex;
    private javax.swing.JPanel p_miInfo;
    private javax.swing.JPanel p_principal;
    private javax.swing.JPanel p_toolbar;
    private javax.swing.JSeparator separadorClasesInscritas;
    private javax.swing.JSeparator separadorInfo;
    private javax.swing.JSeparator separadorKardex;
    private javax.swing.JTable t_clasesInscritas;
    // End of variables declaration//GEN-END:variables
}
