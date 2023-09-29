/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Forms;
import Dependences.Rectangulo;
/**
 *
 * @author josem
 */
public class frmRectangulo extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmRectangulo
     */
    public frmRectangulo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBase = new javax.swing.JTextField();
        btnArea = new javax.swing.JButton();
        btnPerimetro = new javax.swing.JButton();
        btnApotema = new javax.swing.JButton();
        btnAreaTI = new javax.swing.JButton();
        btnDiagonal = new javax.swing.JButton();

        setClosable(true);
        setTitle("Rectangulo");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Altura:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/rectangulo.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Base :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtBase)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

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

        btnApotema.setText("Apotema");
        btnApotema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApotemaActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnArea, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnApotema, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDiagonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAreaTI, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnArea, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnApotema, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAreaTI, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDiagonal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerimetroActionPerformed
        try {
            double base = Double.parseDouble(this.txtBase.getText());
            double altura = Double.parseDouble(this.txtAltura.getText());
            Rectangulo A = new Rectangulo(base, altura);
            Rectangulo B = new Rectangulo();
            B = B.calculatePerimetro(A);
            MessageBox.show(this, "El perimetro del Rectangulo es de " + B.getPerimetro() + " cm", "Perimetro del Rectangulo");
        } catch (Exception e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        }
    }//GEN-LAST:event_btnPerimetroActionPerformed

    private void btnAreaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaTIActionPerformed
        try {
            double base = Double.parseDouble(this.txtBase.getText());
            double altura = Double.parseDouble(this.txtAltura.getText());
            Rectangulo A = new Rectangulo(base, altura);
            Rectangulo B = new Rectangulo();
            B = B.calculateAreaTotalTriangulosInternos(A);
            MessageBox.show(this, "El area de los triangulos internos del Rectangulo es de " + B.getAreaTriangulosInternos() + " cm^2", "Area de los triangulos internos");
        } catch (Exception e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        }
    }//GEN-LAST:event_btnAreaTIActionPerformed

    private void btnDiagonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagonalActionPerformed
        try {
            double base = Double.parseDouble(this.txtBase.getText());
            double altura = Double.parseDouble(this.txtAltura.getText());
            Rectangulo A = new Rectangulo(base, altura);
            Rectangulo B = new Rectangulo();
            B = B.calculateLongitudDiagonal(A);
            MessageBox.show(this, "La longitud de las diagonales es de " + B.getLongitudDiagonal() + " cm", "Longitud de las diagonales");
        } catch (Exception e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        }
    }//GEN-LAST:event_btnDiagonalActionPerformed

    private void btnApotemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApotemaActionPerformed
        try {
            double base = Double.parseDouble(this.txtBase.getText());
            double altura = Double.parseDouble(this.txtAltura.getText());
            Rectangulo A = new Rectangulo(base, altura);
            Rectangulo B = new Rectangulo();
            B = B.calculateCentroide(A);
            MessageBox.show(this, "La distancia que hay desde un lado hasta el centro es de " + B.getCentroide() + " cm", "Distancia de lado hacia el centro");
        } catch (Exception e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        }
    }//GEN-LAST:event_btnApotemaActionPerformed

    private void btnAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaActionPerformed
        try {
            double base = Double.parseDouble(this.txtBase.getText());
            double altura = Double.parseDouble(this.txtAltura.getText());
            Rectangulo A = new Rectangulo(base, altura);
            Rectangulo B = new Rectangulo();
            B = B.calculateArea(A);
            MessageBox.show(this, "El Area del Rectangulo es de " + B.getArea() + " cm^2", "Area del Rectangulo");
        } catch (Exception e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        }
    }//GEN-LAST:event_btnAreaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApotema;
    private javax.swing.JButton btnArea;
    private javax.swing.JButton btnAreaTI;
    private javax.swing.JButton btnDiagonal;
    private javax.swing.JButton btnPerimetro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtBase;
    // End of variables declaration//GEN-END:variables
}
