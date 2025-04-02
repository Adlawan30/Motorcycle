/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.session;
import crud.changepassword;
import crud.editaccount;
import panel.login;

/**
 *
 * @author vienz
 */
public class account extends javax.swing.JFrame {

    /**
     * Creates new form account
     */
    public account() {
        initComponents();
        accountInformation();
        
    }
    public void accountInformation() {

        session sess = session.getInstance();

        String fullName = session.getFirstName() + " " + session.getLastName();

        name.setText("Name: " + fullName);
        

        email.setText("Email: " +session.getEmail());
        
        
        cnum.setText("Contact Number: " +session.getContact());
        
        role.setText("Role: " + session.getAcc_type());
     

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mbg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        profilepic = new javax.swing.JLabel();
        cnum = new javax.swing.JLabel();
        role = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        changepassword = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mbg.setBackground(new java.awt.Color(204, 255, 255));
        mbg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(153, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profilepic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        jPanel5.add(profilepic, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        cnum.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cnum.setText("Contactnum:");
        jPanel5.add(cnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 200, 20));

        role.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        role.setText("Role:");
        jPanel5.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 200, 20));

        email.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        email.setText("Email:");
        jPanel5.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 200, 20));

        name.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        name.setText("Name:");
        jPanel5.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 200, 20));

        changepassword.setText("Change Password");
        changepassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepasswordActionPerformed(evt);
            }
        });
        jPanel5.add(changepassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, 20));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 510));

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/motorbike.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 260, 180));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Motorcycle System Management ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 350, 80));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 370, 510));

        mbg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 700, 510));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel5.setText("PROFILE");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        mbg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 70, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout 2.png"))); // NOI18N
        jLabel8.setText("Logout");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jLabel8FocusLost(evt);
            }
        });
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        mbg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel9.setText("DASHBOARD");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        mbg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 110, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel10.setText("ACCOUNT");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        mbg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 90, 30));

        getContentPane().add(mbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        account acc = new account();

        acc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel8FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8FocusLost

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        login log = new login();

        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        accountmanager man = new accountmanager();

        man.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        adminDB db = new adminDB();

        db.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void changepasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepasswordActionPerformed
        changepassword acc = new changepassword(
        session.getU_id(), 
        session.getFirstName(), 
        session.getLastName(), 
        session.getEmail(), 
        session.getContact()
    );
        acc.setVisible(true);

        
        
    }//GEN-LAST:event_changepasswordActionPerformed

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
            java.util.logging.Logger.getLogger(account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changepassword;
    private javax.swing.JLabel cnum;
    private javax.swing.JLabel email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel mbg;
    private javax.swing.JLabel name;
    private javax.swing.JLabel profilepic;
    private javax.swing.JLabel role;
    // End of variables declaration//GEN-END:variables
}
