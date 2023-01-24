
package objectmahasiswa;


public class Object2Mahasiswa {
    
    public static void main(String[] args) {
        // object-object mhs
        mahasiswa mhs1=new mahasiswa(202051129,
                    " Muhammad Hasan Mahribi", "Teknik Informatika");
        mahasiswa mhs2=new mahasiswa(202051111,
                    "ADE KAKAK", "TEKNIK MESIN");
        
        
        //cetak object
        mhs1.ubahNama("Budi Kurniadi");
        mhs1.tampilMahasiswa();
        
        mhs2.tampilMahasiswa();
    }
}
