package qltour.check_loi;

import java.util.ArrayList;
import javax.swing.JTextField;
import qltour.model.HoaDon;
import qltour.model.KhachHang;
import qltour.model.LichTrinh;
import qltour.model.Tour;

public class check_Loi {

    public  int erros_same_IDTour_v1(ArrayList<Tour> list, String s) {
        for (Tour tour : list) {
            if (tour.getID_Tour().trim().toLowerCase().equals(s.trim().toLowerCase())) {
                return 1;
            }
        }
        return -1;
    }

    public int erros_same_IDTour_v2(ArrayList<Tour> list, String newID, String oldID) {
        int indexOld = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID_Tour().trim().toLowerCase().equals(oldID.trim().toLowerCase())) {
                indexOld = i;
            }
        }
        if (indexOld != 1) {
            for (int i = 0; i < indexOld; i++) {
                if (list.get(i).getID_Tour().trim().toLowerCase().equals(newID.trim().toLowerCase())) {
                    return 1;
                }
            }
            for (int i = indexOld + 1; i < list.size(); i++) {
                if (list.get(i).getID_Tour().trim().toLowerCase().equals(newID.trim().toLowerCase())) {
                    return 1;
                }
            }

        }
        return -1;
    }
    public  int erros_same_IDKH_v1(ArrayList<KhachHang> list, String s) {
        for (KhachHang kh : list) {
            if (kh.getID_client().trim().toLowerCase().equals(s.trim().toLowerCase())) {
                return 1;
            }
        }
        return -1;
    }

    public int erros_same_IDKH_v2(ArrayList<KhachHang> list, String newID, String oldID) {
        int indexOld = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID_client().trim().toLowerCase().equals(oldID.trim().toLowerCase())) {
                indexOld = i;
            }
        }
        if (indexOld != 1) {
            for (int i = 0; i < indexOld; i++) {
                if (list.get(i).getID_client().trim().toLowerCase().equals(newID.trim().toLowerCase())) {
                    return 1;
                }
            }
            for (int i = indexOld + 1; i < list.size(); i++) {
                if (list.get(i).getID_client().trim().toLowerCase().equals(newID.trim().toLowerCase())) {
                    return 1;
                }
            }

        }
        return -1;
    }

    public int erros_same_IDLT_v1(ArrayList<LichTrinh> list, String s) {
        for ( LichTrinh lt: list) {
            if (lt.getID_lichTrinh().trim().toLowerCase().equals(s.trim().toLowerCase())) {
                return 1;
            }
        }
        return -1;
    }

    public int erros_same_IDLT_v2(ArrayList<LichTrinh> list, String newID , String oldID) {
int indexOld = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID_lichTrinh().trim().toLowerCase().equals(oldID.trim().toLowerCase())) {
                indexOld = i;
            }
        }
        if (indexOld != 1) {
            for (int i = 0; i < indexOld; i++) {
                if (list.get(i).getID_lichTrinh().trim().toLowerCase().equals(newID.trim().toLowerCase())) {
                    return 1;
                }
            }
            for (int i = indexOld + 1; i < list.size(); i++) {
                if (list.get(i).getID_lichTrinh().trim().toLowerCase().equals(newID.trim().toLowerCase())) {
                    return 1;
                }
            }

        }
        return -1;
    }
    public int erros_same_IDHD1_v1(ArrayList<HoaDon> list, String s) {
        for ( HoaDon lt: list) {
            if (lt.getID_HoaDon().trim().toLowerCase().equals(s.trim().toLowerCase())) {
                return 1;
            }
        }
        return -1;
    }
    public int erros_same_IDHD1_v2(ArrayList<HoaDon> list, String newID , String oldID) {
int indexOld = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID_HoaDon().trim().toLowerCase().equals(oldID.trim().toLowerCase())) {
                indexOld = i;
            }
        }
        if (indexOld != 1) {
            for (int i = 0; i < indexOld; i++) {
                if (list.get(i).getID_HoaDon().trim().toLowerCase().equals(newID.trim().toLowerCase())) {
                    return 1;
                }
            }
            for (int i = indexOld + 1; i < list.size(); i++) {
                if (list.get(i).getID_HoaDon().trim().toLowerCase().equals(newID.trim().toLowerCase())) {
                    return 1;
                }
            }

        }
        return -1;
    }

    
}
