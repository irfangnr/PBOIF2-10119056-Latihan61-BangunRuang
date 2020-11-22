/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan61.bangunruang;

/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan Bangun ruang
 */
public class PBOIF210119056Latihan61BangunRuang {

    public static void main(String[] args) {

       Bola vBola=new Bola();
       vBola.setPhi(3.14);
       vBola.setR(7);
       System.out.println("Volume Bola : "+vBola.hitungVolume());
       
       Tabung vTabung=new Tabung();
       vTabung.setPhi(3.14);
       vTabung.setR(10);
       vTabung.setT(21);
       System.out.println("Volume Tabung : "+vTabung.hitungVolume());
       
       Kerucut vKerucut=new Kerucut();
       vKerucut.setPhi(3.14);
       vKerucut.setR(14);
       vKerucut.setT(9);
       System.out.println("Volume Kerucut : "+vKerucut.hitungVolume());
    }
    
}
