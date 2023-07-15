# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama, usia, pendapatan yang dimana aplikasi ini di gunakan untuk  orang yang tidak bisa manajement keuangan di bagi untuk menabung, bersenang-senang dan investasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `pengguna`, `ObjekPengguna`, dan `PenggunaBeraksi` adalah contoh dari class.

```bash
public class pengguna {
    ...
}

public class ObjekPengguna extends pengguna {
    ...
}

public class PenggunaBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `ObjekPengguna[] penggunaArray = new ObjekPengguna[jumlahPengguna];` adalah contoh pembuatan object.

```bash
ObjekPengguna[] penggunaArray = new ObjekPengguna[jumlahPengguna];
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `usia`, `pendapatan`, `tabungan`, `bersenangSenang`, dan `investasi` adalah contoh atribut.

```bash
    private String nama;
    int usia;
    private double pendapatan,tabungan,bersenangSenang,investasi;

```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `pengguna`.

```bash
    public pengguna(String nama, int usia, double pendapatan) {
    this.nama = nama;
    this.usia = usia;
    this.pendapatan = pendapatan;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`, `setUsia` dan `setPendapatan` adalah contoh method mutator.

```bash
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getUsia`, `getPendapatan` adalah contoh method accessor.

```bash
    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public double getPendapatan() {
        return pendapatan;
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `pendapatan` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
    private String nama;
    int usia;
    private double pendapatan,tabungan,bersenangSenang,investasi;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MahasiswaDetail` mewarisi `Mahasiswa` dengan sintaks `extends`.

```bash
public class ObjekPengguna extends pengguna {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `MahasiswaDetail` merupakan override dari method `displayInfo` di `Mahasiswa`.

```bash
public String displayInfo() {
        return "Nama: " + getNama() + "\nUsia: " + getUsia() + "\nPendapatan: " + getPendapatan();
    }

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getFakultas` dan seleksi `switch` dalam method `getProdi`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < jumlahPengguna; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
import java.util.Scanner;
Scanner scanner = new Scanner(System.in);
for (int i = 0; i < jumlahPengguna; i++) {
                System.out.println("Data Pengguna ke-" + (i + 1));
                scanner.nextLine(); // Membersihkan newline karakter dari input sebelumnya

                System.out.print("Nama: ");
                String nama = scanner.nextLine();

                System.out.print("Usia: ");
                int usia = scanner.nextInt();

                System.out.print("Masukan Pendapatan Anda (dalam Rupiah): Rp. ");
                double pendapatan = scanner.nextDouble();

System.out.println("\nData pengguna:");
System.out.println(pengguna.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `ObjekPengguna[] penggunaArray = new ObjekPengguna[jumlahPengguna];` adalah contoh penggunaan array.

```bash
ObjekPengguna[] penggunaArray = new ObjekPengguna[jumlahPengguna];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
} catch (InputMismatchException e) { //pengecualian
  System.out.println("Terjadi kesalahan: Input tidak valid");
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Mochammad Alif Ramadhan
NPM: 2110010172
