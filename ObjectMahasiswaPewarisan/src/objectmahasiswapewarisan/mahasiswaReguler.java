
package objectmahasiswapewarisan;


public class mahasiswaReguler extends mahasiswa{
    // atribut mhs reguler
    private double uts;
    private double uas;
    
    //konstruktor
    public mahasiswaReguler (int id, String namam, double uts, double uas){
        super(id, namam);
        if (namam==""){
            throw new IllegalArgumentException("Nama ridak boleh kosong!");
        }
        this.uts=uts;
        this.uas=uas;
    }

    
    //tampil data mhs reguler
    public void printMhsReguler(){
        super.printMahasiswa();
        System.out.println("Nilai UTS :"+uts+"\n"+
                            "Nilai UAS : "+uas);
        if ( uts > 90){
            System.out.println("Grade A");
        }else if(uts > 80) {
            System.out.println("Grade AB");
        }else if(uts > 70) {
            System.out.println("Grade B");
        }else if(uts > 60) {
            System.out.println("Grade C");
        }else if(uts > 50) {
            System.out.println("Grade D");
        }
    }
}
