
package qltour.model;

import java.io.Serializable;
import java.util.Date;

public class LichTrinh implements Serializable {
    private String ID_lichTrinh;
    private String kh;
    private String tour;
    private String date_start;
    private String date_end;
    private double soKhach;
    private String HDV;
    private String trangThai;

    public LichTrinh(String ID_lichTrinh, String kh, String tour, String date_start, String date_end, double soKhach, String HDV, String trangThai) {
        this.ID_lichTrinh = ID_lichTrinh;
        this.kh = kh;
        this.tour = tour;
        this.date_start = date_start;
        this.date_end = date_end;
        this.soKhach = soKhach;
        this.HDV = HDV;
        this.trangThai = trangThai;
    }

    public String getID_lichTrinh() {
        return ID_lichTrinh;
    }

    public void setID_lichTrinh(String ID_lichTrinh) {
        this.ID_lichTrinh = ID_lichTrinh;
    }

    public String getKh() {
        return kh;
    }

    public void setKh(String kh) {
        this.kh = kh;
    }

    public String getTour() {
        return tour;
    }

    public void setTour(String tour) {
        this.tour = tour;
    }

    public String getDate_start() {
        return date_start;
    }

    public void setDate_start(String date_start) {
        this.date_start = date_start;
    }

    public String getDate_end() {
        return date_end;
    }

    public void setDate_end(String date_end) {
        this.date_end = date_end;
    }

    public double getSoKhach() {
        return soKhach;
    }

    public void setSoKhach(double soKhach) {
        this.soKhach = soKhach;
    }

    public String getHDV() {
        return HDV;
    }

    public void setHDV(String HDV) {
        this.HDV = HDV;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    
}

    
    