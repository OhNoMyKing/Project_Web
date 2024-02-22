package test.demo.entity;


import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
@Entity
@Table(name="home")
public class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "sanpham")
    private String listingtypes;
    @Column(name = "dichvu")
    private String offertype;
    @Column(name = "thanhpho")
    private String selectcity;

    @Column(name = "ten")
    private String ten;
    @Column(name = "giatien")
    private String giatien;
    @Column(name = "sophong")
    private String sophong;

    //

    public Home() {
    }
    //

    public Home(int id, String listingtypes, String offertype, String selectcity, String ten, String giatien, String sophong) {
        this.id = id;
        this.listingtypes = listingtypes;
        this.offertype = offertype;
        this.selectcity = selectcity;
        this.ten = ten;
        this.giatien = giatien;
        this.sophong = sophong;
    }
    //

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getListingtypes() {
        return listingtypes;
    }

    public void setListingtypes(String listingtypes) {
        this.listingtypes = listingtypes;
    }

    public String getOffertype() {
        return offertype;
    }

    public void setOffertype(String offertype) {
        this.offertype = offertype;
    }

    public String getSelectcity() {
        return selectcity;
    }

    public void setSelectcity(String selectcity) {
        this.selectcity = selectcity;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGiatien() {
        return giatien;
    }

    public void setGiatien(String giatien) {
        this.giatien = giatien;
    }

    public String getSophong() {
        return sophong;
    }

    public void setSophong(String sophong) {
        this.sophong = sophong;
    }
}