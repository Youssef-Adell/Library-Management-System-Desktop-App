package GUI;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import library.Book;
import library.LibraryManagementSystem;
public class BookManag extends javax.swing.JFrame {
    public BookManag() {
        initComponents();
        addRowToBooksTable();
    }
   public ArrayList ListBooks(){
        ArrayList<Book> List= new ArrayList<Book>();
        LibraryManagementSystem F= LibraryManagementSystem.getInstance();
        try{
           List= F.getAllBooks();
        }catch(Exception n){
            JOptionPane.showMessageDialog(this,n.getMessage());
        }
        
        return List;
    }
    public void addRowToBooksTable(){
        DefaultTableModel model=(DefaultTableModel) BooksTable.getModel();
        ArrayList<Book> List= ListBooks();
        Object rowData[]= new Object[6];
        int b= List.size();
        for(int i=0;i<b;i++){
            rowData[0]=List.get(i).getId();
            rowData[1]=List.get(i).getISBN();
            rowData[2]=List.get(i).getTitle();
            rowData[3]=List.get(i).getAuthor();
            rowData[4]=List.get(i).getAddedDate();
            rowData[5]=List.get(i).getStatus();
            model.addRow(rowData);
        }                
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BooksInteface = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BooksTable = new javax.swing.JTable();
        AddBook = new javax.swing.JButton();
        ReturnBook = new javax.swing.JButton();
        BorrowBook = new javax.swing.JButton();
        BackToMenu = new javax.swing.JButton();
        RemoveBook = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));

        BooksInteface.setFont(new java.awt.Font("Calibri", 1, 60)); // NOI18N
        BooksInteface.setForeground(new java.awt.Color(255, 255, 255));
        BooksInteface.setText("Books Managment");

        BooksTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BooksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ISBN", "Title", "Author", "Added Date", "Git Status"
            }
        ));
        jScrollPane1.setViewportView(BooksTable);

        AddBook.setBackground(new java.awt.Color(204, 255, 204));
        AddBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-add-book-50.png"))); // NOI18N
        AddBook.setText("Add");
        AddBook.setBorder(null);
        AddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBookActionPerformed(evt);
            }
        });

        ReturnBook.setBackground(new java.awt.Color(204, 255, 204));
        ReturnBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/return-book-1-560407.png"))); // NOI18N
        ReturnBook.setText("Return ");
        ReturnBook.setBorder(null);
        ReturnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnBookActionPerformed(evt);
            }
        });

        BorrowBook.setBackground(new java.awt.Color(204, 255, 204));
        BorrowBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-borrow-book-50.png"))); // NOI18N
        BorrowBook.setText("Borrow");
        BorrowBook.setBorder(null);
        BorrowBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrowBookActionPerformed(evt);
            }
        });

        BackToMenu.setBackground(new java.awt.Color(204, 255, 204));
        BackToMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-back-arrow-50.png"))); // NOI18N
        BackToMenu.setText("Back");
        BackToMenu.setBorder(null);
        BackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuActionPerformed(evt);
            }
        });

        RemoveBook.setBackground(new java.awt.Color(204, 255, 204));
        RemoveBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-remove-50.png"))); // NOI18N
        RemoveBook.setText("Remove");
        RemoveBook.setBorder(null);
        RemoveBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 196, Short.MAX_VALUE)
                        .addComponent(BackToMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ReturnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BorrowBook, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RemoveBook, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BooksInteface)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(BooksInteface)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBook)
                    .addComponent(RemoveBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BorrowBook)
                    .addComponent(ReturnBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BackToMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBookActionPerformed
        dispose();
        AddBook Abo=new AddBook();
        Abo.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBookActionPerformed

    private void BackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuActionPerformed
        dispose();
        Home C=new Home();
        C.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_BackToMenuActionPerformed

    private void RemoveBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveBookActionPerformed
        dispose();
        RemoveBook Rbo=new RemoveBook();
        Rbo.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoveBookActionPerformed

    private void BorrowBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrowBookActionPerformed
        dispose();
        Borrow_Book Bbo=new Borrow_Book();
        Bbo.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_BorrowBookActionPerformed

    private void ReturnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnBookActionPerformed
        dispose();
        Return_Book Rebo=new Return_Book();
        Rebo.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_ReturnBookActionPerformed

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
            java.util.logging.Logger.getLogger(BookManag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookManag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookManag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookManag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookManag().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBook;
    private javax.swing.JButton BackToMenu;
    private javax.swing.JLabel BooksInteface;
    private javax.swing.JTable BooksTable;
    private javax.swing.JButton BorrowBook;
    private javax.swing.JButton RemoveBook;
    private javax.swing.JButton ReturnBook;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
