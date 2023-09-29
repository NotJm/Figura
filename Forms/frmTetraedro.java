/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Forms;

import Dependences.Tetraedro;
import Dependences.Triangulo;

/**
 *
 * @author josem
 */
public class frmTetraedro extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmTetraedro
     */
    public frmTetraedro() {
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

        txtAltura = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBase = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAnchura = new javax.swing.JTextField();
        btnLongitudArista = new javax.swing.JButton();
        btnAreaTotal = new javax.swing.JButton();
        btnVolumen = new javax.swing.JButton();

        setClosable(true);
        setTitle("Tetraedro");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Altura:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Base :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/tetraedro.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Anchura:");

        btnLongitudArista.setText("Longitud de Arista");
        btnLongitudArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLongitudAristaActionPerformed(evt);
            }
        });

        btnAreaTotal.setText("Area Total");
        btnAreaTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaTotalActionPerformed(evt);
            }
        });

        btnVolumen.setText("Volumen");
        btnVolumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolumenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAnchura, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAreaTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLongitudArista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVolumen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAreaTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLongitudArista))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnchura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolumenActionPerformed
        try {
            double b = Double.parseDouble(this.txtBase.getText()),
                    a = Double.parseDouble(this.txtAnchura.getText()),
                    h = Double.parseDouble(this.txtAltura.getText());
            Triangulo A = new Triangulo(b, a);
            Tetraedro B = new Tetraedro(h);
            B = B.calculateVolumen(B, A);
            MessageBox.show(this, "El volumen es de " + B.getVolumen() + " cm^3", "Volumen del tetraedro");
        } catch (NumberFormatException e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        } catch (Exception e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        }
    }//GEN-LAST:event_btnVolumenActionPerformed

    private void btnAreaTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaTotalActionPerformed
        try {
            double b = Double.parseDouble(this.txtBase.getText()),
                    a = Double.parseDouble(this.txtAnchura.getText()),
                    h = Double.parseDouble(this.txtAltura.getText());
            Triangulo A = new Triangulo(b, a);
            Tetraedro B = new Tetraedro(h);
            B = B.calculateAreaTotal(B, A);
            MessageBox.show(this, "El area total es de " + B.getAreaTotal() + " cm^2", "Area total del tetraedro");
        } catch (NumberFormatException e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        } catch (Exception e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        }
    }//GEN-LAST:event_btnAreaTotalActionPerformed

    private void btnLongitudAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLongitudAristaActionPerformed
        try {
            double b = Double.parseDouble(this.txtBase.getText()),
                    a = Double.parseDouble(this.txtAnchura.getText()),
                    h = Double.parseDouble(this.txtAltura.getText());
            Triangulo A = new Triangulo(b, a);
            Tetraedro B = new Tetraedro(h);
            B = B.calculateLongitudArista(B, A);
            MessageBox.show(this, "La longitud de la arista es de " + B.getLongitudArista() + " cm", "Longitud de la arista del tetraedro");
        } catch (NumberFormatException e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        } catch (Exception e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        }
    }//GEN-LAST:event_btnLongitudAristaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAreaTotal;
    private javax.swing.JButton btnLongitudArista;
    private javax.swing.JButton btnVolumen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtAnchura;
    private javax.swing.JTextField txtBase;
    // End of variables declaration//GEN-END:variables
}