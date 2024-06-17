
package qltour.model;

import java.io.Serializable;
import java.util.Date;

public class HoaDon implements Serializable{
    private String ID_HoaDon;
    private String ID_HopDong;
    private String ID_LT;
    private String NgTao ;
    private Double gia ;
    private String trangThai;
    private String ngay;

    public HoaDon() {
    }

    public HoaDon(String ID_HoaDon, String ID_HopDong, String ID_LT, String NgTao, Double gia, String trangThai, String ngay) {
        this.ID_HoaDon = ID_HoaDon;
        this.ID_HopDong = ID_HopDong;
        this.ID_LT = ID_LT;
        this.NgTao = NgTao;
        this.gia = gia;
        this.trangThai = trangThai;
        this.ngay = ngay;
    }

    public String getID_HoaDon() {
        return ID_HoaDon;
    }

    public void setID_HoaDon(String ID_HoaDon) {
        this.ID_HoaDon = ID_HoaDon;
    }

    public String getID_HopDong() {
        return ID_HopDong;
    }

    public void setID_HopDong(String ID_HopDong) {
        this.ID_HopDong = ID_HopDong;
    }

    public String getID_LT() {
        return ID_LT;
    }

    public void setID_LT(String ID_LT) {
        this.ID_LT = ID_LT;
    }

    public String getNgTao() {
        return NgTao;
    }

    public void setNgTao(String NgTao) {
        this.NgTao = NgTao;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    
}
