package view;

import controller.IOFile;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.QLMuon;
import model.Sach;
import model.banDoc;

public class FormQLMuon2 extends javax.swing.JPanel {
    DefaultTableModel tm;
    private String fqlMuon;
    private List<QLMuon> lqlMuon;
    private String fsach;
    private List<Sach> lsach;
    
    public FormQLMuon2() {
        initComponents();
        setSize(650, 650);
        String[] cols = {"Ma ban doc", "Ho ten", "Ma sach", "Ten sach", "So luong", "Tinh trang"};
        tm = new DefaultTableModel(cols, 0);
        jTable1.setModel(tm);
        fqlMuon= "src/controller/qlmuon.txt";
        fsach = "src/controller/sach.txt";
        loadData();
        load2Ma();
    }
    private void loadData(){
        File f = new File(fqlMuon);
        if(f.exists()){
            lqlMuon = IOFile.doc(fqlMuon);
        } else {
            lqlMuon= new ArrayList<>();
        }
        
        File fs = new File(fsach);
        if(fs.exists()){
            lsach = IOFile.doc(fsach);
        } else {
            lsach = new ArrayList<>();
        }
    }
    
    private void load2Ma(){
        cbMabd.removeAllItems();
        cbMaSach.removeAllItems();
        String fsach = "src/controller/sach.txt";
        String fbd = "src/controller/bandoc.txt";
        List<banDoc> l1 = IOFile.doc(fbd);
        if(l1 != null){
            for(banDoc i : l1){
                cbMabd.addItem(i.getMa()+"");
            }
        }
        
        for(Sach i : lsach){
            cbMaSach.addItem(i.getMa()+"");
        }
    }
    
    private boolean trung2Ma(int mabd, int mas){
        for(QLMuon i : lqlMuon){
            if(i.getBandoc().getMa() == mabd && i.getSach().getMa() == mas) return true;            
        }
        return false;
    }
    
    private int demDauSach(int mabd){
        int count = 0;
        for(QLMuon i : lqlMuon){
            if(i.getBandoc().getMa() == mabd)
                count++;
        }
        return count;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbMabd = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbMaSach = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cbSapXep = new javax.swing.JComboBox<>();

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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Ma ban doc:");

        cbMabd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Ma sach: ");

        cbMaSach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("So luong muon: ");

        jLabel4.setText("Tinh trang sach:");

        jButton1.setText("Lam tuoi 2 ma");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbMaSach, 0, 108, Short.MAX_VALUE)
                            .addComponent(cbMabd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbMabd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jButton2.setText("Them moi");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Hien thi");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Luu vao file");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        cbSapXep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Lua chon sap xep--", "Ho ten ban doc", "So luong sach muon" }));
        cbSapXep.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSapXepItemStateChanged(evt);
            }
        });
        cbSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSapXepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(cbSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private Sach getSachByMa(int ma){
        for(Sach i : lsach){
            if(i.getMa() == ma)
                return i;
        }
        
        return null;
    }
    
    private banDoc getbDocByMa(int ma){
        String fbdoc = "src/controller/bandoc.txt";
        List<banDoc> l1 = IOFile.doc(fbdoc);
        if(l1 != null){
            for(banDoc i : l1){
                if(i.getMa() == ma)
                    return i;
            }
        }
        return null;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        load2Ma();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int mabd = Integer.parseInt(cbMabd.getSelectedItem().toString());
        int maSach = Integer.parseInt(cbMaSach.getSelectedItem().toString());
        if(trung2Ma(mabd, maSach)){
            JOptionPane.showMessageDialog(this,"Trung 2 ma!");;
            cbMabd.requestFocus();
            return;
        }
        int sl = 0;
        int sltv = getSachByMa(maSach).getSlg();
        try{
            sl = Integer.parseInt(jTextField1.getText());
            if(sl > sltv){
                JOptionPane.showMessageDialog(this,"Khong du sach");;
                jTextField1.requestFocus();
                return;
            }
            String tt = jTextField2.getText();
            QLMuon ql = new QLMuon(getbDocByMa(mabd), getSachByMa(maSach), sl, tt);
            tm.addRow(ql.toObject());
            lqlMuon.add(ql);
            getSachByMa(maSach).setSlg(sltv-sl);
            IOFile.viet(fsach, lsach);

        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Nhap so");;
            jTextField1.requestFocus();
            return;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        File f = new File(fqlMuon);
        if(f.exists()){
            lqlMuon = IOFile.doc(fqlMuon);
            tm.setRowCount(0);
            for(QLMuon i : lqlMuon){
                tm.addRow(i.toObject());
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        IOFile.viet(fqlMuon, lqlMuon);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cbSapXepItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSapXepItemStateChanged
        // TODO add your handling code here:
        if(cbSapXep.getSelectedIndex() == 1){ //sap xep theo ho ten
            lqlMuon.sort(new Comparator<QLMuon>(){
                @Override
                public int compare(QLMuon o1, QLMuon o2){
                    String[] ten1 = o1.getBandoc().getHoten().split("\\s+");
                    String[] ten2 = o2.getBandoc().getHoten().split("\\s+");
                    if(ten1[ten1.length - 1].equals(ten2[ten2.length - 1])) {
                        return o1.getBandoc().getHoten().compareToIgnoreCase(o2.getBandoc().getHoten());
                    } else {
                        return ten1[ten1.length - 1].compareToIgnoreCase(ten2[ten2.length - 1]);
                    }
                }
            });
        }
        if(cbSapXep.getSelectedIndex() == 2){ //sap xep theo so luong
            lqlMuon.sort(new Comparator<QLMuon>(){
                @Override
                public int compare(QLMuon o1, QLMuon o2){
                    return Integer.compare(o1.getSluong(), o2.getSluong());
                }
            });
        }
        tm.setRowCount(0);
        for(QLMuon i : lqlMuon){
            tm.addRow(i.toObject());
        }
    }//GEN-LAST:event_cbSapXepItemStateChanged

    private void cbSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSapXepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSapXepActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbMaSach;
    private javax.swing.JComboBox<String> cbMabd;
    private javax.swing.JComboBox<String> cbSapXep;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
