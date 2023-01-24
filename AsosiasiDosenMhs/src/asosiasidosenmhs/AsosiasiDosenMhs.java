
package asosiasidosenmhs;


public class AsosiasiDosenMhs {

    public static void main(String[] args) {
        //object mhs
        mahasiswa mhs1= new mahasiswa("Andi Saputro", 100);
        mahasiswa mhs2= new mahasiswa("Satrio Purnomo", 200);
        mahasiswa mhs3= new mahasiswa("Bagus Kumala", 300);
        
        //object dosen
        dosen dosen1= new dosen("Dr. Selamet Megumi");
        dosen dosen2= new dosen("Alham Difaudin S.Kom, M.Kom");
        dosen dosen3= new dosen("Arya Ananta S.T, M.T");
        
        //oasosiasi dosen & mhs
        dosen1.setMhsumk(mhs1);
        dosen2.setMhsumk(mhs2);
        dosen3.setMhsumk(mhs3);
        
        //tampil data
        System.out.println("Output:");
        System.out.println("Dosen-1:"+dosen1.getDosen()+"\n"+
                            "Mhs-1:"+dosen1.getMhsumk()+"\n"+
                            "----------------------------------"+"\n"+
                           "Dosen-2:"+dosen2.getDosen()+"\n"+
                            "Mhs-2:"+dosen2.getMhsumk()+"\n"+
                            "----------------------------------"+"\n"+
                            "Dosen-3:"+dosen3.getDosen()+"\n"+
                            "Mhs-3:"+dosen3.getMhsumk()+"\n");
    }
}