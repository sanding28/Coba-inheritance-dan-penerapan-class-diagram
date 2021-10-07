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
public class supra extends Motor{
    public void show() {
        Motor baru = new Motor();
        
        baru.inputData("150", "Supra GTR 150 facelift", "Hitam");
        baru.showData();
    }
}
