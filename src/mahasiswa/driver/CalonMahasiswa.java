package mahasiswa.driver;

import mahasiswa.Mahasiswa;
import mahasiswa.MahasiswaKIP;
import mahasiswa.MahasiswaPertukaran;

public class CalonMahasiswa {
        public static void main(String[] args) {
                Mahasiswa mhs1 = new Mahasiswa("Naufal Nasrullah", "20 Januari", "Tangerang" , 21,
                                "082293105626", "3337210037", "Informatika", "naufaln176@gmail.com");
                MahasiswaKIP mhs2 = new MahasiswaKIP("Naufal Nasrullah", "20 Januari", "Tangerang" , 21,
                                "082293105626", "3337210037", "Informatika", "naufaln176@gmail.com", true, "123456789");
                MahasiswaPertukaran mhs3 = new MahasiswaPertukaran("Naufal Nasrullah", "20 Januari", "Tangerang" , 21,
                                "082293105626", "3337210037", "Informatika", "naufaln176@gmail.com", "Universitas Indonesia", 2, true);

                mhs1.cetakData();
                mhs1.ikutiMK();
                mhs1.abaikanTugas();

                mhs2.cetakData();
                mhs2.tinggalkanMK();
                mhs2.abaikanTugas();

                mhs3.cetakData();
                mhs3.ikutiMK();
                mhs3.kerjakanTugas();
        }

}