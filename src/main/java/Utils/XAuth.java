/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import Entity.KhachHang;

/**
 *
 * @author Phong
 */
public class XAuth {
    /*
    Chứa thông tin khách hàng sau khi đăng nhập
    */
    public static KhachHang staff = null;
    
    /*
    xóa thông tin khách hàng khi có yêu cầu đăng xuất
    */
    public static void clear(){
        XAuth.staff = null;
    }
    
    /*
     * Kiểm tra xem đã đăng nhập hay chưa
     */
    public static boolean Login() {
        return XAuth.staff != null;
    }
    
    
}
