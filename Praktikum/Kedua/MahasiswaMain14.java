package Praktikum.kedua;
public class MahasiswaMain14 {
    public static void main(String[] args) {
        Mahasiswa14 mhs1 = new Mahasiswa14("Muhammad Ali Farhan", "2241720171", "SI 2J", 3.55);
        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();
    }
}