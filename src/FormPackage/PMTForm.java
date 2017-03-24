/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormPackage;

import JavaClassPackage.DBConnectClass;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Echo01
 */
public class PMTForm extends javax.swing.JFrame {
    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    static String username,password;
    /**
     * Creates new form PMTForm
     * @param username
     * @param password
     */
    public PMTForm(String username,String password) {
        PMTForm.username=username;PMTForm.password=password;
        initComponents();
        show_PMT_table();
    }
    private void show_PMT_table(){
        connection = DBConnectClass.Connection(username, password);
        String query = "SELECT * FROM dogpatch06.PMT";
        try{
            pst = connection.prepareStatement(query);
            ResultSet t = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(t));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
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

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ID_tf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fn_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ln_tf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        phy_score = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        chem_score = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bio_score = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        phy_t = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        chem_t = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bio_t = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tenia_tf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        phy_t_id = new javax.swing.JTextField();
        chem_t_id = new javax.swing.JTextField();
        bio_t_id = new javax.swing.JTextField();
        tenia_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButton1.setText("Logout");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator1);

        jButton2.setText("Refresh");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jLabel1.setText("Search");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 2));

        jLabel2.setText("ID");

        ID_tf.setEditable(false);

        jLabel3.setText("First Name");

        fn_tf.setEditable(false);

        jLabel4.setText("Last Name");

        ln_tf.setEditable(false);

        jLabel5.setText("Physics");

        phy_score.setEditable(false);

        jLabel6.setText("Chemistry");

        chem_score.setEditable(false);
        chem_score.setMinimumSize(new java.awt.Dimension(6, 50));

        jLabel7.setText("Biology");

        bio_score.setEditable(false);

        jLabel8.setText("Physics Teacher");

        phy_t.setEditable(false);

        jLabel9.setText("Chemistry Teacher");

        chem_t.setEditable(false);

        jLabel10.setText("Biology Teacher");

        bio_t.setEditable(false);

        jLabel11.setText("Tenia");

        tenia_tf.setEditable(false);

        jLabel12.setText("ID");

        jLabel13.setText("ID");

        jLabel14.setText("ID");

        jLabel15.setText("ID");

        phy_t_id.setEditable(false);

        chem_t_id.setEditable(false);

        bio_t_id.setEditable(false);

        tenia_id.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(phy_score))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(chem_score, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bio_score, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(ID_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(fn_tf))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(ln_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 67, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(phy_t)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bio_t)
                                    .addComponent(chem_t)
                                    .addComponent(tenia_tf))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tenia_id, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(bio_t_id)
                    .addComponent(chem_t_id)
                    .addComponent(phy_t_id))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ID_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fn_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ln_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phy_score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chem_score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bio_score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phy_t)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel12)
                        .addComponent(phy_t_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chem_t)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel13)
                        .addComponent(chem_t_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(bio_t_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(bio_t))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tenia_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(tenia_tf))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 0), null));

        jButton3.setText("Insert");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Update");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Delete");
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Print");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FormPackage/Close_Icon.png"))); // NOI18N
        jMenuItem1.setText("Close");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_LEFT, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FormPackage/1489637830_back-alt.png"))); // NOI18N
        jMenuItem2.setText("Back");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(null, "You realy wanna logout?","Logout confirm",JOptionPane.YES_NO_OPTION);
        if(x==0){
            new LoginForm().setVisible(true);
            try{
                if(connection!=null)connection.close();
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(null, "Are you sure about closing","Close Confirm",JOptionPane.YES_NO_OPTION);
        if(x==0){
            try{
                if(connection!=null)connection.close();
            }catch(SQLException e ){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            this.dispose();System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new SelectTableForm(username, password).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        show_PMT_table();
        DisableNRenameTFS(this.getContentPane());
        jTextField1.setEditable(true);jTextField1.setText(null);
        jButton4.setEnabled(false);jButton5.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new PMTInsertionForm().setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        showData();
        jButton4.setEnabled(true);jButton5.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_DOWN || evt.getKeyCode()==KeyEvent.VK_UP){
            showData();
            jButton4.setEnabled(true);jButton5.setEnabled(true);
        }
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
         if(!jTextField1.getText().equals(null)){
            String sql;
        String value = jTextField1.getText().replace("%", "!%");
        try {
            sql = "SELECT * FROM PMT WHERE `First Name` LIKE ? OR `Last Name` LIKE ? ESCAPE '!';";
            pst= connection.prepareStatement(sql);
            pst.setString(1,"%"+jTextField1.getText()+"%");pst.setString(2, "%"+jTextField1.getText()+"%");
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(PMTForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        }
        if("".equals(jTextField1.getText())){
            show_PMT_table();
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        connection = DBConnectClass.Connection(username, password);
        String query = "UPDATE dogpatch06.PMT set `First Name`=?,`Last Name`=?,`Physics`=?,`Chemistry`=?,`Biology`=?,`Physics Teacher ID`=?,`Chemistry Teacher ID`=?,`Biology Teacher ID`=?,`Co-Ordinator ID`=? WHERE ID=?";
        try{
            pst=connection.prepareStatement(query);
            pst.setString(1, fn_tf.getText());pst.setString(2, ln_tf.getText());
            pst.setInt(3, Integer.parseInt(phy_score.getText()));pst.setInt(4, Integer.parseInt(chem_score.getText()));
            pst.setInt(5, Integer.parseInt(bio_score.getText()));pst.setInt(6, Integer.parseInt(phy_t_id.getText()));
            pst.setInt(7, Integer.parseInt(chem_t_id.getText()));pst.setInt(8, Integer.parseInt(bio_t_id.getText()));
            pst.setInt(9, Integer.parseInt(tenia_id.getText()));pst.setInt(10, Integer.parseInt(ID_tf.getText()));
            pst.executeUpdate();
            show_PMT_table();
            JOptionPane.showMessageDialog(null, "Updated");
        }catch(SQLException e){
            Logger.getLogger(PMTForm.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        connection = DBConnectClass.Connection(username, password);
        String query = "DELETE FROM dogpatch06.PMT where ID=?";
        try{
            pst = connection.prepareStatement(query);
            pst.setInt(1, Integer.parseInt(ID_tf.getText()));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted");
        }catch(SQLException e){
            Logger.getLogger(PMTForm.class.getName()).log(Level.SEVERE,null,e.getMessage());
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        DisableNRenameTFS(this.getContentPane());
        show_PMT_table();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void DisableNRenameTFS(Container container){
        for(Component k : container.getComponents()){
            if(k instanceof JTextField){
                JTextField temp = (JTextField)k;
                temp.setText(null);temp.setEditable(false);
            }else{
                if(k instanceof Container)DisableNRenameTFS((Container)k);
            }
        }
    }
    private void EnableTFS2(Container container){
        for(Component k : container.getComponents()){
            if(k instanceof JTextField){
                JTextField temp = (JTextField)k;
                temp.setEditable(true);
            }else{
                if(k instanceof Container)EnableTFS2((Container)k);
            }
        }
    }
    private void showData(){
        connection = DBConnectClass.Connection(username, password);
        String query = "SELECT * FROM dogpatch06.PMT where ID = ?;";
        String qphy = "select employee.Name from dogpatch06.employee,dogpatch06.PMT where " +
"(PMT.`Physics Teacher ID` = employee.ID)AND PMT.`ID`=?;";
        String qchem = "select employee.Name from dogpatch06.employee,dogpatch06.PMT where (PMT.`Chemistry Teacher ID` = employee.ID)AND PMT.`ID`=?;";
        String qbio = "select employee.Name from dogpatch06.employee,dogpatch06.PMT where (PMT.`Biology Teacher ID` = employee.ID)AND PMT.`ID`=?";
        String qcod = "select employee.Name from dogpatch06.employee,dogpatch06.PMT where (PMT.`Co-Ordinator ID` = employee.ID)AND PMT.`ID`=?;";
        try{
            int rowNo = jTable1.getSelectedRow();
            String Clicked_Table = jTable1.getModel().getValueAt(rowNo, 0).toString();
            pst = connection.prepareStatement(query);
            PreparedStatement pst2,pst3,pst4,pst5;
            pst2 = connection.prepareStatement(qphy);pst3=connection.prepareStatement(qchem);pst4=connection.prepareStatement(qbio);pst5=connection.prepareStatement(qcod);
            pst2.setInt(1, Integer.parseInt(Clicked_Table));pst3.setInt(1, Integer.parseInt(Clicked_Table));
            pst4.setInt(1, Integer.parseInt(Clicked_Table));pst5.setInt(1, Integer.parseInt(Clicked_Table));
            pst.setInt(1, Integer.parseInt(Clicked_Table));
            ResultSet rs2,rs3,rs4,rs5;
            rs2=pst2.executeQuery();rs3=pst3.executeQuery();rs4=pst4.executeQuery();rs5=pst5.executeQuery();
            rs = pst.executeQuery();
            if(rs.next()){
                ID_tf.setText(rs.getString("ID"));
                fn_tf.setText(rs.getString("First Name"));
                ln_tf.setText(rs.getString("Last Name"));
                phy_score.setText(rs.getString("Physics"));
                chem_score.setText(rs.getString("Chemistry"));
                bio_score.setText(rs.getString("Biology"));
                phy_t_id.setText(rs.getString("Physics Teacher ID"));
                chem_t_id.setText(rs.getString("Chemistry Teacher ID"));
                bio_t_id.setText(rs.getString("Biology Teacher ID"));
                tenia_id.setText(rs.getString("Co-Ordinator ID"));
            }
            if(rs2.next()){
                phy_t.setText(rs2.getString("Name"));
            }
            if(rs3.next()){
                chem_t.setText(rs3.getString("Name"));
            }
            if(rs4.next()){
                bio_t.setText(rs4.getString("Name"));
            }
            if(rs5.next()){
                tenia_tf.setText(rs5.getString("Name"));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        EnableTFS2(this.getContentPane());
        ID_tf.setEditable(false);
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
            java.util.logging.Logger.getLogger(PMTForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PMTForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PMTForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PMTForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PMTForm(PMTForm.username,PMTForm.password).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID_tf;
    private javax.swing.JTextField bio_score;
    private javax.swing.JTextField bio_t;
    private javax.swing.JTextField bio_t_id;
    private javax.swing.JTextField chem_score;
    private javax.swing.JTextField chem_t;
    private javax.swing.JTextField chem_t_id;
    private javax.swing.JTextField fn_tf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField ln_tf;
    private javax.swing.JTextField phy_score;
    private javax.swing.JTextField phy_t;
    private javax.swing.JTextField phy_t_id;
    private javax.swing.JTextField tenia_id;
    private javax.swing.JTextField tenia_tf;
    // End of variables declaration//GEN-END:variables
}