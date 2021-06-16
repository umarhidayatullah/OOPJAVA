package Binus;

public class Rumah {
    public String lokasi, jog, swim, gym, cara;
    public double getHrg() {
        return hrg;
    }
    public double hrg, hrg_j, hrg_s, hrg_g, biaya, total;
    public void setLokasi(String s) {
        this.lokasi = s;
    }
    public void setSeleksiLok() {
        if(lokasi.equalsIgnoreCase("Kebayoran")) {
            hrg = 2000;
        } else if (lokasi.equalsIgnoreCase("Kemayoran")) {
            hrg = 1000;
        } else if (lokasi.equalsIgnoreCase("Ketapang")) {
            hrg = 500;
        } else {
            hrg = 0;
        }
    }
    public double getJog() {
        if (jog.equalsIgnoreCase("Jogging Track")) {
            hrg_j = 5000;
        } else {
            hrg_j = 0;
        }
        return hrg_j;
    }
    public void setJog(String jog) {
        this.jog = jog;
    }
    public double getSwim() {
        if (swim.equalsIgnoreCase("Swimming Pool")) {
            hrg_s = 5000;
        } else {
            hrg_s = 0;
        }
        return hrg_s;
    }
    public void setSwim(String swim) {
        this.swim = swim;
    }
    public double getGym() {
        if(gym.equalsIgnoreCase("Gymnasium")) {
            hrg_g = 5000;
        } else {
            hrg_g = 0;
        }
        return hrg_g;
    }
    public void setGym(String gym) {
        this.gym = gym;
    }
    public double getbiaya() {
        return biaya;
    }
    public String getCara() { return cara.toLowerCase(); }
    public void setCara(String cara) {
        this.cara = cara;
    }
    public void setSeleksiCara() {
        if(cara.equalsIgnoreCase("BCA")) {
            biaya = 10000;
        } else if (cara.equalsIgnoreCase("Mandiri")) {
            biaya = 10000;
        } else {
            biaya = 0;
        }
    }
    public double getTotal() {
        return (hrg + hrg_g + hrg_s + hrg_j + biaya);
    }
}
