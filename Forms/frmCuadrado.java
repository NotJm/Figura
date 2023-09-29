package Forms;
import Dependences.Cuadrado;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
/**
 *
 * @author josem
 */
public class frmCuadrado extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cuadrado
     */
    public frmCuadrado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtLado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnArea = new javax.swing.JButton();
        btnPerimetro = new javax.swing.JButton();
        btnAreaTI = new javax.swing.JButton();
        btnDiagonal = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cuadrado");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Lado:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cuadrado.png"))); // NOI18N

        btnArea.setText("Area");
        btnArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaActionPerformed(evt);
            }
        });

        btnPerimetro.setText("Perimetro");
        btnPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerimetroActionPerformed(evt);
            }
        });

        btnAreaTI.setText("Area de triangulos internos");
        btnAreaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaTIActionPerformed(evt);
            }
        });

        btnDiagonal.setText("Longitudo de la diagonal");
        btnDiagonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagonalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(btnArea, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAreaTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDiagonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLado, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(txtLado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnArea, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAreaTI, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDiagonal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaActionPerformed
        try {
            double lado = Double.parseDouble(this.txtLado.getText());
            Cuadrado A = new Cuadrado(lado);
            Cuadrado B = new Cuadrado();
            B = B.calculateArea(A);
            MessageBox.show(this, "El area del cuadrado es de " + B.getArea() + " cm^2", "Area del cuadrado");
        } catch (NumberFormatException e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        } catch (Exception e ){
            MessageBox.show(this, e.getMessage(), "Exception");
        }

    }//GEN-LAST:event_btnAreaActionPerformed

    private void btnPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerimetroActionPerformed
        try {
            String nivel = MessageBox.input(this, "Ingresa cuantas veces se divira el cuadrado en cuadrados pequeños", "Perimetro");
            double lado = Double.parseDouble(this.txtLado.getText());
            Cuadrado A = new Cuadrado(lado, Integer.parseInt(nivel));
            Cuadrado B = new Cuadrado();
            B = B.calculatePerimetroRecursivo(A);
            MessageBox.show(this, "El perimetro del cuadrado es de " + B.getPerimetro() + " cm", "Perimetro del cuadrado");
        } catch (NumberFormatException e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        } catch (Exception e ){
            MessageBox.show(this, e.getMessage(), "Exception");
        }
    }//GEN-LAST:event_btnPerimetroActionPerformed

    private void btnAreaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaTIActionPerformed
        try {
            double lado = Double.parseDouble(this.txtLado.getText());
            Cuadrado A = new Cuadrado(lado);
            Cuadrado B = new Cuadrado();
            B = B.calculateAreaTotalDeTriangulosInternos(A);
            MessageBox.show(this, "El area de los triangulos internos del cuadrado es de " + B.getAreaTotalDeTriangulosInternos() + " cm^2", "Area de los triangulos internos");
        } catch (NumberFormatException e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        } catch (Exception e ){
            MessageBox.show(this, e.getMessage(), "Exception");
        }
    }//GEN-LAST:event_btnAreaTIActionPerformed

    private void btnDiagonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagonalActionPerformed
        try{
            double lado = Double.parseDouble(this.txtLado.getText()); 
            Cuadrado A = new Cuadrado(lado);
            Cuadrado B = new Cuadrado();
            B = B.calculateLongitudDiagonal(A);
            MessageBox.show(this, "La longitud de las diagonales del cuadrado es de " + B.getLongitudDiagonal()+ " cm", "Longitudo de las diagonales del cuadrado");
        } catch (NumberFormatException e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        } catch (Exception e ){
            MessageBox.show(this, e.getMessage(), "Exception");
        }
    }//GEN-LAST:event_btnDiagonalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArea;
    private javax.swing.JButton btnAreaTI;
    private javax.swing.JButton btnDiagonal;
    private javax.swing.JButton btnPerimetro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtLado;
    // End of variables declaration//GEN-END:variables
}
