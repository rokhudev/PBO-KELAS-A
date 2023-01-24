
package proyekslurr;


public class ProyekSlurr {


    public static void main(String[] args) {
        Proyek gedung_j = new Proyek("Renovasi Gedung J");
        Proyek Parkiran_Tingkat = new Proyek("Parkiran Elit");

        
        Kontraktor asep = new Kontraktor("Asep Properti");
        Kontraktor pt = new Kontraktor("PT. Lancar Jaya SLURR");
    
        gedung_j.setKontraktor(asep); asep.setProyek(gedung_j);
        Parkiran_Tingkat.setKontraktor(pt) ; pt.setProyek(Parkiran_Tingkat);
        
        // tampil data
        gedung_j.tampilData();
        Parkiran_Tingkat.tampilData();
        asep.tampilData();
        pt.tampilData();
    }
    
    
}
