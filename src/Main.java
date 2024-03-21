import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa {
    private String nim;
    private String nama;
    private String jurusan;


    public Mahasiswa(String nim, String nama, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void tampilDataMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
    }

    public static void tampilUniversitas() {
        System.out.println("Universitas Muhammadiyah Malang");

    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Exit");
            System.out.print("Pilihan Anda: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    scanner.nextLine();
                    String nama = scanner.nextLine();

                    String nim;
                    do {
                        System.out.print("Masukkan NIM: ");
                        nim = scanner.next();
                        if (nim.length() != 15) {
                            System.out.println("Panjang NIM harus 15 Digit. Coba lagi.");
                        }
                    } while (nim.length() != 15);

                    System.out.print("Masukkan Jurusan: ");
                    scanner.nextLine();
                    String jurusan = scanner.nextLine();


                    daftarMahasiswa.add(new Mahasiswa(nim, nama, jurusan));
                    System.out.println("Data mahasiswa berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.println("Data Mahasiswa:");
                    Mahasiswa.tampilUniversitas();
                    for (Mahasiswa mahasiswa : daftarMahasiswa) {
                        mahasiswa.tampilDataMahasiswa();
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Sangkyu!");
                    scanner.close(); //
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valdi Silakan pilih kembali.");
            }
        }
    }
}