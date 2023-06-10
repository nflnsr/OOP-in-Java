package pekerja;

public class PekerjaPemerintah extends Pekerja {

    private String wktPensiun;
    private String divisi;

    public PekerjaPemerintah(String nama, String tglLahir, String alamat, int umur, String noTelp, String jabatan, String departemen, String tglMasuk, String gaji, String wktPensiun, String divisi) {
        super(nama, tglLahir, alamat, umur, noTelp, jabatan, departemen, tglMasuk, gaji);
        this.wktPensiun = wktPensiun;
        this.divisi = divisi;
    }

    public void cetakData(){
        super.cetakData(wktPensiun, divisi);
    }    
}
