
package objectmahasiswapewarisan;

public class mahasiswaEkstensi extends mahasiswa {
    
    //atributnya
    private double project;
    
    public mahasiswaEkstensi ( int id, String nama, double project){
        super(id, nama);
        this.project=project;
    }
    
    public void printMhsEkstensi(){
        System.out.println("Output:");
        super.printMahasiswa();
        System.out.println("Nilai project:"+project);
        if ( project > 90){
            System.out.println("Grade A");
        }else if(project > 80) {
            System.out.println("Grade AB");
        }else if(project > 70) {
            System.out.println("Grade B");
        }else if(project > 60) {
            System.out.println("Grade C");
        }else if(project > 50) {
            System.out.println("Grade D");
        }
    }
    
}
