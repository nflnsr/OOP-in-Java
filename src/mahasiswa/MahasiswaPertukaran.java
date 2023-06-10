package mahasiswa;

public class MahasiswaPertukaran extends Mahasiswa {

    private String universitasAsal;
    private int lamaPertukaran;
    private Boolean mhsPertukaran;

    public MahasiswaPertukaran(String nama, String tglLahir, String alamat, int umur, String noTelp, String nim,
            String jurusan, String email, String universitasAsal, int lamaPertukaran,
            Boolean mhsPertukaran) {
        super(nama, tglLahir, alamat, umur, noTelp, nim, jurusan, email);
        this.universitasAsal = universitasAsal;
        this.lamaPertukaran = lamaPertukaran;
        this.mhsPertukaran = mhsPertukaran;
    }

    public void cetakData() {
        super.cetakData(universitasAsal, lamaPertukaran, mhsPertukaran);
    }
}
