/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan61.bangunruang;

/**V = 4/3 x π x r3
 *
 * @author ACER
 */
public class Bola extends BangunRuang{
    private double r;


    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
 
    @Override
    public double hitungVolume() {

        return 1.3333*phi*(r*r*r);
    }
    
}
