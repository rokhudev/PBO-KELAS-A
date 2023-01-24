
package objectmahasiswapewarisan;


public class ObjectMahasiswaPewarisan {


    public static void main(String[] args) {
        // object mhs reguler
        mahasiswaReguler fadli=new mahasiswaReguler(88, "Fadli Gunawan ", 85, 90);
    
        //object ekstensi
        mahasiswaEkstensi adi=new mahasiswaEkstensi(67, " Adi Bening ", 88);
        
        //tampil data
        fadli.printMhsReguler();
        adi.printMhsEkstensi();
    }
    
}
