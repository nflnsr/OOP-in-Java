package pekerja;

import abstractions.Orang;

public class Pekerja extends Orang implements interfaces.Kerjaan {
    private String jabatan;
    private String departemen;
    private String tglMasuk;
    private String gaji;

    public Pekerja(String nama, String tglLahir, String alamat, int umur, String noTelp, String jabatan,
            String departemen, String tglMasuk, String gaji) {
        super(nama, tglLahir, alamat, umur, noTelp);
        this.jabatan = jabatan;
        this.departemen = departemen;
        this.tglMasuk = tglMasuk;
        this.gaji = gaji;
    }

    @Override
    public void cetakData(Object... args) {
        if (args.length == 0) {
            super.cetakData();
            System.out.println("Jabatan    : " + jabatan);
            System.out.println("Departemen : " + departemen);
            System.out.println("Tgl Masuk  : " + tglMasuk);
            System.out.println("Gaji       : " + gaji);
        } else if (args.length == 2) {
            System.out.println("\n");
            super.cetakData();
            System.out.println("Jabatan    : " + jabatan);
            System.out.println("Departemen : " + departemen);
            System.out.println("Tgl Masuk  : " + tglMasuk);
            System.out.println("Gaji       : " + gaji);
            System.out.println("Wkt Pensi  : " + args[0]);
            System.out.println("Divisi     : " + args[1]);
        }
    }

    @Override
    public void kerjainKerjaan(){
        System.out.println("Mengerjakan tugas-tugas kantor");
    }

    @Override
    public void abaikanKerjaan(){
        System.out.println("Mengabaikan tugas-tugas kantor");
    }

}