package visuales;

import bd.Clases_BD;
import bd.Docente_BD;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Menu_Docente extends javax.swing.JFrame {

    private int panelActual = 1;
    private Docente_BD ObjDocente;
    private Clases_BD ObjClases;
    private String noControl;
    private String[] idClases;

    public Menu_Docente(String noControl) {
        initComponents();

        this.noControl = noControl;

        ObjDocente = new Docente_BD();
        ObjClases = new Clases_BD();
        ObjDocente.obtenerClaseDocente(t_clasesImpartidas, noControl);
        this.lb_titulo.setText("¡BIENVENIDO " + ObjDocente.obtenerNomDocente(noControl) + "!");
        this.setTitle("¡BIENVENIDO " + ObjDocente.obtenerNomDocente(noControl) + "!");

        cb_clases.removeAllItems();
        Object[] clases = ObjDocente.obtenerClasesDocente(noControl);
        this.idClases = new String[clases.length];
        for (int i = 0; i < clases.length; i++) {
            String[] objeto = (String[]) clases[i];
            idClases[i] = objeto[0];
            cb_clases.addItem(objeto[1] + " - " + objeto[2]);
        }
        ObjClases.obtenerAlumnosClase(t_inscritosClase, idClases[0]);

        this.setExtendedState(MAXIMIZED_BOTH);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/ITH_GRANDE.png")).getImage());
        separadorInfoClases.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_principal = new javax.swing.JPanel();
        p_toolbar = new javax.swing.JPanel();
        p_cambiarClasesImpartiendo = new javax.swing.JPanel();
        separadorClasesImpartiendo = new javax.swing.JSeparator();
        lb_clasesImpartiendo = new javax.swing.JLabel();
        p_cambiarInfoClases = new javax.swing.JPanel();
        separadorInfoClases = new javax.swing.JSeparator();
        lb_infoClases = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb_titulo = new javax.swing.JLabel();
        lb_cerrar = new javax.swing.JLabel();
        lb_minimizar = new javax.swing.JLabel();
        lb_cerrarSesion = new javax.swing.JLabel();
        p_contenedor = new javax.swing.JPanel();
        p_clasesImpartiendo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_clasesImpartidas = new javax.swing.JTable();
        p_infoClases = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cb_clases = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        t_inscritosClase = new javax.swing.JTable();
        btn_enviarCalificaciones = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tf_busquedaAlumno = new javax.swing.JTextField();
        lb_borrarTexto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        p_principal.setBackground(new java.awt.Color(255, 255, 255));

        p_toolbar.setBackground(new java.awt.Color(35, 61, 123));

        p_cambiarClasesImpartiendo.setBackground(new java.awt.Color(35, 61, 123));
        p_cambiarClasesImpartiendo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        p_cambiarClasesImpartiendo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_cambiarClasesImpartiendoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_cambiarClasesImpartiendoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p_cambiarClasesImpartiendoMousePressed(evt);
            }
        });

        separadorClasesImpartiendo.setForeground(new java.awt.Color(255, 255, 255));

        lb_clasesImpartiendo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_clasesImpartiendo.setForeground(new java.awt.Color(255, 255, 255));
        lb_clasesImpartiendo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_clasesImpartiendo.setText("CLASES IMPARTIENDO");

        javax.swing.GroupLayout p_cambiarClasesImpartiendoLayout = new javax.swing.GroupLayout(p_cambiarClasesImpartiendo);
        p_cambiarClasesImpartiendo.setLayout(p_cambiarClasesImpartiendoLayout);
        p_cambiarClasesImpartiendoLayout.setHorizontalGroup(
            p_cambiarClasesImpartiendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separadorClasesImpartiendo)
            .addComponent(lb_clasesImpartiendo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        p_cambiarClasesImpartiendoLayout.setVerticalGroup(
            p_cambiarClasesImpartiendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_cambiarClasesImpartiendoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lb_clasesImpartiendo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(separadorClasesImpartiendo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        p_cambiarInfoClases.setBackground(new java.awt.Color(35, 61, 123));
        p_cambiarInfoClases.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p_cambiarInfoClases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_cambiarInfoClasesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_cambiarInfoClasesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p_cambiarInfoClasesMousePressed(evt);
            }
        });

        separadorInfoClases.setForeground(new java.awt.Color(255, 255, 255));

        lb_infoClases.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lb_infoClases.setForeground(new java.awt.Color(255, 255, 255));
        lb_infoClases.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_infoClases.setText("INFO SOBRE CLASES");

        javax.swing.GroupLayout p_cambiarInfoClasesLayout = new javax.swing.GroupLayout(p_cambiarInfoClases);
        p_cambiarInfoClases.setLayout(p_cambiarInfoClasesLayout);
        p_cambiarInfoClasesLayout.setHorizontalGroup(
            p_cambiarInfoClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separadorInfoClases)
            .addComponent(lb_infoClases, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        p_cambiarInfoClasesLayout.setVerticalGroup(
            p_cambiarInfoClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_cambiarInfoClasesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lb_infoClases)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(separadorInfoClases, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ITH_LOGO_PEQUEÑO.png"))); // NOI18N

        lb_titulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_titulo.setText("¡BIENVENIDO DOCENTE!");

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
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lb_minimizar)
                        .addGap(10, 10, 10)
                        .addComponent(lb_cerrar))
                    .addGroup(p_toolbarLayout.createSequentialGroup()
                        .addComponent(p_cambiarClasesImpartiendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(p_cambiarInfoClases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        p_toolbarLayout.setVerticalGroup(
            p_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_toolbarLayout.createSequentialGroup()
                .addGroup(p_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_minimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(p_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_cambiarClasesImpartiendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_cambiarInfoClases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p_toolbarLayout.createSequentialGroup()
                        .addComponent(lb_cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        p_contenedor.setBackground(new java.awt.Color(255, 255, 255));
        p_contenedor.setLayout(new java.awt.CardLayout());

        p_clasesImpartiendo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("CLASES QUE IMPARTE:");

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        t_clasesImpartidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "GRUPO", "MATERIA", "HORA", "NUMERO DE ALUMNOS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_clasesImpartidas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(t_clasesImpartidas);
        if (t_clasesImpartidas.getColumnModel().getColumnCount() > 0) {
            t_clasesImpartidas.getColumnModel().getColumn(0).setMinWidth(0);
            t_clasesImpartidas.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        javax.swing.GroupLayout p_clasesImpartiendoLayout = new javax.swing.GroupLayout(p_clasesImpartiendo);
        p_clasesImpartiendo.setLayout(p_clasesImpartiendoLayout);
        p_clasesImpartiendoLayout.setHorizontalGroup(
            p_clasesImpartiendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_clasesImpartiendoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_clasesImpartiendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_clasesImpartiendoLayout.createSequentialGroup()
                        .addGroup(p_clasesImpartiendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                            .addComponent(jSeparator1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1054, Short.MAX_VALUE))
                .addContainerGap())
        );
        p_clasesImpartiendoLayout.setVerticalGroup(
            p_clasesImpartiendoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_clasesImpartiendoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addContainerGap())
        );

        p_contenedor.add(p_clasesImpartiendo, "card2");

        p_infoClases.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(35, 61, 123));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("CLASE:");

        cb_clases.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_clases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_clasesActionPerformed(evt);
            }
        });

        t_inscritosClase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NUMERO DE CONTROL", "NOMBRE DEL ALUMNO", "SEMESTRE", "CORREO ELECTRONICO", "CALIFICACION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_inscritosClase.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(t_inscritosClase);
        if (t_inscritosClase.getColumnModel().getColumnCount() > 0) {
            t_inscritosClase.getColumnModel().getColumn(0).setMinWidth(0);
            t_inscritosClase.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        btn_enviarCalificaciones.setText("ENVIAR CALIFICACIONES");
        btn_enviarCalificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarCalificacionesActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(35, 61, 123));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("BUSCAR ALUMNO:");

        tf_busquedaAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_busquedaAlumnoKeyReleased(evt);
            }
        });

        lb_borrarTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrarNormal.png"))); // NOI18N
        lb_borrarTexto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_borrarTexto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_borrarTextoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_borrarTextoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_borrarTextoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lb_borrarTextoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout p_infoClasesLayout = new javax.swing.GroupLayout(p_infoClases);
        p_infoClases.setLayout(p_infoClasesLayout);
        p_infoClasesLayout.setHorizontalGroup(
            p_infoClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_infoClasesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_infoClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1054, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_infoClasesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_enviarCalificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p_infoClasesLayout.createSequentialGroup()
                        .addGroup(p_infoClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(p_infoClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_clases, 0, 500, Short.MAX_VALUE)
                            .addComponent(tf_busquedaAlumno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_borrarTexto)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        p_infoClasesLayout.setVerticalGroup(
            p_infoClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_infoClasesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_infoClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_clases))
                .addGap(18, 18, 18)
                .addGroup(p_infoClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_borrarTexto)
                    .addGroup(p_infoClasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf_busquedaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_enviarCalificaciones)
                .addContainerGap())
        );

        p_contenedor.add(p_infoClases, "card2");

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

    private void p_cambiarClasesImpartiendoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarClasesImpartiendoMouseEntered
        if (panelActual != 1) {
            separadorClasesImpartiendo.setVisible(true);
        }
    }//GEN-LAST:event_p_cambiarClasesImpartiendoMouseEntered

    private void p_cambiarClasesImpartiendoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarClasesImpartiendoMouseExited
        if (panelActual != 1) {
            separadorClasesImpartiendo.setVisible(false);
        }
    }//GEN-LAST:event_p_cambiarClasesImpartiendoMouseExited

    private void p_cambiarClasesImpartiendoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarClasesImpartiendoMousePressed
        if (panelActual != 1) {
            panelActual = 1;
            cambiarPanel(panelActual);
            separadorInfoClases.setVisible(false);
            p_cambiarClasesImpartiendo.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            p_cambiarInfoClases.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    }//GEN-LAST:event_p_cambiarClasesImpartiendoMousePressed

    private void p_cambiarInfoClasesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarInfoClasesMouseEntered
        if (panelActual != 2) {
            separadorInfoClases.setVisible(true);
        }
    }//GEN-LAST:event_p_cambiarInfoClasesMouseEntered

    private void p_cambiarInfoClasesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarInfoClasesMouseExited
        if (panelActual != 2) {
            separadorInfoClases.setVisible(false);
        }
    }//GEN-LAST:event_p_cambiarInfoClasesMouseExited

    private void p_cambiarInfoClasesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_cambiarInfoClasesMousePressed
        if (panelActual != 2) {
            panelActual = 2;
            cambiarPanel(panelActual);
            separadorClasesImpartiendo.setVisible(false);
            p_cambiarClasesImpartiendo.setCursor(new Cursor(Cursor.HAND_CURSOR));
            p_cambiarInfoClases.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_p_cambiarInfoClasesMousePressed

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

    private void cb_clasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_clasesActionPerformed
        btn_enviarCalificaciones.setEnabled(false);
        if (idClases != null) {
            ObjClases.obtenerAlumnosClase(t_inscritosClase, idClases[cb_clases.getSelectedIndex()]);
            tf_busquedaAlumno.setText("");
            for (int i = 0; i < t_inscritosClase.getRowCount(); i++) {
                if (t_inscritosClase.getValueAt(i, 5) == null) {
                    btn_enviarCalificaciones.setEnabled(true);
                    break;
                }
            }
        }
    }//GEN-LAST:event_cb_clasesActionPerformed

    private void tf_busquedaAlumnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_busquedaAlumnoKeyReleased
        ObjClases.obtenerBusquedaAlumnosClase(t_inscritosClase,
                idClases[cb_clases.getSelectedIndex()], tf_busquedaAlumno.getText());
    }//GEN-LAST:event_tf_busquedaAlumnoKeyReleased

    private void lb_borrarTextoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarTextoMouseEntered
        lb_borrarTexto.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarEntered.png")));
    }//GEN-LAST:event_lb_borrarTextoMouseEntered

    private void lb_borrarTextoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarTextoMouseExited
        lb_borrarTexto.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarNormal.png")));
    }//GEN-LAST:event_lb_borrarTextoMouseExited

    private void lb_borrarTextoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarTextoMousePressed
        lb_borrarTexto.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarPressed.png")));
    }//GEN-LAST:event_lb_borrarTextoMousePressed

    private void lb_borrarTextoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarTextoMouseReleased
        lb_borrarTexto.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarEntered.png")));
        tf_busquedaAlumno.setText("");
        ObjClases.obtenerAlumnosClase(t_inscritosClase, idClases[cb_clases.getSelectedIndex()]);
    }//GEN-LAST:event_lb_borrarTextoMouseReleased

    private void btn_enviarCalificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarCalificacionesActionPerformed
        for (int i = 0; i < t_inscritosClase.getRowCount(); i++) {
            Object calificacion = t_inscritosClase.getValueAt(i, 5);
            if (calificacion == null) {
                int p = ObjClases.subirCalificaciones(idClases[cb_clases.getSelectedIndex()],
                        t_inscritosClase.getValueAt(i, 1).toString(),
                        "0");
                if (p != 1) {
                    System.out.println("No se añadió la calificación del alumno: " + t_inscritosClase.getValueAt(i, 2));
                }
            } else {
                int p = ObjClases.subirCalificaciones(idClases[cb_clases.getSelectedIndex()],
                        t_inscritosClase.getValueAt(i, 1).toString(),
                        t_inscritosClase.getValueAt(i, 5).toString());
                if (p != 1) {
                    System.out.println("No se añadió la calificación del alumno: " + t_inscritosClase.getValueAt(i, 2));
                }
            }

        }
        JOptionPane.showMessageDialog(this, "Se modificaron las calificaciones");

        ObjClases.obtenerAlumnosClase(t_inscritosClase, idClases[cb_clases.getSelectedIndex()]);
        btn_enviarCalificaciones.setEnabled(false);
    }//GEN-LAST:event_btn_enviarCalificacionesActionPerformed

    public void cambiarPanel(int i) {
        p_clasesImpartiendo.setVisible(false);
        p_infoClases.setVisible(false);

        switch (i) {
            case 1:
                p_clasesImpartiendo.setVisible(true);
                break;

            case 2:
                p_infoClases.setVisible(true);
                break;
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Docente("15463788").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_enviarCalificaciones;
    private javax.swing.JComboBox<String> cb_clases;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_borrarTexto;
    private javax.swing.JLabel lb_cerrar;
    private javax.swing.JLabel lb_cerrarSesion;
    private javax.swing.JLabel lb_clasesImpartiendo;
    private javax.swing.JLabel lb_clasesImpartiendo1;
    private javax.swing.JLabel lb_infoClases;
    private javax.swing.JLabel lb_minimizar;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JPanel p_cambiarClasesImpartiendo;
    private javax.swing.JPanel p_cambiarClasesImpartiendo1;
    private javax.swing.JPanel p_cambiarInfoClases;
    private javax.swing.JPanel p_clasesImpartiendo;
    private javax.swing.JPanel p_contenedor;
    private javax.swing.JPanel p_infoClases;
    private javax.swing.JPanel p_principal;
    private javax.swing.JPanel p_toolbar;
    private javax.swing.JPanel p_toolbar1;
    private javax.swing.JSeparator separadorClasesImpartiendo;
    private javax.swing.JSeparator separadorClasesImpartiendo1;
    private javax.swing.JSeparator separadorInfoClases;
    private javax.swing.JTable t_clasesImpartidas;
    private javax.swing.JTable t_inscritosClase;
    private javax.swing.JTextField tf_busquedaAlumno;
    // End of variables declaration//GEN-END:variables
}
