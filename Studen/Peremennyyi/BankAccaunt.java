public class BankAccaunt {

int NamberScheta;
double Balans;
String Name;

}

class BankAccauntTest {
    public static void main(String[] args) {
        BankAccaunt MyAkkaunt          =new BankAccaunt();
        BankAccaunt YourAkkaunt        =new BankAccaunt();
        BankAccaunt HisAkkaunt         =new BankAccaunt();
        BankAccaunt IvoshniyAkkaunt    =new BankAccaunt();

        MyAkkaunt.NamberScheta      =9855;
        MyAkkaunt.Balans            =98712.36;
        MyAkkaunt.Name              ="Виталя Джабраилов";


        YourAkkaunt.NamberScheta     =9856;
        YourAkkaunt.Balans           =987754.25;
        YourAkkaunt.Name             ="Юля Жукова";


        HisAkkaunt.NamberScheta      =9857;
        HisAkkaunt.Balans            =554458.25;
        HisAkkaunt.Name              ="Даня Харькин";


        IvoshniyAkkaunt.NamberScheta =9858;
        IvoshniyAkkaunt.Balans       = 5447.21;
        IvoshniyAkkaunt.Name         = "Алеша Рататуй";


        System.out.println( "Номер счета:  "+IvoshniyAkkaunt.NamberScheta+"  Баланс:  "+IvoshniyAkkaunt.Balans+"    Имя клиента  "+IvoshniyAkkaunt.Name);
        System.out.println( "Номер счета:  "+HisAkkaunt.NamberScheta+"  Баланс:  "+HisAkkaunt.Balans+"  Имя клиента  "+HisAkkaunt.Name);
        System.out.println("Номер счета:  "+YourAkkaunt.NamberScheta+"  Баланс:  "+YourAkkaunt.Balans+"   Имя клиента  "+YourAkkaunt.Name);
        System.out.println("Номер счета:  "+MyAkkaunt.NamberScheta+"  Баланс:  "+MyAkkaunt.Balans+"   Имя клиента  "+MyAkkaunt.Name);









    }
}

