/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registrationform;

import DBconnector.DBconnector;
import DBconnector.passwordHasher;
import Loginform.LoginForm;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PERSONAL
 */
public class RegistrationForm extends javax.swing.JFrame {

    /**
     * Creates new form RegistrationForm
     */
    public RegistrationForm() {
        initComponents();
    }
             
     public static String emails, usernames;
    
    public boolean duplicateChecker(){
    
    DBconnector connector = new DBconnector();
        
    try{
        String query = "SELECT * FROM tblassign  WHERE u_username = '" + uname.getText() + "' OR u_email = '" + email.getText() + "'";
            ResultSet resultSet = connector.getData(query);
            
            if(resultSet.next()){
                emails = resultSet.getString("u_email");
                
                if(emails.equals(email.getText())){
                    JOptionPane.showMessageDialog(null, "Email is already used");
                    email.setText("");
                }
                
                usernames = resultSet.getString("u_username");
                
                if(usernames.equals(uname.getText())){
                    JOptionPane.showMessageDialog(null, "Username is already used");
                    uname.setText("");
                }
                
                return true;
                
            }else{
                return false;
            }
        
    }catch(SQLException ex){
            System.out.println(""+ex);
            return false;
  }
    
 }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        stat = new javax.swing.JComboBox<>();
        type = new javax.swing.JComboBox<>();
        password = new javax.swing.JPasswordField();
        uname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(13, 40, 24));
        jPanel2.setLayout(null);

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(240, 450, 73, 23);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(150, 450, 80, 23);

        stat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending", " " }));
        jPanel2.add(stat);
        stat.setBounds(240, 390, 100, 20);

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));
        jPanel2.add(type);
        type.setBounds(240, 360, 100, 20);
        jPanel2.add(password);
        password.setBounds(210, 330, 130, 20);
        jPanel2.add(uname);
        uname.setBounds(210, 300, 130, 20);
        jPanel2.add(email);
        email.setBounds(210, 270, 130, 20);
        jPanel2.add(lname);
        lname.setBounds(210, 240, 130, 20);
        jPanel2.add(fname);
        fname.setBounds(210, 210, 130, 20);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter First Name:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(90, 210, 111, 18);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter Last Name: ");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(90, 240, 113, 18);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter Email: ");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(90, 270, 81, 18);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Enter Username:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(90, 300, 106, 18);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Enter Password: ");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(90, 330, 107, 18);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Choose Account Type: ");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(90, 360, 147, 18);

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Account Status: ");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(90, 390, 106, 18);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/download-removebg-preview.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(-40, 10, 460, 300);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/stars.JPG"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(-70, -40, 610, 220);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/stars.JPG"))); // NOI18N
        jPanel2.add(jLabel11);
        jLabel11.setBounds(-40, 570, 610, 220);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if(fname.getText().isEmpty() || lname.getText().isEmpty() || email.getText().isEmpty() || uname.getText().isEmpty() || password.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All field are required!");

        }else if(password.getText().length()< 8){
            JOptionPane.showMessageDialog(null, "Password must be 8 above!");
            password.setText("");

        }else if(duplicateChecker()){
            System.out.println("Duplicate Exist");

        }else{

            DBconnector connector = new DBconnector();

            try{
                String pass = passwordHasher.hashPassword(password.getText());

                if(connector.insertData("INSERT INTO tblassign(u_fname, u_lname, u_email, u_username, u_password, u_type, u_status)"
                    +"VALUES ('" + fname.getText() + "','" + lname.getText() + "','" + email.getText() + "','" + uname.getText() + "','"
                    + pass + "','" + type.getSelectedItem() + "','Pending')")){

                JOptionPane.showMessageDialog(null, "Registered Successfully");
                LoginForm login = new LoginForm();
                login.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Connection Error!");
            }

        }catch(NoSuchAlgorithmException ex){
            System.out.println(""+ex);
        }
    }                          
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       LoginForm login = new LoginForm();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lname;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> stat;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
