/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.asosiasi;

/**
 *
 * @author Rokhul Affan
 */
public class Asdos {
    private String matkul;
    private int sks;
    private String laboratorium;
    
private Asdos(String mt, int sk, String lab){
    matkul=mt;
    sks=sk;
    laboratorium=lab;
}
    public String getMatkul(){
        return matkul;
    }
    
    public int getSKS(){
        return sks;
    }
    
    public void setLaboratorium(String laboratorium){
        this.laboratorium = laboratorium;
    }
    
    public String getLaboratorium(){
        return laboratorium;
    }
}
