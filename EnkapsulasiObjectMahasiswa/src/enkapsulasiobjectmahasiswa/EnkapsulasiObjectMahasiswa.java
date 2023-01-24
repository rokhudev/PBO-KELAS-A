
package enkapsulasiobjectmahasiswa;


public class EnkapsulasiObjectMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // object mhs-1
        Mahasiswa mhsti1=new Mahasiswa();
        mhsti1.setNim(100);
        mhsti1.setNama("Hasan Mahribi");
        // object mhs-2
        Mahasiswa mhsti2=new Mahasiswa();
        mhsti2.setNim(202051129);
        mhsti2.setNama("Hyuno Asta");
        
        // Tampil Data
        System.out.println("--------------------------------");
        System.out.println("Nim:"+mhsti1.getNim()+"\n"+
                           "Nama:"+mhsti1.getNama()+"\n");
        System.out.println("--------------------------------");
        System.out.println("Nim:"+mhsti2.getNim()+"\n"+
                           "Nama:"+mhsti2.getNama()+"\n");
    }
    
}
