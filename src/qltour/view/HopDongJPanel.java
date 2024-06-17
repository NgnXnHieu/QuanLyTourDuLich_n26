/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package qltour.view;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.plaf.OptionPaneUI;
import javax.swing.table.DefaultTableModel;
import qltour.model.Tour;
import qltour.model.KhachHang;
import qltour.model.HopDong;
import qltour.managedata.IO;

public class HopDongJPanel extends javax.swing.JPanel {

    public HopDongJPanel() {
        o =new IO();
        listHD = new ArrayList<HopDong>();
        initComponents();
    }
     private void setTable() {
         DefaultTableModel defaultTableModel = new DefaultTableModel();
        table.setModel(defaultTableModel);
         ListSelectionModel listSelectionModel = table.getSelectionModel();
        listSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        defaultTableModel.addColumn("STT");
        defaultTableModel.addColumn("Mã Hợp Đồng");
        defaultTableModel.addColumn("Mã Tour");
        defaultTableModel.addColumn("Mã Khách Hàng");
        defaultTableModel.addColumn("Ngày Lập");
        defaultTableModel.addColumn("Trạng thái");

        listHD = o.loadData(listHD, "dsHD.dat");
        int i = 0;
        for (HopDong h : listHD) {
            i++;
            defaultTableModel.addRow(new Object[]{i, h.getID_HopDong(),h.getMaTour(),h.getMaKh(),h.getNgayLap(),h.getTrangThai()});
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

        addDialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        lb_trangthai = new javax.swing.JLabel();
        lb_mhd = new javax.swing.JLabel();
        text_MHD = new javax.swing.JTextField();
        lb_mt = new javax.swing.JLabel();
        lb_mkh = new javax.swing.JLabel();
        CB_mkh = new javax.swing.JComboBox<>();
        CB_mt = new javax.swing.JComboBox<>();
        RB2 = new javax.swing.JRadioButton();
        RB1 = new javax.swing.JRadioButton();
        addbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ediDialog = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        lb_trangthai2 = new javax.swing.JLabel();
        lb_mhd1 = new javax.swing.JLabel();
        text_MHD1 = new javax.swing.JTextField();
        lb_mt1 = new javax.swing.JLabel();
        lb_mkh1 = new javax.swing.JLabel();
        CB_mkh1 = new javax.swing.JComboBox<>();
        CB_mt1 = new javax.swing.JComboBox<>();
        RB4 = new javax.swing.JRadioButton();
        RB3 = new javax.swing.JRadioButton();
        editbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Addbutton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();

        addDialog.setBackground(new java.awt.Color(255, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_trangthai.setText("Trạng thái");
        jPanel1.add(lb_trangthai, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 111, 34));

        lb_mhd.setText("Mã Hợp Đồng");
        jPanel1.add(lb_mhd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 111, 34));

        text_MHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_MHDActionPerformed(evt);
            }
        });
        jPanel1.add(text_MHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 160, 30));

        lb_mt.setText("Mã Tour");
        jPanel1.add(lb_mt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 111, 34));

        lb_mkh.setText("Mã Khách hàng");
        jPanel1.add(lb_mkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 111, 34));

        CB_mkh.setModel(new javax.swing.DefaultComboBoxModel<>());
        listKH = new ArrayList<KhachHang>();
        listKH = o.loadData(listKH, "dsKh.dat");
        for (KhachHang kh : listKH) {
            CB_mkh.addItem(kh.getID_client());
        }
        CB_mkh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_mkhActionPerformed(evt);
            }
        });
        jPanel1.add(CB_mkh, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 160, 30));

        CB_mt.setModel(new javax.swing.DefaultComboBoxModel<>());
        listTour = new ArrayList<Tour>();
        listTour = o.loadData(listTour, "dsTour1.dat");
        for (Tour t : listTour) {
            CB_mt.addItem(t.getID_Tour());
        }
        CB_mt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_mtActionPerformed(evt);
            }
        });
        jPanel1.add(CB_mt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 160, 30));

        RB2.setText("Chưa thanh toán");
        RB2.setSelected(true);
        RB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB2ActionPerformed(evt);
            }
        });
        jPanel1.add(RB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        RB1.setText("Đã thanh toán");
        RB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB1ActionPerformed(evt);
            }
        });
        jPanel1.add(RB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        addbtn.setBackground(new java.awt.Color(51, 153, 0));
        addbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addbtn.setText("Thêm");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        jPanel1.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 90, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Thêm Hợp Đồng");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 290, 40));

        addDialog.getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_trangthai2.setText("Trạng thái");
        jPanel3.add(lb_trangthai2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 111, 34));

        lb_mhd1.setText("Mã Hợp Đồng");
        jPanel3.add(lb_mhd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 111, 34));

        text_MHD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_MHD1ActionPerformed(evt);
            }
        });
        jPanel3.add(text_MHD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 154, -1));

        lb_mt1.setText("Mã Tour");
        jPanel3.add(lb_mt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 111, 34));

        lb_mkh1.setText("Mã Khách hàng");
        jPanel3.add(lb_mkh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 111, 34));

        CB_mkh1.setModel(new javax.swing.DefaultComboBoxModel<>());
        listKH = new ArrayList<KhachHang>();
        listKH = o.loadData(listKH, "dsKh.dat");
        for (KhachHang kh : listKH) {
            CB_mkh1.addItem(kh.getID_client());
        }
        CB_mkh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_mkh1ActionPerformed(evt);
            }
        });
        jPanel3.add(CB_mkh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 150, 30));

        CB_mt1.setModel(new javax.swing.DefaultComboBoxModel<>());
        listTour = new ArrayList<Tour>();
        listTour = o.loadData(listTour, "dsTour1.dat");
        for (Tour t : listTour) {
            CB_mt1.addItem(t.getID_Tour());
        }
        CB_mt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_mt1ActionPerformed(evt);
            }
        });
        jPanel3.add(CB_mt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 150, 30));

        RB4.setText("Chưa thanh toán");
        RB4.setSelected(true);
        RB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB4ActionPerformed(evt);
            }
        });
        jPanel3.add(RB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        RB3.setText("Đã thanh toán");
        RB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB3ActionPerformed(evt);
            }
        });
        jPanel3.add(RB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        editbtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        editbtn.setText("Sửa");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });
        jPanel3.add(editbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 150, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Thêm Hợp Đồng");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 290, 40));

        ediDialog.getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        setBackground(new java.awt.Color(207, 207, 207));
        setLayout(new java.awt.BorderLayout());

        table.setBackground(new java.awt.Color(255, 255, 204));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, "", null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Hợp Đồng", "Mã Tour", "Mã Khách Hàng", "Ngày lập", "Trạng thái thanh toán"
            }
        ));
        table.setSelectionBackground(new java.awt.Color(255, 255, 204));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        setTable();

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản Lý Hợp Đồng");
        add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(190, 223, 232));

        Addbutton.setBackground(new java.awt.Color(51, 153, 0));
        Addbutton.setForeground(new java.awt.Color(255, 255, 255));
        Addbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltour/images/add (1).png"))); // NOI18N
        Addbutton.setText("Thêm");
        Addbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbuttonActionPerformed(evt);
            }
        });

        EditButton.setBackground(new java.awt.Color(255, 204, 204));
        EditButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltour/images/edit-v2 (2).png"))); // NOI18N
        EditButton.setText("Sửa");
        EditButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(204, 51, 0));
        DeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qltour/images/rubbish-bin (1).png"))); // NOI18N
        DeleteButton.setText("Xoá");
        DeleteButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseClicked(evt);
            }
        });
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(616, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel2, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        if(table.getSelectedRow()<0){
            JOptionPane.showMessageDialog(dialog, "Chọn Hợp Đồng cần xoá", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }else{
            listHD.remove(table.getSelectedRow());
            o.saveData(listHD, "dsHD.dat");
            o.loadData(listHD, "dsHD.dat");
            setTable();
            JOptionPane.showMessageDialog(dialog, "Xoá thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void AddbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbuttonActionPerformed
        // TODO add your handling code here:
        addDialog.setVisible(true);
        addDialog.setSize(700,600);
    }//GEN-LAST:event_AddbuttonActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        // TODO add your handling code here
        if(table.getSelectedRow()<0){
            JOptionPane.showMessageDialog(dialog, "Chọn Hợp Đồng cần Sửa", "Lỗi", JOptionPane.ERROR_MESSAGE);

        }else{
            ediDialog.setVisible(true);
        ediDialog.setSize(700,600);
        text_MHD1.setText(listHD.get(table.getSelectedRow()).getID_HopDong());
        OldID= text_MHD1.getText();
        }
    }//GEN-LAST:event_EditButtonActionPerformed

    private void DeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteButtonMouseClicked

    private void text_MHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_MHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_MHDActionPerformed

    private void RB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB1ActionPerformed
        // TODO add your handling code here:
        RB1.setSelected(true);
        RB2.setSelected(false);
    }//GEN-LAST:event_RB1ActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
        String ID = text_MHD.getText().trim();
        String MaKH = (String)CB_mkh.getSelectedItem();
        String text_NgayLap= (String.valueOf(LocalDate.now()));
        String NgayLap = text_NgayLap;
        String MaTour = (String)CB_mt.getSelectedItem();
        String trangthai=null;
        if(RB1.isSelected()) trangthai =RB1.getText();
        else trangthai=RB2.getText();
        if(ID.isEmpty()){
            JOptionPane.showMessageDialog(dialog, "Không để trống thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }else{
            boolean find= false;
        for(HopDong h : listHD ){
            if(h.getID_HopDong().compareTo(ID)==0){
                find =true;
                JOptionPane.showMessageDialog(dialog, "Trùng Mã Hợp Đồng","Lỗi",JOptionPane.ERROR_MESSAGE);
                break;
            }
        }
        if(find == false){
            HopDong h = new HopDong(ID, MaKH, NgayLap, trangthai, MaTour);
            listHD.add(h);
            o.saveData(listHD, "dsHD.dat");
            JOptionPane.showMessageDialog(dialog, "Thêm thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
            setTable();
        }
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMouseClicked

    private void CB_mkhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_mkhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_mkhActionPerformed

    private void CB_mtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_mtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_mtActionPerformed

    private void RB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB2ActionPerformed
        // TODO add your handling code here:
        RB2.setSelected(true);
        RB1.setSelected(false);
    }//GEN-LAST:event_RB2ActionPerformed

    private void text_MHD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_MHD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_MHD1ActionPerformed

    private void CB_mkh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_mkh1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_mkh1ActionPerformed

    private void CB_mt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_mt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_mt1ActionPerformed

    private void RB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB4ActionPerformed
        // TODO add your handling code here:
        RB4.setSelected(true);
        RB3.setSelected(false);
    }//GEN-LAST:event_RB4ActionPerformed

    private void RB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB3ActionPerformed
        // TODO add your handling code here:
        RB3.setSelected(true);
        RB4.setSelected(false);
    }//GEN-LAST:event_RB3ActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        // TODO add your handling code here:
        if(text_MHD1.getText().isEmpty()){
            JOptionPane.showMessageDialog(dialog, "Không để trống thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }else{
            boolean find= false;
        for(HopDong h : listHD ){
            if(h.getID_HopDong().compareTo(text_MHD1.getText())==0&&h.getID_HopDong().compareTo(OldID)!=0){
                find =true;
                JOptionPane.showMessageDialog(dialog, "Trùng Mã Hợp Đồng","Lỗi",JOptionPane.ERROR_MESSAGE);
                break;
            }
        }
        if(find == false){
            listHD.get(table.getSelectedRow()).setID_HopDong(text_MHD1.getText());
	    listHD.get(table.getSelectedRow()).setMaTour((String) CB_mt1.getSelectedItem());
            listHD.get(table.getSelectedRow()).setMaKh((String) CB_mkh1.getSelectedItem());
            String NgayLap= (String.valueOf(LocalDate.now()));
            listHD.get(table.getSelectedRow()).setNgayLap(NgayLap);
            if(RB3.isSelected()) listHD.get(table.getSelectedRow()).setTrangThai("Đã thanh toán");
            else listHD.get(table.getSelectedRow()).setTrangThai("Chưa thanh toán");
            o.saveData(listHD, "dsHD.dat");
            o.loadData(listHD, "dsHD.dat");
            JOptionPane.showMessageDialog(dialog, "Sửa thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
            ediDialog.setVisible(false);
            setTable();
        }
        }
    }//GEN-LAST:event_editbtnActionPerformed


    private ArrayList<Tour> listTour;
    private ArrayList<KhachHang> listKH;
    private ArrayList<HopDong> listHD;
    private IO o;
    private javax.swing.JDialog dialog;
    String OldID;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbutton;
    private javax.swing.JComboBox<String> CB_mkh;
    private javax.swing.JComboBox<String> CB_mkh1;
    private javax.swing.JComboBox<String> CB_mt;
    private javax.swing.JComboBox<String> CB_mt1;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JRadioButton RB1;
    private javax.swing.JRadioButton RB2;
    private javax.swing.JRadioButton RB3;
    private javax.swing.JRadioButton RB4;
    private javax.swing.JDialog addDialog;
    private javax.swing.JButton addbtn;
    private javax.swing.JDialog ediDialog;
    private javax.swing.JButton editbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_mhd;
    private javax.swing.JLabel lb_mhd1;
    private javax.swing.JLabel lb_mkh;
    private javax.swing.JLabel lb_mkh1;
    private javax.swing.JLabel lb_mt;
    private javax.swing.JLabel lb_mt1;
    private javax.swing.JLabel lb_trangthai;
    private javax.swing.JLabel lb_trangthai2;
    private javax.swing.JTable table;
    private javax.swing.JTextField text_MHD;
    private javax.swing.JTextField text_MHD1;
    // End of variables declaration//GEN-END:variables
}
