/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorku;

/**
 *
 * @author HP
 */
public class Motor {
    private String ClilinderCapacity;
    private String Merek;
    private String Warna;

    public String getClilinderCapacity() {
        return ClilinderCapacity;
    }

    public void setClilinderCapacity(String ClilinderCapacity) {
        this.ClilinderCapacity = ClilinderCapacity;
    }

    public String getMerek() {
        return Merek;
    }

    public void setMerek(String Merek) {
        this.Merek = Merek;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }
    
    public void showData(){
    System.out.println("Kapasitas mesin: " + getClilinderCapacity());
    System.out.println("Merek motor: " + getMerek());
    System.out.println("Warna Motor: "+ getWarna());
    }
    
    public void inputData(String c, String m, String w){
        setClilinderCapacity(c);
        setMerek(m);
        setWarna(w);
    }
    
   
}


