package latihan.asosiasi;

public class Monitor {
    private int ukuran;
    private String merk;
    
    public Monitor(String m, int u){
        merk = m;
        ukuran = u;
    }
    
    public void tampilData(){
        System.out.println(
            "Merk: " + merk +
            "\nUkuran: " + ukuran
        );
        
    }
}
