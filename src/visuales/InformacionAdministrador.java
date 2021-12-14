package visuales;

import bd.Admin_BD;
import bd.Puestos_BD;
import bd.Puestos_Personal_BD;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class InformacionAdministrador extends javax.swing.JFrame {

    private int x, y;
    private Menu_Admin ObjPadre;
    private Admin_BD ObjAdmin;
    private Puestos_Personal_BD ObjPuestos;
    private String usuario, idPersonal, usuarioSistema;

    public InformacionAdministrador(Menu_Admin frame, String usuario, String usuarioSistema) {
        initComponents();

        ObjPadre = frame;
        ObjAdmin = new Admin_BD();
        ObjPuestos = new Puestos_Personal_BD();

        this.usuario = usuario;
        this.usuarioSistema = usuarioSistema;
        this.idPersonal = ObjAdmin.obtenerIdAdmin(usuario);

        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27);
        AWTUtilities.setWindowShape(this, forma);

        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/ITH_GRANDE.png")).getImage());

        inicializarFrame(usuario);

        if (usuario.equals(usuarioSistema)) {
            tf_usuario.setEditable(false);
            btn_eliminarAdmin.setEnabled(false);
        }
    }

    public void inicializarFrame(String usuario) {
        Object[] objetos = ObjAdmin.obtenerAdministrador(usuario);
        lb_nombrePersonal.setText(objetos[0].toString());
        lb_sexoPersonal.setText(objetos[1].toString());
        String[] fn = objetos[2].toString().split("-");
        String fechaNacimiento = fn[2] + " de " + obtenerMes(fn[1]) + " del " + fn[0];
        lb_fechaNacimiento.setText(fechaNacimiento);
        tf_usuario.setText(objetos[3].toString());
        tf_pass.setText(objetos[4].toString());
    }

    public String obtenerMes(String numeroMes) {
        String mes = "";
        switch (numeroMes) {
            case "01":
                mes = "Enero";
                break;
            case "02":
                mes = "Febrero";
                break;
            case "03":
                mes = "Marzo";
                break;
            case "04":
                mes = "Abril";
                break;
            case "05":
                mes = "Mayo";
                break;
            case "06":
                mes = "Junio";
                break;
            case "07":
                mes = "Julio";
                break;
            case "08":
                mes = "Agosto";
                break;
            case "09":
                mes = "Septiembre";
                break;
            case "10":
                mes = "Octubre";
                break;
            case "11":
                mes = "Noviembre";
                break;
            case "12":
                mes = "Diciembre";
                break;
        }
        return mes;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_principal = new javax.swing.JPanel();
        p_toolbar = new javax.swing.JPanel();
        lb_logo = new javax.swing.JLabel();
        lb_titulo = new javax.swing.JLabel();
        lb_cerrar = new javax.swing.JLabel();
        lb_minimizar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        lb_nombrePersonal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lb_sexoPersonal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lb_fechaNacimiento = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_usuario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_pass = new javax.swing.JTextField();
        btn_eliminarAdmin = new javax.swing.JButton();
        btn_editarAdmin = new javax.swing.JButton();

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

        lb_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ITH_LOGO_PEQUEÑO.png"))); // NOI18N

        lb_titulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_titulo.setText("Administradores");

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
                .addComponent(lb_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_minimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_cerrar)
                .addContainerGap())
        );
        p_toolbarLayout.setVerticalGroup(
            p_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_toolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb_minimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(lb_logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("INFORMACIÓN DEL PERSONAL");

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("INFORMACIÓN ADMINISTRADOR");

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("NOMBRE DEL PERSONAL");

        lb_nombrePersonal.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lb_nombrePersonal.setText("NOMBRE PRUEBA");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("SEXO");

        lb_sexoPersonal.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lb_sexoPersonal.setText("SEXO PRUEBA");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("FECHA DE NACIMIENTO");

        lb_fechaNacimiento.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lb_fechaNacimiento.setText("FECHA DE NACIMIENTO DE PRUEBA");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("USUARIO");

        tf_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_usuarioKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("CONTRASEÑA");

        tf_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_passKeyTyped(evt);
            }
        });

        btn_eliminarAdmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_eliminarAdmin.setForeground(new java.awt.Color(255, 90, 90));
        btn_eliminarAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminarNormal.png"))); // NOI18N
        btn_eliminarAdmin.setText("ELIMINAR");
        btn_eliminarAdmin.setBorderPainted(false);
        btn_eliminarAdmin.setContentAreaFilled(false);
        btn_eliminarAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_eliminarAdmin.setFocusPainted(false);
        btn_eliminarAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_eliminarAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_eliminarAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_eliminarAdminMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_eliminarAdminMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_eliminarAdminMouseReleased(evt);
            }
        });
        btn_eliminarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarAdminActionPerformed(evt);
            }
        });

        btn_editarAdmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_editarAdmin.setForeground(new java.awt.Color(35, 61, 123));
        btn_editarAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editarNormal.png"))); // NOI18N
        btn_editarAdmin.setText("EDITAR");
        btn_editarAdmin.setBorderPainted(false);
        btn_editarAdmin.setContentAreaFilled(false);
        btn_editarAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editarAdmin.setFocusPainted(false);
        btn_editarAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_editarAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_editarAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_editarAdminMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_editarAdminMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_editarAdminMouseReleased(evt);
            }
        });
        btn_editarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p_principalLayout = new javax.swing.GroupLayout(p_principal);
        p_principal.setLayout(p_principalLayout);
        p_principalLayout.setHorizontalGroup(
            p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_toolbar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(p_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p_principalLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(p_principalLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_fechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                    .addComponent(lb_sexoPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_nombrePersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(18, 18, 18)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_principalLayout.createSequentialGroup()
                        .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jSeparator2)
                            .addGroup(p_principalLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_pass, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_usuario))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(p_principalLayout.createSequentialGroup()
                        .addComponent(btn_eliminarAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_editarAdmin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p_principalLayout.setVerticalGroup(
            p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_principalLayout.createSequentialGroup()
                .addComponent(p_toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_usuario)
                    .addComponent(lb_nombrePersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_pass)
                    .addComponent(lb_sexoPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_principalLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_fechaNacimiento))
                    .addGroup(p_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_eliminarAdmin)
                        .addComponent(btn_editarAdmin)))
                .addContainerGap(22, Short.MAX_VALUE))
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
        ObjPadre.actualizarApartadoAdministrador();
        this.dispose();
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

    private void btn_eliminarAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarAdminMouseEntered
        btn_eliminarAdmin.setForeground(new Color(203, 73, 73));
        btn_eliminarAdmin.setIcon(new ImageIcon(getClass().getResource("/imagenes/eliminarEntered.png")));
    }//GEN-LAST:event_btn_eliminarAdminMouseEntered

    private void btn_eliminarAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarAdminMouseExited
        btn_eliminarAdmin.setForeground(new Color(255, 90, 90));
        btn_eliminarAdmin.setIcon(new ImageIcon(getClass().getResource("/imagenes/eliminarNormal.png")));
    }//GEN-LAST:event_btn_eliminarAdminMouseExited

    private void btn_eliminarAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarAdminMousePressed
        btn_eliminarAdmin.setForeground(new Color(165, 62, 62));
        btn_eliminarAdmin.setIcon(new ImageIcon(getClass().getResource("/imagenes/eliminarPressed.png")));
    }//GEN-LAST:event_btn_eliminarAdminMousePressed

    private void btn_eliminarAdminMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarAdminMouseReleased
        btn_eliminarAdmin.setForeground(new Color(203, 73, 73));
        btn_eliminarAdmin.setIcon(new ImageIcon(getClass().getResource("/imagenes/eliminarEntered.png")));
    }//GEN-LAST:event_btn_eliminarAdminMouseReleased

    private void btn_editarAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarAdminMouseEntered
        btn_editarAdmin.setForeground(new Color(30, 51, 100));
        btn_editarAdmin.setIcon(new ImageIcon(getClass().getResource("/imagenes/editarEntered.png")));
    }//GEN-LAST:event_btn_editarAdminMouseEntered

    private void btn_editarAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarAdminMouseExited
        btn_editarAdmin.setForeground(new Color(35, 61, 123));
        btn_editarAdmin.setIcon(new ImageIcon(getClass().getResource("/imagenes/editarNormal.png")));
    }//GEN-LAST:event_btn_editarAdminMouseExited

    private void btn_editarAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarAdminMousePressed
        btn_editarAdmin.setForeground(new Color(35, 61, 123));
        btn_editarAdmin.setIcon(new ImageIcon(getClass().getResource("/imagenes/editarPressed.png")));
    }//GEN-LAST:event_btn_editarAdminMousePressed

    private void btn_editarAdminMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarAdminMouseReleased
        btn_editarAdmin.setForeground(new Color(30, 51, 100));
        btn_editarAdmin.setIcon(new ImageIcon(getClass().getResource("/imagenes/editarEntered.png")));
    }//GEN-LAST:event_btn_editarAdminMouseReleased

    private void btn_editarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarAdminActionPerformed
        if (!tf_usuario.getText().equals("") && !tf_pass.getText().equals("")) {
            int p = JOptionPane.showConfirmDialog(this, "¿Deseas EDITAR el administrador '"
                    + lb_nombrePersonal.getText() + "'?", "PRECAUCION", JOptionPane.YES_NO_OPTION, 1);

            if (p == 0) {
                int i = ObjAdmin.editarAdministrador(ObjAdmin.obtenerIdAdmin(usuario), tf_usuario.getText(),
                        tf_pass.getText());
                if (i == 1) {
                    JOptionPane.showMessageDialog(this, "Se editó el administrador", "Exito", 1);
                    usuario = tf_usuario.getText();
                } else {
                    JOptionPane.showMessageDialog(this, "No se editó el administrador", "Error", 0);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debes llenar todos los campos", "Error", 0);
        }
    }//GEN-LAST:event_btn_editarAdminActionPerformed

    private void btn_eliminarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarAdminActionPerformed
        int p = JOptionPane.showConfirmDialog(this, "¿Deseas BORRAR el administrador '"
                + lb_nombrePersonal.getText() + "'?", "PRECAUCION", JOptionPane.YES_NO_OPTION, 2);

        if (p == 0) {
            int i = ObjAdmin.eliminarAdministrador(usuario);
            if (i == 1) {
                ObjPuestos.eliminarPuestoPersonal("2", idPersonal);
                JOptionPane.showMessageDialog(this, "Se eliminó el administrador", "Exito", 1);
                JOptionPane.showMessageDialog(this, "Se cerrará esta ventana.");
                ObjPadre.setEnabled(true);
                ObjPadre.actualizarApartadoAdministrador();
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "No se eliminó el administrador", "Error", 0);
            }
        }
    }//GEN-LAST:event_btn_eliminarAdminActionPerformed

    private void tf_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_usuarioKeyTyped
        if (tf_usuario.getText().length() == 10) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_usuarioKeyTyped

    private void tf_passKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_passKeyTyped
        if (tf_pass.getText().length() == 15) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tf_passKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionAdministrador(null, null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_editarAdmin;
    private javax.swing.JButton btn_eliminarAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lb_cerrar;
    private javax.swing.JLabel lb_fechaNacimiento;
    private javax.swing.JLabel lb_logo;
    private javax.swing.JLabel lb_minimizar;
    private javax.swing.JLabel lb_nombrePersonal;
    private javax.swing.JLabel lb_sexoPersonal;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JPanel p_principal;
    private javax.swing.JPanel p_toolbar;
    private javax.swing.JTextField tf_pass;
    private javax.swing.JTextField tf_usuario;
    // End of variables declaration//GEN-END:variables
}
