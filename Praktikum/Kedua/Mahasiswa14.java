package Praktikum.kedua;
public class Mahasiswa14 {
    private String nama;
    private String nim;
    private String kelas;
    private double ipk;

    public Mahasiswa14(String nama, String nim, String kelas, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    public void tampilkanInformasi() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("IPK   : " + ipk);
        System.out.println("Kelas : " + kelas);
    }
    public void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }
    public void updateIpk(double ipkBaru) {
        ipk = ipkBaru;
    }
    public String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
}
