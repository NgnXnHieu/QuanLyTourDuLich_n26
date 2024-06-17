
package qltour.model;

import java.io.Serializable;

public class KhachHang implements Serializable{
    private String ID_client;
    private String name_client;
    private String phone;
    private String CMND;
    private String home_town;
    private String email;
    private String notes;
    private String sex;

    public KhachHang(String ID_client, String name_client, String phone, String CMND, String home_town, String email, String notes, String sex) {
        this.ID_client = ID_client;
        this.name_client = name_client;
        this.phone = phone;
        this.CMND = CMND;
        this.home_town = home_town;
        this.email = email;
        this.notes = notes;
        this.sex = sex;
    }

    public KhachHang() {
    }

    
    public String getID_client() {
        return ID_client;
    }

    public void setID_client(String ID_client) {
        this.ID_client = ID_client;
    }

    public String getName_client() {
        return name_client;
    }

    public void setName_client(String name_client) {
        this.name_client = name_client;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getHome_town() {
        return home_town;
    }

    public void setHome_town(String home_town) {
        this.home_town = home_town;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
}
