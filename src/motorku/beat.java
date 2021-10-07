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
public class beat extends Motor{
    public void show(){
       Motor baru = new Motor();
       
       baru.inputData("125", "Beat pop", "Merah ");
       baru.showData();
    }
}
