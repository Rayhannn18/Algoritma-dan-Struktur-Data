package Praktikum.kedua;
public class MahasiswaMain14 {
    public static void main(String[] args) {
        Mahasiswa14 mhs1 = new Mahasiswa14("Muhammad Ali Farhan", "2241720171", "SI 2J", 3.55);
        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa14 mhs2 = new Mahasiswa14("Annisa Nabila", "2141720106", "TI 2L", 3.25);
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa14 mhs3 = new Mahasiswa14("Faiza Novyta", "2141724253", "SI 2D", 3.68);
        mhs3.updateIpk(3.98);
        mhs3.tampilkanInformasi();
    }
}
