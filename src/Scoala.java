import java.sql.SQLOutput;

public class Scoala {

    //toString() overwritten
    @Override
    public String toString()
    {
        return "Scoala";
    }


        public static void main(String[] args)
        {
            Clasa c = new Clasa();
            copil f = new copil();
            Scoala s = new Scoala();

            System.out.println(s);


            System.out.println(f.getName() + " " + f);
            f.setName("Mihaiu Stefan");
            f.setCatalog(true);
            f.setWhichClass(4);
            System.out.println(f.getName() + " " + f);



            c.setName("Cazanu Dorel");
            c.setCatalog(false);
            c.setWhichClass(4);
            System.out.println(c);
            c.Catalog();

            //The difference between 2 types of references
            Clasa dif1 = new copil("Ana Florentina");
            copil dif2 = new copil();
            dif2.getElevi();
            dif1.getName();
        }



}
