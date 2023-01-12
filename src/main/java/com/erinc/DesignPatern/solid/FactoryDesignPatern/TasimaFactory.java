package com.erinc.DesignPatern.solid.FactoryDesignPatern;

public class TasimaFactory {
    public static Tasima builder(TasimaTipi tip){
        switch (tip){
            case HAVA : return new Ucak();
            case DENIZ : return new Gemi();
            default : return new Kamyon();
        }

    }
}
