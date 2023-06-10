package mahasiswa;

public class MahasiswaKIP extends Mahasiswa {

    private Boolean kip;
    private String noKip;

    public MahasiswaKIP(String nama, String tglLahir, String alamat, int umur, String noTelp, String nim,
            String jurusan, String email, Boolean kip, String noKip) {
        super(nama, tglLahir, alamat, umur, noTelp, nim, jurusan, email);
        this.kip = kip;
        this.noKip = noKip;
    }

    public void cetakData() {
        super.cetakData(kip, noKip);
    }
}
