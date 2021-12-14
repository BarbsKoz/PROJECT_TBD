package visuales;

import bd.*;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ConAvanzada extends javax.swing.JFrame {

    private Menu_Admin ObjPadre;
    private Carrera_BD ObjCarrera;
    private Puestos_BD ObjPuestos;
    private Materia_BD ObjMaterias;
    private int x, y;

    public ConAvanzada(Menu_Admin frame) {
        initComponents();

        ObjPadre = frame;
        ObjCarrera = new Carrera_BD();
        ObjPuestos = new Puestos_BD();
        ObjMaterias = new Materia_BD();

        ObjCarrera.obtenerCarreras(t_carreras);

        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27);
        AWTUtilities.setWindowShape(this, forma);

        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/ITH_GRANDE.png")).getImage());

        cambiarPaneles(1);
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
        lb_carreras = new javax.swing.JLabel();
        lb_puestos = new javax.swing.JLabel();
        lb_materias = new javax.swing.JLabel();
        p_contenedor = new javax.swing.JPanel();
        p_carreras = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_carreras = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        tf_carrera = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_creditosCarrera = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btn_agregarCarrera = new javax.swing.JButton();
        btn_editarCarrera = new javax.swing.JButton();
        btn_eliminarCarrera = new javax.swing.JButton();
        p_puestos = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_puestos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        tf_puesto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_agregarPuesto = new javax.swing.JButton();
        btn_editarPuesto = new javax.swing.JButton();
        btn_eliminarPuesto = new javax.swing.JButton();
        p_materias = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        t_materias = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        tf_materia = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf_creditosMateria = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btn_agregarMateria = new javax.swing.JButton();
        btn_editarMateria = new javax.swing.JButton();
        btn_eliminarMateria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        p_principal.setBackground(new java.awt.Color(255, 255, 255));
        p_principal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
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
        jLabel1.setText("CONFIGURACIÓN AVANZADA");

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

        lb_carreras.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_carreras.setForeground(new java.awt.Color(102, 102, 102));
        lb_carreras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_carreras.setText("CARRERAS");
        lb_carreras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_carreras.setEnabled(false);
        lb_carreras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_carrerasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_carrerasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_carrerasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lb_carrerasMouseReleased(evt);
            }
        });

        lb_puestos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_puestos.setForeground(new java.awt.Color(255, 255, 255));
        lb_puestos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_puestos.setText("PUESTOS");
        lb_puestos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_puestos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_puestosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_puestosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_puestosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lb_puestosMouseReleased(evt);
            }
        });

        lb_materias.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_materias.setForeground(new java.awt.Color(255, 255, 255));
        lb_materias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_materias.setText("MATERIAS");
        lb_materias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_materias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_materiasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_materiasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_materiasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lb_materiasMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout p_barraHerramientasLayout = new javax.swing.GroupLayout(p_barraHerramientas);
        p_barraHerramientas.setLayout(p_barraHerramientasLayout);
        p_barraHerramientasLayout.setHorizontalGroup(
            p_barraHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_barraHerramientasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_carreras, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_puestos, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_materias, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p_barraHerramientasLayout.setVerticalGroup(
            p_barraHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_barraHerramientasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_barraHerramientasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_carreras, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(lb_puestos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_materias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        p_carreras.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("CARRERAS");

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        t_carreras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "CARRERA", "CREDITOS CARRERA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_carreras.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        t_carreras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                t_carrerasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(t_carreras);
        if (t_carreras.getColumnModel().getColumnCount() > 0) {
            t_carreras.getColumnModel().getColumn(0).setMinWidth(50);
            t_carreras.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("DATOS DE LA CARRERA");

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("CARRERA:");

        tf_carrera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_carreraKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("CREDITOS DE LA CARRERA:");

        tf_creditosCarrera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_creditosCarreraKeyTyped(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_agregarCarrera.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_agregarCarrera.setForeground(new java.awt.Color(48, 173, 32));
        btn_agregarCarrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarNormal.png"))); // NOI18N
        btn_agregarCarrera.setText("AGREGAR CARRERA");
        btn_agregarCarrera.setBorderPainted(false);
        btn_agregarCarrera.setContentAreaFilled(false);
        btn_agregarCarrera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregarCarrera.setFocusPainted(false);
        btn_agregarCarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_agregarCarreraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_agregarCarreraMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_agregarCarreraMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_agregarCarreraMouseReleased(evt);
            }
        });
        btn_agregarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarCarreraActionPerformed(evt);
            }
        });

        btn_editarCarrera.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_editarCarrera.setForeground(new java.awt.Color(35, 61, 123));
        btn_editarCarrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editarNormal.png"))); // NOI18N
        btn_editarCarrera.setText("EDITAR CARRERA");
        btn_editarCarrera.setBorderPainted(false);
        btn_editarCarrera.setContentAreaFilled(false);
        btn_editarCarrera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editarCarrera.setFocusPainted(false);
        btn_editarCarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_editarCarreraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_editarCarreraMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_editarCarreraMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_editarCarreraMouseReleased(evt);
            }
        });
        btn_editarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarCarreraActionPerformed(evt);
            }
        });

        btn_eliminarCarrera.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_eliminarCarrera.setForeground(new java.awt.Color(255, 90, 90));
        btn_eliminarCarrera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminarNormal.png"))); // NOI18N
        btn_eliminarCarrera.setText("ELIMINAR CARRERA");
        btn_eliminarCarrera.setBorderPainted(false);
        btn_eliminarCarrera.setContentAreaFilled(false);
        btn_eliminarCarrera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminarCarrera.setFocusPainted(false);
        btn_eliminarCarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_eliminarCarreraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_eliminarCarreraMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_eliminarCarreraMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_eliminarCarreraMouseReleased(evt);
            }
        });
        btn_eliminarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarCarreraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_eliminarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_agregarCarrera)
                .addGap(18, 18, 18)
                .addComponent(btn_editarCarrera)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminarCarrera)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout p_carrerasLayout = new javax.swing.GroupLayout(p_carreras);
        p_carreras.setLayout(p_carrerasLayout);
        p_carrerasLayout.setHorizontalGroup(
            p_carrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_carrerasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_carrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(p_carrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_carrera)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_creditosCarrera)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p_carrerasLayout.setVerticalGroup(
            p_carrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_carrerasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_carrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_carrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_carrerasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(p_carrerasLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_creditosCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        p_contenedor.add(p_carreras, "card2");

        p_puestos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("PUESTOS");

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));

        t_puestos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "PUESTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_puestos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        t_puestos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                t_puestosMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(t_puestos);
        if (t_puestos.getColumnModel().getColumnCount() > 0) {
            t_puestos.getColumnModel().getColumn(0).setMinWidth(50);
            t_puestos.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("DATOS DEL PUESTO");

        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("PUESTO:");

        tf_puesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_puestoKeyReleased(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btn_agregarPuesto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_agregarPuesto.setForeground(new java.awt.Color(48, 173, 32));
        btn_agregarPuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarNormal.png"))); // NOI18N
        btn_agregarPuesto.setText("AGREGAR PUESTO");
        btn_agregarPuesto.setBorderPainted(false);
        btn_agregarPuesto.setContentAreaFilled(false);
        btn_agregarPuesto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregarPuesto.setFocusPainted(false);
        btn_agregarPuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_agregarPuestoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_agregarPuestoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_agregarPuestoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_agregarPuestoMouseReleased(evt);
            }
        });
        btn_agregarPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarPuestoActionPerformed(evt);
            }
        });

        btn_editarPuesto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_editarPuesto.setForeground(new java.awt.Color(35, 61, 123));
        btn_editarPuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editarNormal.png"))); // NOI18N
        btn_editarPuesto.setText("EDITAR PUESTO");
        btn_editarPuesto.setBorderPainted(false);
        btn_editarPuesto.setContentAreaFilled(false);
        btn_editarPuesto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editarPuesto.setFocusPainted(false);
        btn_editarPuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_editarPuestoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_editarPuestoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_editarPuestoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_editarPuestoMouseReleased(evt);
            }
        });
        btn_editarPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarPuestoActionPerformed(evt);
            }
        });

        btn_eliminarPuesto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_eliminarPuesto.setForeground(new java.awt.Color(255, 90, 90));
        btn_eliminarPuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminarNormal.png"))); // NOI18N
        btn_eliminarPuesto.setText("ELIMINAR PUESTO");
        btn_eliminarPuesto.setBorderPainted(false);
        btn_eliminarPuesto.setContentAreaFilled(false);
        btn_eliminarPuesto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminarPuesto.setFocusPainted(false);
        btn_eliminarPuesto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_eliminarPuestoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_eliminarPuestoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_eliminarPuestoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_eliminarPuestoMouseReleased(evt);
            }
        });
        btn_eliminarPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarPuestoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_eliminarPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editarPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregarPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_agregarPuesto)
                .addGap(18, 18, 18)
                .addComponent(btn_editarPuesto)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminarPuesto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout p_puestosLayout = new javax.swing.GroupLayout(p_puestos);
        p_puestos.setLayout(p_puestosLayout);
        p_puestosLayout.setHorizontalGroup(
            p_puestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_puestosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_puestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(p_puestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_puesto)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p_puestosLayout.setVerticalGroup(
            p_puestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_puestosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_puestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_puestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_puestosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(p_puestosLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        p_contenedor.add(p_puestos, "card2");

        p_materias.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("MATERIAS");

        jSeparator5.setForeground(new java.awt.Color(102, 102, 102));

        t_materias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "MATERIA", "CREDITOS DE MATERIA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_materias.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        t_materias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                t_materiasMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(t_materias);
        if (t_materias.getColumnModel().getColumnCount() > 0) {
            t_materias.getColumnModel().getColumn(0).setMinWidth(50);
            t_materias.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("DATOS DE LA MATERIA");

        jSeparator6.setForeground(new java.awt.Color(102, 102, 102));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("MATERIA:");

        tf_materia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_materiaKeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("CREDITOS DE LA MATERIA:");

        tf_creditosMateria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_creditosMateriaKeyTyped(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btn_agregarMateria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_agregarMateria.setForeground(new java.awt.Color(48, 173, 32));
        btn_agregarMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarNormal.png"))); // NOI18N
        btn_agregarMateria.setText("AGREGAR MATERIA");
        btn_agregarMateria.setBorderPainted(false);
        btn_agregarMateria.setContentAreaFilled(false);
        btn_agregarMateria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregarMateria.setFocusPainted(false);
        btn_agregarMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_agregarMateriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_agregarMateriaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_agregarMateriaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_agregarMateriaMouseReleased(evt);
            }
        });
        btn_agregarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarMateriaActionPerformed(evt);
            }
        });

        btn_editarMateria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_editarMateria.setForeground(new java.awt.Color(35, 61, 123));
        btn_editarMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editarNormal.png"))); // NOI18N
        btn_editarMateria.setText("EDITAR MATERIA");
        btn_editarMateria.setBorderPainted(false);
        btn_editarMateria.setContentAreaFilled(false);
        btn_editarMateria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editarMateria.setFocusPainted(false);
        btn_editarMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_editarMateriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_editarMateriaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_editarMateriaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_editarMateriaMouseReleased(evt);
            }
        });
        btn_editarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarMateriaActionPerformed(evt);
            }
        });

        btn_eliminarMateria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_eliminarMateria.setForeground(new java.awt.Color(255, 90, 90));
        btn_eliminarMateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminarNormal.png"))); // NOI18N
        btn_eliminarMateria.setText("ELIMINAR MATERIA");
        btn_eliminarMateria.setBorderPainted(false);
        btn_eliminarMateria.setContentAreaFilled(false);
        btn_eliminarMateria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminarMateria.setFocusPainted(false);
        btn_eliminarMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_eliminarMateriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_eliminarMateriaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_eliminarMateriaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_eliminarMateriaMouseReleased(evt);
            }
        });
        btn_eliminarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarMateriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_eliminarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_agregarMateria)
                .addGap(18, 18, 18)
                .addComponent(btn_editarMateria)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminarMateria)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout p_materiasLayout = new javax.swing.GroupLayout(p_materias);
        p_materias.setLayout(p_materiasLayout);
        p_materiasLayout.setHorizontalGroup(
            p_materiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_materiasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_materiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator5)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(p_materiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator6)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_materia)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_creditosMateria)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p_materiasLayout.setVerticalGroup(
            p_materiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_materiasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_materiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_materiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_materiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(p_materiasLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_creditosMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        p_contenedor.add(p_materias, "card2");

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

    private void lb_carrerasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_carrerasMouseEntered
        lb_carreras.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_lb_carrerasMouseEntered

    private void lb_carrerasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_carrerasMouseExited
        lb_carreras.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_lb_carrerasMouseExited

    private void lb_carrerasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_carrerasMousePressed
        lb_carreras.setForeground(new Color(102, 102, 102));
        ObjCarrera.obtenerCarreras(t_carreras);
        cambiarPaneles(1);
    }//GEN-LAST:event_lb_carrerasMousePressed

    private void lb_carrerasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_carrerasMouseReleased
        lb_carreras.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_lb_carrerasMouseReleased

    private void lb_puestosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_puestosMouseEntered
        lb_puestos.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_lb_puestosMouseEntered

    private void lb_puestosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_puestosMouseExited
        lb_puestos.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_lb_puestosMouseExited

    private void lb_puestosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_puestosMousePressed
        lb_puestos.setForeground(new Color(102, 102, 102));
        ObjPuestos.obtenerPuestos(t_puestos);
        cambiarPaneles(2);
    }//GEN-LAST:event_lb_puestosMousePressed

    private void lb_puestosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_puestosMouseReleased
        lb_puestos.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_lb_puestosMouseReleased

    private void lb_materiasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_materiasMouseEntered
        lb_materias.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_lb_materiasMouseEntered

    private void lb_materiasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_materiasMouseExited
        lb_materias.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_lb_materiasMouseExited

    private void lb_materiasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_materiasMousePressed
        lb_materias.setForeground(new Color(102, 102, 102));
        ObjMaterias.obtenerMateria(t_materias);
        cambiarPaneles(3);
    }//GEN-LAST:event_lb_materiasMousePressed

    private void lb_materiasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_materiasMouseReleased
        lb_materias.setForeground(new Color(153, 153, 153));
    }//GEN-LAST:event_lb_materiasMouseReleased

    private void btn_eliminarCarreraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarCarreraMouseEntered
        btn_eliminarCarrera.setForeground(new Color(203, 73, 73));
        btn_eliminarCarrera.setIcon(new ImageIcon(getClass().getResource("/imagenes/eliminarEntered.png")));
    }//GEN-LAST:event_btn_eliminarCarreraMouseEntered

    private void btn_eliminarCarreraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarCarreraMouseExited
        btn_eliminarCarrera.setForeground(new Color(255, 90, 90));
        btn_eliminarCarrera.setIcon(new ImageIcon(getClass().getResource("/imagenes/eliminarNormal.png")));
    }//GEN-LAST:event_btn_eliminarCarreraMouseExited

    private void btn_eliminarCarreraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarCarreraMousePressed
        btn_eliminarCarrera.setForeground(new Color(165, 62, 62));
        btn_eliminarCarrera.setIcon(new ImageIcon(getClass().getResource("/imagenes/eliminarPressed.png")));
    }//GEN-LAST:event_btn_eliminarCarreraMousePressed

    private void btn_eliminarCarreraMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarCarreraMouseReleased
        btn_eliminarCarrera.setForeground(new Color(203, 73, 73));
        btn_eliminarCarrera.setIcon(new ImageIcon(getClass().getResource("/imagenes/eliminarEntered.png")));
    }//GEN-LAST:event_btn_eliminarCarreraMouseReleased

    private void btn_agregarCarreraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarCarreraMouseEntered
        btn_agregarCarrera.setForeground(new Color(40, 140, 26));
        btn_agregarCarrera.setIcon(new ImageIcon(getClass().getResource("/imagenes/agregarEntered.png")));
    }//GEN-LAST:event_btn_agregarCarreraMouseEntered

    private void btn_agregarCarreraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarCarreraMouseExited
        btn_agregarCarrera.setForeground(new Color(48, 173, 32));
        btn_agregarCarrera.setIcon(new ImageIcon(getClass().getResource("/imagenes/agregarNormal.png")));
    }//GEN-LAST:event_btn_agregarCarreraMouseExited

    private void btn_agregarCarreraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarCarreraMousePressed
        btn_agregarCarrera.setForeground(new Color(28, 99, 19));
        btn_agregarCarrera.setIcon(new ImageIcon(getClass().getResource("/imagenes/agregarPressed.png")));
    }//GEN-LAST:event_btn_agregarCarreraMousePressed

    private void btn_agregarCarreraMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarCarreraMouseReleased
        btn_agregarCarrera.setForeground(new Color(40, 140, 26));
        btn_agregarCarrera.setIcon(new ImageIcon(getClass().getResource("/imagenes/agregarEntered.png")));
    }//GEN-LAST:event_btn_agregarCarreraMouseReleased

    private void btn_editarCarreraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarCarreraMouseEntered
        btn_editarCarrera.setForeground(new Color(30, 51, 100));
        btn_editarCarrera.setIcon(new ImageIcon(getClass().getResource("/imagenes/editarEntered.png")));
    }//GEN-LAST:event_btn_editarCarreraMouseEntered

    private void btn_editarCarreraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarCarreraMouseExited
        btn_editarCarrera.setForeground(new Color(35, 61, 123));
        btn_editarCarrera.setIcon(new ImageIcon(getClass().getResource("/imagenes/editarNormal.png")));
    }//GEN-LAST:event_btn_editarCarreraMouseExited

    private void btn_editarCarreraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarCarreraMousePressed
        btn_editarCarrera.setForeground(new Color(35, 61, 123));
        btn_editarCarrera.setIcon(new ImageIcon(getClass().getResource("/imagenes/editarPressed.png")));
    }//GEN-LAST:event_btn_editarCarreraMousePressed

    private void t_carrerasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_carrerasMousePressed
        tf_carrera.setText(t_carreras.getValueAt(t_carreras.getSelectedRow(), 1).toString());
        tf_creditosCarrera.setText(t_carreras.getValueAt(t_carreras.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_t_carrerasMousePressed

    private void btn_agregarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarCarreraActionPerformed
        if (!tf_carrera.getText().equals("") && !tf_creditosCarrera.getText().equals("")) {
            int i = ObjCarrera.agregarCarrera(tf_carrera.getText(), tf_creditosCarrera.getText());
            if (i == 1) {
                ObjCarrera.obtenerCarreras(t_carreras);
                this.tf_carrera.setText("");
                this.tf_creditosCarrera.setText("");
            } else {
                getToolkit().beep();
                JOptionPane.showMessageDialog(this, "No se añadió la carrera", "Error", 0);
            }
        } else {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Debes llenar todos los campos", "Error", 0);
        }
    }//GEN-LAST:event_btn_agregarCarreraActionPerformed

    private void btn_editarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarCarreraActionPerformed
        if (t_carreras.getSelectedRow() != -1) {
            int p = JOptionPane.showConfirmDialog(this, "¿Deseas EDITAR la carrera '"
                    + t_carreras.getValueAt(t_carreras.getSelectedRow(), 1).toString() + "'?", "PRECAUCION", JOptionPane.YES_NO_OPTION, 1);

            if (p == 0) {
                String id = t_carreras.getValueAt(t_carreras.getSelectedRow(), 0).toString();
                int i = ObjCarrera.editarCarrera(id, tf_carrera.getText(), tf_creditosCarrera.getText());
                if (i == 1) {
                    JOptionPane.showMessageDialog(this, "Se agregó la carrera", "Agregado", 1);
                    ObjCarrera.obtenerCarreras(t_carreras);
                    this.tf_carrera.setText("");
                    this.tf_creditosCarrera.setText("");
                } else {
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(this, "No se pudo editar la carrera", "Error", 0);
                }
            }
        } else {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Debes seleccionar un elemento de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btn_editarCarreraActionPerformed

    private void btn_eliminarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarCarreraActionPerformed
        if (t_carreras.getSelectedRow() != -1) {
            if (!ObjCarrera.obtenerUsoCarrera(t_carreras.getValueAt(t_carreras.getSelectedRow(), 0).toString())) {
                int p = JOptionPane.showConfirmDialog(this, "¿Deseas BORRAR la carrera '"
                        + t_carreras.getValueAt(t_carreras.getSelectedRow(), 1).toString() + "'?", "PRECAUCION", JOptionPane.YES_NO_OPTION, 2);

                if (p == 0) {
                    int i = ObjCarrera.eliminarCarrera(t_carreras.getValueAt(t_carreras.getSelectedRow(), 0).toString());
                    if (i == 1) {
                        ObjCarrera.obtenerCarreras(t_carreras);
                        this.tf_carrera.setText("");
                        this.tf_creditosCarrera.setText("");
                    } else {
                        getToolkit().beep();
                        JOptionPane.showMessageDialog(this, "No se pudo eliminar la carrera", "Error", 0);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Esta carrera no puede eliminarse porque se encuentra en uso", "Error", 0);
            }
        } else {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Debes seleccionar un elemento de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btn_eliminarCarreraActionPerformed

    private void t_puestosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_puestosMousePressed
        tf_puesto.setText(t_puestos.getValueAt(t_puestos.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_t_puestosMousePressed

    private void btn_agregarPuestoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarPuestoMouseEntered
        btn_agregarPuesto.setForeground(new Color(40, 140, 26));
        btn_agregarPuesto.setIcon(new ImageIcon(getClass().getResource("/imagenes/agregarEntered.png")));
    }//GEN-LAST:event_btn_agregarPuestoMouseEntered

    private void btn_agregarPuestoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarPuestoMouseExited
        btn_agregarPuesto.setForeground(new Color(48, 173, 32));
        btn_agregarPuesto.setIcon(new ImageIcon(getClass().getResource("/imagenes/agregarNormal.png")));
    }//GEN-LAST:event_btn_agregarPuestoMouseExited

    private void btn_agregarPuestoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarPuestoMousePressed
        btn_agregarPuesto.setForeground(new Color(28, 99, 19));
        btn_agregarPuesto.setIcon(new ImageIcon(getClass().getResource("/imagenes/agregarPressed.png")));
    }//GEN-LAST:event_btn_agregarPuestoMousePressed

    private void btn_agregarPuestoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarPuestoMouseReleased
        btn_agregarPuesto.setForeground(new Color(40, 140, 26));
        btn_agregarPuesto.setIcon(new ImageIcon(getClass().getResource("/imagenes/agregarEntered.png")));
    }//GEN-LAST:event_btn_agregarPuestoMouseReleased

    private void btn_agregarPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarPuestoActionPerformed
        if (!tf_puesto.getText().equals("")) {
            int i = ObjPuestos.agregarPuesto(tf_puesto.getText());
            if (i == 1) {
                ObjPuestos.obtenerPuestos(t_puestos);
                this.tf_puesto.setText("");
            } else {
                getToolkit().beep();
                JOptionPane.showMessageDialog(this, "No se añadió el puesto", "Error", 0);
            }
        } else {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Debes llenar todos los campos", "Error", 0);
        }
    }//GEN-LAST:event_btn_agregarPuestoActionPerformed

    private void btn_editarPuestoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarPuestoMouseEntered
        btn_editarPuesto.setForeground(new Color(30, 51, 100));
        btn_editarPuesto.setIcon(new ImageIcon(getClass().getResource("/imagenes/editarEntered.png")));
    }//GEN-LAST:event_btn_editarPuestoMouseEntered

    private void btn_editarPuestoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarPuestoMouseExited
        btn_editarPuesto.setForeground(new Color(35, 61, 123));
        btn_editarPuesto.setIcon(new ImageIcon(getClass().getResource("/imagenes/editarNormal.png")));
    }//GEN-LAST:event_btn_editarPuestoMouseExited

    private void btn_editarPuestoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarPuestoMousePressed
        btn_editarPuesto.setForeground(new Color(35, 61, 123));
        btn_editarPuesto.setIcon(new ImageIcon(getClass().getResource("/imagenes/editarPressed.png")));
    }//GEN-LAST:event_btn_editarPuestoMousePressed

    private void btn_editarPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarPuestoActionPerformed
        if (t_puestos.getSelectedRow() != -1) {
            int p = JOptionPane.showConfirmDialog(this, "¿Deseas EDITAR el puesto '"
                    + t_puestos.getValueAt(t_puestos.getSelectedRow(), 1).toString() + "'?", "PRECAUCION", JOptionPane.YES_NO_OPTION, 1);

            if (p == 0) {
                String id = t_puestos.getValueAt(t_puestos.getSelectedRow(), 0).toString();
                int i = ObjPuestos.editarPuesto(id, tf_puesto.getText());
                if (i == 1) {
                    ObjPuestos.obtenerPuestos(t_puestos);
                    this.tf_puesto.setText("");
                } else {
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(this, "No se pudo editar la carrera", "Error", 0);
                }
            }
        } else {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Debes seleccionar un elemento de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btn_editarPuestoActionPerformed

    private void btn_eliminarPuestoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarPuestoMouseEntered
        btn_eliminarPuesto.setForeground(new Color(203, 73, 73));
        btn_eliminarPuesto.setIcon(new ImageIcon(getClass().getResource("/imagenes/eliminarEntered.png")));
    }//GEN-LAST:event_btn_eliminarPuestoMouseEntered

    private void btn_eliminarPuestoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarPuestoMouseExited
        btn_eliminarPuesto.setForeground(new Color(255, 90, 90));
        btn_eliminarPuesto.setIcon(new ImageIcon(getClass().getResource("/imagenes/eliminarNormal.png")));
    }//GEN-LAST:event_btn_eliminarPuestoMouseExited

    private void btn_eliminarPuestoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarPuestoMousePressed
        btn_eliminarPuesto.setForeground(new Color(165, 62, 62));
        btn_eliminarPuesto.setIcon(new ImageIcon(getClass().getResource("/imagenes/eliminarPressed.png")));
    }//GEN-LAST:event_btn_eliminarPuestoMousePressed

    private void btn_eliminarPuestoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarPuestoMouseReleased
        btn_eliminarPuesto.setForeground(new Color(203, 73, 73));
        btn_eliminarPuesto.setIcon(new ImageIcon(getClass().getResource("/imagenes/eliminarEntered.png")));
    }//GEN-LAST:event_btn_eliminarPuestoMouseReleased

    private void btn_eliminarPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarPuestoActionPerformed
        if (t_puestos.getSelectedRow() != -1) {
            if (!ObjPuestos.obtenerUsoPuesto(t_puestos.getValueAt(t_puestos.getSelectedRow(), 0).toString())) {
                int p = JOptionPane.showConfirmDialog(this, "¿Deseas BORRAR el puesto '"
                        + t_puestos.getValueAt(t_puestos.getSelectedRow(), 1).toString() + "'?", "PRECAUCION", JOptionPane.YES_NO_OPTION, 2);

                if (p == 0) {
                    int i = ObjPuestos.eliminarPuesto(t_puestos.getValueAt(t_puestos.getSelectedRow(), 0).toString());
                    if (i == 1) {
                        ObjPuestos.obtenerPuestos(t_puestos);
                        this.tf_puesto.setText("");
                    } else {
                        getToolkit().beep();
                        JOptionPane.showMessageDialog(this, "No se pudo eliminar la carrera", "Error", 0);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Este puesto no se puede eliminar porque esta en uso", "Error", 0);
            }
        } else {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Debes seleccionar un elemento de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btn_eliminarPuestoActionPerformed

    private void btn_editarCarreraMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarCarreraMouseReleased
        btn_editarCarrera.setForeground(new Color(30, 51, 100));
        btn_editarCarrera.setIcon(new ImageIcon(getClass().getResource("/imagenes/editarEntered.png")));
    }//GEN-LAST:event_btn_editarCarreraMouseReleased

    private void btn_editarPuestoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarPuestoMouseReleased
        btn_editarPuesto.setForeground(new Color(30, 51, 100));
        btn_editarPuesto.setIcon(new ImageIcon(getClass().getResource("/imagenes/editarEntered.png")));
    }//GEN-LAST:event_btn_editarPuestoMouseReleased

    private void t_materiasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_materiasMousePressed
        tf_materia.setText(t_materias.getValueAt(t_materias.getSelectedRow(), 1).toString());
        tf_creditosMateria.setText(t_materias.getValueAt(t_materias.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_t_materiasMousePressed

    private void btn_agregarMateriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarMateriaMouseEntered
        btn_agregarMateria.setForeground(new Color(40, 140, 26));
        btn_agregarMateria.setIcon(new ImageIcon(getClass().getResource("/imagenes/agregarEntered.png")));
    }//GEN-LAST:event_btn_agregarMateriaMouseEntered

    private void btn_agregarMateriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarMateriaMouseExited
        btn_agregarMateria.setForeground(new Color(48, 173, 32));
        btn_agregarMateria.setIcon(new ImageIcon(getClass().getResource("/imagenes/agregarNormal.png")));
    }//GEN-LAST:event_btn_agregarMateriaMouseExited

    private void btn_agregarMateriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarMateriaMousePressed
        btn_agregarMateria.setForeground(new Color(28, 99, 19));
        btn_agregarMateria.setIcon(new ImageIcon(getClass().getResource("/imagenes/agregarPressed.png")));
    }//GEN-LAST:event_btn_agregarMateriaMousePressed

    private void btn_agregarMateriaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarMateriaMouseReleased
        btn_agregarMateria.setForeground(new Color(40, 140, 26));
        btn_agregarMateria.setIcon(new ImageIcon(getClass().getResource("/imagenes/agregarEntered.png")));
    }//GEN-LAST:event_btn_agregarMateriaMouseReleased

    private void btn_agregarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarMateriaActionPerformed
        if (!tf_materia.getText().equals("") && !tf_creditosMateria.getText().equals("")) {
            int i = ObjMaterias.agregarMateria(tf_materia.getText(), tf_creditosMateria.getText());
            if (i == 1) {
                ObjMaterias.obtenerMateria(t_materias);
                this.tf_materia.setText("");
                this.tf_creditosMateria.setText("");
            } else {
                getToolkit().beep();
                JOptionPane.showMessageDialog(this, "No se añadió la materia", "Error", 0);
            }
        } else {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Debes llenar todos los campos", "Error", 0);
        }
    }//GEN-LAST:event_btn_agregarMateriaActionPerformed

    private void btn_editarMateriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarMateriaMouseEntered
        btn_editarMateria.setForeground(new Color(30, 51, 100));
        btn_editarMateria.setIcon(new ImageIcon(getClass().getResource("/imagenes/editarEntered.png")));
    }//GEN-LAST:event_btn_editarMateriaMouseEntered

    private void btn_editarMateriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarMateriaMouseExited
        btn_editarMateria.setForeground(new Color(35, 61, 123));
        btn_editarMateria.setIcon(new ImageIcon(getClass().getResource("/imagenes/editarNormal.png")));
    }//GEN-LAST:event_btn_editarMateriaMouseExited

    private void btn_editarMateriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarMateriaMousePressed
        btn_editarMateria.setForeground(new Color(35, 61, 123));
        btn_editarMateria.setIcon(new ImageIcon(getClass().getResource("/imagenes/editarPressed.png")));
    }//GEN-LAST:event_btn_editarMateriaMousePressed

    private void btn_editarMateriaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarMateriaMouseReleased
        btn_editarMateria.setForeground(new Color(30, 51, 100));
        btn_editarMateria.setIcon(new ImageIcon(getClass().getResource("/imagenes/editarEntered.png")));
    }//GEN-LAST:event_btn_editarMateriaMouseReleased

    private void btn_editarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarMateriaActionPerformed
        if (t_materias.getSelectedRow() != -1) {
            int p = JOptionPane.showConfirmDialog(this, "¿Deseas EDITAR la materia '"
                    + t_materias.getValueAt(t_materias.getSelectedRow(), 1).toString() + "'?", "PRECAUCION", JOptionPane.YES_NO_OPTION, 1);

            if (p == 0) {
                String id = t_materias.getValueAt(t_materias.getSelectedRow(), 0).toString();
                int i = ObjMaterias.editarMateria(id, tf_materia.getText(), tf_creditosMateria.getText());
                if (i == 1) {
                    ObjMaterias.obtenerMateria(t_materias);
                    this.tf_materia.setText("");
                    this.tf_creditosMateria.setText("");
                } else {
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(this, "No se pudo editar la materia", "Error", 0);
                }
            }
        } else {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Debes seleccionar un elemento de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btn_editarMateriaActionPerformed

    private void btn_eliminarMateriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMateriaMouseEntered
        btn_eliminarMateria.setForeground(new Color(203, 73, 73));
        btn_eliminarMateria.setIcon(new ImageIcon(getClass().getResource("/imagenes/eliminarEntered.png")));
    }//GEN-LAST:event_btn_eliminarMateriaMouseEntered

    private void btn_eliminarMateriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMateriaMouseExited
        btn_eliminarMateria.setForeground(new Color(255, 90, 90));
        btn_eliminarMateria.setIcon(new ImageIcon(getClass().getResource("/imagenes/eliminarNormal.png")));
    }//GEN-LAST:event_btn_eliminarMateriaMouseExited

    private void btn_eliminarMateriaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMateriaMousePressed
        btn_eliminarMateria.setForeground(new Color(165, 62, 62));
        btn_eliminarMateria.setIcon(new ImageIcon(getClass().getResource("/imagenes/eliminarPressed.png")));
    }//GEN-LAST:event_btn_eliminarMateriaMousePressed

    private void btn_eliminarMateriaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMateriaMouseReleased
        btn_eliminarMateria.setForeground(new Color(203, 73, 73));
        btn_eliminarMateria.setIcon(new ImageIcon(getClass().getResource("/imagenes/eliminarEntered.png")));
    }//GEN-LAST:event_btn_eliminarMateriaMouseReleased

    private void btn_eliminarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarMateriaActionPerformed
        if (t_materias.getSelectedRow() != -1) {
            if (!ObjMaterias.obtenerUsoMateria(t_materias.getValueAt(t_materias.getSelectedRow(), 0).toString())) {
                int p = JOptionPane.showConfirmDialog(this, "¿Deseas BORRAR la materia '"
                        + t_materias.getValueAt(t_materias.getSelectedRow(), 1).toString() + "'?", "PRECAUCION", JOptionPane.YES_NO_OPTION, 2);

                if (p == 0) {
                    int i = ObjMaterias.eliminarMateria(t_materias.getValueAt(t_materias.getSelectedRow(), 0).toString());
                    if (i == 1) {
                        ObjMaterias.obtenerMateria(t_materias);
                        this.tf_materia.setText("");
                        this.tf_creditosMateria.setText("");
                    } else {
                        getToolkit().beep();
                        JOptionPane.showMessageDialog(this, "No se pudo eliminar la materia", "Error", 0);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Esta materia no puede ser eliminada porque esta en uso", "Error", 0);
            }
        } else {
            getToolkit().beep();
            JOptionPane.showMessageDialog(this, "Debes seleccionar un elemento de la tabla", "Error", 0);
        }
    }//GEN-LAST:event_btn_eliminarMateriaActionPerformed

    private void p_principalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_principalMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_p_principalMousePressed

    private void p_principalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_principalMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_p_principalMouseDragged

    private void tf_creditosCarreraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_creditosCarreraKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == evt.VK_BACK_SPACE)
                || (c == evt.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_creditosCarreraKeyTyped

    private void tf_creditosMateriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_creditosMateriaKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == evt.VK_BACK_SPACE)
                || (c == evt.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_creditosMateriaKeyTyped

    private void tf_materiaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_materiaKeyReleased
        tf_materia.setText(tf_materia.getText().toUpperCase());
    }//GEN-LAST:event_tf_materiaKeyReleased

    private void tf_puestoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_puestoKeyReleased
        tf_puesto.setText(tf_puesto.getText().toUpperCase());
    }//GEN-LAST:event_tf_puestoKeyReleased

    private void tf_carreraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_carreraKeyReleased
        tf_carrera.setText(tf_carrera.getText().toUpperCase());
    }//GEN-LAST:event_tf_carreraKeyReleased

    public void cambiarPaneles(int panel) {
        lb_carreras.setEnabled(true);
        lb_puestos.setEnabled(true);
        lb_materias.setEnabled(true);

        p_carreras.setVisible(false);
        p_puestos.setVisible(false);
        p_materias.setVisible(false);

        switch (panel) {
            case 1:
                lb_carreras.setEnabled(false);
                p_carreras.setVisible(true);
                break;

            case 2:
                lb_puestos.setEnabled(false);
                p_puestos.setVisible(true);
                break;

            case 3:
                lb_materias.setEnabled(false);
                p_materias.setVisible(true);
                break;
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConAvanzada(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarCarrera;
    private javax.swing.JButton btn_agregarMateria;
    private javax.swing.JButton btn_agregarPuesto;
    private javax.swing.JButton btn_editarCarrera;
    private javax.swing.JButton btn_editarMateria;
    private javax.swing.JButton btn_editarPuesto;
    private javax.swing.JButton btn_eliminarCarrera;
    private javax.swing.JButton btn_eliminarMateria;
    private javax.swing.JButton btn_eliminarPuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lb_carreras;
    private javax.swing.JLabel lb_cerrar;
    private javax.swing.JLabel lb_logoEscuela;
    private javax.swing.JLabel lb_materias;
    private javax.swing.JLabel lb_minimizar;
    private javax.swing.JLabel lb_puestos;
    private javax.swing.JPanel p_barraHerramientas;
    private javax.swing.JPanel p_carreras;
    private javax.swing.JPanel p_contenedor;
    private javax.swing.JPanel p_materias;
    private javax.swing.JPanel p_principal;
    private javax.swing.JPanel p_puestos;
    private javax.swing.JPanel p_toolbar;
    private javax.swing.JTable t_carreras;
    private javax.swing.JTable t_materias;
    private javax.swing.JTable t_puestos;
    private javax.swing.JTextField tf_carrera;
    private javax.swing.JTextField tf_creditosCarrera;
    private javax.swing.JTextField tf_creditosMateria;
    private javax.swing.JTextField tf_materia;
    private javax.swing.JTextField tf_puesto;
    // End of variables declaration//GEN-END:variables

}
