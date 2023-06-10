package pekerja.driver;

import pekerja.Pekerja;
import pekerja.PekerjaPemerintah;

public class CalonPekerja {
    public static void main(String[] args) {
        Pekerja pekerja1 = new Pekerja("Naufal Nasrullah", "20 Januari", "Tangerang", 21,
                "082293105626", "Fullstack", "Teknologi", "20 Januari 2020", "Rp 12.000.000");
        PekerjaPemerintah pekerja2 = new PekerjaPemerintah("Naufal Nasrullah", "20 Januari", "Tangerang", 21,
                "082293105626", "Pegawai", "Pemerintah", "20 Januari 2020", "Rp 7.500.000", "20 Januari 2030",
                "Pengajar");

        pekerja1.cetakData();
        pekerja1.kerjainKerjaan();

        pekerja2.cetakData();
        pekerja2.abaikanKerjaan();
    }
}
