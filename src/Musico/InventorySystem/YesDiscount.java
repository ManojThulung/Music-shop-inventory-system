/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Musico.InventorySystem;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class YesDiscount extends javax.swing.JFrame {
    //instance variable
    //private = access restricted
    private String discount;
    /**
     * Creates new form yesdiscount
     */
    public YesDiscount() {
        initComponents();
        setIconImage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Musico Inventory System");
        setLocation(new java.awt.Point(1000, 1000));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Enter Discount(%)");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        txtDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiscountActionPerformed(evt);
            }
        });
        txtDiscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiscountKeyTyped(evt);
            }
        });
        getContentPane().add(txtDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 150, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Musico/InventorySystem/Close.png"))); // NOI18N
        jButton1.setText("CLOSE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 110, 30));

        btnadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Musico/InventorySystem/save-icon--1.png"))); // NOI18N
        btnadd.setText("ADD");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 110, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Musico/InventorySystem/textbackground.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 230));

        setSize(new java.awt.Dimension(346, 276));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiscountActionPerformed

    }//GEN-LAST:event_txtDiscountActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false); //close the inventory table Jframe.
    }//GEN-LAST:event_jButton1ActionPerformed
  
    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // This method gets appropriate discount percent data from the usres.
    try{
        String discountValue = txtDiscount.getText().trim();
        int discountPercent = Integer.parseInt(discountValue);
     
        if (discountPercent > 0 && discountPercent < 100){
            setVisible(false);
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "The discount percent should be less than 100%", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
   catch(NumberFormatException e){
JOptionPane.showMessageDialog(this,"Please Fill the form","ERROR",JOptionPane.ERROR_MESSAGE);
}        
    }//GEN-LAST:event_btnaddActionPerformed

    private void txtDiscountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiscountKeyTyped
        // This method allows the characters only from 0 to 9 to enter in the text field.
        char discNo = evt.getKeyChar();
        if(!(discNo >= '0' && discNo <= '9' )){
            // The character that does not lie between the 0 to 9 ara consumed here so it doesn't get to the process.
            evt.consume(); 
        }
    }//GEN-LAST:event_txtDiscountKeyTyped

    public void setDiscount() {
        //This method get the input discount data from the users and pass to the addnewinstrument class and further Musicoinformationlist class.
        String discountValue = txtDiscount.getText().trim(); //Get discount input from txtDiscount jtextfield. .trim() remove leading and trailing spaces.
        if (discount != null){
            this.discount = discountValue + "%"; 
        }
        else{
            this.discount = "0%";
        }
    }
    
    public String disCount(){
        return discount;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(YesDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YesDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YesDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YesDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YesDiscount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextField txtDiscount;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("titleicon.png")));
    }
}
