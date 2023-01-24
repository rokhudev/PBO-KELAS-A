
package enkapsulasiobjectmahasiswa;

/**
 *
 * @author User
 */
public class Mahasiswa {
    // instance variable yang di enkapsulasi
    private int nim;
    private String nama;
    
    // metod seter dan geter
    public void setNim(int nimku){
        nim=nimku;
    }
    
    public void setNama(String namaku){
        nama=namaku;
    }
    
    public int getNim(){
        return nim;
    }
    
    public String getNama(){
        return nama;
    }
    
    //method tampil data
    public void tampilData(){
        System.out.println("Nim:"+nim+"\n"+
                            "Nama"+nama+"\n");
    }
}
