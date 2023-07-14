
package pengguna;

// inheritance
public class ObjekPengguna extends pengguna {
    public ObjekPengguna(String nama, int usia, double pendapatan) {
        super(nama, usia, pendapatan); //pemanggilan konstruktor superclass
    }

    // Override metode dari superclass
    public String getKelompokUsia() {
        if (getUsia() >= 0 && getUsia() <= 12) {
            return "Anak-anak";
        } else if (getUsia() >= 13 && getUsia() <= 17) {
            return "Remaja";
        } else if (getUsia() >= 18 && getUsia() <= 59) {
            return "Dewasa";
        } else {
            return "Lansia";
        }
    }
}

