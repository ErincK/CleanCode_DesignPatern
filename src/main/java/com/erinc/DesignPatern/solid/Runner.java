package com.erinc.DesignPatern.solid;

public class Runner {
    public static void main(String[] args) {
        /**
         * SOLID - ACID
         * Amaç:
         *
         * 1- Yazılımın esnek olmasını ve yeniden kullanılabilir olmasını sağlamak.
         * 2- Kodların daha anlaşılır olmasını sağlar ve okunabilirliği arttırır.
         * 3- Kodların modülerliğini arttırarak sadece methıd bazında değil, sınıf ve
         *      proje bazında da kodların tekrar etmesini sağlar.
         * 4- Kodlarınızı yazarken SOLID prensiplerine uygun şekilde yazmaya özen gösterirseniz,
         *      zaman ve maliyetten tasarruf edersiniz.
         *      Kodları daha sonra revize etmek zorunda kalmaz ve geliştirmeye açık olursunuz.
         *
         *
         *
         *  S - Single Responsibility
         *  Interface, Class ve Method'larınız sadece tek bir iş yapmalı.
         *  Orn;
         *  IMusteriRepository.class -> sadece müşteri ile ilgili DataBase işlemleri yapmak.
         *  ICrud, IService, v.s. -> sadece DB ler için işlem bütünlüğü sağlıyor.
         *  save(), bindById(), findOptionalByUsernameAndPassword() -> bir method sadece bir iş yapmlaı.
         *
         *  O - open-closed
         *  yazdığınız method ve class'lar değiştirilmeye ve değişime kapalı olmalıdırlar.
         *  Ancak, gelişime açık olmalıdırlar.
         *  Service -> findAll(), filter -> active, yaptığı işlemler
         *  findAll(){filter, silinmiş hesaplar, aktif olmayan hesaplar gösterilmeli } SORUN!!!,
         *  başka bir method içinde silinmiş hesapların aktivasyonunu raporlamam gerekiyordu,
         *  ancak hiç data gelmediği için sorunu tespit edemedim.
         *  Services -> findAllIsActiveTrue();
         *
         *  L - Listow Substituation
         *  Gereksiz method kullanımlarından uzak durun, mümkün olduğu kadar ortak kullanılan methodları
         *  miras olarak kullanın. Eğer ortak genişleme yapıları ve methodlar kullanacaksanız Interface
         *  miras alarak genişlemeleri yapınız.
         *  MusteriService, UrunService, SatisService -> save(); - ServiceManager<Entity, ID> {save(); findAll();}
         *
         *
         *  I - Interface Segregation
         *
         *
         *
         *  D - Dependency Inversion
         *
         *
         */





    }
}
