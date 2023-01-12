package com.erinc.DesignPatern.solid.FactoryDesignPatern;

public class Ucak extends Tasima {


    public Ucak() {
        super(TasimaTipi.HAVA);
    }

    @Override
    protected void evrakDoldur() {
        System.out.println("Ucak evraki dolduruldu");
    }
}
