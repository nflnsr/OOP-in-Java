package mahasiswa;

import abstractions.Orang;

public class Mahasiswa extends Orang implements interfaces.Tugas, interfaces.MataKuliah {
    private String nim;
    private String jurusan;
    private String email;

    public Mahasiswa(String nama, String tglLahir, String alamat, int umur, String noTelp, String nim, String jurusan,
            String email) {
        super(nama, tglLahir, alamat, umur, noTelp);
        this.nim = nim;
        this.jurusan = jurusan;
        this.email = email;
    }

    @Override
    public void cetakData(Object... args) {
        if (args.length == 0) {
            super.cetakData();
            System.out.println("NIM        : " + nim);
            System.out.println("Jurusan    : " + jurusan);
            System.out.println("Email      : " + email);
        } else if (args.length == 2) {
            System.out.println("\n");
            super.cetakData();
            System.out.println("NIM        : " + nim);
            System.out.println("Jurusan    : " + jurusan);
            System.out.println("Email      : " + email);
            System.out.println("KIP        : " + args[0]);
            System.out.println("No KIP     : " + args[1]);
        } else if (args.length == 3) {
            System.out.println("\n");
            super.cetakData();
            System.out.println("NIM        : " + nim);
            System.out.println("Jurusan    : " + jurusan);
            System.out.println("Email      : " + email);
            System.out.println("Univ Asal  : " + args[0]);
            System.out.println("Lama Wkt   : " + args[1]);
            System.out.println("Mhs Asing  : " + args[2]);
        }
    }

    @Override
    public void ikutiMK() {
        System.out.println("Mahasiswa mengikuti mata kuliah");
    }

    @Override
    public void tinggalkanMK() {
        System.out.println("Mahasiswa meninggalkan mata kuliah");
    }

    @Override
    public void kerjakanTugas() {
        System.out.println("Mahasiswa mengerjakan tugas");
    }

    @Override
    public void abaikanTugas() {
        System.out.println("Mahasiswa mengabaikan tugas");
    }
}
