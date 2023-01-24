
package latihan1;


public class BuahBeraksi {
    
   public static void main(String[] args) {
       //membuat object buah-1
       Buah mangga=new Buah("Mangga Kueni", "Kuning", "Kecut", 200, 150000);
       //membuat object buah-2
       Buah salak=new Buah("Salak Pondoh", "Hitam", "Manis", 5, 60000);
       //membuat object buah-3
       Buah duren=new Buah("Duren Montong", "Kuning", "Manis", 8, 400000);
       
       //mengakses object
       mangga.deskripsiBuah();
       salak.deskripsiBuah();
       duren.deskripsiBuah();
       
       //mengganti ?
       mangga.setNama("Mangga Arum Manis");
       mangga.setWarna("Hijau");
       mangga.setRasa("Manis");
       mangga.setHarga(90000);
       mangga.setBerat(15);
       
       mangga.deskripsiBuah();
   } 
}

