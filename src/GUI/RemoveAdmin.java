/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import library.LibrarianAccount;
import library.LibraryManagementSystem;

/**
 *
 * @author Abdo Nagy
 */
public class RemoveAdmin extends javax.swing.JFrame {
     ArrayList<LibrarianAccount> List= new ArrayList<LibrarianAccount>();
     LibraryManagementSystem E= LibraryManagementSystem.getInstance();
    /**
     * Creates new form RemoveAdmin
     */
    public RemoveAdmin() {
        initComponents();
        try{
           List= E.getAllAccoutns();
           for(int i=0;i<List.size();i++){
            LibrariansNames.addItem(List.get(i).getName());}
        }catch(Exception m){
            JOptionPane.showMessageDialog(this,m.getMessage());
        }
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
        Name = new javax.swing.JLabel();
        RemoveLibInterface = new javax.swing.JLabel();
        RemoveLibrarian = new javax.swing.JButton();
        LibrariansNames = new javax.swing.JComboBox<>();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Name.setFont(new java.awt.Font("Calibri", 1, 25)); // NOI18N
        Name.setText("Name");

        RemoveLibInterface.setFont(new java.awt.Font("Calibri", 1, 25)); // NOI18N
        RemoveLibInterface.setText("            Remove Librarians ");

        RemoveLibrarian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-remove-48.png"))); // NOI18N
        RemoveLibrarian.setText("Remove");
        RemoveLibrarian.setBorder(null);
        RemoveLibrarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveLibrarianActionPerformed(evt);
            }
        });

        LibrariansNames.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                LibrariansNamesComponentShown(evt);
            }
        });
        LibrariansNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibrariansNamesActionPerformed(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-close-window-48.png"))); // NOI18N
        Exit.setBorder(null);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Name)
                            .addComponent(LibrariansNames, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(RemoveLibInterface)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(Exit)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(RemoveLibrarian, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(RemoveLibInterface, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Exit))
                .addGap(75, 75, 75)
                .addComponent(Name)
                .addGap(18, 18, 18)
                .addComponent(LibrariansNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(RemoveLibrarian)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        dispose();
        AdminManag D=new AdminManag();
        D.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

    private void LibrariansNamesComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_LibrariansNamesComponentShown
         try{
           List= E.getAllAccoutns();
           for(int i=0;i<List.size();i++){
               JComboBox<String> LibrariansNames1 = LibrariansNames;
               LibrariansNames.addItem(List.get(i).getName());
           }
        }catch(Exception s){
            JOptionPane.showMessageDialog(this,s.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_LibrariansNamesComponentShown

    private void LibrariansNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibrariansNamesActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_LibrariansNamesActionPerformed

    private void RemoveLibrarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveLibrarianActionPerformed
        try{
            int[]arr= new int[20];
            for(int i=0;i<List.size();i++){
                arr[i]= E.getAllAccoutns().get(i).getId();}
            int SelectedValue=LibrariansNames.getSelectedIndex();
            int z=arr[SelectedValue];
            E.removeAccount(z);
            dispose();
            AdminManag S=new AdminManag();
            S.show();
            
        }catch(Exception s){
            JOptionPane.showMessageDialog(this,s.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoveLibrarianActionPerformed

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
            java.util.logging.Logger.getLogger(RemoveAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JComboBox<String> LibrariansNames;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel RemoveLibInterface;
    private javax.swing.JButton RemoveLibrarian;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
