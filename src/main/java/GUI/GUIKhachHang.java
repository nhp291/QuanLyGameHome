/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DAO.KhachHangDAO;
import Utils.Dialog;
import Utils.Auth;
import Entity.KhachHang;
import Utils.XAuth;

/**
 *
 * @author Phong
 */
public class GUIKhachHang extends javax.swing.JFrame {

    KhachHangDAO khdao = new KhachHangDAO();
    KhachHang khachHang = new KhachHang();
    GUIOrder Order = new GUIOrder();
    
    
    
    public GUIKhachHang() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Hệ Thống Quản Lý Game Home");
        setBounds(1112, 0, 420, 630);
    }
    
    
    
    private void exit() {
        if (Dialog.confirm(this, "Bạn muốn kết thúc ứng dụng?")) {
            System.exit(0);
        }
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) { 
        lblKhachHang.setText(XAuth.staff.getTenKH());
    }  

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpnKhachHang = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblKhachHang = new javax.swing.JLabel();
        btnDIchVu = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnPhanHoi = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTGSDung = new javax.swing.JLabel();
        lblTGConLai = new javax.swing.JLabel();
        lblTKChinh = new javax.swing.JLabel();
        btnLSGDich = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jpnKhachHang.setBackground(new java.awt.Color(255, 255, 255));
        jpnKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        jpnKhachHang.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jpnKhachHangAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Khách hàng:");

        lblKhachHang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblKhachHang.setForeground(new java.awt.Color(0, 0, 51));
        lblKhachHang.setText("Nguyễn Hoài Phong");

        btnDIchVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyduan1/Icon/food.png"))); // NOI18N
        btnDIchVu.setText("Dịch vụ");
        btnDIchVu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDIchVu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDIchVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDIchVuActionPerformed(evt);
            }
        });

        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyduan1/Icon/iconLogOut.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        btnPhanHoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyduan1/Icon/iconFeedback.png"))); // NOI18N
        btnPhanHoi.setText("Phản hồi");
        btnPhanHoi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPhanHoi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPhanHoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhanHoiActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Thời gian sử dụng:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Tài khoản chính:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Thời gian còn lại");

        lblTGSDung.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTGSDung.setForeground(new java.awt.Color(0, 0, 51));
        lblTGSDung.setText("00:30:15");

        lblTGConLai.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTGConLai.setForeground(new java.awt.Color(0, 0, 51));
        lblTGConLai.setText("02:10:00");

        lblTKChinh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTKChinh.setForeground(new java.awt.Color(0, 0, 51));
        lblTKChinh.setText("150.000");

        btnLSGDich.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyduan1/Icon/iconFeedback.png"))); // NOI18N
        btnLSGDich.setText("Lịch sử giao dịch");
        btnLSGDich.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLSGDich.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLSGDich.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLSGDichMouseClicked(evt);
            }
        });
        btnLSGDich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLSGDichActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnKhachHangLayout = new javax.swing.GroupLayout(jpnKhachHang);
        jpnKhachHang.setLayout(jpnKhachHangLayout);
        jpnKhachHangLayout.setHorizontalGroup(
            jpnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnKhachHangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDangXuat)
                .addGap(153, 153, 153))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnKhachHangLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(btnPhanHoi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDIchVu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLSGDich, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTGSDung, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTGConLai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTKChinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jpnKhachHangLayout.setVerticalGroup(
            jpnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTGSDung, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTGConLai, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTKChinh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(jpnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnDIchVu, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLSGDich, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPhanHoi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(btnDangXuat)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        this.exit();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnPhanHoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhanHoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPhanHoiActionPerformed

    private void btnDIchVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDIchVuActionPerformed
        new GUIOrder();
    }//GEN-LAST:event_btnDIchVuActionPerformed

    private void btnLSGDichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLSGDichActionPerformed
        new GUIInHoaDon();
    }//GEN-LAST:event_btnLSGDichActionPerformed

    private void jpnKhachHangAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jpnKhachHangAncestorAdded
        lblKhachHang.setText(XAuth.staff.getTenKH());
        lblTKChinh.setText(String.valueOf(XAuth.staff.getSoDu()));
    }//GEN-LAST:event_jpnKhachHangAncestorAdded

    private void btnLSGDichMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLSGDichMouseClicked
        GUIInHoaDon inHoaDon = new GUIInHoaDon();
        inHoaDon.setVisible(true);
    }//GEN-LAST:event_btnLSGDichMouseClicked

    
    
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
            java.util.logging.Logger.getLogger(GUIKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDIchVu;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnLSGDich;
    private javax.swing.JButton btnPhanHoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpnKhachHang;
    private javax.swing.JLabel lblKhachHang;
    private javax.swing.JLabel lblTGConLai;
    private javax.swing.JLabel lblTGSDung;
    private javax.swing.JLabel lblTKChinh;
    // End of variables declaration//GEN-END:variables
}
