package YouTube;

public class Perpustakaan {
    private String code, name, member, tanggal;
    private int biaya, lamaPinjam, total, bayar, kembalian;
    private String[] buku = {"Animal Life", "History of Java", "Macro Economics", "World War II", "Aristoteles", "Alan Turing: the Man of CS", "Computer Science", "Geospasial", "World Bank", "The Messengers", "Prophet Mohammed", "Napoleon Bonaparte", "Communist againts the world", "Adam Smith", "Chemistry", "Biology", "Math fun", "Football", "Algorithm", "Data Analyst", "Data Scientist", "Robot processing automation", "Machine Learning", "Deep Learning", "UI/UX", "Android Studio", "Jengis Khan", "Ottoman empire", "Psychology", "After die", "Positive Income", "Build Application", "Visioner"};


    public void setCode(String kd) {;
        code = kd;
    }

    public String getName() {
        for(int i = 0; i < buku.length; i++) {
            if(buku[i].charAt(1) == code.charAt(0)) {
                name = buku[i];
            }
        }
        return name;
    }

    public void setMember(String m) {
        member = m;
    }

    public int getBiaya() {
        if(member.equalsIgnoreCase("School")) {
            biaya = 1000;
        }
        if (member.equalsIgnoreCase("Personal")) {
            biaya = 2000;
        }
        return biaya;
    }

    public void setTanggal(String t, String b, String thn) {
        tanggal = t + "/" + b + "/" + thn;
    }
    public String getTanggal() {
        return tanggal;
    }

    public void setLamaPinjam(int la) {
        lamaPinjam = la;
    }

    public int getTotal() {
        total = biaya * lamaPinjam;
        return total;
    }

    public void setBayar(int bay) {
        bayar = bay;
    }

    public int getKembalian() {
        kembalian = bayar - total;
        return kembalian;
    }
}
