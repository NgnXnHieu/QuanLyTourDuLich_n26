package qltour.controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import qltour.bean.DanhMucBean;
import qltour.view.GuestJPanel;
import qltour.view.HoaDonJPanel;
import qltour.view.HoaDonJPanel;
import qltour.view.HopDongJPanel;
import qltour.view.LichTrinhJPanel;
import qltour.view.TongHopJPanel;
import qltour.view.TourJPanel;
import qltour.view.TrangChuJPanel;

public class changeview_controller extends DanhMucBean {

    private JPanel jplRoot;
    private String kind_slected = "";

    public changeview_controller(JPanel jplRoot) {
        this.jplRoot = jplRoot;
    }

    public void setview(JLabel jliteam) {
        kind_slected = "TrangChu";

        jliteam.setBackground(Color.red);
        jplRoot.removeAll();
        jplRoot.setLayout(new BorderLayout());
        jplRoot.add(new TrangChuJPanel());
        jplRoot.validate();
        jplRoot.repaint();
    }

    public void setEven(ArrayList<DanhMucBean> list) {
        for (DanhMucBean danhMucBean : list) {
           danhMucBean.getJlb().addMouseListener(new labeleven(danhMucBean.getKind(),danhMucBean.getJlb()));

        }
    }

    class labeleven implements MouseListener {

        private JPanel node;
        private String kind;
        private JLabel jlbitem;

        public labeleven(String kind, JLabel jlbitem) {
            this.kind = kind;
            this.jlbitem = jlbitem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "TrangChu":
                    node = new TrangChuJPanel();
                    break;
                case "Tour":
                    node = new TourJPanel();
                    break;
                case "Guest":
                    node = new GuestJPanel();
                    break;
                case "LichTrinh":
                    node = new LichTrinhJPanel();
                    break;
                case "HopDong":
                    node = new HopDongJPanel();
                    break;
                case "HoaDon":
                    node = new HoaDonJPanel();
                    break;
                case "ThongKe":
                    node = new TongHopJPanel();
                    break;
                default:
                    break;

            }
            jplRoot.removeAll();
            jplRoot.setLayout(new BorderLayout());
            jplRoot.add(node);
            jplRoot.validate();
            jplRoot.repaint();

//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mousePressed(MouseEvent e) {
//            kind_slected = kind;
//            jlbitem.setBackground(Color.LIGHT_GRAY);
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseReleased(MouseEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseEntered(MouseEvent e) {
                jlbitem.setForeground(Color.red);

//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!kind_slected.equalsIgnoreCase(kind)) {
                jlbitem.setForeground(Color.BLACK);

            }
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

    }

}
