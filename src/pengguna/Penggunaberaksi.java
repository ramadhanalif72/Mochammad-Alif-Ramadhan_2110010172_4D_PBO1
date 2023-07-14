package pengguna;

import java.text.DecimalFormat; //mengubah format angka
import java.util.InputMismatchException; //error heading
import java.util.Scanner; //input

public class Penggunaberaksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Masukkan jumlah pengguna: ");
            int jumlahPengguna = scanner.nextInt();

            // Array
            ObjekPengguna[] penggunaArray = new ObjekPengguna[jumlahPengguna];

            DecimalFormat decimalFormat = new DecimalFormat("#,###"); //# mewakili angka

            // Perulangan
            for (int i = 0; i < jumlahPengguna; i++) {
                System.out.println("Data Pengguna ke-" + (i + 1));
                scanner.nextLine(); // Membersihkan newline karakter dari input sebelumnya

                System.out.print("Nama: ");
                String nama = scanner.nextLine();

                System.out.print("Usia: ");
                int usia = scanner.nextInt();

                System.out.print("Masukan Pendapatan Anda (dalam Rupiah): Rp. ");
                double pendapatan = scanner.nextDouble();

                penggunaArray[i] = new ObjekPengguna(nama, usia, pendapatan);
            }

            System.out.println("\nData Pengguna:");

            for (ObjekPengguna pengguna : penggunaArray) {
                System.out.println("Nama: " + pengguna.getNama());
                System.out.println("Usia: " + pengguna.getUsia());
                System.out.println("Pendapatan: Rp " + decimalFormat.format(pengguna.getPendapatan()));
                System.out.println("Kelompok Usia: " + pengguna.getKelompokUsia());

                // Perhitungan pendapatan
                double tabungan = pengguna.getPendapatan() * 0.1; //10%
                double bersenangSenang = pengguna.getPendapatan() * 0.5; //50%
                double investasi = pengguna.getPendapatan() * 0.4; //40%
                
                //untuk keluaran dari pendapatan
                System.out.println("Yang Tabungan: Rp " + decimalFormat.format(tabungan)); //memformat nilai tabungan
                System.out.println("Bersenang-senang: Rp " + decimalFormat.format(bersenangSenang));
                System.out.println("Harus Investasi: Rp " + decimalFormat.format(investasi));
                System.out.println();
            }
            
        } catch (InputMismatchException e) { //pengecualian
            System.out.println("Terjadi kesalahan: Input tidak valid");
        } finally {
            scanner.close();
        }
    }
}
