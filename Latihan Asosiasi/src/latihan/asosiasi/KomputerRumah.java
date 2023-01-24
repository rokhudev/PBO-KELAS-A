package latihan.asosiasi;

public class KomputerRumah {
    private int daya;
    public Monitor monitor1;
    public Keyboard kb1;
    
    public KomputerRumah(int d, Monitor m, Keyboard k){
        daya = d;
        monitor1 = m;
        kb1 = k;
    }
    
    public void setDaya(int daya){
        this.daya = daya;
    }
    
    public int getDaya(){
        return daya;
    }
}
