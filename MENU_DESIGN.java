/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suruchi;

/**
 *
 * @author shrey
 */
public class MENU_DESIGN extends javax.swing.JFrame {

    /**
     * Creates new form MENU_DESIGN
     */
    public MENU_DESIGN() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Win10\\Downloads\\welcome.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(300, 0, 410, 50);

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jLabel1.setText("May i help you");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 50, 270, 60);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/suruchi/chatbot.png"))); // NOI18N
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 20, 140, 120);

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Have fun and enjoy this application!!!");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(150, 120, 800, 50);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Win10\\Downloads\\snake.jpg")); // NOI18N
        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(660, 450, 190, 180);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/suruchi/currency converter.jpg"))); // NOI18N
        jButton3.setText("jButton2");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(140, 170, 210, 200);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/suruchi/notepad.jpg"))); // NOI18N
        jButton4.setText("jButton2");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(720, 170, 210, 200);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/suruchi/calculator.jpg"))); // NOI18N
        jButton5.setText("jButton2");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(430, 170, 210, 200);

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Win10\\Downloads\\tictac.jpg")); // NOI18N
        jButton6.setText("jButton2");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(290, 440, 230, 200);

        jLabel4.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel4.setText("snake the conquer");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(620, 650, 290, 30);

        jLabel5.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel5.setText("Currency convertor");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(120, 390, 290, 50);

        jLabel6.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel6.setText("calculator");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(460, 390, 170, 60);

        jLabel7.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel7.setText("notepad");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(760, 390, 170, 50);

        jLabel8.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel8.setText("tic-tac-toe");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(320, 650, 290, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Win10\\Downloads\\bg.png")); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(1, -40, 1000, 810);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jButton7.setText("GO BACK TO SIGNIN PAGE");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 5));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(270, 780, 470, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-3, -3, 1000, 850);

        setSize(new java.awt.Dimension(1018, 890));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 chatbot1 n=new chatbot1();
n.setVisible(true);
this.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
Loading_tictactoe1 Viewbooks=  new Loading_tictactoe1 ();
      Viewbooks.setUpLoading();

     Viewbooks.setVisible(true);
   
       this.dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
Notepad n=new Notepad();
n.setVisible(true);
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     snake1 n=new snake1();
n.setVisible(true);
this.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
   calculator n=new calculator();
n.setVisible(true);
this.dispose();     // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
MyCurrencyConverter n=new MyCurrencyConverter();
n.setVisible(true);
this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    signin n=new signin();
n.setVisible(true);
this.dispose();     // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(MENU_DESIGN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU_DESIGN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU_DESIGN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU_DESIGN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU_DESIGN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}