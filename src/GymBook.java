
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Time;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class GymBook extends javax.swing.JFrame {

    /**
     * Creates new form DashBoard
     */
    public GymBook() {
        initComponents();
        String sql = "SELECT Id,Name,Surname,Phone,time_in,time_out,record FROM gymbook";
        setTable(sql);
    }
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    
    public int getRecord(String id){
        int record =0;
        try{
            


            DBConnect db = new DBConnect();
            String sql = String.format("SELECT COUNT(Id) FROM gymbook WHERE Id = '%s' ",id);
            ResultSet rs = db.getConnect(sql);
            
            if(rs.next()){
                record = rs.getInt(1);
                
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return record;
    }
    
    public void setTable(String sql){
        String[] colname = {"Id","Name","Surname","Phone no.","Time in","Time out"};
        DefaultTableModel model = new DefaultTableModel(colname,0);
        
        try{
            DBConnect db = new DBConnect();
            ResultSet rs = db.getConnect(sql);
            
        
            while(rs.next()){
                String Id = rs.getString("Id");
                String name = rs.getString("Name");
                String surname = rs.getString("Surname");
                String Phone = rs.getString("Phone");
                String time_in = rs.getString("time_in");
                String time_out = rs.getString("time_out");
                String[] row = {Id,name,surname,Phone,time_in,time_out};
               
                model.addRow(row);
                
            }
            
        }catch (Exception e){
            e.printStackTrace();
        }
        jTable1.setModel(model);
        jTable1.repaint();
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
        jLabel1 = new javax.swing.JLabel();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        searchf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        refresh = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AU FITNESS");
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(252, 48, 29));
        jPanel1.setMaximumSize(new java.awt.Dimension(200, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 768));

        jLabel1.setText("Gym");
        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N

        bt1.setText("Time in");
        bt1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        bt2.setText("Time out");
        bt2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Surname", "Phone no.", "Time in", "Time out"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        refresh.setText("refresh");
        refresh.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        jButton2.setText("remove");
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton3KeyReleased(evt);
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
                        .addGap(6, 6, 6)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(426, 426, 426)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchf, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        // TODO add your handling code here:
        String id = searchf.getText();
        Long now = System.currentTimeMillis();
        Time time = new Time(now);
        String time_out = time.toString();
        String time_in = "";
        try{

            DBConnect db = new DBConnect();
            String sql = String.format("SELECT time_in FROM gymbook WHERE id='%s' ORDER BY time_in DESC",id);
            ResultSet rs = db.getConnect(sql);
            
            if(rs.next()){
                time_in =rs.getString("time_in");
                
            }
            
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        
        
        try{
            DBConnect db = new DBConnect();
            String sql = String.format("UPDATE gymbook SET time_out = '%s' WHERE id = '%s' AND time_in = '%s'",time_out,id,time_in);
            db.getUpdate(sql);
            db.disconnect();
            
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        String sql = "SELECT Id,Name,Surname,Phone,time_in,time_out,record FROM gymbook";
        setTable(sql);
        
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        // TODO add your handling code here:
        String id = searchf.getText();
        String name = "";
        String surname="";
        String phone ="";
        String time_in = "";
        
        
        try{

            DBConnect db = new DBConnect();
            String sql = String.format("SELECT Name,Surname,Phone FROM users WHERE id='%s'",id);
            ResultSet rs = db.getConnect(sql);
            
            if(rs.next()){
                name = rs.getString("Name");
                surname = rs.getString("Surname");
                phone = rs.getString("Phone");
                
            }
            
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        String time_out = "";
        
        try{

            DBConnect db = new DBConnect();
            String sql = String.format("SELECT time_out FROM gymbook WHERE id = '%s' ORDER BY time_in DESC",id);
            ResultSet rs = db.getConnect(sql);
            
            if(rs.next()){
                time_out = rs.getString("time_out");
                
                
            }
            
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        if(time_out == null){
           JOptionPane.showMessageDialog(null,"Not Time out yet!","Error",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Long now = System.currentTimeMillis();
            Time time = new Time(now);
            time_in = time.toString();

            int record = getRecord(id);



            try{
                DBConnect db =new DBConnect();
                String sql = String.format("INSERT INTO gymbook(Id,Name,Surname,Phone,time_in,record) VALUES('%s','%s','%s','%s','%s','%d') ",id,name,surname,phone,time_in,record);
                db.getUpdate(sql);


                db.disconnect();

                JOptionPane.showMessageDialog(null,"Time in!");
            }catch(Exception ex){

            }
            String sql = "SELECT Id,Name,Surname,Phone,time_in,time_out,record FROM gymbook";
            setTable(sql);
        }
        
        
       
        
        
        
        
        
        
        
    }//GEN-LAST:event_bt1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        close();
        SportsPanel sp = new SportsPanel();
        sp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        String sql = "SELECT Id,Name,Surname,Phone,time_in,time_out,record FROM gymbook";
        setTable(sql);
        
    }//GEN-LAST:event_refreshActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String id = searchf.getText();
        int a = JOptionPane.showConfirmDialog(null,"Do you really want to delete this Id '?", "Select",JOptionPane.YES_NO_OPTION);
            if(a == 0){
                try{
                    DBConnect db =new DBConnect();
                    String sql = String.format("DELETE FROM gymbook WHERE id='%s' ",id);
                    db.getUpdate(sql);
                    db.disconnect();

                    JOptionPane.showMessageDialog(null,"Delete Successfully!");
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3KeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel ob = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
        jTable1.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(searchf.getText()));
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(TennisBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TennisBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TennisBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TennisBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GymBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton refresh;
    private javax.swing.JTextField searchf;
    // End of variables declaration//GEN-END:variables
}
