package Java;

public class Barang {
    public String kd,nm;
    public int jml;
    public double hrg,ub;

    public void setKd(String kd) {
        this.kd = kd;
    }
    public void setSeleksiKd() {
        if(kd.equalsIgnoreCase("B001")){
            nm="Pencil";
            hrg=3000;
        }else if(kd.equalsIgnoreCase("B002")){
            nm="Buku";
            hrg=5000;
        }else if(kd.equalsIgnoreCase("B003")){
            nm="Penggaris";
            hrg=1000;
        }else if(kd.equalsIgnoreCase("B004")){
            nm="Penghapus";
            hrg=500;
        }else {
            nm="";
            hrg=0;
        }
    }
    public String getNm() {
        return nm;
    }
    public double getHrg() {
        return hrg;
    }
    public void setJml(int jml) {
        this.jml = jml;
    }
    public double getTtl() {
        return hrg*jml;
    }
    public void setUb(double ub) {
        this.ub = ub;
    }
    public double getUb() { return ub;}
    public double getUk() {
        return (ub-getTtl());
    }



}
