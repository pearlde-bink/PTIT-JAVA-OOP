package model;

import java.io.Serializable;

public class banDoc implements Serializable{
    private int ma;
    private String hoten, diachi, sdt;
    private static int sma = 10000;

    public banDoc(int ma, String hoten, String diachi, String sdt) {
        this.ma = ma;
        this.hoten = hoten;
        this.diachi = diachi;
        this.sdt = sdt;
    }
    
    public banDoc(){}

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        banDoc.sma = sma;
    }
    
    public Object[] toObject(){
        return new Object[]{
            ma, hoten, diachi, sdt
        };
    }
}
