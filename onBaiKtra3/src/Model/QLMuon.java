package Model;

import java.io.Serializable;

public class QLMuon implements Serializable{
    private banDoc bandoc;
    private Sach sach;
    private int sluong;
    private String ttrang;
    
    public QLMuon(){}

    public QLMuon(banDoc bandoc, Sach sach, int sluong, String ttrang) {
        this.bandoc = bandoc;
        this.sach = sach;
        this.sluong = sluong;
        this.ttrang = ttrang;
    }

    public banDoc getBandoc() {
        return bandoc;
    }

    public void setBandoc(banDoc bandoc) {
        this.bandoc = bandoc;
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public int getSluong() {
        return sluong;
    }

    public void setSluong(int sluong) {
        this.sluong = sluong;
    }

    public String getTtrang() {
        return ttrang;
    }

    public void setTtrang(String ttrang) {
        this.ttrang = ttrang;
    }
    
    public Object[] toObject(){
        return new Object[]{
            bandoc.getMa(), bandoc.getHoten(),
            sach.getMa(), sach.getTen(),  
            sluong, ttrang
        };
    }
}
