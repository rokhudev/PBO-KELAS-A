/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

public class Buah {
    //properti object
    public String nama; 
    public String rasa; 
    public String warna; 
    public int berat; 
    public double harga; 
 
    //konstruktor
    public Buah(String nm, String rs, String wr, int 
    br, double hg){ 
        nama=nm; 
        rasa=rs; 
        warna=wr; 
        berat=br; 
        harga=hg; 
    } 
    //method untuk tampil buah
    public void deskripsiBuah(){ 
    System.out.println("Object Buah:"); 
    System.out.println("---------------------");
    System.out.println("Buah:"+nama+"\n"+
                       "Warna:"+warna+"\n"+
                       "Rasa:"+rasa+"\n"+
                       "Berat:"+berat+"\n"+
                       "Harga:"+harga+"\n"
            );
         }
    //method setter
    // digunakan untuk mengganti nilai attribut
    public void setNama(String nm){
        nama = nm;
}

    public void setWarna(String wr){
        warna = wr;
}

    public void setRasa(String rs){
        rasa = rs;
}

    public void setBerat(int br){
        berat = br;
}

    public void setHarga(double hr){
        harga = hr;
}
}