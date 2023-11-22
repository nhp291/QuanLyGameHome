package Entity;

import javax.swing.JTextField;

public class InHoaDon {

    
    private JTextField txtmaHD;
    private JTextField txtmaNV;
    private JTextField txtmaMay;
    private JTextField txtTongTien;
    private JTextField txtda;
    private JTextField txtdu;
    private JTextField txtnt;

    // các phương thức getter
    public String getTxtmaHD() {
        return txtmaHD.getText();
    }

    public String getTxtmaNV() {
        return txtmaNV.getText();
    }

    public String getTxtmaMay() {
        return txtmaMay.getText();
    }

    public String getTxtTongTien() {
        return txtTongTien.getText();
    }

    public String getTxtda() {
        return txtda.getText();
    }

    public String getTxtdu() {
        return txtdu.getText();
    }

    public String getTxtnt() {
        return txtnt.getText();
    }

    // các phương thức setter
    public void setTxtmaHD(String txtmaHD) {
        this.txtmaHD.setText(txtmaHD);
    }

    public void setTxtmaNV(String txtmaNV) {
        this.txtmaNV.setText(txtmaNV);
    }

    public void setTxtmaMay(String txtmaMay) {
        this.txtmaMay.setText(txtmaMay);
    }

    public void setTxtTongTien(String txtTongTien) {
        this.txtTongTien.setText(txtTongTien);
    }

    public void setTxtda(String txtda) {
        this.txtda.setText(txtda);
    }

    public void setTxtdu(String txtdu) {
        this.txtdu.setText(txtdu);
    }

    public void setTxtnt(String txtnt) {
        this.txtnt.setText(txtnt);
    }

}
