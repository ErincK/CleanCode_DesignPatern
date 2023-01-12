package com.erinc.DesignPatern.solid.FactoryDesignPatern;

public class Gemi extends Tasima{
    public Gemi() {
        super(TasimaTipi.DENIZ);
    }

    @Override
    protected void evrakDoldur() {
        System.out.println("Gemi evraki dolduruldu.");
    }
}
