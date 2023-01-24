
package proyekslurr;


public class Proyek {
    private String nama_proyek;
    private Kontraktor kontraktor;
    
    public Proyek(String nama_proyek){
        this.nama_proyek= nama_proyek;
    }
    
    public void setKontraktor(Kontraktor k){
        kontraktor = k;
    }
    
    public String getNama(){
        return nama_proyek;
    }
    
    public void tampilData(){
        System.out.println("Nama Proyek: " + nama_proyek);
        System.out.println("Nama Kontraktor " + kontraktor.getNama());
    }
}
