
package staffdashboard;

import DBconnector.DBconnector;
import DBconnector.passwordHasher;
import editevent.*;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import organizerdashboard.addstaff;


public class addevent extends javax.swing.JFrame {


    public addevent() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        eventName = new javax.swing.JTextField();
        venue = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        time = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        eventType = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        amounts = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(13, 40, 24));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(148, 137, 121), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ADD EVENT");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 200, 30));

        jButton1.setText("ADD");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 100, 30));
        jPanel2.add(eventName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 190, 30));
        jPanel2.add(venue, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 190, 30));
        jPanel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 190, 30));
        jPanel2.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 190, 30));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Time");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icons8-back-arrow-50.png"))); // NOI18N
        jLabel7.setText("Back");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 50));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Venue");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 30));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Date");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 30));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Event Type:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 30));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Event Name");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 30));

        eventType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conference", "Kids Party", "Company Party", "Seminar", "Ceremony", "Exhibitions", "Festival", "Sports Event", "Performance" }));
        eventType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventTypeActionPerformed(evt);
            }
        });
        jPanel2.add(eventType, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 190, 30));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, 240, -1, -1));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -190, -1, -1));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Amount:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, 30));

        amounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountsActionPerformed(evt);
            }
        });
        jPanel2.add(amounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 190, 30));

        jPanel3.setLayout(null);

        jLabel3.setText("---------------------------------------------------");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(0, 180, 204, 14);

        jLabel15.setText("Event Type:");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(20, 150, 70, 14);

        jLabel16.setText("Event Name:");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(20, 70, 70, 14);

        jLabel17.setText("Time:");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(20, 130, 70, 14);

        jLabel18.setText("Total Amount");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(10, 200, 70, 14);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/icons8-peso-symbol-50.png"))); // NOI18N
        jLabel19.setText("100,000.00");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(0, 230, 150, 40);

        jLabel13.setText("Event Organize");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(60, 20, 80, 14);

        jLabel20.setText("Venue:");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(20, 90, 70, 14);

        jLabel21.setText("Date:");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(20, 110, 70, 14);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 200, 310));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/stars.JPG"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 290, 580, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 550, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eventTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eventTypeActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        staffhomepage home = new staffhomepage();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DBconnector dbc = new DBconnector();
        
        if (eventName.getText().isEmpty() || venue.getText().isEmpty() || date.getText().isEmpty() || time.getText().isEmpty() || amounts.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        } else {
            
            if (dbc.insertData("INSERT INTO event_list (Event_Name, Venue, Date, Time, Event_Type, Amount, status)"
                    + "VALUES('" + eventName.getText() + "','" + venue.getText() + "','" + date.getText() + "','" + time.getText() + "','" + eventType.getSelectedItem() + "','"+ amounts.getText() +"','Available')"))
            {
                JOptionPane.showMessageDialog(null, "Inserted Successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "Connection Error!");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void amountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountsActionPerformed

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
            java.util.logging.Logger.getLogger(addevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addevent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addevent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amounts;
    private javax.swing.JTextField date;
    private javax.swing.JTextField eventName;
    private javax.swing.JComboBox<String> eventType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField time;
    private javax.swing.JTextField venue;
    // End of variables declaration//GEN-END:variables
}
