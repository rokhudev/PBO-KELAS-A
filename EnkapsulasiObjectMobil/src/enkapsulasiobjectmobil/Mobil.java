package enkapsulasiobjectmobil;

public class Mobil {
   private int id_driver;
    private String nama;
    private String merk;
    private String warna;
    private int tahun;
    private String pabrik;
    
    // Setter dan Getter Method
    public void setId(int idku){
        id_driver=idku;
    }
    
    public int getId(){
        return id_driver;
    }
    
    public void setNama(String namaku){
        nama=namaku;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setMerk(String merkku){
        merk=merkku;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public void setWarna(String warnaku){
        warna=warnaku;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public void setTahun(int tahunku){
        tahun=tahunku;
    }
    
    public int getTahun(){
        return tahun;
    }
    
    public void setPabrik(String pabrikku){
        pabrik=pabrikku;
    }
    
    public String getPabrik(){
        return pabrik;
    }
}