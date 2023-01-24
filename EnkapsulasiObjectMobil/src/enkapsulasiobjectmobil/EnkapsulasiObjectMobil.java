
package enkapsulasiobjectmobil;


public class EnkapsulasiObjectMobil {


    public static void main(String[] args) {
        Mobil mb1=new Mobil();
        mb1.setId(1);
        mb1.setNama("Hasan Mahribi");
        mb1.setMerk("Avanza");
        mb1.setWarna("Hijau");
        mb1.setMerk("Honda");
        mb1.setPabrik("Honda");
        
        System.out.println("Output:");
        System.out.println("--------------------------------");
        System.out.println("ID:"+mbl.getId()+"\n"+
                           "Nama:"+mbl.getNama()+"\n"+
                           "Merk:"+mbl.getMerk()+"\n"+
                           "Warna:"+mbl.getWarna()+"\n"+
                           "Tahun:"+mbl.getTahun()+"\n"+
                           "Pabrik:"+mbl.getPabrik()+"\n");
    }
    
}
