package visuales;

import bd.Puestos_BD;
import bd.Puestos_Personal_BD;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class AgregarPuestoPersonal extends javax.swing.JFrame {

    private Puestos_BD ObjPuestos;
    private Puestos_Personal_BD ObjPuestosPersonal;
    private LinkedList listaPuestos = new LinkedList();
    private InformacionPersonalEscolar ObjPadre;
    private String idPersonal;
    private int x, y;

    public AgregarPuestoPersonal(InformacionPersonalEscolar frame, String idPersonal) {
        initComponents();

        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27);
        AWTUtilities.setWindowShape(this, forma);

        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/ITH_GRANDE.png")).getImage());

        ObjPuestos = new Puestos_BD();
        ObjPuestosPersonal = new Puestos_Personal_BD();
        ObjPadre = frame;

        this.idPersonal = idPersonal;

        llenarPuestos(idPersonal);
    }

    public void llenarPuestos(String idPersonal) {
        p_puestos.removeAll();
        String[] puestos = ObjPuestosPersonal.obtenerPuestosFaltantesPersonal(idPersonal);

        for (int i = 0; i < puestos.length; i++) {
            if (!puestos[i].equals("ADMINISTRADOR") && !puestos[i].equals("DOCENTE")) {
                JCheckBox check = new JCheckBox(puestos[i]);
                check.setBackground(Color.WHITE);
                listaPuestos.add(check);
                p_puestos.add(check);
            }
        }
        p_puestos.setLayout(new GridLayout(puestos.length, 0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_principal = new javax.swing.JPanel();
        p_puestos = new javax.swing.JPanel();
        p_toolbar = new javax.swing.JPanel();
        lb_logoEscuela = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lb_cerrar = new javax.swing.JLabel();
        lb_minimizar = new javax.swing.JLabel();
        btn_agregarPuestos = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

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

        p_puestos.setBackground(new java.awt.Color(255, 255, 255));
        p_puestos.setLayout(new java.awt.GridLayout());

        p_toolbar.setBackground(new java.awt.Color(35, 61, 123));

        lb_logoEscuela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_logoEscuela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ITH_LOGO_PEQUEÑO.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AGREGAR PUESTOS");

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
                .addComponent(lb_logoEscuela, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_minimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_cerrar)
                .addContainerGap())
        );
        p_toolbarLayout.setVerticalGroup(
            p_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_logoEscuela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(p_toolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                    .addComponent(lb_minimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btn_agregarPuestos.setText("AGREGAR PUESTOS");
        btn_agregarPuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarPuestosActionPerformed(evt);
            }
        });

        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_principalLayout = new javax.swing.GroupLayout(p_principal);
        p_principal.setLayout(p_principalLayout);
        p_principalLayout.setHorizontalGroup(
            p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(p_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(p_puestos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_agregarPuestos, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p_principalLayout.setVerticalGroup(
            p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_principalLayout.createSequentialGroup()
                .addComponent(p_toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_principalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p_puestos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(p_principalLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btn_agregarPuestos)
                        .addGap(100, 100, 100)
                        .addComponent(btn_cancelar)
                        .addContainerGap(50, Short.MAX_VALUE))))
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
        ObjPadre.actualizarPuestos();
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

    private void btn_agregarPuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarPuestosActionPerformed
        boolean exito = true;
        for (int i = 0; i < listaPuestos.size(); i++) {
            JCheckBox box = (JCheckBox) listaPuestos.get(i);
            if (box.isSelected()) {
                int p = ObjPuestosPersonal.agregarPuestoPersonal(ObjPuestos.obtenerIdPuesto(box.getText()), idPersonal);
                if (p == 1) {
                    exito = true;
                    System.out.println("Se añadió el puesto " + box.getText());
                } else {
                    exito = false;
                    break;
                }
            }
        }
        if (exito) {
            JOptionPane.showMessageDialog(this, "Los puestos se añadieron.");
            JOptionPane.showMessageDialog(this, "Se cerrará esta ventana.");
            ObjPadre.setEnabled(true);
            ObjPadre.actualizarPuestos();
            this.dispose();
        }
    }//GEN-LAST:event_btn_agregarPuestosActionPerformed

    private void p_principalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_principalMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_p_principalMousePressed

    private void p_principalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_principalMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_p_principalMouseDragged

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        ObjPadre.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarPuestoPersonal(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarPuestos;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_cerrar;
    private javax.swing.JLabel lb_logoEscuela;
    private javax.swing.JLabel lb_minimizar;
    private javax.swing.JPanel p_principal;
    private javax.swing.JPanel p_puestos;
    private javax.swing.JPanel p_toolbar;
    // End of variables declaration//GEN-END:variables
}
