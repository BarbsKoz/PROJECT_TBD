package visuales;

import bd.Clases_BD;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;

public class InformacionClase extends javax.swing.JFrame {

    private int panelActual = 1, x, y;
    private Menu_Admin ObjPadre;
    private Clases_BD ObjClases;
    private static String idClase;

    public InformacionClase(Menu_Admin frame, String idClase) {
        initComponents();

        this.ObjPadre = frame;
        this.idClase = idClase;

        ObjClases = new Clases_BD();

        ObjClases.obtenerAlumnosClase(t_alumnosInscritos, idClase);

        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27);
        AWTUtilities.setWindowShape(this, forma);

        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/ITH_GRANDE.png")).getImage());

        t_alumnosInscritos.getDefaultEditor(String.class).addCellEditorListener(ChangeNotification);
    }

    CellEditorListener ChangeNotification = new CellEditorListener() {
        public void editingCanceled(ChangeEvent e) {

        }

        public void editingStopped(ChangeEvent e) {
            String[] datos = obtenerDatosModificacion();
            Clases_BD ObjClases_BD = new Clases_BD();

            int p = JOptionPane.showConfirmDialog(null, "¿Deseas modificar la calificacion del alumno '" + datos[1] + "'?\n"
                    + "   Calificación Anterior: " + datos[4] + "\n"
                    + "   Calificación Nueva: " + datos[3], "", JOptionPane.YES_NO_OPTION, 1);
            if (p == 0) {
                int i = ObjClases_BD.subirCalificaciones(datos[0], datos[2], datos[3]);
                if (i == 1) {
                    JOptionPane.showMessageDialog(null, "La calificación se modificó");
                    actualizarTabla();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo modificar la calificación del alumno", "Error", 0);
                }
            }
        }
    };

    public static String[] obtenerDatosModificacion() {
        String[] datos = new String[5];
        int fila = t_alumnosInscritos.getSelectedRow();
        // ID DE LA CLASE
        datos[0] = t_alumnosInscritos.getValueAt(fila, 0).toString();
        // NOMBRE DEL ALUMNO
        datos[1] = t_alumnosInscritos.getValueAt(fila, 2).toString();
        // NUMERO DE CONTROL
        datos[2] = t_alumnosInscritos.getValueAt(fila, 1).toString();
        // CALIFICACION A AGREGAR
        datos[3] = t_alumnosInscritos.getValueAt(fila, 5).toString();
        actualizarTabla();
        // CALIFICACION VIEJA
        datos[4] = t_alumnosInscritos.getValueAt(fila, 5).toString();
        return datos;
    }

    public static void actualizarTabla() {
        Clases_BD clase = new Clases_BD();
        clase.obtenerAlumnosClase(t_alumnosInscritos, idClase);
    }

    public void refrescarTabla() {
        ObjClases.obtenerAlumnosClase(t_alumnosInscritos, idClase);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_principal = new javax.swing.JPanel();
        p_toolbar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lb_titulo = new javax.swing.JLabel();
        lb_cerrar = new javax.swing.JLabel();
        lb_minimizar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_busquedaAlumno = new javax.swing.JTextField();
        lb_borrarTexto = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        t_alumnosInscritos = new javax.swing.JTable();
        btn_agregarAlumno = new javax.swing.JButton();
        btn_eliminarAlumno = new javax.swing.JButton();

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ITH_LOGO_PEQUEÑO.png"))); // NOI18N

        lb_titulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_titulo.setText("INFORMACIÓN DE CLASE");

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

        javax.swing.GroupLayout p_toolbarLayout = new javax.swing.GroupLayout(p_toolbar);
        p_toolbar.setLayout(p_toolbarLayout);
        p_toolbarLayout.setHorizontalGroup(
            p_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_toolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lb_minimizar)
                .addGap(10, 10, 10)
                .addComponent(lb_cerrar)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(35, 61, 123));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("BUSCAR ALUMNO:");

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

        t_alumnosInscritos.setModel(new javax.swing.table.DefaultTableModel(
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
        t_alumnosInscritos.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(t_alumnosInscritos);
        if (t_alumnosInscritos.getColumnModel().getColumnCount() > 0) {
            t_alumnosInscritos.getColumnModel().getColumn(0).setMinWidth(0);
            t_alumnosInscritos.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        btn_agregarAlumno.setText("AGREGAR ALUMNO");
        btn_agregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarAlumnoActionPerformed(evt);
            }
        });

        btn_eliminarAlumno.setText("ELIMINAR ALUMNO");
        btn_eliminarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_principalLayout = new javax.swing.GroupLayout(p_principal);
        p_principal.setLayout(p_principalLayout);
        p_principalLayout.setHorizontalGroup(
            p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p_principalLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_busquedaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lb_borrarTexto)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(p_principalLayout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addComponent(btn_agregarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(316, Short.MAX_VALUE))
        );
        p_principalLayout.setVerticalGroup(
            p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_principalLayout.createSequentialGroup()
                .addComponent(p_toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_busquedaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_borrarTexto))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregarAlumno)
                    .addComponent(btn_eliminarAlumno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void lb_minimizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_minimizarMouseReleased
        lb_minimizar.setIcon(new ImageIcon(getClass().getResource("/imagenes/minimizarEntered.png")));
    }//GEN-LAST:event_lb_minimizarMouseReleased

    private void lb_minimizarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_minimizarMousePressed
        lb_minimizar.setIcon(new ImageIcon(getClass().getResource("/imagenes/minimizarPressed.png")));
        this.setState(ICONIFIED);
    }//GEN-LAST:event_lb_minimizarMousePressed

    private void lb_minimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_minimizarMouseExited
        lb_minimizar.setIcon(new ImageIcon(getClass().getResource("/imagenes/minimizarNormal.png")));
    }//GEN-LAST:event_lb_minimizarMouseExited

    private void lb_minimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_minimizarMouseEntered
        lb_minimizar.setIcon(new ImageIcon(getClass().getResource("/imagenes/minimizarEntered.png")));
    }//GEN-LAST:event_lb_minimizarMouseEntered

    private void lb_cerrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarMouseReleased
        lb_cerrar.setIcon(new ImageIcon(getClass().getResource("/imagenes/cerrarEntered.png")));
    }//GEN-LAST:event_lb_cerrarMouseReleased

    private void lb_cerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarMousePressed
        lb_cerrar.setIcon(new ImageIcon(getClass().getResource("/imagenes/cerrarPressed.png")));
        ObjPadre.setEnabled(true);
        dispose();
    }//GEN-LAST:event_lb_cerrarMousePressed

    private void lb_cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarMouseExited
        lb_cerrar.setIcon(new ImageIcon(getClass().getResource("/imagenes/cerrarNormal.png")));
    }//GEN-LAST:event_lb_cerrarMouseExited

    private void lb_cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_cerrarMouseEntered
        lb_cerrar.setIcon(new ImageIcon(getClass().getResource("/imagenes/cerrarEntered.png")));
    }//GEN-LAST:event_lb_cerrarMouseEntered

    private void tf_busquedaAlumnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_busquedaAlumnoKeyReleased
        ObjClases.obtenerBusquedaAlumnosClase(t_alumnosInscritos, idClase, tf_busquedaAlumno.getText());
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
        ObjClases.obtenerAlumnosClase(t_alumnosInscritos, idClase);
    }//GEN-LAST:event_lb_borrarTextoMouseReleased

    private void p_principalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_principalMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_p_principalMousePressed

    private void p_principalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_principalMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_p_principalMouseDragged

    private void btn_agregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarAlumnoActionPerformed
        AgregarAlumnoClase frame = new AgregarAlumnoClase(this, idClase);
        frame.setAlwaysOnTop(true);
        this.setEnabled(false);
        frame.setVisible(true);
    }//GEN-LAST:event_btn_agregarAlumnoActionPerformed

    private void btn_eliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarAlumnoActionPerformed
        try {
            int p = JOptionPane.showConfirmDialog(this, "¿Esta seguro de dar de baja al alumno '"
                    + t_alumnosInscritos.getValueAt(t_alumnosInscritos.getSelectedRow(), 2) + "'?", "", JOptionPane.YES_NO_OPTION, 1);
            if (p == 0) {
                int i = ObjClases.darBajaAlumno(idClase, 
                        t_alumnosInscritos.getValueAt(t_alumnosInscritos.getSelectedRow(), 1).toString());
                if (i == 1) {
                    JOptionPane.showMessageDialog(this, "Se dió de baja el alumno", "Exito", 1);
                    ObjClases.obtenerAlumnosClase(t_alumnosInscritos, idClase);
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo dar de baja", "Error", 0);
                }
            } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Necesitas seleccionar un alumno de la tabla", "Error", 0);
        }

    }//GEN-LAST:event_btn_eliminarAlumnoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionClase(null, "1").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarAlumno;
    private javax.swing.JButton btn_eliminarAlumno;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lb_borrarTexto;
    private javax.swing.JLabel lb_cerrar;
    private javax.swing.JLabel lb_minimizar;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JPanel p_principal;
    private javax.swing.JPanel p_toolbar;
    public static javax.swing.JTable t_alumnosInscritos;
    private javax.swing.JTextField tf_busquedaAlumno;
    // End of variables declaration//GEN-END:variables
}
