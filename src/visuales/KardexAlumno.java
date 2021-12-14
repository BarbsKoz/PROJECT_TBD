package visuales;

import bd.Alumnos_BD;

public class KardexAlumno extends javax.swing.JInternalFrame {

    private Alumnos_BD ObjAlumnos;

    public KardexAlumno(String semestre, String noControl) {
        initComponents();

        setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI ifu = this.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) ifu).setNorthPane(null);

        ObjAlumnos = new Alumnos_BD();
        ObjAlumnos.obtenerKardexAlumno(t_semestreActual, noControl, semestre);
        calcularPromedio();
    }

    private void calcularPromedio() {
        double suma = 0;
        if (t_semestreActual.getRowCount() > 0) {
            for (int i = 0; i < t_semestreActual.getRowCount(); i++) {
                Object valor = t_semestreActual.getValueAt(i, 5);
                if (valor != null) {
                    suma += Double.parseDouble(t_semestreActual.getValueAt(i, 5).toString());
                } else {
                    suma += 0;
                }
            }
            double promedio = suma / t_semestreActual.getRowCount();
            lb_promedioSemestre.setText(promedio + "");
        } else {
            lb_promedioSemestre.setText("Sin Datos");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_semestreActual = new javax.swing.JTable();
        lb_promedioSemestre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(735, 428));
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        t_semestreActual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "MATERIA", "GRUPO", "DOCENTE", "HORA", "CALIFICACIÓN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_semestreActual.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(t_semestreActual);
        if (t_semestreActual.getColumnModel().getColumnCount() > 0) {
            t_semestreActual.getColumnModel().getColumn(0).setMinWidth(0);
            t_semestreActual.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        lb_promedioSemestre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_promedioSemestre.setText("10.00");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(35, 61, 123));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("PROMEDIO DEL SEMESTRE:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_promedioSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_promedioSemestre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_promedioSemestre;
    private javax.swing.JTable t_semestreActual;
    // End of variables declaration//GEN-END:variables
}
