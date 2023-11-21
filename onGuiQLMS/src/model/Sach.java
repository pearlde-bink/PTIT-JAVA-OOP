package model;

import java.io.Serializable;

public class Sach implements Serializable{
    private int ma;
    private String ten, tg, cn;
    private int slg;
    private static int sma = 10000;
    
    public Sach(){
        ma = sma++;
    }

    public Sach(int ma, String ten, String tg, String cn, int slg) {
        this.ma = ma;
        this.ten = ten;
        this.tg = tg;
        this.cn = cn;
        this.slg = slg;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTg() {
        return tg;
    }

    public void setTg(String tg) {
        this.tg = tg;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public int getSlg() {
        return slg;
    }

    public void setSlg(int slg) {
        this.slg = slg;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Sach.sma = sma;
    }
    
    public Object[] toObject(){
        return new Object[]{
            ma, ten, tg, cn, slg
        };
    }
    
}
