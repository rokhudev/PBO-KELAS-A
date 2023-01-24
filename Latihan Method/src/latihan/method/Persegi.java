
package latihan.method;


public class Persegi {
    // Atribut
    int panjang;
    
    // Method Constructir
    public Persegi(int panjang) {
        this.panjang = panjang;
    }
    
    // Method Static
    public static void infoClass(){
        System.out.println("Ini adalah method static");
    }
    
    // Method Fungsi
    public int getPanjang(){
        return panjang;
    }
    
    public int getKeliling(){
        return 4 * panjang;
    }
    
    public int getLuas(){
        return panjang * panjang;
    } 
    
    //Method Prosedure
    public void setPanjang(int panjang){
        this.panjang = panjang;
    }
    
    public void tampilData(){
        System.out.println(
               "[X] Persegi [X]\n" +
               "Panjang: " + panjang + "\n" +
               "Keliling: " + getKeliling() + "\n" +
               "Luas: " + getLuas()
        );
    }
}
