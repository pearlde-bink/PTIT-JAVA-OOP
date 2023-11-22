package model;

import java.io.Serializable;

public class Tuyen  implements Serializable{
    private int ma, kc, stop;
    private static int sma = 100;
    
    public Tuyen(){
        ma = sma++;
    }

    public Tuyen(int ma, int kc, int stop) {
        this.ma = ma;
        this.kc = kc;
        this.stop = stop;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getKc() {
        return kc;
    }

    public void setKc(int kc) {
        this.kc = kc;
    }

    public int getStop() {
        return stop;
    }

    public void setStop(int stop) {
        this.stop = stop;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Tuyen.sma = sma;
    }
    
    public Object[] toObject(){
        return new Object[]{
            ma, kc, stop
        };
    }
}
