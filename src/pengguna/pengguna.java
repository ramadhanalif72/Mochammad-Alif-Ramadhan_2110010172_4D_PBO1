
package pengguna;

// class
public class pengguna {
    //encapsulasi
    private String nama;
    int usia;
    private double pendapatan,tabungan,bersenangSenang,investasi;

    
    //construktor
    public pengguna(String nama, int usia, double pendapatan) {
    this.nama = nama;
    this.usia = usia;
    this.pendapatan = pendapatan;
    }
    
    //accecor
    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    // Mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }
    
    //polarsym
    public String displayInfo() {
        return "Nama: " + getNama() + "\nUsia: " + getUsia() + "\nPendapatan: " + getPendapatan();
    }
}




