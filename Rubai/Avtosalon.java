import java.util.Date;

public class Avtosalon {
    String NameKlienta;
    String NameCar;
    String Cvet;
    String Motor;
    double ObemMotora;
    int LochadinuyeSiluy;
    double Cena;
    double KilometruyPerogoTO;
}

class Avtosolon1 {
    public static void main(String[] args) {
        Avtosalon Klient1 = new Avtosalon();
        Avtosalon Klient2 = new Avtosalon();
        Avtosalon Klient3 = new Avtosalon();
        Avtosalon KLient4 = new Avtosalon();

        Klient1.NameKlienta = "Харькин Даниил Дмитриевич";
        Klient1.NameCar = "Audi A8";
        Klient1.Cvet = "Красный";
        Klient1.Motor = "V6";
        Klient1.ObemMotora = 5.0;
        Klient1.LochadinuyeSiluy = 1000;
        Klient1.Cena = 2000.00;
        Klient1.KilometruyPerogoTO = 15.000;


        System.out.println("Имя клиента:  \n" + Klient1.NameKlienta + "\n\nНазвание машины:  \n" + Klient1.NameCar + "\n\nЦвет машины: \n" + Klient1.Cvet + "\n\nМотор: \n" + Klient1.Motor + "\n\nОбъем мотора\n" + Klient1.ObemMotora + "\n\nЛошадиные силы:\n" + Klient1.LochadinuyeSiluy + "\n\nЦена автомобиля:\n" + Klient1.Cena + "\n\nТО через (км): \n" + Klient1.KilometruyPerogoTO);


    }
}