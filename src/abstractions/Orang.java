package abstractions;

public abstract class Orang {
    public String nama;
    public String tglLahir;
    public String alamat;
    public int umur;
    public String noTelp;

    public Orang(String nama, String tglLahir, String alamat, int umur, String noTelp) {
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.alamat = alamat;
        this.umur = umur;
        this.noTelp = noTelp;
    }
    
    public String getNama() {
        return nama;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getUmur() {
        return umur;
    }
    
    public String getNoTelp() {
        return noTelp;
    }

    public void cetakData(Object... args){
            System.out.println("Nama       : " + getNama());
            System.out.println("Tgl Lahir  : " + getTglLahir());
            System.out.println("Alamat     : " + getAlamat());
            System.out.println("Umur       : " + getUmur());
            System.out.println("No Telp    : " + getNoTelp());
    };
}
