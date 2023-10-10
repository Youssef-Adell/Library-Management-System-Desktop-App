package GUI;
import java.awt.Color;
import javax.swing.JOptionPane;
import library.LibraryManagementSystem;
public class Home extends javax.swing.JFrame {
LibraryManagementSystem U= LibraryManagementSystem.getInstance();
    public Home() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        ManageBooks = new javax.swing.JLabel();
        Hi = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        ManageLibrarian = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        ManageStudents = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        UserName = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LogOut = new javax.swing.JButton();
        LibrarianNamee = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(54, 33, 79));

        LibrarianName.setBackground(new java.awt.Color(88, 65, 118));
        LibrarianName.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        LibrarianName.setForeground(new java.awt.Color(255, 255, 255));
        LibrarianName.setText(" Librarians");
        LibrarianName.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                LibrarianNameAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        LibrarianName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LibrarianNameMouseClicked(evt);
            }
        });
        LibrarianName.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                LibrarianNameVetoableChange(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(88, 65, 118));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        ManageBooks.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        ManageBooks.setForeground(new java.awt.Color(255, 255, 255));
        ManageBooks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/issue.png"))); // NOI18N
        ManageBooks.setText("Manage Books");
        ManageBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageBooksMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ManageBooksMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(ManageBooks)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(ManageBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        Hi.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        Hi.setForeground(new java.awt.Color(255, 255, 255));
        Hi.setText("Hi,");

        jPanel5.setBackground(new java.awt.Color(88, 65, 118));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        ManageLibrarian.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        ManageLibrarian.setForeground(new java.awt.Color(255, 255, 255));
        ManageLibrarian.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManageLibrarian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/member-add-on-300x300.png"))); // NOI18N
        ManageLibrarian.setText("Manage Librarans");
        ManageLibrarian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageLibrarianMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ManageLibrarian, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ManageLibrarian, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(88, 65, 118));
        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
        });

        ManageStudents.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        ManageStudents.setForeground(new java.awt.Color(255, 255, 255));
        ManageStudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/male_user_50px.png"))); // NOI18N
        ManageStudents.setText("Manage Students");
        ManageStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageStudentsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel19)
                .addGap(71, 71, 71)
                .addComponent(ManageStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
            .addComponent(ManageStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Admin.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Hi)
                        .addGap(18, 18, 18)
                        .addComponent(LibrarianName, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hi, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LibrarianName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(319, Short.MAX_VALUE))
        );

        UserName.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        UserName.setText("Username:");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/signup-library-icon.png"))); // NOI18N

        LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logout.png"))); // NOI18N
        LogOut.setBorder(null);
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        LibrarianNamee.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        LibrarianNamee.setText("Admin");
        LibrarianNamee.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                LibrarianNameeAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(UserName)
                        .addGap(18, 18, 18)
                        .addComponent(LibrarianNamee)
                        .addGap(75, 75, 75)
                        .addComponent(LogOut))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LibrarianNamee, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
         dispose();
        new BookManag().setVisible(true);
        this.dispose();
        ManageBooks.setForeground(Color.black);
        ManageLibrarian.setForeground(Color.white);
        jLabel4.setForeground(Color.white);
        jPanel4.setBackground(Color.white);
        jPanel5.setBackground(new Color(85, 65, 118));
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        dispose();
        new StudentManag().setVisible(true);
        this.dispose();
        jPanel4.setBackground(new Color(85, 65, 118));
        jPanel5.setBackground(new Color(85, 65, 118));
        jPanel9.setBackground(Color.white);
        ManageBooks.setForeground(Color.white);
        ManageLibrarian.setForeground(Color.white);
        jLabel4.setForeground(Color.white);
        ManageStudents.setForeground(Color.black);
        new BookManag().setVisible(true);
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        dispose();
        new AdminManag().setVisible(true);
        this.dispose();
        ManageBooks.setForeground(Color.white);
        ManageLibrarian.setForeground(Color.black);
        jLabel4.setForeground(Color.white);
        jPanel5.setBackground(Color.white);
        jPanel4.setBackground(new Color(85, 65, 118));
    }//GEN-LAST:event_jPanel5MouseClicked

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        try{
            U.signout();
            dispose();
            SingIn n=new SingIn();
            n.show();
         }catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage()); 
         
         }
        // TODO add your handling code here:
    }//GEN-LAST:event_LogOutActionPerformed

    private void ManageBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBooksMouseClicked
        dispose();
        new BookManag().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageBooksMouseClicked

    private void ManageStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageStudentsMouseClicked
        dispose();
        new StudentManag().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageStudentsMouseClicked

    private void ManageLibrarianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageLibrarianMouseClicked
        dispose();
        new AdminManag().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageLibrarianMouseClicked

    private void ManageBooksMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageBooksMousePressed
       // TODO add your handling code here:
    }//GEN-LAST:event_ManageBooksMousePressed

    private void LibrarianNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LibrarianNameMouseClicked
        
        // TODO add your handling code here:
    }//GEN-LAST:event_LibrarianNameMouseClicked

    private void LibrarianNameVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_LibrarianNameVetoableChange
        
        // TODO add your handling code here:
    }//GEN-LAST:event_LibrarianNameVetoableChange

    private void LibrarianNameAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_LibrarianNameAncestorAdded
        try{
            String Z=U.getLoggedAccount().getName();
            LibrarianName.setText(Z);
         }catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage()); 
         
         }
        // TODO add your handling code here:
    }//GEN-LAST:event_LibrarianNameAncestorAdded

    private void LibrarianNameeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_LibrarianNameeAncestorAdded
        try{
            String Z=U.getLoggedAccount().getUsername();
            LibrarianNamee.setText(Z);
         }catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage()); 
         
         }
        // TODO add your handling code here:
    }//GEN-LAST:event_LibrarianNameeAncestorAdded

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hi;
    public static final javax.swing.JLabel LibrarianName = new javax.swing.JLabel();
    private javax.swing.JLabel LibrarianNamee;
    private javax.swing.JButton LogOut;
    private javax.swing.JLabel ManageBooks;
    private javax.swing.JLabel ManageLibrarian;
    private javax.swing.JLabel ManageStudents;
    private javax.swing.JLabel UserName;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
