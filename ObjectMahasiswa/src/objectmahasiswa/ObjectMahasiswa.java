
package objectmahasiswa;


public class ObjectMahasiswa {

        public Class {
        // Inctance variable
        int nim;
        String nama;
        String jurusan;
    }   
        // constructor
        public Mahasiswa (int nim_mhs, String nama_mhs, String jurusan_mhs){
            nim= nim_mhs;
            nama=nama_mhs;
            jurusan=jurusan_mhs;
        }
        
        // method ubah nama
        public void ubahNama(String nm){
            nama=nm;
        }
        // method ubah nim
        public void ubahNim(int nim){
            this.nim=nim;
        }
        
        // method tampil nama
        public void tampilMahasiswa(){
        System.out.println("Data mahasiswa");
        System.out.println("-----------------------");
        System.out.println("Nim:"+nim);
        System.out.println("Nama:+nama");
        System.out.println("Jurusan:+Jurusan");
    
}
