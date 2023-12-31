package Forms;
import Dependences.Triangulo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
/**
 *
 * @author josem
 */
public class frmTriangulo extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmTriangulo
     */
    public frmTriangulo() {
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
        btnArea = new javax.swing.JButton();
        btnPerimetro = new javax.swing.JButton();
        btnDiagonal = new javax.swing.JButton();
        btnHipotenusa = new javax.swing.JButton();
        btnSemiperimetro = new javax.swing.JButton();
        btnTipoDeTriangulo = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Altura:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Base :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/triangulo.png"))); // NOI18N

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

        btnDiagonal.setText("Longitudo de la diagonal");
        btnDiagonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiagonalActionPerformed(evt);
            }
        });

        btnHipotenusa.setText("Hipotenusa");
        btnHipotenusa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHipotenusaActionPerformed(evt);
            }
        });

        btnSemiperimetro.setText("Semiperimetro");
        btnSemiperimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSemiperimetroActionPerformed(evt);
            }
        });

        btnTipoDeTriangulo.setText("Tipo de Triangulo");
        btnTipoDeTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoDeTrianguloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnPerimetro, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                        .addComponent(btnArea, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnHipotenusa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSemiperimetro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnDiagonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTipoDeTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBase, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnArea, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHipotenusa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSemiperimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDiagonal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTipoDeTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaActionPerformed
        try {
            double base = Double.parseDouble(this.txtBase.getText());
            double altura = Double.parseDouble(this.txtAltura.getText());
            Triangulo A = new Triangulo(base, altura);
            Triangulo B = new Triangulo();
            B = B.calculateArea(A);
            MessageBox.show(this,
                    "El area del triangulo es de " + B.getArea() + " cm^2",
                    "Area del triangulo");
        } catch (Exception e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        }
    }//GEN-LAST:event_btnAreaActionPerformed

    private void btnPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerimetroActionPerformed
        try {
            String strLados = MessageBox.input(this, "Ingresa solo 3 lados de la siguiente manera (1, 2, 3)", "Introduce Lados");
            double[] lados = Triangulo.generateLados(strLados.split(","));
            Triangulo A = new Triangulo(lados);
            Triangulo B = new Triangulo();
            B = B.calculatePerimetro(A);
            MessageBox.show(this, "El perimetro del triangulo es de " + B.getPerimetro() + " cm",
                    "Perimetro del triangulo");
        } catch (Exception e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        }
    }//GEN-LAST:event_btnPerimetroActionPerformed

    private void btnDiagonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiagonalActionPerformed
        try {
            String strLados = MessageBox.input(this, "Ingresa solo 3 lados de la siguiente manera (1, 2, 3)", "Introduce Lados");
            double[] lados = Triangulo.generateLados(strLados.split(","));
            Triangulo A = new Triangulo(lados);
            Triangulo B = new Triangulo();
            B = B.calculateLongitudDiagonal(A);
            MessageBox.show(this, "La longitud de la diagonal del triangulo es  " + B.getLongitudDiagonal() + " cm",
                    "Longitud de la diagonal del triangulo");
        } catch (Exception e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        }
    }//GEN-LAST:event_btnDiagonalActionPerformed

    private void btnHipotenusaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHipotenusaActionPerformed
        try {
            String strLados = MessageBox.input(this, "Ingresa solo 3 lados de la siguiente manera (1, 2, 3)", "Introduce Lados");
            double[] lados = Triangulo.generateLados(strLados.split(","));
            Triangulo A = new Triangulo(lados);
            Triangulo B = new Triangulo();
            B = B.calculateHipotenusa(A);
            MessageBox.show(this, "El valor de la hipotenusa es de  " + B.getHipotenusa() + " cm",
                    "Hipotenusa del triangulo");
        } catch (Exception e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        }
    }//GEN-LAST:event_btnHipotenusaActionPerformed

    private void btnSemiperimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSemiperimetroActionPerformed
        try {
            String strLados = MessageBox.input(this, "Ingresa solo 3 lados de la siguiente manera (1, 2, 3)", "Introduce Lados");
            double[] lados = Triangulo.generateLados(strLados.split(","));
            Triangulo A = new Triangulo(lados);
            Triangulo B = new Triangulo();
            B = B.calculateSemiperimetro(A);
            MessageBox.show(this, "El valor del semiperimetro es de " + B.getSemiperimetro() + " cm",
                    "Semiperimetro del triangulo");
        } catch (Exception e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        }
    }//GEN-LAST:event_btnSemiperimetroActionPerformed

    private void btnTipoDeTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoDeTrianguloActionPerformed
        try{
            String strLados = MessageBox.input(this, "Ingresa solo 3 lados de la siguiente manera (1, 2, 3)", "Introduce Lados");
            double[] lados = Triangulo.generateLados(strLados.split(","));
            Triangulo A = new Triangulo(lados);
            MessageBox.show(this, "El tipo de triangulo es  " + Triangulo.typeOf(A),
                    "Tipo de triangulo");
        } catch (Exception e) {
            MessageBox.show(this, e.getMessage(), "Exception");
        }
    }//GEN-LAST:event_btnTipoDeTrianguloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArea;
    private javax.swing.JButton btnDiagonal;
    private javax.swing.JButton btnHipotenusa;
    private javax.swing.JButton btnPerimetro;
    private javax.swing.JButton btnSemiperimetro;
    private javax.swing.JButton btnTipoDeTriangulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtBase;
    // End of variables declaration//GEN-END:variables
}
