/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan62.livingthing;

/**
 *
 * @author
 * NAMA     : Sandy Akbar
 * KELAS    : PBO-Ulang
 * NIM      : 10114504
 * DESKRIPSI: Program ini berisi konsep pendekatan
 */
public abstract class LivingThing {
    
    public abstract void walk(String nama);

    public void breath(String nama) {
        System.out.println(nama + " Bernafas");
    }

    public void eat(String nama) {
        System.out.println(nama + " Makan");
    
}
}