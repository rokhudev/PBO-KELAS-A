
package latihan2;


public class PegawaiTampil {
    
    /**
     * *@param args the command line arguments
     */
    public static void main(String[] args){
        //project pegawai
        Pegawai ob=new Pegawai(213, " Joko Tingkir");
        Pegawai staf=new Pegawai(412, "Fajar Pamungkas");
        Pegawai gardener=new Pegawai(903, "Bagus Friadi");
        
        //tampil pegawai
        ob.tampilData();
        staf.tampilData();
        gardener.tampilData();
    }
}
