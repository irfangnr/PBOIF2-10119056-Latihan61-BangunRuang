/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan61.bangunruang;

/**
 *π x r2 x t
 * @author ACER
 */
public class Tabung extends BangunRuang {
    private double r;
    private double t;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    
    @Override
    public double hitungVolume() {
        return phi*r*r*t;
    }
    
}
