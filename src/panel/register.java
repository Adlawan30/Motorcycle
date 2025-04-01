/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panel;

import config.connectDB;
import java.awt.Color;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import config.hasher;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author vienz
 */
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
        initComponents();
    }
    
    private boolean emailExists(String email) {

        connectDB con = new connectDB();

        try {
            String query = "SELECT * FROM tbl_user WHERE u_email = ?";
            PreparedStatement pstmt = con.getConnection().prepareStatement(query);
            pstmt.setString(1, email.trim());
            ResultSet resultSet = pstmt.executeQuery();

            if (resultSet.next()) {

                return true;
            }

        } catch (SQLException ex) {
            System.out.println("" + ex);

        }

        return false;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegisterError = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        RegisterSuccess = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        firstname = new javax.swing.JTextField();
        logintext = new javax.swing.JLabel();
        Signup = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        requiredfname = new javax.swing.JLabel();
        lastnametext = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        requiredlname = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        emailtext = new javax.swing.JLabel();
        requiredemail = new javax.swing.JLabel();
        contactnumber = new javax.swing.JTextField();
        cnumbertext = new javax.swing.JLabel();
        requiredcnumber = new javax.swing.JLabel();
        passwordtext = new javax.swing.JLabel();
        requiredpassword = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        backlogin = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 100, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Sign-up failed! Please complete all fields correctly.        ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 490, 40));

        javax.swing.GroupLayout RegisterErrorLayout = new javax.swing.GroupLayout(RegisterError.getContentPane());
        RegisterError.getContentPane().setLayout(RegisterErrorLayout);
        RegisterErrorLayout.setHorizontalGroup(
            RegisterErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        RegisterErrorLayout.setVerticalGroup(
            RegisterErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 100, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Sign-up successful!");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 180, 40));

        javax.swing.GroupLayout RegisterSuccessLayout = new javax.swing.GroupLayout(RegisterSuccess.getContentPane());
        RegisterSuccess.getContentPane().setLayout(RegisterSuccessLayout);
        RegisterSuccessLayout.setHorizontalGroup(
            RegisterSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        RegisterSuccessLayout.setVerticalGroup(
            RegisterSuccessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        firstname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstnameFocusLost(evt);
            }
        });
        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        jPanel2.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 69, 240, 30));

        logintext.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        logintext.setText("Signup");
        jPanel2.add(logintext, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 11, -1, -1));

        Signup.setBackground(new java.awt.Color(204, 255, 255));
        Signup.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Signup.setText("Signup");
        Signup.setBorderPainted(false);
        Signup.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SignupFocusLost(evt);
            }
        });
        Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupActionPerformed(evt);
            }
        });
        jPanel2.add(Signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 240, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("First Name");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 49, -1, -1));

        requiredfname.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jPanel2.add(requiredfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 105, 240, 10));

        lastnametext.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lastnametext.setText("Last Name");
        jPanel2.add(lastnametext, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 121, -1, -1));

        lastname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastnameFocusLost(evt);
            }
        });
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel2.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 141, 240, 30));

        requiredlname.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jPanel2.add(requiredlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 177, 240, 10));

        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 213, 240, 30));

        emailtext.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        emailtext.setText("Email");
        jPanel2.add(emailtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 193, 240, -1));

        requiredemail.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jPanel2.add(requiredemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 249, 240, 10));

        contactnumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contactnumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                contactnumberFocusLost(evt);
            }
        });
        contactnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactnumberActionPerformed(evt);
            }
        });
        jPanel2.add(contactnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 285, 240, 30));

        cnumbertext.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        cnumbertext.setText("Contact Number");
        jPanel2.add(cnumbertext, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 265, -1, -1));

        requiredcnumber.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jPanel2.add(requiredcnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 321, 240, 10));

        passwordtext.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        passwordtext.setText("Password");
        jPanel2.add(passwordtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 337, -1, -1));

        requiredpassword.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jPanel2.add(requiredpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 393, 240, 10));

        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 357, 240, 30));

        backlogin.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        backlogin.setText("Already have an account click here to go back");
        backlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backloginMouseClicked(evt);
            }
        });
        jPanel2.add(backlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 11, 340, 460));

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 320, 460));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupActionPerformed



if (signUpValidation()) {
    connectDB con = new connectDB();
    hasher hasher = new hasher();

    // Hash the password before storing it
    String hashedPassword = hasher.hashPassword(password.getText());

    con.insertData("INSERT INTO tbl_user (u_firstname, u_lastname, u_email, u_contactnumber, u_hashpw, u_type, u_status) " +
            "VALUES ('" + firstname.getText() + "','" + lastname.getText() + "','" + email.getText() + "'," +
            "'" + contactnumber.getText() + "','" + hashedPassword + "', 'Employee', 'Pending')");

    JOptionPane.showMessageDialog(this, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);

    login lg = new login();
    lg.setVisible(true);
    this.dispose();
} else {
    JOptionPane.showMessageDialog(this, "Sign up error. Please fill all required fields.", "Warning", JOptionPane.WARNING_MESSAGE);
}






    }//GEN-LAST:event_SignupActionPerformed

    private void firstnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstnameFocusLost
Font smallFont = new Font("Arial", Font.PLAIN, 10);
firstname.setFont(smallFont); 
requiredfname.setFont(smallFont); 

String user = firstname.getText();

if (user.isEmpty()) {
    firstname.setForeground(Color.RED);
    requiredfname.setText("First Name is required");
    requiredfname.setForeground(Color.RED);
} else {
    firstname.setForeground(Color.BLACK);
    requiredfname.setText("");
}

firstname.repaint();
    }//GEN-LAST:event_firstnameFocusLost

    private void lastnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastnameFocusLost
        Font smallFont = new Font("Arial", Font.PLAIN, 10);
lastname.setFont(smallFont); 
requiredlname.setFont(smallFont); 

String user = lastname.getText();

if (user.isEmpty()) {
    lastname.setForeground(Color.RED);
    requiredlname.setText("Last Name is required");
    requiredlname.setForeground(Color.RED);
} else {
    lastname.setForeground(Color.BLACK);
    requiredlname.setText("");
}

lastname.repaint();
    }//GEN-LAST:event_lastnameFocusLost

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        Font smallFont = new Font("Arial", Font.PLAIN, 10);
email.setFont(smallFont); 
requiredemail.setFont(smallFont); 

String email1 = email.getText();
String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

if (email1.isEmpty()) {
    email.setForeground(Color.RED);
    requiredemail.setText("Email is required");
    requiredemail.setForeground(Color.RED);
} else if (!email1.matches(emailRegex)) {
    email.setForeground(Color.RED);
    requiredemail.setText("Email is invalid");
    requiredemail.setForeground(Color.RED);
} else if (emailExists(email1)) {
    email.setForeground(Color.RED);
    requiredemail.setText("Email already exists");
    requiredemail.setForeground(Color.RED);
} else {
    email.setForeground(Color.BLACK);
    requiredemail.setText("");
}

email.repaint();

    }//GEN-LAST:event_emailFocusLost

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        
    }//GEN-LAST:event_emailActionPerformed

    private void contactnumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactnumberFocusLost
        Font smallFont = new Font("Arial", Font.PLAIN, 10);
contactnumber.setFont(smallFont); 
requiredcnumber.setFont(smallFont); 

String user = contactnumber.getText();

if (user.isEmpty()) {
    contactnumber.setForeground(Color.RED);
    requiredcnumber.setText("Contact Number is required");
    requiredcnumber.setForeground(Color.RED);
} else if (!user.matches("\\d{11}")) { 
    contactnumber.setForeground(Color.RED);
    requiredcnumber.setText("Contact Number must be exactly 11 digits");
    requiredcnumber.setForeground(Color.RED);
} else {
    contactnumber.setForeground(Color.BLACK);
    requiredcnumber.setText("");
}

contactnumber.repaint();

    }//GEN-LAST:event_contactnumberFocusLost

    private void contactnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactnumberActionPerformed

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        Font smallFont = new Font("Arial", Font.PLAIN, 10);
password.setFont(smallFont); 
requiredpassword.setFont(smallFont); 

String password1 = password.getText();

if (password1.isEmpty()) {
    password.setForeground(Color.RED);
    requiredpassword.setText("Password is required");
    requiredpassword.setForeground(Color.RED);
} else if (password1.length() < 8) {
    password.setForeground(Color.RED);
    requiredpassword.setText("Password too short. Must be 8 characters or more");
    requiredpassword.setForeground(Color.RED);
} else {
    password.setForeground(Color.BLACK);
    requiredpassword.setText("");
}

password.repaint();
    }//GEN-LAST:event_passwordFocusLost

      
    
    
    private void backloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backloginMouseClicked
        login log = new login();

        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backloginMouseClicked

    private void SignupFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SignupFocusLost
        
    }//GEN-LAST:event_SignupFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        RegisterError.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    
    private boolean signUpValidation() {
        boolean valid = true;
        
 //First name Validation       
 String user = firstname.getText();

if (user.isEmpty()) {
    firstname.setForeground(Color.RED);
    requiredfname.setText("First Name is required");
    requiredfname.setForeground(Color.RED);
    valid = false;
} else {
    firstname.setForeground(Color.BLACK);
    requiredfname.setText("");
}

firstname.repaint();


// Last name Validation

String last = lastname.getText();

if (last.isEmpty()) {
    lastname.setForeground(Color.RED);
    requiredlname.setText("Last Name is required");
    requiredlname.setForeground(Color.RED);
    valid = false;
} else {
    lastname.setForeground(Color.BLACK);
    requiredlname.setText("");
}

lastname.repaint();

// Email Validation

String email1 = email.getText();
String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

if (email1.isEmpty()) {
    email.setForeground(Color.RED);
    requiredemail.setText("Email is required");
    requiredemail.setForeground(Color.RED);
    valid = false;
} else if (!email1.matches(emailRegex)) {
    email.setForeground(Color.RED);
    requiredemail.setText("Email is invalid");
    requiredemail.setForeground(Color.RED);
    valid = false;
} else if (emailExists(email1)) {
    email.setForeground(Color.RED);
    requiredemail.setText("Email already exists");
    requiredemail.setForeground(Color.RED);
    valid = false;
} else {
    email.setForeground(Color.BLACK);
    requiredemail.setText("");
}

email.repaint();

// Contact Number Validation

String con = contactnumber.getText();

if (con.isEmpty()) {
    contactnumber.setForeground(Color.RED);
    requiredcnumber.setText("Contact Number is required");
    requiredcnumber.setForeground(Color.RED);
    valid = false;
} else if (!con.matches("\\d{11}")) { 
    contactnumber.setForeground(Color.RED);
    requiredcnumber.setText("Contact Number must be exactly 11 digits");
    requiredcnumber.setForeground(Color.RED);
    valid = false;
} else {
    contactnumber.setForeground(Color.BLACK);
    requiredcnumber.setText("");
}

contactnumber.repaint();




// Password Validation

String password1 = password.getText();

        if (password1.isEmpty()) {
            password.setForeground(Color.RED);
            requiredpassword.setText("Password is required");
            requiredpassword.setForeground(Color.RED);
            valid = false;
        } else if (password1.length() < 8) {

            password.setForeground(Color.RED);
            requiredpassword.setText("Password too short. Must be 8 characters or more");
            requiredpassword.setForeground(Color.RED);
            valid = false;
        } else {
            password.setForeground(Color.BLACK);
            requiredpassword.setText("Password good");
            requiredpassword.setForeground(Color.GREEN);
        }
        password.repaint();
 
        return valid;
    
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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog RegisterError;
    private javax.swing.JDialog RegisterSuccess;
    private javax.swing.JButton Signup;
    private javax.swing.JLabel backlogin;
    private javax.swing.JLabel cnumbertext;
    private javax.swing.JTextField contactnumber;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailtext;
    private javax.swing.JTextField firstname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField lastname;
    private javax.swing.JLabel lastnametext;
    private javax.swing.JLabel logintext;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordtext;
    private javax.swing.JLabel requiredcnumber;
    private javax.swing.JLabel requiredemail;
    private javax.swing.JLabel requiredfname;
    private javax.swing.JLabel requiredlname;
    private javax.swing.JLabel requiredpassword;
    // End of variables declaration//GEN-END:variables
}
