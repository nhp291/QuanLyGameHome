/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Phong
 */
public class Validate {
    
    /*
    Ktr thời gian chạy còn lại
    */
    public static boolean checkThoiLuong(JTextField txt) {
        try {
            int hour = Integer.parseInt(txt.getText());
            if (hour >= 0) {
                return true;
            } else {
                Dialog.alert(txt.getRootPane(), txt.getToolTipText() + " phải lớn hơn bằng 0.");
                return false;
            }
        } catch (NumberFormatException e) {
            Dialog.alert(txt.getRootPane(), txt.getToolTipText() + " phải là số nguyên.");
            return false;
        }
    }
    
    /*
    ktr nạp tiền 
    */
    public static boolean checkNapTien(JTextField txt) {
        try {
            float NT = Float.parseFloat(txt.getText());
            if (NT >= 0) {
                return true;
            } else {
                Dialog.alert(txt.getRootPane(), txt.getToolTipText() + " phải là lớn hơn 0.");
                return false;
            }
        } catch (NumberFormatException e) {
            Dialog.alert(txt.getRootPane(), txt.getToolTipText() + " phải là số thực.");
            return false;
        }
    }
    
    /*
     * Kiểm thử mã khách hàng
     */
    public static boolean checkMaKH(JTextField txt) {
        String id = txt.getText();
        String rgx = "[a-zA-Z0-9]{7}";
        if (id.matches(rgx)) {
            return true;
        } else {
            Dialog.alert(txt.getRootPane(), txt.getToolTipText() + " phải có đúng 7 kí tự\n(chữ hoa, thường không dấu hoặc số).");
            return false;
        }
    }
    
    /*
     * Kiểm thử mã nhân viên
     */
    public static boolean checkMaNV(JTextField txt) {
        String id = txt.getText();
        String rgx = "[a-zA-Z0-9]{7}";
        if (id.matches(rgx)) {
            return true;
        } else {
            Dialog.alert(txt.getRootPane(), txt.getToolTipText() + " phải có đúng 7 kí tự\n(chữ hoa, thường không dấu hoặc số).");
            return false;
        }
    }
    
    /*
     * Kiểm thử tên Nhân Viên, Người Học
     */
    public static boolean checkName(JTextField txt) {
        String id = txt.getText();
        String rgx = "^[A-Za-zÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ ]{3,25}$";
        if (id.matches(rgx)) {
            return true;
        } else {
            Dialog.alert(txt.getRootPane(), txt.getToolTipText() + " phải là tên có dấu hoặc không và từ 3-25 kí tự.");
            return false;
        }
    }
    
    /*
     * Kiểm thử mật khẩu Nhân Viên, khách hàng
     */
    public static boolean checkPassNV_KH(JPasswordField txt) {
        if (txt.getPassword().length > 2 && txt.getPassword().length < 17) {
            return true;
        } else {
            Dialog.alert(txt.getRootPane(), txt.getToolTipText() + " phải có từ 3-16 kí tự.");
            return false;
        }
    }
    
//    public static boolean checkTrungNH(JTextField txt) {
//        if (nhdao.selectById(txt.getText()) == null) {
//            return true;
//        } else {
//            Dialog.alert(txt.getRootPane(), "Mã người học '" + txt.getText() + "' đã tồn tại.");
//            return false;
//        }
//    }
    
    /*
     * Kiểm thử ngày tháng năm
     */
    public static boolean isValidDate(String date) {
        if (date == null) {
            return false;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        if (date.trim().length() != sdf.toPattern().length()) {
            return false;
        }
        sdf.setLenient(false);
        try {
            sdf.parse(date.trim());
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    /*
     * Kiểm thử ngày tháng năm
     */
    public static boolean checkDate(JTextField txt) {
        String date = txt.getText();
        if (isValidDate(date)) {
            return true;
        } else {
            Dialog.alert(txt.getRootPane(), "Không đúng định dạng dd/MM/yyyy.");
            return false;
        }
    }
    
    /*
     * Kiểm thử Email
     */
    public static boolean checkEmail(JTextField txt) {
        String id = txt.getText();
        String rgx = "^[a-zA-Z][a-zA-Z0-9_\\.]{5,32}@[a-zA-Z0-9]{2,}(\\.[a-zA-Z0-9]{2,5}){1,2}$";
        if (id.matches(rgx)) {
            return true;
        } else {
            Dialog.alert(txt.getRootPane(), txt.getToolTipText() + " không đúng định dạng (ký tự có dấu)"
                    + "\nhoặc bị giới hạn kí tự cho phép.");
            return false;
        }
    }
    
    /*
     * Kiểm thử nhập rỗng TextField
     */
    public static boolean checkNullText(JTextField txt) {
        if (txt.getText().trim().length() > 0) {
            return true;
        } else {
            Dialog.alert(txt.getRootPane(), txt.getToolTipText() + " không được để trống.");
            return false;
        }
    }
    
    /*
     * Kiểm thử nhập rỗng TextArea
     */
    public static boolean checkNullText(JTextArea txt) {
        if (txt.getText().trim().length() > 0) {
            return true;
        } else {
            Dialog.alert(txt.getRootPane(), txt.getToolTipText() + " không được để trống.");
            return false;
        }
    }
    
    /*
     * Kiểm tra mật khẩu rỗng
     */
    public static boolean checkNullPass(JPasswordField txt) {
        if (txt.getPassword().length > 0) {
            return true;
        } else {
            Dialog.alert(txt.getRootPane(), txt.getToolTipText() + " không được để trống.");
            return false;
        }
    }

    /*
     * Kiểm tra ảnh chưa được chọn
     */
    public static boolean checkNullHinh(JLabel lbl) {
        if (lbl.getToolTipText() != null) {
            return true;
        } else {
            Dialog.alert(lbl.getRootPane(), lbl.getToolTipText() + " không được để trống.");
            return false;
        }
    }
}
