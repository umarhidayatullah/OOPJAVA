package Form_OOP;

public class Ratarata {
    public double nilai1, nilai2, nilaiRata;
    public double getNilai1() {
        return nilai1;
    }
    public void setNilai1(double nilai1) {
        this.nilai1 = nilai1;
    }
    public double getNilai2() {
        return nilai2;
    }
    public void setNilai2(double nilai2) {
        this.nilai2 = nilai2;
    }
    public double getNilaiRata() {
        return (nilai1 + nilai2)/2;
    }
}
