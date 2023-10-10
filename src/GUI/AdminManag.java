package GUI;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import library.LibrarianAccount;
import library.LibraryManagementSystem;
public class AdminManag extends javax.swing.JFrame {
    public AdminManag() {
        initComponents();
        addRowToLibrariansTable();
    }
   public ArrayList ListAdmins(){
        ArrayList<LibrarianAccount> List= new ArrayList<LibrarianAccount>();
        LibraryManagementSystem E= LibraryManagementSystem.getInstance();
        try{
           List= E.getAllAccoutns();
        }catch(Exception m){
            JOptionPane.showMessageDialog(this,m.getMessage());
        }
        
        return List;
    }
    public void addRowToLibrariansTable(){
        DefaultTableModel model=(DefaultTableModel) LibrariansTable.getModel();
        ArrayList<LibrarianAccount> List= ListAdmins();
        Object rowData[]= new Object[3];
        int D= List.size();
        for(int i=0;i<D;i++){
            rowData[0]=List.get(i).getId();
            rowData[1]=List.get(i).getName();
            rowData[2]=List.get(i).getUsername();
            model.addRow(rowData);
        }                
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LibrariansInterface = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LibrariansTable = new javax.swing.JTable();
        BackToMenu = new javax.swing.JButton();
        AddLibrarian = new javax.swing.JButton();
        RemoveLibrarian = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 135, 205));

        LibrariansInterface.setFont(new java.awt.Font("Calibri", 1, 60)); // NOI18N
        LibrariansInterface.setForeground(new java.awt.Color(255, 255, 255));
        LibrariansInterface.setText("Librarians Managment");

        LibrariansTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LibrariansTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Name", "Username"
            }
        ));
        jScrollPane1.setViewportView(LibrariansTable);

        BackToMenu.setBackground(new java.awt.Color(204, 255, 204));
        BackToMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-back-arrow-50.png"))); // NOI18N
        BackToMenu.setText("Back");
        BackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuActionPerformed(evt);
            }
        });

        AddLibrarian.setBackground(new java.awt.Color(204, 255, 204));
        AddLibrarian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-remove-50.png"))); // NOI18N
        AddLibrarian.setText("Remove");
        AddLibrarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddLibrarianActionPerformed(evt);
            }
        });

        RemoveLibrarian.setBackground(new java.awt.Color(204, 255, 204));
        RemoveLibrarian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-student-registration-50.png"))); // NOI18N
        RemoveLibrarian.setText("Add");
        RemoveLibrarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveLibrarianActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 173, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LibrariansInterface)
                                .addGap(173, 173, 173))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BackToMenu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AddLibrarian)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RemoveLibrarian)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(LibrariansInterface)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackToMenu)
                    .addComponent(AddLibrarian)
                    .addComponent(RemoveLibrarian))
                .addGap(21, 21, 21))
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
    }// </editor-fold>//GEN-END:initComponents

    private void RemoveLibrarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveLibrarianActionPerformed
        dispose();
        AddAdmin Aad=new AddAdmin();
        Aad.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoveLibrarianActionPerformed

    private void AddLibrarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddLibrarianActionPerformed
        dispose();
        RemoveAdmin Rad=new RemoveAdmin();
        Rad.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_AddLibrarianActionPerformed

    private void BackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuActionPerformed
        dispose();
        Home B=new Home();
        B.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_BackToMenuActionPerformed

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
            java.util.logging.Logger.getLogger(AdminManag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminManag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminManag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminManag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminManag().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddLibrarian;
    private javax.swing.JButton BackToMenu;
    private javax.swing.JLabel LibrariansInterface;
    private javax.swing.JTable LibrariansTable;
    private javax.swing.JButton RemoveLibrarian;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
