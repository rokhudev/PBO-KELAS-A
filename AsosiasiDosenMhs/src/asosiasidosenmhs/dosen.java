
package asosiasidosenmhs;


public class dosen {
//insatnce variabel object
    private String nama;
    private mahasiswa mhsumk;
    
    public dosen(String nama_mhs){
        this.nama=nama_mhs;
        this.mhsumk=null;
    }
    
    public void setMhsumk(mahasiswa mhsumk){
        this.mhsumk = mhsumk;
    }
    
    public String getDosen(){
        return nama;
    }
    
    public String getMhsumk(){
        return mhsumk.getNama();
    }
}
