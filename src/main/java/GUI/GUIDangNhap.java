package GUI;

import DAO.KhachHangDAO;
import DAO.NhanVienDAO;
import Entity.KhachHang;
import Utils.Auth;
import Utils.XAuth;
import Entity.NhanVien;
import Utils.Dialog;
import java.awt.Color;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class GUIDangNhap extends javax.swing.JFrame {

    NhanVienDAO nvdao = new NhanVienDAO();
    KhachHangDAO khDAo = new KhachHangDAO();
//    GUINhanVien nhanVien = new GUINhanVien();
//    GUIKhachHang khachHang = new GUIKhachHang();
    GUIEmail email = new GUIEmail();

    public GUIDangNhap() {
        initComponents();
        setLocationRelativeTo(null);
        btnClose.setBackground(Color.white);
        txtpass.setEchoChar('*');
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnDangNhap = new javax.swing.JButton();
        lblQuenMatKhau = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        chkcheck = new javax.swing.JCheckBox();
        txtuser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel1KeyTyped(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyduan1/Icon/lg.png"))); // NOI18N
        jLabel8.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnDangNhap.setBackground(new java.awt.Color(0, 0, 102));
        btnDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        btnDangNhap.setText("Login");
        btnDangNhap.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnDangNhap.setBorderPainted(false);
        btnDangNhap.setDefaultCapable(false);
        btnDangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDangNhapMouseClicked(evt);
            }
        });
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        btnDangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnDangNhapKeyTyped(evt);
            }
        });

        lblQuenMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblQuenMatKhau.setText("Quên Mật Khẩu");
        lblQuenMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuenMatKhauMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 51, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Đăng Nhập");

        btnClose.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        btnClose.setText("X");
        btnClose.setBorder(null);
        btnClose.setBorderPainted(false);
        btnClose.setDefaultCapable(false);
        btnClose.setFocusPainted(false);
        btnClose.setFocusable(false);
        btnClose.setRequestFocusEnabled(false);
        btnClose.setRolloverEnabled(false);
        btnClose.setVerifyInputWhenFocusTarget(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Tài Khoản");

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Mật Khẩu");

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel5.setText("Welcome to DiNoGaming!");

        txtpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        chkcheck.setBackground(new java.awt.Color(255, 255, 255));
        chkcheck.setText("Hiện Mật Khẩu");
        chkcheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkcheckMouseClicked(evt);
            }
        });
        chkcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkcheckActionPerformed(evt);
            }
        });

        txtuser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        txtuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtuserKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(chkcheck, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblQuenMatKhau))
                            .addComponent(btnDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtpass)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtuser))
                        .addGap(60, 60, 60))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel5)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(127, 127, 127))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuenMatKhau)
                    .addComponent(chkcheck))
                .addGap(32, 32, 32)
                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(27, 27, 27))
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

    private void exit() {
        if (Dialog.confirm(this, "Bạn muốn kết thúc ứng dụng?")) {
            System.exit(0);
        }
    }
    
    private void login() {
        String TaiKhoan = txtuser.getText();
        String MatKhau = new String(txtpass.getText());
        NhanVien nv = nvdao.selectById(TaiKhoan);
        KhachHang kh = khDAo.selectById(TaiKhoan);
        
        if (TaiKhoan.equals("")) {
            Dialog.alert(this, "Tài khoản không được để trống!");
        }else if(MatKhau.equals("")) {
            Dialog.alert(this, "Mật khẩu không được để trống!");
        }else{
            try {
              if (TaiKhoan.equals(nv.getTaiKhoanNV())) {
                  if (MatKhau.equals(nv.getMatKhauNV())) {
                      Dialog.alert(this, "Đăng nhập thành công nhân viên: " + nv.getTenNV() + "!");
                      Auth.user = nv;
                      this.dispose();
                      GUINhanVien nhanVien = new GUINhanVien();
                      nhanVien.setVisible(true);
                  } else {
                      JOptionPane.showMessageDialog(this, "Sai tên đăng nhập hoặc mật khẩu!", "Thông báo!", JOptionPane.ERROR_MESSAGE);
                  }
              }
            } catch (Exception e) {
                if (TaiKhoan.equals(kh.getTaiKhoanKH())) {
                    if (MatKhau.equals(kh.getMatKhauKH())) {
                        Dialog.alert(this, "Đăng nhập thành công khách hàng: " + kh.getTenKH() + "!");
                        XAuth.staff = kh;
                        this.dispose();
                        GUIKhachHang khachHang = new GUIKhachHang();
                        khachHang.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "Sai tên đăng nhập hoặc mật khẩu!", "Thông báo!", JOptionPane.ERROR_MESSAGE);
                    }
                }            
            }
        }

    }

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.exit();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void chkcheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkcheckMouseClicked
        if (chkcheck.isSelected()) {
            txtpass.setEchoChar((char) 0);
        } else {
            txtpass.setEchoChar('*');
        }
    }//GEN-LAST:event_chkcheckMouseClicked

    private void btnDangNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangNhapMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnDangNhapMouseClicked

    private void jPanel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1KeyTyped

    private void btnDangNhapKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDangNhapKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_btnDangNhapKeyTyped

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        if (txtuser.getText().trim().length() > 0) {
            if (txtpass.getPassword().length > 0) {
                this.login();
            } else {
                Dialog.alert(this, "Không được để trống tên mật khẩu.");
            }
        } else {
            Dialog.alert(this, "Không được để trống tên đăng nhập.");
        }

    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void chkcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkcheckActionPerformed
    }//GEN-LAST:event_chkcheckActionPerformed

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
    }//GEN-LAST:event_txtuserActionPerformed

    private void txtuserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuserKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.getRootPane().setDefaultButton(btnDangNhap);
            btnDangNhap.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.exit();
        }
    }//GEN-LAST:event_txtuserKeyPressed

    private void lblQuenMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuenMatKhauMouseClicked
        this.dispose();
        email = new GUIEmail();
        email.setVisible(true);
    }//GEN-LAST:event_lblQuenMatKhauMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIDangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JCheckBox chkcheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblQuenMatKhau;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
