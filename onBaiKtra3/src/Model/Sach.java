package Model;

import java.io.Serializable;

public class Sach implements Serializable{
    private int ma, sluong;
    private String ten, tg, cn;
    private static int sma = 10000;
    
    public Sach(){
        ma = sma++;
    }

    public Sach(int ma, String ten, String tg, String cn, int sluong) {
        this.ma = ma;
        this.sluong = sluong;
        this.ten = ten;
        this.tg = tg;
        this.cn = cn;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getSluong() {
        return sluong;
    }

    public void setSluong(int sluong) {
        this.sluong = sluong;
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

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Sach.sma = sma;
    }
    
    public Object[] toObject(){
        return new Object[]{
            ma, ten, tg, cn, sluong
        };
    }
}
