public class Clasa {

    private int WhichClass;
    private String Name;
    private boolean Catalog;
    private int Medie;

    public Clasa() {
        super();
    }

    public Clasa(int WhichClass, String Name, boolean Catalog) {
        this.WhichClass = WhichClass;
        this.Name = Name;
        this.Catalog = Catalog;
    }

    public int getWhichClass() {
        return WhichClass;
    }

    // Getters And Setters
    public void setWhichClass(int whichClass) {
        WhichClass = whichClass;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean isCatalog() {
        return Catalog;
    }

    public void setCatalog(boolean catalog) {
        Catalog = catalog;
    }

    public int getMedie() {
        return Medie;
    }

    public void setMedie(int medie) {
        Medie = medie;
    }

    public void GetNotaMedie() {
        if (getMedie() <=4) {
            System.out.println(Name + " can't pass in 5th grade");
        } else if (getMedie() >=5 && getMedie()<=9) {
            System.out.print(Name + " made it to the 5th grade");
        } else if (getMedie() == 10) {
            System.out.print(Name + " passed the 5th grade with an average of 10");
        }
    }

    @Override
    public String toString() {
        return "Clasa{" + "WhichClass=" + WhichClass + ", Name='" + Name + '\'' + ", Catalog=" + Catalog + '}';
    }
}
