import java.sql.SQLOutput;

public class Scoala {

    @Override
    public String toString()
    {
        return "Scoala";
    }

        public static void main(String[] args)
        {
            Clasa c = new copil();
            copil f = new copil();
            Scoala s = new Scoala();

            System.out.println(s);


            System.out.println(f.getName() + "..................." + f);
            f.setName("Mihaiu Stefan");
            f.setCatalog(true);
            f.setWhichClass(4);
            System.out.println(f.getName() + "............" + f);


            c.setMedie(10);
            c.setName("Cazanu Dorel");
            c.setCatalog(true);
            c.setWhichClass(4);
            System.out.println(c);
            c.GetNotaMedie();


            Clasa dif1 = new copil();
            copil dif2 = new copil();
            dif2.getElevi();
            dif1.getName();
        }







}
