
package proyekslurr;


public class Kontraktor {
    private String nama_kontraktor;
    private Proyek proyek;
    
    public Kontraktor(String nama){
        nama_kontraktor = nama;
    }
    
    public void setProyek(Proyek proyek){
        this.proyek = proyek;
    }
    
    public String getNama(){
        return nama_kontraktor;
    }
    
    public void tampilData(){
        System.out.println(
            "\nInformasi Kontraktor" +
            "\nNama: " + nama_kontraktor +
            "\nProyek:" + proyek.getNama ()
        );
    }
}
