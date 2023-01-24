
package objectmahasiswapewarisan;


public class mahasiswa {
    //instance variable
    protected int id;
    protected String nama;
    
    //konstruktor
    public mahasiswa(int idm, String namam){
        id=idm;
        nama=namam;
    }
    
    //method tampil mhs
    public void printMahasiswa(){
        System.out.println("Id:"+id+"\n"+
                            "Nama:"+nama);
    }
}
