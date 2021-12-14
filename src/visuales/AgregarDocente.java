package visuales;

import bd.*;
import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AgregarDocente extends javax.swing.JFrame {

    Menu_Admin ObjPadre;
    Personal_Escolar_BD ObjPersonal;
    Docente_BD ObjDocentes;
    Puestos_Personal_BD ObjPuestosPersonal;
    private int x, y;

    public AgregarDocente(Menu_Admin frame) {
        initComponents();

        ObjPadre = frame;

        this.setLocationRelativeTo(null);
        this.lb_nombre.setText("-");

        ObjDocentes = new Docente_BD();
        ObjPuestosPersonal = new Puestos_Personal_BD();
        ObjPersonal = new Personal_Escolar_BD();

        ObjPersonal.obtenerPersonalNoDocente(t_personalNoDocente);

        ingresarNumerosAleatorios();

        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27);
        AWTUtilities.setWindowShape(this, forma);

        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/ITH_GRANDE.png")).getImage());
    }

    public void ingresarNumerosAleatorios() {
        do {
            String primerDigitoNoControl = ((int) (Math.random() * 9 + 1)) + "";
            String ultimosDigitosNoControl = ((int) (Math.random() * (10000000 - 1 + 1) + 1)) + "";
            if (ultimosDigitosNoControl.length() < 7) {
                for (int i = 0; i < (7 - ultimosDigitosNoControl.length()); i++) {
                    ultimosDigitosNoControl = "0" + ultimosDigitosNoControl;
                }
            }
            String noControl = primerDigitoNoControl + ultimosDigitosNoControl;
            if (!ObjDocentes.encontrarDocente(noControl)) {
                tf_noControl.setText(noControl);
                break;
            }
        } while (true);
        String primerDigitoNip = ((int) (Math.random() * 9 + 1)) + "";
        String ultimosDigitosNip = ((int) (Math.random() * (1000 - 1 + 1) + 1)) + "";
        if (ultimosDigitosNip.length() < 3) {
            for (int i = 0; i <= (3 - ultimosDigitosNip.length()); i++) {
                ultimosDigitosNip = "0" + ultimosDigitosNip;
            }
        }
        String nip = primerDigitoNip + ultimosDigitosNip;
        tf_nip.setText(nip);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_principal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_personalNoDocente = new javax.swing.JTable();
        btn_agregarDocente = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        p_toolbar2 = new javax.swing.JPanel();
        lb_logo2 = new javax.swing.JLabel();
        lb_titulo2 = new javax.swing.JLabel();
        lb_cerrar2 = new javax.swing.JLabel();
        lb_minimizar2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        tf_busquedaPersonal = new javax.swing.JTextField();
        lb_borrarCon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        lb_nombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_noControl = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_nip = new javax.swing.JTextField();
        btn_numerosAlAzar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

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

        t_personalNoDocente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NOMBRES", "FECHA DE NACIMIENTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_personalNoDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                t_personalNoDocenteMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(t_personalNoDocente);

        btn_agregarDocente.setText("AGREGAR DOCENTE");
        btn_agregarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarDocenteActionPerformed(evt);
            }
        });

        btn_cerrar.setText("CERRAR");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        p_toolbar2.setBackground(new java.awt.Color(16, 134, 118));

        lb_logo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ITH_LOGO_PEQUEÑO.png"))); // NOI18N

        lb_titulo2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_titulo2.setForeground(new java.awt.Color(255, 255, 255));
        lb_titulo2.setText("AGREGAR DOCENTES");

        lb_cerrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrarNormal.png"))); // NOI18N
        lb_cerrar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_cerrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_cerrar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_cerrar2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_cerrar2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lb_cerrar2MouseReleased(evt);
            }
        });

        lb_minimizar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minimizarNormal.png"))); // NOI18N
        lb_minimizar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_minimizar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_minimizar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_minimizar2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_minimizar2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lb_minimizar2MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout p_toolbar2Layout = new javax.swing.GroupLayout(p_toolbar2);
        p_toolbar2.setLayout(p_toolbar2Layout);
        p_toolbar2Layout.setHorizontalGroup(
            p_toolbar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_toolbar2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_titulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_minimizar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_cerrar2)
                .addContainerGap())
        );
        p_toolbar2Layout.setVerticalGroup(
            p_toolbar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_toolbar2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_toolbar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_titulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_cerrar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_minimizar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(lb_logo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("PERSONAL NO DOCENTE");

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N

        tf_busquedaPersonal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_busquedaPersonalKeyReleased(evt);
            }
        });

        lb_borrarCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrarNormal.png"))); // NOI18N
        lb_borrarCon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_borrarCon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_borrarConMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_borrarConMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_borrarConMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lb_borrarConMouseReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("INFORMACIÓN DOCENTE");

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NOMBRE DEL PERSONAL");

        lb_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NUMERO DE CONTROL");

        tf_noControl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_noControl.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_noControl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_noControlKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NIP");

        tf_nip.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tf_nip.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_nip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_nipKeyTyped(evt);
            }
        });

        btn_numerosAlAzar.setText("GENERAR AL AZAR");
        btn_numerosAlAzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_numerosAlAzarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_principalLayout = new javax.swing.GroupLayout(p_principal);
        p_principal.setLayout(p_principalLayout);
        p_principalLayout.setHorizontalGroup(
            p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_toolbar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(p_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                    .addGroup(p_principalLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_busquedaPersonal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_borrarCon)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_principalLayout.createSequentialGroup()
                        .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_agregarDocente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_principalLayout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_noControl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btn_numerosAlAzar, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                .addComponent(tf_nip)))
                        .addGap(20, 20, 20))))
        );
        p_principalLayout.setVerticalGroup(
            p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_principalLayout.createSequentialGroup()
                .addComponent(p_toolbar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(tf_busquedaPersonal, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_borrarCon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_principalLayout.createSequentialGroup()
                        .addComponent(lb_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_noControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_numerosAlAzar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_agregarDocente)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cerrar)))
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

    private void t_personalNoDocenteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_personalNoDocenteMousePressed
        lb_nombre.setText(t_personalNoDocente.getValueAt(t_personalNoDocente.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_t_personalNoDocenteMousePressed

    private void btn_numerosAlAzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_numerosAlAzarActionPerformed
        ingresarNumerosAleatorios();
    }//GEN-LAST:event_btn_numerosAlAzarActionPerformed

    private void tf_busquedaPersonalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_busquedaPersonalKeyReleased
        ObjPersonal.obtenerBusquedaPersonalNoDocente(t_personalNoDocente, tf_busquedaPersonal.getText());
    }//GEN-LAST:event_tf_busquedaPersonalKeyReleased

    private void btn_agregarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarDocenteActionPerformed
        try {
            if (tf_noControl.getText().length() == 8 && tf_nip.getText().length() == 4) {
                int i = ObjDocentes.agregarDocente(tf_noControl.getText(), tf_nip.getText(),
                        t_personalNoDocente.getValueAt(t_personalNoDocente.getSelectedRow(), 0).toString());
                if (i == 1) {
                    JOptionPane.showMessageDialog(this, "El docente se añadió con exito");
                    ObjPuestosPersonal.agregarPuestoPersonal("1",
                            t_personalNoDocente.getValueAt(t_personalNoDocente.getSelectedRow(), 0).toString());
                    ObjPersonal.obtenerPersonalNoDocente(t_personalNoDocente);
                    lb_nombre.setText("-");
                    ingresarNumerosAleatorios();
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo añadir el docente", "Error", 0);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Formato de numero de control y/o nip incorrecto", "Error", 0);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un docente", "Error", 0);
        }
    }//GEN-LAST:event_btn_agregarDocenteActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        ObjPadre.setEnabled(true);
        ObjPadre.actualizarApartadoDocentes();
        this.dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ObjPadre.setEnabled(true);
        ObjPadre.actualizarApartadoDocentes();
    }//GEN-LAST:event_formWindowClosing

    private void tf_noControlKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_noControlKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == evt.VK_BACK_SPACE)
                || (c == evt.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
        if (tf_noControl.getText().length() == 8) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_noControlKeyTyped

    private void tf_nipKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_nipKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == evt.VK_BACK_SPACE)
                || (c == evt.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
        if (tf_nip.getText().length() == 4) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_nipKeyTyped

    private void lb_cerrar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrar2MouseEntered
        lb_cerrar2.setIcon(new ImageIcon(getClass().getResource("/imagenes/cerrarEntered.png")));
    }//GEN-LAST:event_lb_cerrar2MouseEntered

    private void lb_cerrar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrar2MouseExited
        lb_cerrar2.setIcon(new ImageIcon(getClass().getResource("/imagenes/cerrarNormal.png")));
    }//GEN-LAST:event_lb_cerrar2MouseExited

    private void lb_cerrar2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrar2MousePressed
        lb_cerrar2.setIcon(new ImageIcon(getClass().getResource("/imagenes/cerrarPressed.png")));
    }//GEN-LAST:event_lb_cerrar2MousePressed

    private void lb_cerrar2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrar2MouseReleased
        lb_cerrar2.setIcon(new ImageIcon(getClass().getResource("/imagenes/cerrarEntered.png")));
        ObjPadre.setEnabled(true);
        ObjPadre.actualizarApartadoAdministrador();
        this.dispose();
    }//GEN-LAST:event_lb_cerrar2MouseReleased

    private void lb_minimizar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_minimizar2MouseEntered
        lb_minimizar2.setIcon(new ImageIcon(getClass().getResource("/imagenes/minimizarEntered.png")));
    }//GEN-LAST:event_lb_minimizar2MouseEntered

    private void lb_minimizar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_minimizar2MouseExited
        lb_minimizar2.setIcon(new ImageIcon(getClass().getResource("/imagenes/minimizarNormal.png")));
    }//GEN-LAST:event_lb_minimizar2MouseExited

    private void lb_minimizar2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_minimizar2MousePressed
        lb_minimizar2.setIcon(new ImageIcon(getClass().getResource("/imagenes/minimizarPressed.png")));
    }//GEN-LAST:event_lb_minimizar2MousePressed

    private void lb_minimizar2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_minimizar2MouseReleased
        lb_minimizar2.setIcon(new ImageIcon(getClass().getResource("/imagenes/minimizarEntered.png")));
        this.setState(ICONIFIED);
    }//GEN-LAST:event_lb_minimizar2MouseReleased

    private void lb_borrarConMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarConMouseEntered
        lb_borrarCon.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarEntered.png")));
    }//GEN-LAST:event_lb_borrarConMouseEntered

    private void lb_borrarConMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarConMouseExited
        lb_borrarCon.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarNormal.png")));
    }//GEN-LAST:event_lb_borrarConMouseExited

    private void lb_borrarConMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarConMousePressed
        lb_borrarCon.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarPressed.png")));
        ObjPersonal.obtenerBusquedaPersonalNoDocente(t_personalNoDocente, tf_busquedaPersonal.getText());
        tf_busquedaPersonal.setText("");
    }//GEN-LAST:event_lb_borrarConMousePressed

    private void lb_borrarConMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_borrarConMouseReleased
        lb_borrarCon.setIcon(new ImageIcon(getClass().getResource("/imagenes/borrarEntered.png")));
    }//GEN-LAST:event_lb_borrarConMouseReleased

    private void p_principalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_principalMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_p_principalMousePressed

    private void p_principalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_principalMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_p_principalMouseDragged

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarDocente(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarDocente;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_numerosAlAzar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lb_borrarCon;
    private javax.swing.JLabel lb_cerrar;
    private javax.swing.JLabel lb_cerrar1;
    private javax.swing.JLabel lb_cerrar2;
    private javax.swing.JLabel lb_logo;
    private javax.swing.JLabel lb_logo1;
    private javax.swing.JLabel lb_logo2;
    private javax.swing.JLabel lb_minimizar;
    private javax.swing.JLabel lb_minimizar1;
    private javax.swing.JLabel lb_minimizar2;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JLabel lb_titulo1;
    private javax.swing.JLabel lb_titulo2;
    private javax.swing.JPanel p_principal;
    private javax.swing.JPanel p_toolbar;
    private javax.swing.JPanel p_toolbar1;
    private javax.swing.JPanel p_toolbar2;
    private javax.swing.JTable t_personalNoDocente;
    private javax.swing.JTextField tf_busquedaPersonal;
    private javax.swing.JTextField tf_nip;
    private javax.swing.JTextField tf_noControl;
    // End of variables declaration//GEN-END:variables
}
