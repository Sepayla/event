/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loginform;

import DBconnector.DBconnector;
import DBconnector.Session;
import DBconnector.passwordHasher;
import Registrationform.RegistrationForm;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import organizerdashboard.adminhomepage;
import staffdashboard.staffhomepage;

/**
 *
 * @author PERSONAL
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
    } 
           static String status;
          static String types;
          static String accname;
  public static boolean loginAcc(String username, String password){
        DBconnector connector = new DBconnector();

        try{
            String query = "SELECT * FROM tblassign  WHERE u_username = '" + username + "'";
            ResultSet resultSet = connector.getData(query);
            if(resultSet.next()){

            String hashedPass = resultSet.getString("u_password");
            String rehashedPass = passwordHasher.hashPassword(password);
                    
        if(hashedPass.equals(rehashedPass)){
            status = resultSet.getString("u_status");
            types = resultSet.getString("u_type");
            accname = resultSet.getString("u_fname");
                
            Session sess = Session.getInstance();
            sess.setUid(resultSet.getInt("u_id"));
            sess.setFname(resultSet.getString("u_fname"));
            sess.setLname(resultSet.getString("u_lname"));
            sess.setEmail(resultSet.getString("u_email"));
            sess.setUsername(resultSet.getString("u_username"));
            sess.setType(resultSet.getString("u_type"));
            sess.setStatus(resultSet.getString("u_status"));
                
            return true;
        
        }else{
             return false;
        }
        }else{
            return false;
        }
  
        }catch (SQLException | NoSuchAlgorithmException ex) {
            return false;
        }

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        signUp = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(13, 40, 24));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(90, 390, 63, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(90, 330, 66, 17);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/download-removebg-preview.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(-40, 0, 460, 300);
        jPanel2.add(user);
        user.setBounds(90, 350, 170, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dont have an account? Sign up here.");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4);
        jLabel4.setBounds(210, 670, 206, 15);

        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(180, 450, 80, 23);

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(90, 450, 80, 23);
        jPanel2.add(pass);
        pass.setBounds(90, 410, 170, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/stars.JPG"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(-60, -90, 530, 260);

        signUp.setBackground(new java.awt.Color(255, 255, 255));
        signUp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        signUp.setForeground(new java.awt.Color(255, 255, 255));
        signUp.setText("Sign Up");
        signUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpMouseClicked(evt);
            }
        });
        jPanel2.add(signUp);
        signUp.setBounds(220, 510, 50, 30);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Don't Have an account?");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(80, 510, 140, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                                            

        if(loginAcc(user.getText(), pass.getText())){

            if(!status.equals("Active")){
                JOptionPane.showMessageDialog(null, "In-Active Account, Please Contact the Admin!");

            }else{
                if(types.equals("Admin")){
                    JOptionPane.showMessageDialog(null, "Login Successful!");
                    adminhomepage dash = new adminhomepage();
                    dash.name.setText(""+accname);
                    dash.setVisible(true);
                    this.dispose();

                }else if(types.equals("User")){
                    JOptionPane.showMessageDialog(null, "Login Successful!");
                    staffhomepage userdash = new staffhomepage();
                    userdash.acc_id.setText(""+accname);
                    userdash.setVisible(true);
                    this.dispose();

                }else{
                    JOptionPane.showMessageDialog(null, "No account type found, Please Contact the Admin!");
                }
            }

        }else{
            JOptionPane.showMessageDialog(null, "Invalid Account!");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.out.println("Registration Start!");
        RegistrationForm rgf = new RegistrationForm();
        rgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        super.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void signUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMouseClicked
        RegistrationForm register = new RegistrationForm();
        register.setVisible(true);
    }//GEN-LAST:event_signUpMouseClicked

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel signUp;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
