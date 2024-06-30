public class Studen {

    int NamberStud;
    int GodObucheniya;
    String Name;
    double SrednayaOcenkaMatematika;
    double SrednayaOcenkaEconomike;
    double SrednayaOcenkaEnglis;

}
class Studentest{
    public static void main(String[] args) {

        Studen IvanStudent= new Studen();
        Studen KirillStudent= new Studen();
        Studen SavanStudent= new Studen();

        IvanStudent.NamberStud=401;
        IvanStudent.GodObucheniya=2001;
        IvanStudent.Name="Крылов Иван Генадьевич";
        IvanStudent.SrednayaOcenkaMatematika=10;
        IvanStudent.SrednayaOcenkaEconomike=9.5;
        IvanStudent.SrednayaOcenkaEnglis=10;

        KirillStudent.NamberStud=402;
        KirillStudent.GodObucheniya=2001;
        KirillStudent.Name="Васильев Кирилл Иванович";
        KirillStudent.SrednayaOcenkaMatematika=5.4;
        KirillStudent.SrednayaOcenkaEconomike=7.8;
        KirillStudent.SrednayaOcenkaEnglis=10;

        SavanStudent.NamberStud=403;
        SavanStudent.GodObucheniya=2001;
        SavanStudent.Name="Геворгян Саван Арамович";
        SavanStudent.SrednayaOcenkaMatematika=6.9;
        SavanStudent.SrednayaOcenkaEconomike=9.8;
        SavanStudent.SrednayaOcenkaEnglis=3.2;

        double a1 = (SavanStudent.SrednayaOcenkaMatematika +SavanStudent.SrednayaOcenkaEconomike+SavanStudent.SrednayaOcenkaEnglis)/3;
        double a2 = (KirillStudent.SrednayaOcenkaMatematika+KirillStudent.SrednayaOcenkaEconomike+KirillStudent.SrednayaOcenkaEnglis)/3;
        double a3 = (IvanStudent.SrednayaOcenkaMatematika  +IvanStudent.SrednayaOcenkaEconomike+IvanStudent.SrednayaOcenkaEnglis)/3;

        System.out.print("Средний бал Саван    ");
        System.out.println(a1);
        System.out.print("Cредний балл Кирилл  ");
        System.out.println(a2);
        System.out.print("Средний балл Иван    ");
        System.out.println(a3);



    }
}