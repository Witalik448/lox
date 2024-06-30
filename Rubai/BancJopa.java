public class BancJopa {

    String name;
    String email;
    String namberTel;
    int schet;
    double balans;


}

class BancJopaTest {
    public static void main(String[] args) {
        BancJopa LivanKlient = new BancJopa();
        BancJopa DanaKlient = new BancJopa();
        BancJopa UliaKlient = new BancJopa();
        BancJopa VladKlient = new BancJopa();
        BancJopa ElinaKlient = new BancJopa();
        BancJopa VitalikKlient = new BancJopa();
        BancJopa ZubahaKlient = new BancJopa();

        LivanKlient.name = "Кения Леван Эрикович";
        LivanKlient.email = "Keniy@yandex.ru";
        LivanKlient.namberTel = "+7(965)458-14-15";
        LivanKlient.schet = 54458;
        LivanKlient.balans = 500879.00;


        DanaKlient.name = "Харькин Даниил Дмитриевич";
        DanaKlient.email = "dan2001@mail.ru";
        DanaKlient.namberTel = "+7(587)658-47-98";
        DanaKlient.schet = 54478;
        DanaKlient.balans = 847447.25;


        UliaKlient.name = "Жукова Юлия Генадьевна";
        UliaKlient.email = "Y-zuk2001@yandex.ru";
        UliaKlient.namberTel = "+7(984)478-25-54";
        UliaKlient.schet = 78874;
        UliaKlient.balans = 458879.21;


        VladKlient.name = "Муромов Владислав Генадьевич";
        VladKlient.email = "Vlad.Mur@yandex.ru";
        VladKlient.namberTel = "+7(986)789-54-96";
        VladKlient.schet = 87789;
        VladKlient.balans = 447887.45;


        ElinaKlient.name = "Сидора Элина Константиновна";
        ElinaKlient.email = "Elin.Sid@yandex.ru";
        ElinaKlient.namberTel = "+7(897)875-25-36";
        ElinaKlient.schet = 78889;
        ElinaKlient.balans = 477895.45;


        VitalikKlient.name = "Джабраилов Виталий Зайнудинович";
        VitalikKlient.email = "Vit.jabrailoff2016@yandex.ru";
        VitalikKlient.namberTel = "+7(965)017-17-15";
        VitalikKlient.schet = 89987;
        VitalikKlient.balans = 988987.25;


        ZubahaKlient.name = "Зубаха Андрей Сергеивич";
        ZubahaKlient.email = "Zub.Dauy@yandex.ru";
        ZubahaKlient.namberTel = "+7(000)000-00-00";
        ZubahaKlient.schet = 00001;
        ZubahaKlient.balans = 000000.25;


        System.out.println("Имя Клиента:   " + ZubahaKlient.name + "  Электронная почта:  " + ZubahaKlient.email + "  Номер моб.  " + ZubahaKlient.namberTel + " Счет клиента:  " + ZubahaKlient.schet + "  Баланс:  " + ZubahaKlient.balans);
    }

}
