package com.erinc.DesignPatern.solid.FactoryDesignPatern;

public class Kamyon extends Tasima{
    public Kamyon() {
        super(TasimaTipi.KARA);
    }

    @Override
    protected void evrakDoldur() {
        System.out.println("Kamyon evraki dolduruldu.");
    }
}
