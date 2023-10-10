package GUI;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import library.LibraryManagementSystem;
import library.Student;
public class StudentManag extends javax.swing.JFrame {
    public StudentManag() {
        initComponents();
        addRowToStudentsTable();
    }
    public ArrayList ListStudents(){
        ArrayList<Student> List= new ArrayList<Student>();
        LibraryManagementSystem A= LibraryManagementSystem.getInstance();
        try{
           List= A.getAllStudents();
        }catch(Exception s){
            JOptionPane.showMessageDialog(this,s.getMessage());
        }
        
        return List;
    }
    public void addRowToStudentsTable(){
        DefaultTableModel model=(DefaultTableModel) StudentsTable.getModel();
        ArrayList<Student> List= ListStudents();
        Object rowData[]= new Object[5];
        int C= List.size();
        for(int i=0;i<C;i++){
            rowData[0]=List.get(i).getUnvId();
            rowData[1]=List.get(i).getName();
            rowData[2]=List.get(i).getGrade();
            rowData[3]=List.get(i).getPhone();
            rowData[4]=List.get(i).getBorrowedBooksIds().toString();
            model.addRow(rowData);
        }                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        StudentsInterface = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        StudentsTable = new javax.swing.JTable();
        BackToHome = new javax.swing.JButton();
        RemoveStudent = new javax.swing.JButton();
        AddStudent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));

        StudentsInterface.setFont(new java.awt.Font("Calibri", 1, 60)); // NOI18N
        StudentsInterface.setForeground(new java.awt.Color(255, 255, 255));
        StudentsInterface.setText("Students Managment");

        StudentsTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        StudentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Name", "Grade", "Phone", "ID Borrowed Name"
            }
        ));
        StudentsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(StudentsTable);

        BackToHome.setBackground(new java.awt.Color(204, 255, 204));
        BackToHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-back-arrow-50.png"))); // NOI18N
        BackToHome.setText("Back");
        BackToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToHomeActionPerformed(evt);
            }
        });

        RemoveStudent.setBackground(new java.awt.Color(204, 255, 204));
        RemoveStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-remove-50.png"))); // NOI18N
        RemoveStudent.setText("Remove");
        RemoveStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveStudentActionPerformed(evt);
            }
        });

        AddStudent.setBackground(new java.awt.Color(204, 255, 204));
        AddStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-student-registration-50.png"))); // NOI18N
        AddStudent.setText("Add");
        AddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BackToHome)
                        .addGap(18, 18, 18)
                        .addComponent(RemoveStudent)
                        .addGap(18, 18, 18)
                        .addComponent(AddStudent))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addComponent(StudentsInterface))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(StudentsInterface)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddStudent)
                    .addComponent(RemoveStudent)
                    .addComponent(BackToHome))
                .addGap(25, 25, 25))
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

    private void AddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentActionPerformed
        dispose();
        AddStudent Ast=new AddStudent();
        Ast.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_AddStudentActionPerformed

    private void BackToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToHomeActionPerformed
        dispose();
        Home D=new Home();
        D.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_BackToHomeActionPerformed

    private void RemoveStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveStudentActionPerformed
        dispose();
        RemoveStudent Rst=new RemoveStudent();
        Rst.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_RemoveStudentActionPerformed

    private void StudentsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentsTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentsTableMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentManag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentManag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentManag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentManag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentManag().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddStudent;
    private javax.swing.JButton BackToHome;
    private javax.swing.JButton RemoveStudent;
    private javax.swing.JLabel StudentsInterface;
    private javax.swing.JTable StudentsTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
