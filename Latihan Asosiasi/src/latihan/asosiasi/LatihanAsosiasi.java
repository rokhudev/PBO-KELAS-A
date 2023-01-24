package latihan.asosiasi;

public class LatihanAsosiasi {

    public static void main(String[] args) {       
        Keyboard kb1 = new Keyboard("Razer");
        Keyboard kb2 = new Keyboard("Geming99");
        Keyboard kb3 = new Keyboard("Toyota");
        
        Monitor m1 = new Monitor("HP",21);
        Monitor m2 = new Monitor("Dell",25);
        Monitor m3 = new Monitor("Samsung",32);
        
        KomputerRumah pc1 = new KomputerRumah(220, m1, kb1);
        KomputerRumah pc2 = new KomputerRumah(210, m2, kb2);
        KomputerRumah pc3 = new KomputerRumah(230, m3, kb3);
        
        System.out.println("Informasi Komputer");
        // Lanjut...
    }
    
    
}
