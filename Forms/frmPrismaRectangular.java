/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Forms;

import Dependences.Poliedro;
import Dependences.Rectangulo;

/**
 *
 * @author josem
 */
public class frmPrismaRectangular extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmPrismaRectangular
     */
    public frmPrismaRectangular() {
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

        jLabel1 = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBase = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAnchura = new javax.swing.JTextField();
        btnVolumen = new javax.swing.JButton();
        btnAreaBase = new javax.swing.JButton();
        btnAreaSuperficie = new javax.swing.JButton();
        btnCarasLaterales = new javax.swing.JButton();

        setClosable(true);
        setTitle("Prisma Rectangular");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Altura:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/prisme_rectangular.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Base :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Anchura:");

        btnVolumen.setText("Volumen");
        btnVolumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolumenActionPerformed(evt);
            }
        });

        btnAreaBase.setText("Area Base");
        btnAreaBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaBaseActionPerformed(evt);
            }
        });

        btnAreaSuperficie.setText("Area Superfcie");
        btnAreaSuperficie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaSuperficieActionPerformed(evt);
            }
        });

        btnCarasLaterales.setText("Area Caras Laterales");
        btnCarasLaterales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarasLateralesActionPerformed(evt);
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
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVolumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAreaBase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAreaSuperficie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCarasLaterales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAnchura, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnchura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnVolumen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAreaBase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAreaSuperficie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCarasLaterales)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolumenActionPerformed
        try{
            double b = Double.parseDouble(this.txtBase.getText());
            double h = Double.parseDouble(this.txtAltura.getText());
            double a = Double.parseDouble(this.txtAnchura.getText());
            Rectangulo A = new Rectangulo(b, a);
            Poliedro B = new Poliedro(h);
            B = B.calculateVolumen(B, A);
            MessageBox.show(this, "El volumen del Poliedro es de " + B.getVolumen() + " cm^3", "Volumen del Poliedro");
        } catch (NumberFormatException e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        } catch (Exception e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        }
    }//GEN-LAST:event_btnVolumenActionPerformed

    private void btnAreaBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaBaseActionPerformed
        try{
            double b = Double.parseDouble(this.txtBase.getText());
            double h = Double.parseDouble(this.txtAltura.getText());
            double a = Double.parseDouble(this.txtAnchura.getText());
            Poliedro A = new Poliedro(b,a,h);
            Poliedro B = new Poliedro();
            B = B.calculateAreaBase(A);
            MessageBox.show(this, "El Area de la base es de " + B.getAreaBase() + " cm^2", "Area de la base del Poliedro");
        } catch (NumberFormatException e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        } catch (Exception e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        }
    }//GEN-LAST:event_btnAreaBaseActionPerformed

    private void btnAreaSuperficieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaSuperficieActionPerformed
        try{
            double b = Double.parseDouble(this.txtBase.getText());
            double h = Double.parseDouble(this.txtAltura.getText());
            double a = Double.parseDouble(this.txtAnchura.getText());
            Rectangulo A = new Rectangulo(b, h);
            Poliedro B = new Poliedro(a);
            B = B.calculateAreaSuperficie(B, A);
            MessageBox.show(this, "El Area de la superficie es de " + B.getAreaSuperficial()+ " cm^2", "Area de la superficie del Poliedro");
        } catch (NumberFormatException e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        } catch (Exception e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        }
    }//GEN-LAST:event_btnAreaSuperficieActionPerformed

    private void btnCarasLateralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarasLateralesActionPerformed
        try{
            double b = Double.parseDouble(this.txtBase.getText());
            double h = Double.parseDouble(this.txtAltura.getText());
            double a = Double.parseDouble(this.txtAnchura.getText());
            Poliedro A = new Poliedro(b, a, h);
            Poliedro B = new Poliedro();
            B = B.calculateAreasLaterales(A);
            MessageBox.show(this, "El Area Caras Laterales es de" + B.getAreaCarasLaterales() + " cm^2", "Area de Caras Laterales del Poliedro");
        } catch (NumberFormatException e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        } catch (Exception e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        }
    }//GEN-LAST:event_btnCarasLateralesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAreaBase;
    private javax.swing.JButton btnAreaSuperficie;
    private javax.swing.JButton btnCarasLaterales;
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