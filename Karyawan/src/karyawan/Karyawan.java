
package karyawan;

public class Karyawan {
    public int id;
    public String nama;
    public String unit;
    
    public Karyawan(int id, String nama){
        this.id=id;
        this.nama=nama;
    }
    
    public Karyawan(int id, String nama, String unit){
        this(id, nama);
        this.unit=unit;
    }
    
public void tampilKaryawan() {
    System.out.println("Id:" + id+"\n"+
                       "Nama:"+nama+"\n"+
                        "Unit:"+unit);
}
}