

public class KaryawanTampil {
    
    public static void main(String[] args) {
        // object karyawan
        karyawan ob=new karyawan(29, "FADLI AKBAR");
        karyawan staf=new karyawan(34, "FAJAR ADI");
        karyawan accounting=new karyawan(55, "HESTI PURWA", "KEUANGAN");
        karyawan humas=new karyawan(76, "BAMBANG DIFA", "humas");
        karyawan programmer=new karyawan (82, " Hasan Mahribi", "R&D");
        
        //karyawan tampil
        ob.tampilKaryawan();
        staf.tampilKaryawan();
        accounting.tampilKaryawan();
        humas.tampilKaryawan();
        programer.tampilKaryawan();
    }
}
