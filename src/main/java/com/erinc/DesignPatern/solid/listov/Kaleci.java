package com.erinc.DesignPatern.solid.listov;

public class Kaleci extends Oyuncu implements IOyuncu {
    @Override
    public void topuElleTut() {
        System.out.println("Kaleci topu elle yakaladı");
    }
}
