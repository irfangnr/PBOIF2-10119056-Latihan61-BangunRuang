/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan61.bangunruang;

/**
 *
 * @author ACER
 */
public abstract class BangunRuang {
    double phi;

    
    public double getPhi() {
        return phi;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }

    public abstract double hitungVolume();
}
